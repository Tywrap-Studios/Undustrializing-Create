package net.tywrapstudios.undustrialized.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.tywrapstudios.undustrialized.UndustrializedMod;

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
                entries.accept(BAUXITE_CLUMP);
                entries.accept(STEEL_PIPE);
                entries.accept(ALUMINIUM_HYDROXIDE);
                entries.accept(SEEDED_ALUMINOUS_SLUDGE);
                entries.accept(THERMITE);
                entries.accept(FEEDING_TUBE);
                entries.accept(BRASS_IMPULSE_ROTOR);

                entries.accept(ALUMINA_POWDER);
                entries.accept(CHARCOAL_POWDER);
                entries.accept(CARBON_POWDER);
                entries.accept(COAL_POWDER);
                entries.accept(IRON_POWDER);

                entries.accept(PIG_IRON_INGOT);
                entries.accept(STEEL_INGOT);
                entries.accept(ALUMINIUM_INGOT);
                entries.accept(BAUXITE_INGOT);

                entries.accept(STEEL_SHEET);
                entries.accept(ALUMINIUM_SHEET);

                entries.accept(FILE);

                entries.accept(STEEL_STATOR);
                entries.accept(ELECTRODE_PAIR);
                entries.accept(BRINE_CONCENTRATE);
                entries.accept(SALT);
                entries.accept(LYE);
                entries.accept(STEEL_ROD);
                entries.accept(ALUMINIUM_ROD);
                entries.accept(STEEL_AXLE);
                entries.accept(ALUMINIUM_AXLE);
                entries.accept(ALUMINIUM_ROTOR);
                entries.accept(HIGH_PRESSURE_ALUMINIUM_ROTOR);
                entries.accept(INERT_ANODE);
                entries.accept(INERT_CATHODE);
                entries.accept(FLUID_FILTER);
                entries.accept(REVERSE_OSMOSIS_FILTER);
            })
            .build();

}