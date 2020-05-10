package com.t8pelway.dangancraft.blocks;

import com.t8pelway.dangancraft.DanganCraft;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {


    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(DanganCraft.TAB_BLOCKS));
    }
}
