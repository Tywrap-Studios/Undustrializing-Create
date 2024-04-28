package net.tywrapstudios.undustrialized;

import net.fabricmc.api.ClientModInitializer;
import net.tywrapstudios.undustrialized.item.ModItemGroups;
import net.tywrapstudios.undustrialized.item.ModItems;

public class UndustrializedModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
        ModItemGroups.registerModItemGroups();
    }
}
