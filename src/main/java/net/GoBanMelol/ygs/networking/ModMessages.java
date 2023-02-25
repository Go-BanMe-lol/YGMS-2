package net.GoBanMelol.ygs.networking;

import net.GoBanMelol.ygs.networking.packet.G12C2S;
import net.GoBanMelol.ygs.networking.packet.G1C2S;
import net.GoBanMelol.ygs.ygs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class ModMessages {
    public static final Identifier G_1 = new Identifier(ygs.MOD_ID, "gamemode");
    public static final Identifier G_12 = new Identifier(ygs.MOD_ID, "gamemode2");
    public static final Identifier G_13 = new Identifier(ygs.MOD_ID, "meaningless");

    public static void registerC2SPackets() {
        //ServerPlayerEntity.
        ServerPlayNetworking.registerGlobalReceiver(G_1, G1C2S::receive);
        ServerPlayNetworking.registerGlobalReceiver(G_12, G12C2S::receive);
    }

    public static void registerS2CPackets() {

    }
}
