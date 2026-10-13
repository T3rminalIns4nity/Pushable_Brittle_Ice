package code.ins4nity.too.many.packages.pushable_brittle_ice;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PushableBrittleIce implements ModInitializer {
	public static final String MOD_ID = "pushable_brittle_ice";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Brittle Ice can now be pushed by pistons.");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
