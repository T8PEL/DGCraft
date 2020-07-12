package com.t8pelway.dangancraft.util;

import com.t8pelway.dangancraft.DanganCraft;
import com.t8pelway.dangancraft.armor.DanganArmorMaterial;
import com.t8pelway.dangancraft.tools.DanganItemMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandlerHD {

    public static final String MOD_ID = DanganCraft.MOD_ID;

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //Hope Tools
    public static final RegistryObject<SwordItem> HOPE_SWORD = ITEMS.register("hope_sword", () ->
            new SwordItem(DanganItemMaterial.HOPE, 5, -2.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<SwordItem> HOPE_GAVEL = ITEMS.register("hope_gavel",()->
            new SwordItem(DanganItemMaterial.HOPE, 7,0.0F,new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<PickaxeItem> HOPE_PICKAXE = ITEMS.register("hope_pickaxe", () ->
            new PickaxeItem(DanganItemMaterial.HOPE, 0, -5.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<AxeItem> HOPE_AXE = ITEMS.register("hope_axe", () ->
            new AxeItem(DanganItemMaterial.HOPE, 7, -4.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<ShovelItem> HOPE_SHOVEL = ITEMS.register("hope_shovel", () ->
            new ShovelItem(DanganItemMaterial.HOPE, 0, -5.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<HoeItem> HOPE_HOE = ITEMS.register("hope_hoe", ()->
            new HoeItem(DanganItemMaterial.HOPE,-3,-1.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    //Hope Armor
    public static final RegistryObject<ArmorItem> HOPE_HELMET = ITEMS.register("hope_helm", ()->
            new ArmorItem(DanganArmorMaterial.HOPE, EquipmentSlotType.HEAD, new Item.Properties().group(DanganCraft.TAB_ARMOR)));
    public static final RegistryObject<ArmorItem> HOPE_CHESTPLATE = ITEMS.register("hope_chestplate", ()->
            new ArmorItem(DanganArmorMaterial.HOPE, EquipmentSlotType.CHEST, new Item.Properties().group(DanganCraft.TAB_ARMOR)));
    public static final RegistryObject<ArmorItem> HOPE_LEGGINGS = ITEMS.register("hope_leggings", ()->
            new ArmorItem(DanganArmorMaterial.HOPE, EquipmentSlotType.LEGS, new Item.Properties().group(DanganCraft.TAB_ARMOR)));
    public static final RegistryObject<ArmorItem> HOPE_BOOTS = ITEMS.register("hope_boots", ()->
            new ArmorItem(DanganArmorMaterial.HOPE, EquipmentSlotType.FEET, new Item.Properties().group(DanganCraft.TAB_ARMOR)));

    //Despair Tools
    public static final RegistryObject<SwordItem> DESPAIR_SWORD = ITEMS.register("despair_sword", () ->
            new SwordItem(DanganItemMaterial.DESPAIR, 5, -2.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<SwordItem> DESPAIR_GAVEL = ITEMS.register("despair_gavel",()->
            new SwordItem(DanganItemMaterial.DESPAIR, 7,0.0F,new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<PickaxeItem> DESPAIR_PICKAXE = ITEMS.register("despair_pickaxe", () ->
            new PickaxeItem(DanganItemMaterial.DESPAIR, 0, -5.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<AxeItem> DESPAIR_AXE = ITEMS.register("despair_axe", () ->
            new AxeItem(DanganItemMaterial.DESPAIR, 7, -4.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<ShovelItem> DESPAIR_SHOVEL = ITEMS.register("despair_shovel", () ->
            new ShovelItem(DanganItemMaterial.DESPAIR, 0, -5.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<HoeItem> DESPAIR_HOE = ITEMS.register("despair_hoe",()->
            new HoeItem(DanganItemMaterial.DESPAIR,-3,-1.0F,new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    //Despair Armor
    public static final RegistryObject<ArmorItem> DESPAIR_HELM = ITEMS.register("despair_helm",()->
            new ArmorItem(DanganArmorMaterial.DESPAIR, EquipmentSlotType.HEAD, new Item.Properties().group(DanganCraft.TAB_ARMOR)));
    public static final RegistryObject<ArmorItem> DESPAIR_CHESTPLATE = ITEMS.register("despair_chestplate",()->
            new ArmorItem(DanganArmorMaterial.DESPAIR, EquipmentSlotType.CHEST, new Item.Properties().group(DanganCraft.TAB_ARMOR)));
    public static final RegistryObject<ArmorItem> DESPAIR_LEGGINGS = ITEMS.register("despair_leggings", ()->
            new ArmorItem(DanganArmorMaterial.DESPAIR, EquipmentSlotType.LEGS, new Item.Properties().group(DanganCraft.TAB_ARMOR)));
    public static final RegistryObject<ArmorItem> DESPAIR_BOOTS = ITEMS.register("despair_boots", ()->
            new ArmorItem(DanganArmorMaterial.DESPAIR, EquipmentSlotType.FEET, new Item.Properties().group(DanganCraft.TAB_ARMOR)));
}
