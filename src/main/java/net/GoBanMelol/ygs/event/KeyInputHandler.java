package net.GoBanMelol.ygs.event;

import net.GoBanMelol.ygs.gui.gui;
import net.GoBanMelol.ygs.gui.reelgui;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_FIRST = "key.category.ygs.1";
    public static final String KEY_OPEN_GUI = "key.ygs.open_gui";

    public static KeyBinding guiKey;
    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(guiKey.wasPressed()) {
                MinecraftClient.getInstance().setScreen(new gui(new reelgui()));
            }
        });
    }
   public static void register() {
        guiKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
           KEY_OPEN_GUI,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_J,
                KEY_CATEGORY_FIRST
        ));
        registerKeyInputs();
   }
}


