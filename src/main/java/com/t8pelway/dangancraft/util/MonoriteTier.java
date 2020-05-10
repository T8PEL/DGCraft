package com.t8pelway.dangancraft.util;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum MonoriteTier implements IItemTier   {
    ;

    @Override
    public int getMaxUses() {
        return 280;
    }

    @Override
    public float getEfficiency() {
        return 2.0f;
    }

    @Override
    public float getAttackDamage() {
        return 5.0f;
    }

    @Override
    public int getHarvestLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 1;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return null;
    }
}
