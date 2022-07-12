package com.thomasglasser.minejago.init;

import com.thomasglasser.minejago.MinejagoMod;
import com.thomasglasser.minejago.server.item.BoneKnifeItem;
import com.thomasglasser.minejago.server.entity.projectile.ThrownBoneKnife;
import com.thomasglasser.minejago.server.item.property.ModTiers;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Elements {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinejagoMod.MODID);
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MinejagoMod.MODID);

    public static void init()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
        ENTITY_TYPES.register(bus);
    }

    //ITEMS
    public static final RegistryObject<Item> BONE_KNIFE = ITEMS.register("bone_knife", () -> new BoneKnifeItem(ModTiers.BONE_TIER, 3, -2, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //ENTITY TYPES
    public static final RegistryObject<EntityType<ThrownBoneKnife>> THROWN_BONE_KNIFE = ENTITY_TYPES.register("throw_bone_knife", () -> EntityType.Builder.<ThrownBoneKnife>of(ThrownBoneKnife::new, MobCategory.MISC)
            .sized(0.5F, 0.5F)
            .clientTrackingRange(4)
            .updateInterval(20)
            .setShouldReceiveVelocityUpdates(true)
            .build("thrown_bone_knife"));
}
