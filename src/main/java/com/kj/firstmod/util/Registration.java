package com.kj.firstmod.util;

import com.kj.firstmod.Myfirstmod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
    public static final DeferredRegister<Block> BLOCKS = // we init blocks register
            DeferredRegister.create(ForgeRegistries.BLOCKS, Myfirstmod.MOD_ID);

    public static final DeferredRegister<Item> ITEMS =  // we init items register
            DeferredRegister.create(ForgeRegistries.ITEMS, Myfirstmod.MOD_ID);

    public static void register(){ // init event bus and add blocks register and items register in it
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }


}
