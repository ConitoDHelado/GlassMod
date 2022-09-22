package net.conitodhelado.glassmod;

import net.conitodhelado.glassmod.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlassMod implements ModInitializer {
	public static final String MOD_ID = "glassmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();

	}
}
