package net.tywrapstudios.undustrialized.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tywrapstudios.undustrialized.UndustrializedMod;

public class ModBlocks_SimpleBlocks {

/*
How to add a simple block:

public static final Block EXAMPLE = registerBlock("block_id", new Block(FabricBlockSettings.copyOf(Blocks.BLOCK_ID)));

Don't forget: block states, block models, item models and correct textures!

*/







    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(UndustrializedMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(UndustrializedMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
}
