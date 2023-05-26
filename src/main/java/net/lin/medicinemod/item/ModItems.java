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
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM,new Identifier(MedicineMod.MOD_ID,name),item);
    }
    public static void registerModItems(){
        MedicineMod.LOGGER.info("Registering Mod Items for "+MedicineMod.MOD_ID);
    }
}
