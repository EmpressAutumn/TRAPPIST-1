package com.atom596.ad_trappist.fabric;

import com.atom596.ad_trappist.AdTrappist;
import net.fabricmc.api.ModInitializer;

public class AdTrappistFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AdTrappist.init();
    }
}
