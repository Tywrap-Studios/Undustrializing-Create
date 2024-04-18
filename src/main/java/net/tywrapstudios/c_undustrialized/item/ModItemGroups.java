package net.tywrapstudios.c_undustrialized.item;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.tywrapstudios.c_undustrialized.UndustrializedMod;

public class ModItemGroups {

/*    private static final CreativeModeTab C_UNDUSTRIALIZED_MAIN = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.CRUSHED_BAUXITE))
            .displayName(Component.translatable("itemGroup.undustrialized.main"))
            .entries((context, entries) -> {
                entries.add(ModItems.CRUSHED_BAUXITE);
            })
            .build();

 */
public static final ResourceKey<CreativeModeTab> CREATIVE_TAB =
        ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(UndustrializedMod.MOD_ID, "group"));

    public static void register(Registrate REGISTRATE) {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CREATIVE_TAB, FabricItemGroup.builder()
                .title(Component.translatable("itemGroup.c_main"))
                .icon(ModItems.CRUSHED_BAUXITE::getDefaultInstance)
                .displayItems((b, output) -> {
                    for (RegistryEntry<Item> item : REGISTRATE.getAll(Registries.ITEM)) {
                        output.accept(item.get());
                    }
                })
                .build()
        );
    }
}