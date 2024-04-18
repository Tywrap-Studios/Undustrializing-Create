package net.tywrapstudios.c_undustrialized;

import net.fabricmc.api.ClientModInitializer;
import net.tywrapstudios.c_undustrialized.item.ModItems;

public class UndustrializedModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
    }
}
