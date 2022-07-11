package com.thomasglasser.minejago.generated;

import com.thomasglasser.minejago.MinejagoMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModItemTags extends ItemTagsProvider
{

    public ModItemTags(DataGenerator generator, BlockTagsProvider blockTags, @Nullable ExistingFileHelper helper) {
        super(generator, blockTags, MinejagoMod.MODID, helper);
    }

    @Override
    protected void addTags() {

    }

    @Override
    public String getName()
    {
        return "Minejago Tags";
    }
}
