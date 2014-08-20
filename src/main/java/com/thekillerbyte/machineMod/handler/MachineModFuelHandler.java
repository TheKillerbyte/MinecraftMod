package com.thekillerbyte.machineMod.handler;

import com.thekillerbyte.machineMod.init.ModItems;
import com.thekillerbyte.machineMod.utility.LogHelper;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

/**
 * Created on 19.08.2014.
 */
public class MachineModFuelHandler implements IFuelHandler {
    @Override
    public int getBurnTime(ItemStack fuel) {
        LogHelper.info((1600 * 6 + 1200 * 2 + 100 * 3) * 3 / 2);
        if (fuel.getUnlocalizedName().equalsIgnoreCase(ModItems.compressedFuel.getUnlocalizedName())) {
            return (1600 * 6 + 1200 * 2 + 100 * 3) * 3 / 2;
        } else if (fuel.getUnlocalizedName().equalsIgnoreCase("coal")) {

        }
        return 0;
    }
}
