package com.t8pelway.dangancraft.tools;

import com.t8pelway.dangancraft.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum DanganItemTier implements IItemTier {

    MONORITE(2, 450, 7.0F, 2.0F, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.MONORITE.get());
    }),
    HOPE(3, 1000, 9.0F, 3.0F, 15, () -> {
        return Ingredient.fromItems(RegistryHandler.HOPE_FRAGMENT.get());
    }),
    DESPAIR(3, 1800, 8.0F, 4.5F, 15, () ->{
        return Ingredient.fromItems(RegistryHandler.DESPAIR_SHARD.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float effciency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    DanganItemTier(int harvestLevel, int maxUses, float effciency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.effciency = effciency;
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
        return effciency;
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
        return repairMaterial.get();
    }
}
