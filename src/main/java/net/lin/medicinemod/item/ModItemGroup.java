package net.lin.medicinemod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.lin.medicinemod.MedicineMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MEDICINE = FabricItemGroupBuilder.build(new Identifier(MedicineMod.MOD_ID,"medicine"),
            () -> new ItemStack(ModItems.WHITE_PILL));
}
