package com.t8pelway.dangancraft.world.gen;

import com.t8pelway.dangancraft.DanganCraft;
import com.t8pelway.dangancraft.util.RegistryHandlerItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

@Mod.EventBusSubscriber(modid = DanganCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreGenHandler {

    //public static OreFeatureConfig.FillerBlockType END_STONE = OreFeatureConfig.FillerBlockType.create("END_STONE", "end_stone", new BlockMatcher(Blocks.END_STONE));


    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event){
        for (Biome biome : ForgeRegistries.BIOMES){
            //Nether Gen (Future Proofing)
            if (biome.getCategory() == Biome.Category.NETHER){
                //genOre(biome, 10, 5,5,80, OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandlerItems.MONORITE_ORE_BLOCK.get().getDefaultState(), 6);

                //End Gen (Future Proofing
            } else if (biome.getCategory() == Biome.Category.THEEND){

                //World Gen
            } else {
                genOre(biome, 15, 16,5,60, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandlerItems.MONORITE_ORE_BLOCK.get().getDefaultState(), 4);
            }
        }
    }

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate, int size){
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler,defaultBlockstate, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
}
