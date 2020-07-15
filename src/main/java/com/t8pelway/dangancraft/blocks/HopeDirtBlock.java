package com.t8pelway.dangancraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class HopeDirtBlock extends Block {
    public HopeDirtBlock() {
        super(Block.Properties.create(Material.EARTH)
                .harvestTool(ToolType.SHOVEL)
                .hardnessAndResistance(2.0f,1.0f)



        );
    }
}
