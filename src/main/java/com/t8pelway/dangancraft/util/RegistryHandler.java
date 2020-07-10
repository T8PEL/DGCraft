package com.t8pelway.dangancraft.util;

import com.t8pelway.dangancraft.DanganCraft;
import com.t8pelway.dangancraft.blocks.BlockItemBase;
import com.t8pelway.dangancraft.blocks.DespairDirtBlock;
import com.t8pelway.dangancraft.blocks.MonoriteOreBlock;
import com.t8pelway.dangancraft.items.ItemBase;
import com.t8pelway.dangancraft.tools.DanganItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class RegistryHandler {
    public static final String MOD_ID = DanganCraft.MOD_ID;

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<Block> CUSTOMBLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        CUSTOMBLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //Items
    public static final RegistryObject<Item> MONORITE = ITEMS.register("monorite", ItemBase::new);
    public static final RegistryObject<Item> HOPE_FRAGMENT = ITEMS.register("hope_fragment", ItemBase::new);
    public static final RegistryObject<Item> DESPAIR_SHARD = ITEMS.register("despair_shard", ItemBase::new);
    //Tools
    public static final RegistryObject<SwordItem> MONORITE_SWORD = ITEMS.register("monorite_sword", () ->
            new SwordItem(DanganItemTier.MONORITE, 4, -2.6F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<SwordItem> HOPE_SWORD = ITEMS.register("hope_sword", () ->
            new SwordItem(DanganItemTier.HOPE, 5, -2.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    public static final RegistryObject<SwordItem> DESPAIR_SWORD = ITEMS.register("despair_sword", () ->
            new SwordItem(DanganItemTier.DESPAIR, 5, -2.0F, new Item.Properties().group(DanganCraft.TAB_ITEMS)));
    //public static final RegistryObject<Item> GUNGNIR_SPEAR = ITEMS.register("gungnir_spear", ItemBase::new);

    //Armor
    //public static final RegistryObject<Item> MONORITE_HELM = ITEMS.register("monorite_helm", ItemBase::new);
    //public static final RegistryObject<Item> MONORITE_CHESTPLATE = ITEMS.register("monorite_chestplate", ItemBase::new);
    //public static final RegistryObject<Item> MONORITE_PANTS = ITEMS.register("monorite_pants", ItemBase::new);
    //public static final RegistryObject<Item> MONORITE_BOOTS = ITEMS.register("monorite_boots", ItemBase::new);

    //Blocks
    public static final RegistryObject<Block> MONORITE_ORE_BLOCK = CUSTOMBLOCKS.register("monorite_ore_block", MonoriteOreBlock::new);
    public static final RegistryObject<Block> DESPAIR_DIRT_BLOCK = CUSTOMBLOCKS.register("despair_dirt_block", DespairDirtBlock::new);



    //Block Items
    public static final RegistryObject<Item> MONORITE_ORE_BLOCK_ITEM = ITEMS.register("monorite_ore_block", () -> new BlockItemBase(MONORITE_ORE_BLOCK.get()));
    public static final RegistryObject<Item> DESPAIR_DIRT_BLOCK_ITEM = ITEMS.register("despair_dirt_block", () -> new BlockItemBase(DESPAIR_DIRT_BLOCK.get()));
}

