package com.thomasglasser.minejago.server.item.property;

import com.thomasglasser.minejago.MinejagoMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.Arrays;

public class ModTiers
{
    public static final ForgeTier BONE_TIER = new ForgeTier(2, 150, 10.0f, 1.5f, 10, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Tags.Items.BONES));

    public static void register()
    {
        TierSortingRegistry.registerTier(BONE_TIER, new ResourceLocation(MinejagoMod.MODID, "bone_tier"), Arrays.asList(Tiers.WOOD, Tiers.GOLD, Tiers.STONE), Arrays.asList(Tiers.IRON, Tiers.DIAMOND, Tiers.NETHERITE));
    }
}
