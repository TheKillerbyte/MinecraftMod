package com.thekillerbyte.machineMod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created on 20.08.2014.
 */
public class Recipes {
    public static void init() {
        GameRegistry.addRecipe(new ItemStack(ModItems.filter), " s ", "sss", " s ", 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModBlock.compressedFuelBlock), "CcC", "rsr", "cCc", 'C', new ItemStack(Items.coal), 'c', new ItemStack(Items.coal, 1, 1), 'r', new ItemStack(Items.redstone), 's', new ItemStack(Blocks.sapling));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.compressedFuelBlock), new ItemStack(ModItems.compressedFuel), new ItemStack(ModItems.compressedFuel));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.filter), " s ", "sss", " s ", 's', "stickWood"));
        // GameRegistry.addRecipe(new ShapelessOreRecipe());
    }
}
