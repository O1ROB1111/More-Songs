package me.FellTomato6998.moresongsrealnum_5;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;

public class Moresongsrealnum_5 implements ModInitializer {

    @Override
    public void onInitialize() {
        ModItems.registerModItems();

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register(entries -> entries.add(ModItems.APT_DISC_ITEM));
    }
}
