package net.GoBanMelol.ygs.gui;
import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.data.Texture;
import io.github.cottonmc.cotton.gui.widget.icon.TextureIcon;
import net.minecraft.text.Text;
//import net.minecraft.client.;


public class reelgui extends LightweightGuiDescription {
    public reelgui() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(150, 150);

        WLabel label = new WLabel(Text.literal("Affirm?"));
        //криво сделано, если не будет работать, то поставлю new WLabel("Affirm?")
        root.add(label, 1, 1);

        WLabel label2 = new WLabel(Text.literal("(Yes) or (No) to confirm."));
        //аналогично.
        root.add(label2, 1, 1);

        WButton button = new WButton(Text.literal("Yes"));
        root.add(button, 20, 20, 30, 20);
        button.setOnClick(() -> {
            // This code runs on the client when you click the button.
            System.out.println("Yes");
            //Пока пусть будет заглушкой, потом надо будет заменить выдачу/снятие креатива.
        });

        WButton button2 = new WButton(Text.literal("No"));
        root.add(button2, 40, 20, 30, 20);
        button2.setOnClick(() -> {

            System.out.println("No");
            //Пока пусть будет заглушкой, потом надо будет заменить выдачу/снятие креатива.
        });



    }
}
