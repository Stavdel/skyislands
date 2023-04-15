package com.stav.tutorialmod.item;

import com.stav.tutorialmod.TutorialMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs
{
    public static CreativeModeTab TUTORIAL_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event)
    {
        TUTORIAL_TAB = event.registerCreativeModeTab(new ResourceLocation(TutorialMod.MODID, "tutorial_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.ZIRCON.get())).title(Component.translatable(
                        "creativemodetab.tutorial_tab")));
    }
}
