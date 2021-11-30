package com.kj.firstmod.item;

import com.kj.firstmod.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class Moditems {
    public static final RegistryObject<Item> COPPER_INGOT =
            Registration.ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static void register() { }

}
