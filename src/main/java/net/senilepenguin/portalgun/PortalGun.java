package net.senilepenguin.portalgun;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PortalGun implements ModInitializer {
	public static final String MOD_ID = "portalgun";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing mod: " + MOD_ID);
	}
}
