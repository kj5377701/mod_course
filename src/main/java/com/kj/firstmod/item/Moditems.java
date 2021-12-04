package com.kj.firstmod.item;

import com.kj.firstmod.Myfirstmod;
import com.kj.firstmod.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class Moditems {
    public static final RegistryObject<Item> COPPER_WIRE =
            Registration.ITEMS.register("copper_wire", () -> new Item(new Item.Properties().group(Myfirstmod.MOD_TAP)));
    public static final RegistryObject<Item> COPPER_INGOT = // regist a new item name
            Registration.ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().group(Myfirstmod.MOD_TAP).maxStackSize(24)));

    public static void register() { }

}
