package InfernalSpark.more.materials;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class FighterBeef {
    public static final FoodComponent FIGHTER_BEEF = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.7F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 10000, 5), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 10000, 0), 1.0F).statusEffect( new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 10000, 0), 1.0F).statusEffect( new StatusEffectInstance(StatusEffects.RESISTANCE, 10000, 2), 1.0F).statusEffect( new StatusEffectInstance(StatusEffects.STRENGTH, 10000, 2), 1.0F).build();
}
