package com.t8pelway.dangancraft.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MonoriteOreBlock extends Block {
    public MonoriteOreBlock() {
        super(Block.Properties.create(Material.IRON)
            .hardnessAndResistance(5.0f,6.0f)
            .harvestLevel(2)
            .doesNotBlockMovement()
            .lightValue(4)
            .sound(SoundType.METAL)
            .harvestTool(ToolType.PICKAXE)

        );
    }
}
