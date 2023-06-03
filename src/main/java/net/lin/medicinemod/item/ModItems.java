package net.lin.medicinemod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lin.medicinemod.MedicineMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {



    public static final Item EMPTY_PILL=registerItem("empty_pill",
            new Item(new FabricItemSettings().group(ModItemGroup.MEDICINE)));
    public static final Item WHITE_PILL=registerItem("white_pill",
            new Item(new FabricItemSettings().group(ModItemGroup.MEDICINE)));
    public static final Item BLACK_PILL=registerItem("black_pill",
            new Item(new FabricItemSettings().group(ModItemGroup.MEDICINE)));
    public static final Item GREEN_PILL=registerItem("green_pill",
            new Item(new FabricItemSettings().group(ModItemGroup.MEDICINE)));
    public static final Item PINK_PILL=registerItem("pink_pill",
            new Item(new FabricItemSettings().group(ModItemGroup.MEDICINE)));
    public static final Item BLUE_PILL=registerItem("blue_pill",
            new Item(new FabricItemSettings().group(ModItemGroup.MEDICINE)));
    public static final Item GRAY_PILL=registerItem("gray_pill",
            new Item(new FabricItemSettings().group(ModItemGroup.MEDICINE)));
    public static final Item PURPLE_PILL=registerItem("purple_pill",
            new Item(new FabricItemSettings().group(ModItemGroup.MEDICINE)));
    public static final Item RED_PILL=registerItem("red_pill",
            new Item(new FabricItemSettings().group(ModItemGroup.MEDICINE)));
    public static final Item ORANGE_PILL=registerItem("orange_pill",
            new Item(new FabricItemSettings().group(ModItemGroup.MEDICINE)));
    public static final Item YELLOW_PILL=registerItem("yellow_pill",
            new Item(new FabricItemSettings().group(ModItemGroup.MEDICINE)));
    public static final Item WHITE_POWDER=registerItem("white_powder",
            new Item(new FabricItemSettings().group(ModItemGroup.MEDICINE)));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM,new Identifier(MedicineMod.MOD_ID,name),item);
    }
    public static void registerModItems(){
        MedicineMod.LOGGER.info("Registering Mod Items for "+MedicineMod.MOD_ID);
    }
}
