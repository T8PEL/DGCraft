package com.t8pelway.dangancraft.util;

import com.t8pelway.dangancraft.DanganCraft;
import com.t8pelway.dangancraft.blocks.BlockItemBase;
import com.t8pelway.dangancraft.blocks.DespairDirtBlock;
import com.t8pelway.dangancraft.blocks.HopeDirtBlock;
import com.t8pelway.dangancraft.blocks.MonoriteOreBlock;
import com.t8pelway.dangancraft.items.ItemBase;
import com.t8pelway.dangancraft.tools.DanganItemMaterial;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class RegistryHandlerItems {
    public static final String MOD_ID = DanganCraft.MOD_ID;

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static void init(){ ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus()); }
    //Items for crafting
    public static final RegistryObject<Item> MONORITE = ITEMS.register("monorite", ItemBase::new);
    public static final RegistryObject<Item> ENHANCED_MONORITE = ITEMS.register("enhanced_monorite", ItemBase::new);
    public static final RegistryObject<Item> HOPE_FRAGMENT = ITEMS.register("hope_fragment", ItemBase::new);
    public static final RegistryObject<Item> DESPAIR_SHARD = ITEMS.register("despair_shard", ItemBase::new);
    public static final RegistryObject<Item> CARDBOARD = ITEMS.register("cardboard",ItemBase::new);
    //Dungeon Loot Items
    //public static final RegistryObject<SwordItem> GUNGNIR_SPEAR = ITEMS.register("gungnir_spear", () ->
     //       new SwordItem(DanganItemMaterial.DESPAIR, 8, -1.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS).setNoRepair()));
    //Tony's Tools, Not Yet Implamented due to reasons ;p
    public static final RegistryObject<SwordItem> CARDBOARD_SWORD_CRAFT = ITEMS.register("cardboard_sword_craft", () ->
          new SwordItem(DanganItemMaterial.TONYCRAFT, 10,0.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<SwordItem> CARDBOARD_SWORD_DUNGEON = ITEMS.register("cardboard_sword_dungeon",()->
            new SwordItem(DanganItemMaterial.TONYDUNGEON,10,0.0F,new Item.Properties().group(DanganCraft.TAB_ITEMS)));

    }

