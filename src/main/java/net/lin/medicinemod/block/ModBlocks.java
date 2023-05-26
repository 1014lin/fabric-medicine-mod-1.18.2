package net.lin.medicinemod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lin.medicinemod.MedicineMod;
import net.lin.medicinemod.block.custom.MedicineCraftingTable;
import net.lin.medicinemod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block MEDICINE_CRAFTING_TABLE = registerBlock("medicine_crafting_table",
            new MedicineCraftingTable(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MEDICINE);



    private static Block registerBlock(String name,Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK,new Identifier(MedicineMod.MOD_ID,name),block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM,new Identifier(MedicineMod.MOD_ID,name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks(){
        MedicineMod.LOGGER.info("registering ModBlocks for"+ MedicineMod.MOD_ID);
    }
}
