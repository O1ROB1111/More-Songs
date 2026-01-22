package me.FellTomato6998.more_songs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class more_songs implements ModInitializer {

    @Override
    public void onInitialize() {
        ModItems.registerModItems();

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register(entries -> entries.add(ModItems.APT_DISC_ITEM));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH)
                .register(entries -> entries.add(ModItems.APT_DISC_ITEM));
    }
}
