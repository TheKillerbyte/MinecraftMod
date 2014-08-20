package com.thekillerbyte.machineMod.creativetab;

import com.thekillerbyte.machineMod.init.ModItems;
import com.thekillerbyte.machineMod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created on 20.08.2014.
 */
public class CreativeTabMM {
    public static final CreativeTabs MM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.filter;
        }
    };
}
