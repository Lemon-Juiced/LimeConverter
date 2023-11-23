package lemon_juice.lime_converter.item;

import lemon_juice.lime_converter.LimeConverter;
import lemon_juice.lime_converter.item.custom.PolishingClothItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class LimeConverterItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LimeConverter.MOD_ID);

    public static final DeferredItem<Item> POLISHING_CLOTH = ITEMS.register("polishing_cloth", () -> new PolishingClothItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
