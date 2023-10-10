package me.xmrvizzy.skyblocker.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import me.xmrvizzy.skyblocker.config.SkyblockerConfigManager;
import me.xmrvizzy.skyblocker.utils.ItemUtils;
import me.xmrvizzy.skyblocker.utils.Utils;
import net.minecraft.item.DyeableItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(DyeableItem.class)
public interface DyeableItemMixin {
	@ModifyReturnValue(method = "getColor", at = @At("RETURN"))
	private int skyblocker$customDyeColor(int originalColor, ItemStack stack) {
		if (Utils.isOnSkyblock()) {
			String itemUuid = ItemUtils.getItemUuid(stack);

			return SkyblockerConfigManager.get().general.customDyeColors.getOrDefault(itemUuid, originalColor);
		}

		return originalColor;
	}
}
