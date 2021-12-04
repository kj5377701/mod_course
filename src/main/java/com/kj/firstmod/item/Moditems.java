package com.kj.firstmod.item;

import com.kj.firstmod.Myfirstmod;
import com.kj.firstmod.util.Registration;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class Moditems {
    public static final RegistryObject<Item> COPPER_WIRE =
            Registration.ITEMS.register("copper_wire", () -> new Item(new Item.Properties().group(Myfirstmod.MOD_TAP)));
    public static final RegistryObject<Item> COPPER_INGOT = // regist a new item name
            Registration.ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().group(Myfirstmod.MOD_TAP).maxStackSize(24)));
    public static final RegistryObject<Item> COPPERED_APPLE =
            Registration.ITEMS.register("coppered_apple", () -> new CopperedApple());

    /* TOOLS */
    public static final RegistryObject<Item> COPPER_SHOVEL =
            Registration.ITEMS.register("copper_shovel",
                    () -> new ShovelItem(ModItemTier.COPPER, 0f, 0f,
                            new Item.Properties()
                                    .group(Myfirstmod.MOD_TAP)
                                    .defaultMaxDamage(150)
                                    .addToolType(ToolType.SHOVEL, 2)));

    public static void register() { }

    public enum ModItemTier implements IItemTier {
        COPPER(2, 150, 2.5f, 0f, 15, Ingredient.fromStacks(new ItemStack(Moditems.COPPER_INGOT.get())));

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final Ingredient repairMaterial;

        ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Ingredient repairMaterial) {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = repairMaterial;
        }


        @Override
        public int getMaxUses() {
            return maxUses;
        }

        @Override
        public float getEfficiency() {
            return efficiency;
        }

        @Override
        public float getAttackDamage() {
            return attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return harvestLevel;
        }

        @Override
        public int getEnchantability() {
            return enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return repairMaterial;
        }
    }

}
