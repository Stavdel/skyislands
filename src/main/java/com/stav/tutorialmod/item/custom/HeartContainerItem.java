package com.stav.tutorialmod.item.custom;

import net.minecraft.network.protocol.game.ClientboundSetHealthPacket;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class HeartContainerItem extends Item {

    //Constructor
    public HeartContainerItem(Properties properties) {
        super(properties);
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

            // Would this be client or server side?
            //System.out.println("Player health: " + player.getHealth());




        return super.use(level, player, hand);
    }
}
