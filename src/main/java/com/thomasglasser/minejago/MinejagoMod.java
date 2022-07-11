package com.thomasglasser.minejago;

import com.thomasglasser.minejago.init.Elements;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.thomasglasser.minejago.init.ClientSetup;
import com.thomasglasser.minejago.init.ModSetup;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MinejagoMod.MODID)
public class MinejagoMod
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MODID = "minejago";

    public MinejagoMod() {
        Elements.init();

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> bus.addListener(ClientSetup::init));
    }
}
