package net.lin.medicinemod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.lin.medicinemod.screen.MedicineCraftingTableScreen;
import net.lin.medicinemod.screen.ModScreenHandlers;

public class MedicineClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(ModScreenHandlers.MEDICINE_CRAFTING_TABLE_HANDLER, MedicineCraftingTableScreen::new);
    }
}
