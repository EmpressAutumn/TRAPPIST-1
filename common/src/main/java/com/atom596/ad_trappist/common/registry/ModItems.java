package com.atom596.ad_trappist.common.registry;

import com.atom596.ad_trappist.AdTrappist;
import com.teamresourceful.resourcefullib.common.item.tabs.ResourcefulCreativeTab;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Supplier;

public class ModItems {
    public static final ResourcefulRegistry<Item> ITEMS = ResourcefulRegistries.create(BuiltInRegistries.ITEM, AdTrappist.MOD_ID);

    public static final RegistryEntry<Item> SPACE_PAINTING = ITEMS.register("space_painting", () -> new Item(new Item.Properties()));
    public static final Supplier<CreativeModeTab> TRAPPIST_TAB = new ResourcefulCreativeTab(new ResourceLocation(AdTrappist.MOD_ID, "trappist"))
            .setItemIcon(SPACE_PAINTING)
            .addRegistry(ITEMS)
            .build();
}
