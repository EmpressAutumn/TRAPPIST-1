package com.atom596.ad_trappist.forge;

import com.atom596.ad_trappist.AdTrappist;
import com.atom596.ad_trappist.client.AdTrappistClient;
import com.atom596.ad_trappist.forge.client.AdTrappistClientForge;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AdTrappist.MOD_ID)
public class AdTrappistForge {
    public AdTrappistForge() {
        AdTrappist.init();
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(AdTrappistForge::commonSetup);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> AdTrappistClientForge::init);
        bus.addListener(AdTrappistForge::onClientSetup);
    }

    public static void commonSetup(FMLCommonSetupEvent event) {
        AdTrappist.postInit();
    }

    public static void onClientSetup(FMLClientSetupEvent event) {
        AdTrappistClient.init();
        AdTrappistClientForge.postInit();
    }
}
