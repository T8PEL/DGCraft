package com.t8pelway.dangancraft.util;

import com.t8pelway.dangancraft.DanganCraft;
import com.t8pelway.dangancraft.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandlerBlocks {
    public static String MOD_ID = DanganCraft.MOD_ID;
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Blocks
    public static final RegistryObject<Block> MONORITE_ORE_BLOCK = BLOCKS.register("monorite_ore_block", MonoriteOreBlock::new);
    //Despair Biome Blocks
    public static final RegistryObject<Block> DESPAIR_DIRT_BLOCK = BLOCKS.register("despair_dirt_block", DespairDirtBlock::new);
    public static final RegistryObject<Block> DESPAIR_GRASS_BLOCK = BLOCKS.register("despair_grass_block",DespairGrassBlock::new);
    public static final RegistryObject<Block> DESPAIR_STONE_BLOCK = BLOCKS.register("despair_stone_block", DespairStoneBlock::new);
    public static final RegistryObject<Block> DESPAIR_COBBLESTONE_BLOCK = BLOCKS.register("despair_cobblestone_block", DespairCobblestoneBlock::new);
    //Hope Biome Blocks
    public static final RegistryObject<Block> HOPE_DIRT_BLOCK = BLOCKS.register("hope_dirt_block", HopeDirtBlock::new);
    public static final RegistryObject<Block> HOPE_GRASS_BLOCK = BLOCKS.register("hope_grass_block", HopeGrassBlock::new);
    public static final RegistryObject<Block> HOPE_STONE_BLOCK = BLOCKS.register("hope_stone_block", HopeStoneBlock::new);
    public static final RegistryObject<Block> HOPE_COBBLESTONE_BLOCK = BLOCKS.register("hope_cobblestone_block", HopeCobblestoneBlock::new);

    //Block Items
    public static final RegistryObject<Item> MONORITE_ORE_BLOCK_ITEM = ITEMS.register("monorite_ore_block", () -> new BlockItemBase(MONORITE_ORE_BLOCK.get()));
    //Despair Biome Block Items
    public static final RegistryObject<Item> DESPAIR_DIRT_BLOCK_ITEM = ITEMS.register("despair_dirt_block", () -> new BlockItemBase(DESPAIR_DIRT_BLOCK.get()));
    public static final RegistryObject<Item> DESPAIR_GRASS_BLOCK_ITEM = ITEMS.register("despair_grass_block",()-> new BlockItemBase(DESPAIR_GRASS_BLOCK.get()));
    public static final RegistryObject<Item> DESPAIR_STONE_BLOCK_ITEM = ITEMS.register("despair_stone_block", ()-> new BlockItemBase(DESPAIR_STONE_BLOCK.get()));
    public static final RegistryObject<Item> DESPAIR_COBBLESTONE_BLOCK_ITEM = ITEMS.register("despair_cobblestone_block", ()-> new BlockItemBase(DESPAIR_COBBLESTONE_BLOCK.get()));
    //Hope Biome Block Items
    public static final RegistryObject<Item> HOPE_DIRT_BLOCK_ITEM = ITEMS.register("hope_dirt_block", ()-> new BlockItemBase(HOPE_DIRT_BLOCK.get()));
    public static final RegistryObject<Item> HOPE_GRASS_BLOCK_ITEM = ITEMS.register("hope_grass_block",()-> new BlockItemBase(HOPE_GRASS_BLOCK.get()));
    public static final RegistryObject<Item> HOPE_STONE_BLOCK_IETM = ITEMS.register("hope_stone_block", ()-> new BlockItemBase(HOPE_STONE_BLOCK.get()));
    public static final RegistryObject<Item> HOPE_COBBLESTONE_BLOCK_ITEM = ITEMS.register("hope_cobblestone_block", ()-> new BlockItemBase(HOPE_COBBLESTONE_BLOCK.get()));


}
