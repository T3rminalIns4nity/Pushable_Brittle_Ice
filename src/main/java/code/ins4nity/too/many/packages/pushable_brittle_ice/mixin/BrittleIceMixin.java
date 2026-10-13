package code.ins4nity.too.many.packages.pushable_brittle_ice.mixin;

import net.minecraft.world.level.block.BrittleIceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockBehaviour.BlockStateBase.class)
public class BrittleIceMixin {

    @Inject(
            method = "getPistonPushReaction",
            at = @At("HEAD"),
            cancellable = true
    )
    private void overridePushReaction(CallbackInfoReturnable<PushReaction> cir) {
        BlockBehaviour.BlockStateBase state = (BlockBehaviour.BlockStateBase) (Object) this;

        if (state.getBlock() instanceof BrittleIceBlock) {
            cir.setReturnValue(PushReaction.PUSH_PULL);
        }
    }
}