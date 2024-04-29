package net.tywrapstudios.undustrialized.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.tywrapstudios.undustrialized.UndustrializedMod;

public class ModBlocks_SimpleBlocks {

    // How to add a simple block:

    // public static final Block EXAMPLE = registerBlock("block_id", new Block(FabricBlockSettings.copyOf(Blocks.BLOCK_ID)));

    // Don't forget: blockstates, block models, item models and correct textures!

    public static final Block BAUXITE_ORE = registerBlock("bauxite_ore", new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(UndustrializedMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(UndustrializedMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocksForClass() {
        UndustrializedMod.LOGGER.info("Registering ModBlocks for class SimpleBlocks for " + UndustrializedMod.NAME);
    }
}
