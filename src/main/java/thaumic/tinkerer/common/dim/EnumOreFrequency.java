package thaumic.tinkerer.common.dim;

/**
 * Created by pixlepix on 3/31/14.
 * <p/>
 * Numbers here used with permission of Vazkii
 */
public enum EnumOreFrequency {

    ALUMINUM("oreAluminum", 617),
    AMBER("oreAmber", 161),
    APATITE("oreApatite", 269),
    TOPAZ("oreTopaz", 238),
    SILICON("oreSilicon", 234),
    ILMENITE("oreIlmenite", 270),
    CINNABAR("oreCinnabar", 172),
    COAL("oreCoal", 2648),
    COPPER("oreCopper", 603),
    DIAMOND("oreDiamond", 67),
    EMERALD("oreEmerald", 48),
    TANZANITE("oreTanzanite", 61),
    GOLD("oreGold", 164),
    AIR("oreInfusedAir", 94),
    EARTH("oreInfusedEarth", 35),
    ENTROPY("oreInfusedEntropy", 53),
    FIRE("oreInfusedFire", 42),
    ORDER("oreInfusedOrder", 31),
    WATER("oreInfusedWater", 27),
    IRON("oreIron", 1503),
    LAPIS("oreLapis", 57),
    LEAD("oreLead", 335),
    // DRACONIUM("oreDraconium", 72),
    PERIDOT("orePeridot", 79),
    REDSTONE("oreRedstone", 364),
    RUBY("oreRuby", 57),
    // METEORICIRON("oreMeteoricIron", 86),
    SAPPHIRE("oreSapphire", 70),
    MALACHITE("oreMalachite", 416),
    DESH("oreDesh", 105),
    TIN("oreTin", 507),
    URANIUM("oreUranium", 112),
    // ELECTROTINE("oreElectrotine", 392),
    NETHERQUARTZ("oreNetherQuartz", 809),
    // CERTUS_QUARTZ("oreCertusQuartz", 234),
    CHARGED_CERTUS_QUARTZ("oreChargedCertusQuartz", 117),
    CHEESE("oreCheese", 1024);
    // NICKEL("oreNickel", 144),
    // SULFUR("oreSulfur", 288),
    // COBALT("oreCobalt", 96),
    // ORIHARUKON("oreOriharukon", 44),
    // TUNGSTEN("oreTungsten", 22),
    // MAGNESIUM("oreMagnesium", 96),
    // ANDAMANTIUM("oreAdamantium", 11),
    // PLATINUM("orePlatinum", 33),
    // MITHRIL("oreMithril", 44);

    public int freq;
    public String name;

    EnumOreFrequency(String name, int freq) {
        this.name = name;
        this.freq = freq;
    }
}
