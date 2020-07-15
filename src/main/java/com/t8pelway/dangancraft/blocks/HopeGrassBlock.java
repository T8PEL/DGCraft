package com.t8pelway.dangancraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class HopeGrassBlock extends Block {
    public HopeGrassBlock() {
        super(Block.Properties.create(Material.EARTH)
        .harvestTool(ToolType.SHOVEL)
        );

    }
}
