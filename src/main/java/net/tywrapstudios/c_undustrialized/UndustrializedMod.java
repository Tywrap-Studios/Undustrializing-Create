package net.tywrapstudios.c_undustrialized;

import com.simibubi.create.Create;
import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import net.tywrapstudios.c_undustrialized.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UndustrializedMod implements ModInitializer {
	public static final String MOD_ID = "undustrialized";
	public static final String NAME = "Create: Undustrialized";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(MOD_ID, path);
	}
}






