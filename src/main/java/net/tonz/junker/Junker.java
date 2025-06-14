package net.tonz.junker;

import net.fabricmc.api.ModInitializer;

import net.tonz.junker.block.ModBlocks;
import net.tonz.junker.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Junker implements ModInitializer {
	public static final String MOD_ID = "junker";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}