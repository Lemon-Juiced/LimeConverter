package lemon_juice.lime_converter.creative_tab;

import lemon_juice.lemon_core.creativetab.LemonCoreCreativeTabs;
import lemon_juice.lime_converter.item.LimeConverterItems;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

public class LimeConverterCreativeTab {
    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == LemonCoreCreativeTabs.LEMON_CORE_OTHER_TAB.get()) {
            event.accept(new ItemStack(LimeConverterItems.POLISHING_CLOTH.get()));
        }
    }
}
