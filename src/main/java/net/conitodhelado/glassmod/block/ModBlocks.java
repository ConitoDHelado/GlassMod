package net.conitodhelado.glassmod.block;

import net.conitodhelado.glassmod.GlassMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.particle.SpellParticle;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block MOSAIC_GLASS_BLOCK = registerBlock("mosaicglass_block",
            new GlassBlock(FabricBlockSettings.of(Material.GLASS).strength(3F,3F).requiresTool().sounds(BlockSoundGroup.GLASS).nonOpaque()),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSAIC_GLASS_PANE = registerBlock("mosaicglass_pane",
            new PaneBlock(FabricBlockSettings.of(Material.GLASS).strength(3F,3F).requiresTool().sounds(BlockSoundGroup.GLASS).nonOpaque()),
            ItemGroup.BUILDING_BLOCKS);



    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(GlassMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(GlassMod.MOD_ID, name),
            new BlockItem(block,new FabricItemSettings().group(tab)));

    }
    public static void registerModBlocks(){
        GlassMod.LOGGER.debug("Registering Modblocks for " + GlassMod.MOD_ID);
    }
}
