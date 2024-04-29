package net.tywrapstudios.undustrialized.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.tywrapstudios.undustrialized.item.ModItems.*;

public class ModItemGroups {

    public static void registerModItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("undustrialized", "cu_main"), CU_MAIN);
    }

    private static final ItemGroup CU_MAIN = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.CRUSHED_BAUXITE))
            .displayName(Text.translatable("itemGroup.undustrialized_cu_main"))
            .entries((context, entries) -> {
                entries.add(CRUSHED_BAUXITE);
                entries.add(BAUXITE_CLUMP);
                entries.add(STEEL_PIPE);
                entries.add(ALUMINIUM_HYDROXIDE);
                entries.add(SEEDED_ALUMINOUS_SLUDGE);
                entries.add(THERMITE);
                entries.add(FEEDING_TUBE);
                entries.add(BRASS_IMPULSE_ROTOR);

                entries.add(ALUMINA_POWDER);
                entries.add(CHARCOAL_POWDER);
                entries.add(CARBON_POWDER);
                entries.add(COAL_POWDER);
                entries.add(IRON_POWDER);

                entries.add(PIG_IRON_INGOT);
                entries.add(STEEL_INGOT);
                entries.add(ALUMINIUM_INGOT);
                entries.add(BAUXITE_INGOT);

                entries.add(STEEL_SHEET);
                entries.add(ALUMINIUM_SHEET);

                entries.add(FILE);

                entries.add(STEEL_STATOR);
                entries.add(ELECTRODE_PAIR);
                entries.add(BRINE_CONCENTRATE);
                entries.add(SALT);
                entries.add(LYE);
                entries.add(STEEL_ROD);
                entries.add(ALUMINIUM_ROD);
                entries.add(STEEL_AXLE);
                entries.add(ALUMINIUM_AXLE);
                entries.add(ALUMINIUM_ROTOR);
                entries.add(HIGH_PRESSURE_ALUMINIUM_ROTOR);
                entries.add(INERT_ANODE);
                entries.add(INERT_CATHODE);
                entries.add(FLUID_FILTER);
                entries.add(REVERSE_OSMOSIS_FILTER);
            })
            .build();

}