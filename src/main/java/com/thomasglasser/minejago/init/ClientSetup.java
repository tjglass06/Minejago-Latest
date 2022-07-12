package com.thomasglasser.minejago.init;

import com.thomasglasser.minejago.MinejagoMod;
import com.thomasglasser.minejago.client.entity.model.BoneKnifeModel;
import com.thomasglasser.minejago.client.entity.renderer.ThrownBoneKnifeRenderer;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MinejagoMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {
    public static void init(FMLClientSetupEvent event) {
    }

    @SubscribeEvent
    public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event)
    {
        event.registerLayerDefinition(BoneKnifeModel.LAYER_LOCATION, BoneKnifeModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void onRegisterRenderer(EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerEntityRenderer(Elements.THROWN_BONE_KNIFE.get(), ThrownBoneKnifeRenderer::new);
    }
}
