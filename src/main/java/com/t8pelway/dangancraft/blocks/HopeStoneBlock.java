package com.t8pelway.dangancraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class HopeStoneBlock extends Block {
    public HopeStoneBlock() {
        super(Block.Properties.create(Material.EARTH)
        .harvestTool(ToolType.PICKAXE)


        );
    }
}
