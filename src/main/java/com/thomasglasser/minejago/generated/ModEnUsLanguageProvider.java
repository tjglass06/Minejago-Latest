package com.thomasglasser.minejago.generated;

import com.thomasglasser.minejago.MinejagoMod;
import com.thomasglasser.minejago.init.Elements;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnUsLanguageProvider extends LanguageProvider
{

    public ModEnUsLanguageProvider(DataGenerator generator)
    {
        super(generator, MinejagoMod.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(Elements.BONE_KNIFE.get(), "Bone Knife");
    }
}
