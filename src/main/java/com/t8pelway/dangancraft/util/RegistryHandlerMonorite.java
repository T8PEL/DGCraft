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

public class RegistryHandlerMonorite {

    public static final String MOD_ID = DanganCraft.MOD_ID;

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //Tools
    public static final RegistryObject<SwordItem> MONORITE_SWORD = ITEMS.register("monorite_sword", () ->
            new SwordItem(DanganItemMaterial.MONORITE, 4, -2.6F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<SwordItem> MONORITE_GAVEL = ITEMS.register("monorite_gavel", ()->
            new SwordItem(DanganItemMaterial.MONORITE, 5,0.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<PickaxeItem> MONORITE_PICKAXE = ITEMS.register("monorite_pickaxe", ()->
            new PickaxeItem(DanganItemMaterial.MONORITE,0, -3.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<AxeItem> MONORITE_AXE = ITEMS.register("monorite_axe", () ->
            new AxeItem(DanganItemMaterial.MONORITE, 5, -4.5F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<ShovelItem> MONORITE_SHOVEL = ITEMS.register("monorite_shovel", () ->
            new ShovelItem(DanganItemMaterial.MONORITE, 0,0, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<HoeItem> MONORITE_HOE = ITEMS.register("monorite_hoe",()->
            new HoeItem(DanganItemMaterial.MONORITE,-3,-1.0F,new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    //Armor
    public static final RegistryObject<ArmorItem> MONORITE_HELMET = ITEMS.register("monorite_helm", ()->
            new ArmorItem(DanganArmorMaterial.MONORITE, EquipmentSlotType.HEAD, new Item.Properties().group(DanganCraft.TAB_ARMOR)));
    public static final RegistryObject<ArmorItem> MONORITE_CHESTPLATE = ITEMS.register("monorite_chestplate", ()->
            new ArmorItem(DanganArmorMaterial.MONORITE, EquipmentSlotType.CHEST, new Item.Properties().group(DanganCraft.TAB_ARMOR)));
    public static final RegistryObject<ArmorItem> MONORITE_LEGGINGS = ITEMS.register("monorite_leggings", ()->
            new ArmorItem(DanganArmorMaterial.MONORITE, EquipmentSlotType.LEGS, new Item.Properties().group(DanganCraft.TAB_ARMOR)));
    public static final RegistryObject<ArmorItem> MONORITE_BOOTS = ITEMS.register("monorite_boots", ()->
            new ArmorItem(DanganArmorMaterial.MONORITE, EquipmentSlotType.FEET, new Item.Properties().group(DanganCraft.TAB_ARMOR)));

    //enhanced Monorite Armor
    public static final RegistryObject<ArmorItem> ENHANCED_MONORITE_HELMET = ITEMS.register("enhanced_monorite_helm", ()->
            new ArmorItem(DanganArmorMaterial.ENHANCED_MONORITE, EquipmentSlotType.HEAD, new Item.Properties().group(DanganCraft.TAB_ARMOR)));

}
