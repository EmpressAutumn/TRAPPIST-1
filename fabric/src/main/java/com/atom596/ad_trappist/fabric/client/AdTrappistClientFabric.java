package com.atom596.ad_trappist.fabric.client;

import com.atom596.ad_trappist.client.AdTrappistClient;
import net.fabricmc.api.ClientModInitializer;

public class AdTrappistClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AdTrappistClient.init();
    }
}
