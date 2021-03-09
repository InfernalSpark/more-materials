package InfernalSpark.more.materials;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class MinerBeef {
    public static final FoodComponent MINER_BEEF = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.7F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 10000, 2), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 10000, 0), 1.0f).build();
}
