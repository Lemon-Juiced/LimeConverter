package lemon_juice.lime_converter.item.custom;

import lemon_juice.lime_converter.item.LimeConverterItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PolishingClothItem extends Item {
    public PolishingClothItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        return new ItemStack(LimeConverterItems.POLISHING_CLOTH.get());
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        components.add(Component.translatable("tooltip.lime_converter.lemon_to_lime_1"));
        components.add(Component.translatable("tooltip.lime_converter.lemon_to_lime_2"));
    }
}
