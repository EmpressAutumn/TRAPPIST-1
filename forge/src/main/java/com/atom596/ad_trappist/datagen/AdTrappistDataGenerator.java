package com.atom596.ad_trappist.datagen;

import com.atom596.ad_trappist.AdTrappist;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AdTrappist.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class AdTrappistDataGenerator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        // Client
        generator.addProvider(event.includeClient(), new com.atom596.ad_trappist.datagen.provider.client.AdTrappistLangProvider(generator));

        // Server
    }
}
