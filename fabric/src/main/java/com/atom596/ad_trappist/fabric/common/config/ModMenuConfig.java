package com.atom596.ad_trappist.fabric.common.config;

import com.atom596.ad_trappist.AdTrappist;
import com.teamresourceful.resourcefulconfig.client.ConfigScreen;
import com.teamresourceful.resourcefulconfig.common.config.ResourcefulConfig;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import com.atom596.ad_trappist.common.config.AdTrappistConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ModMenuConfig implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> {
            ResourcefulConfig config = AdTrappist.CONFIGURATOR.getConfig(AdTrappistConfig.class);
            if (config == null) {
                return null;
            }
            return new ConfigScreen(null, config);
        };
    }
}
