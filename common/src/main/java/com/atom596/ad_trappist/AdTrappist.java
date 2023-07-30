package com.atom596.ad_trappist;

import com.mojang.logging.LogUtils;
import com.teamresourceful.resourcefulconfig.common.config.Configurator;
import com.atom596.ad_trappist.common.config.*;
import com.atom596.ad_trappist.common.registry.ModBlocks;
import com.atom596.ad_trappist.common.registry.ModItems;
import org.slf4j.Logger;

public class AdTrappist {
    public static final String MOD_ID = "ad_trappist";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final Configurator CONFIGURATOR = new Configurator();

    public static void init() {
        CONFIGURATOR.registerConfig(AdTrappistConfig.class);
        ModBlocks.BLOCKS.init();
        ModItems.ITEMS.init();
    }

    public static void postInit() {
    }
}
