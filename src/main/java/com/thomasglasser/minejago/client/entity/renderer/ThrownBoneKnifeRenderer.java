package com.thomasglasser.minejago.client.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import com.thomasglasser.minejago.MinejagoMod;
import com.thomasglasser.minejago.client.entity.model.BoneKnifeModel;
import com.thomasglasser.minejago.server.entity.projectile.ThrownBoneKnife;
import net.minecraft.client.model.TridentModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.projectile.ThrownTrident;

public class ThrownBoneKnifeRenderer extends EntityRenderer<ThrownBoneKnife>
{
    public static final ResourceLocation TEXTURE_LOCATION = new ResourceLocation(MinejagoMod.MODID, "textures/entity/bone_knife.png");
    private final BoneKnifeModel model;

    public ThrownBoneKnifeRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.model = new BoneKnifeModel(context.bakeLayer(BoneKnifeModel.LAYER_LOCATION));
    }

    public void render(ThrownBoneKnife pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.pushPose();
        pMatrixStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(pPartialTicks, pEntity.yRotO, pEntity.getYRot()) - 90.0F));
        pMatrixStack.mulPose(Vector3f.ZP.rotationDegrees(Mth.lerp(pPartialTicks, pEntity.xRotO, pEntity.getXRot()) + 90.0F));
        VertexConsumer vertexconsumer = ItemRenderer.getFoilBufferDirect(pBuffer, this.model.renderType(this.getTextureLocation(pEntity)), false, pEntity.isFoil());
        this.model.renderToBuffer(pMatrixStack, vertexconsumer, pPackedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        pMatrixStack.popPose();
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }

    /**
     * Returns the location of an entity's texture.
     */
    public ResourceLocation getTextureLocation(ThrownBoneKnife pEntity) {
        return TEXTURE_LOCATION;
    }
}
