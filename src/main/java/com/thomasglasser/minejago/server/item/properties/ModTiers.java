package com.thomasglasser.minejago.server.item.properties;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers
{
    public static final ForgeTier BONE_TIER = new ForgeTier(2, 150, 10.0f, 1.5f, 10, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Tags.Items.BONES));
}
