package com.kj.firstmod.item;

import com.kj.firstmod.Myfirstmod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CopperedApple extends Item
{
    public CopperedApple(){
        super(new Properties().group(Myfirstmod.MOD_TAP)
                .food(new Food.Builder()
                        .hunger(5)
                        .saturation(1.5f)
                        .effect(() -> new EffectInstance(Effects.GLOWING, 300, 1), 0.5f)
                        .build()));
    }
}
