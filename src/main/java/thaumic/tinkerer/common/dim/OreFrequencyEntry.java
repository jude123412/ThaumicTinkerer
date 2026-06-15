package thaumic.tinkerer.common.dim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreFrequencyEntry {

    public static final List<OreFrequencyEntry> ENTRIES = new ArrayList<>();

    public final String oreName;
    public final int weight;

    public OreFrequencyEntry(String oreName, int weight) {
        this.oreName = oreName;
        this.weight = weight;
    }

    public static int getSum() {
        return OreFrequencyEntry.ENTRIES.stream().filter(OreFrequencyEntry::isValid).mapToInt(e -> e.weight).sum();
    }

    public static ItemStack getRandomOre(Random rand) {
        int r = rand.nextInt(getSum());

        for (OreFrequencyEntry e : OreFrequencyEntry.ENTRIES) {
            if (!e.isValid()) continue;
            r -= e.weight;
            if (r < 0) {
                return OreDictionary.getOres(e.oreName).get(0);
            }
        }

        return new ItemStack(Blocks.iron_ore);
    }

    public boolean isValid() {
        return !Arrays.asList(OreClusterGenerator.blacklist).contains(oreName)
                && !OreDictionary.getOres(oreName).isEmpty()
                && OreDictionary.getOres(oreName).get(0).getItem() instanceof ItemBlock;
    }
}
