package com.buraki.gunmod.item;

import com.buraki.gunmod.IntroductionMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class intoroductionitems {
    // レジストリを作成
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, IntroductionMod.MOD_ID);

    // レジストリにアイテムを追加
    public static final RegistryObject<Item> RAW_ORIHALCON = ITEMS.register("raw_orihalcon", () -> new item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}