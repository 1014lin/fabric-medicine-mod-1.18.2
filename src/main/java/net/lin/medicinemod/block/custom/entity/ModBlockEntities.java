package net.lin.medicinemod.block.custom.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.lin.medicinemod.MedicineMod;
import net.lin.medicinemod.block.ModBlocks;
import net.lin.medicinemod.block.custom.MedicineCraftingTable;
import net.lin.medicinemod.item.inventory.ImplementedInventory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.Nullable;

public class ModBlockEntities {
    public static BlockEntityType<MedicineCraftingTableEntity> MEDICINE_CRAFTING_TABLE;

    public static void registerAllBlockEntities(){
        MEDICINE_CRAFTING_TABLE = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(MedicineMod.MOD_ID,"medicine_crafting_table"),
                FabricBlockEntityTypeBuilder.create(MedicineCraftingTableEntity::new,
                        ModBlocks.MEDICINE_CRAFTING_TABLE).build(null));
    }

}
