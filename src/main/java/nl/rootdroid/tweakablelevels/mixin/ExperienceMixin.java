package nl.rootdroid.tweakablelevels.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class ExperienceMixin {
	@Inject(at = @At("HEAD"), method = "getNextLevelExperience", cancellable = true)
	private void getNextLevelExperience(CallbackInfoReturnable<Integer> returnable) {
		returnable.setReturnValue(7);
	}
}
