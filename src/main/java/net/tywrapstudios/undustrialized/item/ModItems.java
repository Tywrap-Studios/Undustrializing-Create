package net.tywrapstudios.undustrialized.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tywrapstudios.undustrialized.UndustrializedMod;

public class ModItems {
    //uncategorized
    public static final Item CRUSHED_BAUXITE = registerItem("crushed_bauxite", new Item(new FabricItemSettings()));
    public static final Item STEEL_PIPE = registerItem("steel_pipe", new Item(new FabricItemSettings()));
    public static final Item ALUMINIUM_HYDROXIDE = registerItem("aluminium_hydroxide", new Item(new FabricItemSettings()));
    public static final Item SEEDED_ALUMINOUS_SLUDGE = registerItem("seeded_aluminous_sludge", new Item(new FabricItemSettings()));
    public static final Item THERMITE = registerItem("thermite", new Item(new FabricItemSettings()));
    public static final Item FEEDING_TUBE = registerItem("feeding_tube", new Item(new FabricItemSettings()));
    public static final Item BRASS_IMPULSE_ROTOR = registerItem("brass_impulse_rotor", new Item(new FabricItemSettings()));
    public static final Item STEEL_STATOR = registerItem("steel_stator", new Item(new FabricItemSettings()));
    public static final Item ELECTRODE_PAIR = registerItem("electrode_pair", new Item(new FabricItemSettings()));
    public static final Item BRINE_CONCENTRATE = registerItem("brine_concentrate", new Item(new FabricItemSettings()));
    public static final Item SALT = registerItem("salt", new Item(new FabricItemSettings()));
    public static final Item LYE = registerItem("lye", new Item(new FabricItemSettings()));
    public static final Item BAUXITE_CLUMP = registerItem("bauxite_clump", new Item(new FabricItemSettings()));
    //powders
    public static final Item ALUMINA_POWDER = registerItem("alumina_powder", new Item(new FabricItemSettings()));
    public static final Item CHARCOAL_POWDER = registerItem("charcoal_powder", new Item(new FabricItemSettings()));
    public static final Item CARBON_POWDER = registerItem("carbon_powder", new Item(new FabricItemSettings()));
    public static final Item COAL_POWDER = registerItem("coal_powder", new Item(new FabricItemSettings()));
    public static final Item IRON_POWDER = registerItem("iron_powder", new Item(new FabricItemSettings()));
    //ingots
    public static final Item PIG_IRON_INGOT = registerItem("pig_iron_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item(new FabricItemSettings()));
    public static final Item BAUXITE_INGOT = registerItem("bauxite_ingot", new Item(new FabricItemSettings()));  //sheets
    public static final Item STEEL_SHEET = registerItem("steel_sheet", new Item(new FabricItemSettings()));
    public static final Item ALUMINIUM_SHEET = registerItem("aluminium_sheet", new Item(new FabricItemSettings()));
    //tools
    public static final Item FILE = registerItem("file", new Item(new FabricItemSettings()));
    public static final Item UNFINISHED_FILE = registerItem("unfinished_file", new Item(new FabricItemSettings()));
    //rods
    public static final Item STEEL_ROD = registerItem("steel_rod", new Item(new FabricItemSettings()));
    public static final Item ALUMINIUM_ROD = registerItem("aluminium_rod", new Item(new FabricItemSettings()));
    //axles
    public static final Item STEEL_AXLE = registerItem("steel_axle", new Item(new FabricItemSettings()));
    public static final Item ALUMINIUM_AXLE = registerItem("aluminium_axle", new Item(new FabricItemSettings()));
    public static final Item ALUMINIUM_ROTOR = registerItem("aluminium_rotor", new Item(new FabricItemSettings())); //rotors
    public static final Item HIGH_PRESSURE_ALUMINIUM_ROTOR = registerItem("high_pressure_aluminium_rotor", new Item(new FabricItemSettings()));
    public static final Item INERT_ANODE = registerItem("inert_anode", new Item(new FabricItemSettings()));
    //inerts
    public static final Item INERT_CATHODE = registerItem("inert_cathode", new Item(new FabricItemSettings()));
    public static final Item FLUID_FILTER = registerItem("fluid_filter", new Item(new FabricItemSettings()));
    //filters
    public static final Item REVERSE_OSMOSIS_FILTER = registerItem("reverse_osmosis_filter", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(UndustrializedMod.MOD_ID, name), item);
    }
}
