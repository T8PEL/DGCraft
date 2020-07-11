package com.t8pelway.dangancraft.util;

import com.t8pelway.dangancraft.DanganCraft;
import com.t8pelway.dangancraft.armor.ModArmorMaterial;
import com.t8pelway.dangancraft.tools.DanganItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandlerMonorite {

    public static final String MOD_ID = DanganCraft.MOD_ID;

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //Tools
    public static final RegistryObject<SwordItem> MONORITE_SWORD = ITEMS.register("monorite_sword", () ->
            new SwordItem(DanganItemTier.MONORITE, 4, -2.6F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<PickaxeItem> MONORITE_PICK = ITEMS.register("monorite_pickaxe", ()->
            new PickaxeItem(DanganItemTier.MONORITE,0, -3.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<AxeItem> MONORITE_AXE = ITEMS.register("monorite_axe", () ->
            new AxeItem(DanganItemTier.MONORITE, 5, -4.5F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<ShovelItem> MONORITE_SHOVEL = ITEMS.register("monorite_shovel", () ->
            new ShovelItem(DanganItemTier.MONORITE, 0,0, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    //Armor
    public static final RegistryObject<ArmorItem> MONORITE_HELMET = ITEMS.register("monorite_helm", ()->
            new ArmorItem(ModArmorMaterial.MONORITE, EquipmentSlotType.HEAD, new Item.Properties().group(DanganCraft.TAB_ARMOR)));
    public static final RegistryObject<ArmorItem> MONORITE_CHESTPLATE = ITEMS.register("monorite_chestplate", ()->
            new ArmorItem(ModArmorMaterial.MONORITE, EquipmentSlotType.CHEST, new Item.Properties().group(DanganCraft.TAB_ARMOR)));
    public static final RegistryObject<ArmorItem> MONORITE_LEGGINGS = ITEMS.register("monorite_leggings", ()->
            new ArmorItem(ModArmorMaterial.MONORITE, EquipmentSlotType.LEGS, new Item.Properties().group(DanganCraft.TAB_ARMOR)));
    public static final RegistryObject<ArmorItem> MONORITE_BOOTS = ITEMS.register("monorite_boots", ()->
            new ArmorItem(ModArmorMaterial.MONORITE, EquipmentSlotType.LEGS, new Item.Properties().group(DanganCraft.TAB_ARMOR)));

}
