package com.t8pelway.dangancraft.util;

import com.t8pelway.dangancraft.DanganCraft;
import com.t8pelway.dangancraft.tools.DanganItemTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandlerHD {

    public static final String MOD_ID = DanganCraft.MOD_ID;

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //Hope Tools
    public static final RegistryObject<SwordItem> HOPE_SWORD = ITEMS.register("hope_sword", () ->
            new SwordItem(DanganItemTier.HOPE, 5, -2.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<PickaxeItem> HOPE_PICK = ITEMS.register("hope_pick", () ->
            new PickaxeItem(DanganItemTier.HOPE, 0, -5.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<AxeItem> HOPE_AXE = ITEMS.register("hope_axe", () ->
            new AxeItem(DanganItemTier.HOPE, 7, -4.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<ShovelItem> HOPE_SHOVEL = ITEMS.register("hope_shovel", () ->
            new ShovelItem(DanganItemTier.HOPE, 0, -5.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));

    //Despair Tools
    public static final RegistryObject<SwordItem> DESPAIR_SWORD = ITEMS.register("despair_sword", () ->
            new SwordItem(DanganItemTier.DESPAIR, 5, -2.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<PickaxeItem> DESPAIR_PICK = ITEMS.register("despair_pick", () ->
            new PickaxeItem(DanganItemTier.DESPAIR, 0, -5.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<AxeItem> DESPAIR_AXE = ITEMS.register("despair_axe", () ->
            new AxeItem(DanganItemTier.DESPAIR, 7, -4.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<ShovelItem> DESPAIR_SHOVEL = ITEMS.register("despair_shovel", () ->
            new ShovelItem(DanganItemTier.DESPAIR, 0, -5.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
}
