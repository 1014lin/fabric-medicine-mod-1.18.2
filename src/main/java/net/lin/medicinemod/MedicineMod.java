package net.lin.medicinemod;

import net.fabricmc.api.ModInitializer;

import net.lin.medicinemod.block.ModBlocks;
import net.lin.medicinemod.block.custom.entity.ModBlockEntities;
import net.lin.medicinemod.item.ModItems;
import net.lin.medicinemod.recipe.ModRecipes;
import net.lin.medicinemod.screen.ModScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MedicineMod implements ModInitializer {
	public static final String MOD_ID = "medicinemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerAllBlockEntities();
		ModScreenHandlers.registerAllScreenHandlers();
		ModRecipes.registerRecipes();
		LOGGER.info("Hello Fabric world!");
	}
}
