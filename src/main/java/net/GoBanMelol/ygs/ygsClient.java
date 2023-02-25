package net.GoBanMelol.ygs;

import net.GoBanMelol.ygs.event.KeyInputHandler;
import net.GoBanMelol.ygs.networking.ModMessages;
import net.fabricmc.api.ClientModInitializer;

public class ygsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyInputHandler.register();
        ModMessages.registerS2CPackets();
    }
}
