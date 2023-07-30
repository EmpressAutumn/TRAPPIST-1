package com.atom596.ad_trappist.common.registry;

import com.atom596.ad_trappist.AdTrappist;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;

public class ModBlocks {
    public static final ResourcefulRegistry<Block> BLOCKS = ResourcefulRegistries.create(BuiltInRegistries.BLOCK, AdTrappist.MOD_ID);

//    public static final RegistryEntry<Block> TEST_BLOCK = BLOCKS.register("test_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
}
