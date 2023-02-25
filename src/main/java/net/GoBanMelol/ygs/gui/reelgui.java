package net.GoBanMelol.ygs.gui;
import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.data.HorizontalAlignment;
import io.github.cottonmc.cotton.gui.widget.data.Texture;
import io.github.cottonmc.cotton.gui.widget.icon.TextureIcon;
import net.minecraft.text.Text;
//import net.minecraft.client.;


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
            // This code runs on the client when you click the button.
            System.out.println("Yes");
            //Пока пусть будет заглушкой, потом надо будет заменить выдачу/снятие креатива.
        });

        WButton button2 = new WButton(Text.literal("No"));
        root.add(button2, 5, 3, 4, 20);
        button2.setOnClick(() -> {

            System.out.println("No");
            //Пока пусть будет заглушкой, потом надо будет заменить выдачу/снятие креатива.
        });



    }
}
