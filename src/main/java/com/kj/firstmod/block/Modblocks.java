package com.kj.firstmod.block;

import com.kj.firstmod.Myfirstmod;
import com.kj.firstmod.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import java.util.function.Supplier;

public class Modblocks {
    // use register method to init COPPER_BLOCK
    public static final RegistryObject<Block> COPPER_BLOCK = register("copper_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)));
    public static final RegistryObject<Block> COPPER_ORE = register("copper_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).harvestTool(ToolType.AXE)));

    public static void register() { }

    // define register method
    private static <T extends Block> RegistryObject<T>  register(String name, Supplier<T> block){
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block); // regist blocks
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(), // blocks also be items
                new Item.Properties().group(Myfirstmod.MOD_TAP)));
        return toReturn;
    }
}
