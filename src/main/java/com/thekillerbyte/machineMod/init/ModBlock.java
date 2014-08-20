package com.thekillerbyte.machineMod.init;

import com.thekillerbyte.machineMod.block.BlockMM;
import com.thekillerbyte.machineMod.block.CompressedFuelBlock;
import com.thekillerbyte.machineMod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created on 19.08.2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlock {
    public static BlockMM compressedFuelBlock = new CompressedFuelBlock();

    public static void init() {
        GameRegistry.registerBlock(compressedFuelBlock, "fuel");
    }
}
