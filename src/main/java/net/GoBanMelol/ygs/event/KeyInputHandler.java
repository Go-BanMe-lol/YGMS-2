package net.GoBanMelol.ygs.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.option.KeyBinding;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_1 = "key.category.ygs1";
    public static final String KEY_CATEGORY_OPENGUI = "key.ygs.opengui";

    public static KeyBinding activationKey;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(Client -> {
           if(activationKey.wasPressed()) {
               //Key pressed

           }
        });
    }
}
