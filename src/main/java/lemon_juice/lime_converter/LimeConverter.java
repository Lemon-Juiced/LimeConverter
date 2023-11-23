package lemon_juice.lime_converter;

import lemon_juice.lime_converter.creative_tab.LimeConverterCreativeTab;
import lemon_juice.lime_converter.item.LimeConverterItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(LimeConverter.MOD_ID)
public class LimeConverter {
    public static final String MOD_ID = "lime_converter";

    public LimeConverter(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);

        // Register Items
        LimeConverterItems.register(modEventBus);

        // Register Creative Tab
        modEventBus.addListener(LimeConverterCreativeTab::registerTabs);

        NeoForge.EVENT_BUS.register(this);
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