package com.atom596.ad_trappist.forge.common.config;

import com.teamresourceful.resourcefulconfig.client.ConfigScreen;
import com.teamresourceful.resourcefulconfig.common.config.ResourcefulConfig;
import com.atom596.ad_trappist.AdTrappist;
import com.atom596.ad_trappist.common.config.AdTrappistConfig;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.fml.ModLoadingContext;

public class ForgeMenuConfig {
    public static void register() {
        ModLoadingContext.get().registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class,
                () -> new ConfigScreenHandler.ConfigScreenFactory((client, parent) -> {
                    ResourcefulConfig config = AdTrappist.CONFIGURATOR.getConfig(AdTrappistConfig.class);
                    if (config == null) {
                        return null;
                    }
                    return new ConfigScreen(null, config);
                })
        );
    }
}
