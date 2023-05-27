package net.lin.medicinemod.recipe;

import net.lin.medicinemod.MedicineMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void registerRecipes(){
        Registry.register(Registry.RECIPE_SERIALIZER,new Identifier(MedicineMod.MOD_ID,MedicineCraftingTableRecipe.Serializer.ID),
                MedicineCraftingTableRecipe.Serializer.INSTANCE);

        Registry.register(Registry.RECIPE_TYPE,new Identifier(MedicineMod.MOD_ID,MedicineCraftingTableRecipe.Type.ID),
                MedicineCraftingTableRecipe.Type.INSTANCE);
    }

}
