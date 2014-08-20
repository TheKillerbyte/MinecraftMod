package com.thekillerbyte.machineMod;

import com.thekillerbyte.machineMod.handler.ConfigurationsHandler;
import com.thekillerbyte.machineMod.handler.MachineModFuelHandler;
import com.thekillerbyte.machineMod.init.ModBlock;
import com.thekillerbyte.machineMod.init.ModItems;
import com.thekillerbyte.machineMod.init.Recipes;
import com.thekillerbyte.machineMod.proxy.IProxy;
import com.thekillerbyte.machineMod.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MachineMod {
    @Mod.Instance("machinemod")
    public static MachineMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_SIDE, serverSide = Reference.SERVER_SIDE)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationsHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationsHandler());
        // item and block

        ModItems.init();
        ModBlock.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // gui crafting handlers
        GameRegistry.registerFuelHandler(new MachineModFuelHandler());
        Recipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // crafting handler with other mods

    }

}
