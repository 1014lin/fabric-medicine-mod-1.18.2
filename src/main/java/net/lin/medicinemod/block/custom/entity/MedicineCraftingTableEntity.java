package net.lin.medicinemod.block.custom.entity;

import net.lin.medicinemod.item.ModItems;
import net.lin.medicinemod.item.inventory.ImplementedInventory;
import net.lin.medicinemod.screen.MedicineCraftingTableScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class MedicineCraftingTableEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {

    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(4,ItemStack.EMPTY);
    public MedicineCraftingTableEntity( BlockPos pos, BlockState state) {
        super(ModBlockEntities.MEDICINE_CRAFTING_TABLE, pos, state);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public Text getDisplayName() {
        return new LiteralText("Medicine Crafting Table");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new MedicineCraftingTableScreenHandler(syncId,inv,this);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, this.inventory);
    }

    @Override
    public void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, this.inventory);
    }
    public static void tick(World world, BlockPos pos, BlockState state, MedicineCraftingTableEntity entity) {
        if(hasRecipe(entity) && hasNotReachedStackLimit(entity)) {
            craftItem(entity);
        }
    }

    private static void craftItem(MedicineCraftingTableEntity entity) {
        entity.removeStack(0, 1);
        entity.removeStack(1, 1);
        entity.removeStack(2, 1);

        entity.setStack(3, new ItemStack(ModItems.WHITE_PILL,
                entity.getStack(3).getCount() + 1));
    }

    private static boolean hasRecipe(MedicineCraftingTableEntity entity) {
        boolean hasItemInFirstSlot = entity.getStack(0).getItem() == ModItems.EMPTY_PILL;
        boolean hasItemInSecondSlot = entity.getStack(1).getItem() == Items.YELLOW_DYE;
        boolean hasItemInThirdSlot = entity.getStack(2).getItem() == Items.YELLOW_DYE;

        return hasItemInFirstSlot && hasItemInSecondSlot && hasItemInThirdSlot;
    }

    private static boolean hasNotReachedStackLimit(MedicineCraftingTableEntity entity) {
        return entity.getStack(3).getCount() < entity.getStack(3).getMaxCount();
    }
}
