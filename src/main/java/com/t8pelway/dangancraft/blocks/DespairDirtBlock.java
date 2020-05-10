package com.t8pelway.dangancraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class DespairDirtBlock extends Block {
    public DespairDirtBlock() {
        super(Block.Properties.create(Material.MISCELLANEOUS)
        .harvestTool(ToolType.SHOVEL)
        .hardnessAndResistance(2.0f,1.0f)



        );
    }
}
