package net.GoBanMelol.ygs;

import net.GoBanMelol.ygs.networking.ModMessages;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ygs implements ModInitializer {

	public static final String MOD_ID = "ygs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModMessages.registerC2SPackets();
	}
}
