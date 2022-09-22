package net.conitodhelado.glassmod.block;

import net.conitodhelado.glassmod.GlassMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.particle.SpellParticle;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
       public static final Block MOSAIC_GLASS_BLOCK = registerBlock("mosaic_glass_block",
               new Block(FabricBlockSettings.of(Material.GLASS).strength()))



    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(GlassMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(GlassMod.MOD_ID, name),
            new BlockItem(Block,new FabricItemSettings().group(tab)));

    }
    public static void registerModBlocks(){
        GlassMod.LOGGER.debug("Registering Modblocks for " + GlassMod.MOD_ID);
    }
}
