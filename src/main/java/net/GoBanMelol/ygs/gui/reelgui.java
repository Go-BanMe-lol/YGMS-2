package net.GoBanMelol.ygs.gui;
import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.data.HorizontalAlignment;
//import io.github.cottonmc.cotton.gui.widget.data.Texture;
//import io.github.cottonmc.cotton.gui.widget.icon.TextureIcon;
//import net.minecraft.client.MinecraftClient;
//import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.GoBanMelol.ygs.networking.ModMessages;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.command.GameModeCommand;
//import net.minecraft.server.dedicated.PendingServerCommand;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.world.GameMode;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.MinecraftClientGame;

public class reelgui extends LightweightGuiDescription {
    public reelgui() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(8, 5);
        WLabel label = new WLabel(Text.literal("Affirm?"));
        //криво сделано, если не будет работать, то поставлю new WLabel("Affirm?")
        label.setHorizontalAlignment(HorizontalAlignment.CENTER);
        root.add(label, 4, 1);

        WLabel label2 = new WLabel(Text.literal("(Yes) or (No) to confirm."));
        //аналогично.
        label2.setHorizontalAlignment(HorizontalAlignment.CENTER);
        root.add(label2,4, 2);

        WButton button = new WButton(Text.literal("Yes"));
        root.add(button, 0, 3, 4, 20);
        button.setOnClick(() -> {
            System.out.println("Yes");
            ClientPlayNetworking.send(ModMessages.G_1, PacketByteBufs.create());

            //player.ChangeGameMode(GameMode.CREATIVE);
            //Пока пусть будет заглушкой, потом надо будет заменить выдачу/снятие креатива.
        });

        WButton button2 = new WButton(Text.literal("No"));
        root.add(button2, 5, 3, 4, 20);
        button2.setOnClick(() -> {
            System.out.println("No");
            ClientPlayNetworking.send(ModMessages.G_12, PacketByteBufs.create());
            //Пока пусть будет заглушкой, потом надо будет заменить выдачу/снятие креатива.
        });



    }
}
