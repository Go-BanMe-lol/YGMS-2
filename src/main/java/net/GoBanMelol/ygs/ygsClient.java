package net.GoBanMelol.ygs;

import net.GoBanMelol.ygs.event.KeyInputHandler;
import net.fabricmc.api.ClientModInitializer;

public class ygsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyInputHandler.register();
    }
}
