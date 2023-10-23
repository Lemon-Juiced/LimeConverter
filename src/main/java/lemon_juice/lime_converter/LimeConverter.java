package lemon_juice.lime_converter;

import lemon_juice.lemon_core.block.ModBlocks;
import lemon_juice.lemon_core.creativetab.ModCreativeTabs;
import lemon_juice.lemon_core.item.ModItems;
import lemon_juice.lime_converter.creative_tab.LimeConverterCreativeTab;
import lemon_juice.lime_converter.item.LimeConverterItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(LimeConverter.MOD_ID)
public class LimeConverter {
    public static final String MOD_ID = "lime_converter";

    public LimeConverter() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register Items
        LimeConverterItems.register(modEventBus);

        // Register Creative Tab
        modEventBus.addListener(LimeConverterCreativeTab::registerTabs);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}