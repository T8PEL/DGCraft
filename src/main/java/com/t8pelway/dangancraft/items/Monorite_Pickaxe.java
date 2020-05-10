package com.t8pelway.dangancraft.items;

import com.t8pelway.dangancraft.util.MonoriteTier;
import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class Monorite_Pickaxe extends PickaxeItem  {


    private static final Object MonoriteTier = null ;

    public Monorite_Pickaxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super((IItemTier) MonoriteTier, 3, 3, builder);
    }
}

