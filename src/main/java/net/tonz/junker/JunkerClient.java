package net.tonz.junker;

import net.fabricmc.api.ClientModInitializer;
import net.tonz.junker.item.ModItems;

public class JunkerClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
    }
}
