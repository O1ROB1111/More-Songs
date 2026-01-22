package me.FellTomato6998.moresongsrealnum_5;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item APT_DISC_ITEM = registerItem("music_disc_1", new Item.Settings());

    private static Item registerItem(String name, Item.Settings settings) {
        Identifier id = Identifier.of("music_disc_1", name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        return Registry.register(Registries.ITEM, key, new Item(settings.registryKey(key)));
    }

    public static void registerModItems(){

    }
}
