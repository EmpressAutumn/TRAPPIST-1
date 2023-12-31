package com.atom596.ad_trappist.datagen.provider.client;

import com.atom596.ad_trappist.AdTrappist;
import com.atom596.ad_trappist.common.registry.ModBlocks;
import com.atom596.ad_trappist.common.registry.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.BlockItem;
import net.minecraftforge.common.data.LanguageProvider;
import org.codehaus.plexus.util.StringUtils;

import java.util.Objects;

public class AdTrappistLangProvider extends LanguageProvider {
    public AdTrappistLangProvider(DataGenerator generator) {
        super(generator.getPackOutput(), AdTrappist.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.modid.main", "ModId");

        ModBlocks.BLOCKS.stream().forEach(entry -> addBlock(entry, StringUtils.capitaliseAllWords(entry.getId().getPath().replace("_", " "))));
        ModItems.ITEMS.stream().filter(e -> !(e instanceof BlockItem)).forEach(entry -> addItem(entry, StringUtils.capitaliseAllWords(Objects.requireNonNull(entry.getId()).getPath().replace("_", " "))));
    }
}
