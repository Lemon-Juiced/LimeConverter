package lemon_juice.lime_converter.item;

import lemon_juice.lime_converter.LimeConverter;
import lemon_juice.lime_converter.item.custom.PolishingClothItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LimeConverterItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LimeConverter.MOD_ID);

    public static final RegistryObject<Item> POLISHING_CLOTH = ITEMS.register("polishing_cloth", () -> new PolishingClothItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
