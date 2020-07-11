package com.t8pelway.dangancraft.armor;

import com.t8pelway.dangancraft.DanganCraft;
import com.t8pelway.dangancraft.util.RegistryHandlerItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum DanganArmorMaterial implements IArmorMaterial {

    MONORITE(DanganCraft.MOD_ID + ":monorite", 30, new int[] { 3,6,7,3 }, 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1.5F, () ->
    { return Ingredient.fromItems(RegistryHandlerItems.MONORITE.get()); }),
    HOPE(DanganCraft.MOD_ID + ":hope", 40, new int[] { 3,6,7,3 }, 22, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0F, () ->
    { return Ingredient.fromItems(RegistryHandlerItems.HOPE_FRAGMENT.get()); }),
    DESPAIR(DanganCraft.MOD_ID + ":hope", 40, new int[] { 3,6,7,3 }, 22, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0F, () ->
    { return Ingredient.fromItems(RegistryHandlerItems.HOPE_FRAGMENT.get()); });




    private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmtArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;

    DanganArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmtArray, int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial){
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmtArray = damageReductionAmtArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmtArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }
    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }
}
