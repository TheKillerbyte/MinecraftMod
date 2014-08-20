package com.thekillerbyte.machineMod.handler;


import com.thekillerbyte.machineMod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created on 19.08.2014.
 */
public class ConfigurationsHandler {
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }


    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            // Resync configs
            loadConfiguration();
        }
    }

    private static void loadConfiguration() {
        // load the configuration file
        // configuration.load();
        // read in properties from configuration file
        testValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example Value").getBoolean(true);
        // save the configuration file
        if (configuration.hasChanged()) {
            configuration.save();
        }
        System.out.print(testValue);
    }
}
