package com.stav.tutorialmod;

import com.stav.tutorialmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MODID);


    // Create new blocks here:

    public static final RegistryObject<Block> ZIRCON_BLOCK = registerBlock("zircon_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PALM_LOG = registerBlock("palm_log",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(3f)));


    public static final RegistryObject<Block> PALM_LEAVES = registerBlock("palm_leaves",
            () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES).strength(3f)));


    public static final RegistryObject<Block> XYLEM_BLOCK = registerBlock("xylem_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.GRASS).strength(3f).requiresCorrectToolForDrops()));




    // End of blocks

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    // test

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }




    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }



    // why isn't this working.
    // one final test.

}
