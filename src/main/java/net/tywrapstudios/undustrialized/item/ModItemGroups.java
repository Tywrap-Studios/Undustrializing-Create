package net.tywrapstudios.undustrialized.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.tywrapstudios.undustrialized.UndustrializedMod;
import net.tywrapstudios.undustrialized.block.ModBlocks_SimpleBlocks;

import static net.tywrapstudios.undustrialized.item.ModItems.*;

public class ModItemGroups {

    public static void registerModItemGroups() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation("undustrialized", "cu_main"), CU_MAIN);
        UndustrializedMod.LOGGER.info("Registering CreativeModeTabs for " + UndustrializedMod.NAME);
    }
    private static final CreativeModeTab CU_MAIN = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.CRUSHED_BAUXITE))
            .title(Component.translatable("itemGroup.c_undustrialized_cu_main"))
            .displayItems((context, entries) -> {
                entries.accept(CRUSHED_BAUXITE);
                entries.accept(STEEL_PIPE);
                entries.accept(ALUMINIUM_HYDROXIDE);
                entries.accept(SEEDED_ALUMINOUS_SLUDGE);
                entries.accept(THERMITE);
            })
            .build();
}