package com.t8pelway.dangancraft.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class HopeCobblestoneBlock extends Block {
    public HopeCobblestoneBlock() {
        super(Block.Properties.create(Material.EARTH)
        .harvestTool(ToolType.PICKAXE));
    }
}
