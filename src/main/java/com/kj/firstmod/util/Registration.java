package com.kj.firstmod.util;

import com.kj.firstmod.Myfirstmod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Myfirstmod.MOD_ID); // register my mod as a blocks

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Myfirstmod.MOD_ID); //  register my mod as a item

    public static void register(){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus(); // use eventbus on blocks and register
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }


}
