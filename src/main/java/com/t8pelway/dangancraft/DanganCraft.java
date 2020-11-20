package com.t8pelway.dangancraft;

import com.t8pelway.dangancraft.util.RegistryHandlerBlocks;
import com.t8pelway.dangancraft.util.RegistryHandlerHD;
import com.t8pelway.dangancraft.util.RegistryHandlerItems;
import com.t8pelway.dangancraft.util.RegistryHandlerMonorite;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("dangancraft")
public class DanganCraft {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "dangancraft";

    public DanganCraft() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandlerItems.init();
        RegistryHandlerMonorite.init();
        RegistryHandlerHD.init();
        RegistryHandlerBlocks.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    public static final ItemGroup TAB_ITEMS = new ItemGroup("dangan_tab_items") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandlerItems.MONORITE.get());
        }

    };
    public static final ItemGroup TAB_BLOCKS = new ItemGroup("dangan_tab_blocks") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandlerBlocks.DESPAIR_DIRT_BLOCK.get());
        }
    };
    public static final ItemGroup TAB_ARMOR = new ItemGroup("dangan_tab_armor") {

        @Override
        public ItemStack createIcon() { return new ItemStack(RegistryHandlerMonorite.MONORITE_CHESTPLATE.get()); }
    };
}
