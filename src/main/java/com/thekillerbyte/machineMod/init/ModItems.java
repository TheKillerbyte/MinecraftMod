package com.thekillerbyte.machineMod.init;

import com.thekillerbyte.machineMod.item.CompressedFuel;
import com.thekillerbyte.machineMod.item.Filter;
import com.thekillerbyte.machineMod.item.ItemMM;
import com.thekillerbyte.machineMod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created on 19.08.2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemMM filter = new Filter();
    public static final ItemMM compressedFuel = new CompressedFuel();

    public static void init() {
        GameRegistry.registerItem(filter, "Filter");
        GameRegistry.registerItem(compressedFuel, "CompressedFuel");
    }
}
