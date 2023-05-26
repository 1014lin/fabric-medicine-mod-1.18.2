package net.lin.medicinemod.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.lin.medicinemod.MedicineMod;
import net.lin.medicinemod.block.custom.entity.MedicineCraftingTableEntity;
import net.minecraft.screen.MerchantScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static ScreenHandlerType<MedicineCraftingTableScreenHandler> MEDICINE_CRAFTING_TABLE_HANDLER;

    public static void registerAllScreenHandlers() {
        MEDICINE_CRAFTING_TABLE_HANDLER =
                ScreenHandlerRegistry.registerSimple(new Identifier(MedicineMod.MOD_ID, "medicine_crafting_table"),
                        MedicineCraftingTableScreenHandler::new);
    }
}
