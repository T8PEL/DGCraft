package com.t8pelway.dangancraft;

import com.t8pelway.dangancraft.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("dangancraft")
public class DanganCraft
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "dangancraft";

    public DanganCraft() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static final ItemGroup TAB_ITEMS = new ItemGroup("dangantab"){

        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.MONORITE.get());
    }

};
    public static final ItemGroup TAB_BLOCKS = new ItemGroup("dangantabblocks"){

        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.DESPAIR_DIRT_BLOCK.get());
        }
};
}
