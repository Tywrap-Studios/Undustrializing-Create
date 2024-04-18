package net.tywrapstudios.c_undustrialized.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.tywrapstudios.c_undustrialized.UndustrializedMod;
import net.minecraft.resources.ResourceLocation;

public class ModItems {
    public static final Item CRUSHED_BAUXITE =                      registerItem("crushed_bauxite",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_PIPE =                           registerItem("steel_pipe",
            new Item(new FabricItemSettings()));
    public static final Item ALUMINIUM_HYDROXIDE =                  registerItem("aluminium_hydroxide",
            new Item(new FabricItemSettings()));
    public static final Item SEEDED_ALUMINOUS_SLUDGE =              registerItem("seeded_aluminous_sludge",
            new Item(new FabricItemSettings()));
    public static final Item THERMITE =                             registerItem("thermite",
            new Item(new FabricItemSettings()));


   private static void addItemsToCuItemGroup(FabricItemGroupEntries entries) {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
              .register((content) -> {
                 content.accept(CRUSHED_BAUXITE);
                 content.accept(STEEL_PIPE);
                 content.accept(ALUMINIUM_HYDROXIDE);
                 content.accept(SEEDED_ALUMINOUS_SLUDGE);
                 content.accept(THERMITE);
       });
    }



    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(UndustrializedMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        UndustrializedMod.LOGGER.info("Registering Mod Items for" + UndustrializedMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(ModItems::addItemsToCuItemGroup);
    }
}
