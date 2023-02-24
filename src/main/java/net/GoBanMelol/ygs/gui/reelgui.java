package net.GoBanMelol.ygs.gui;
import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import net.minecraft.text.Text;


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

        WButton button = new WButton(Text.literal("Confirm"));
        button.setOnClick(() -> {
            // This code runs on the client when you click the button.
            System.out.println("Comfirmed");
            //Пока пусть будет заглушкой, потом надо будет заменить на проверку написанного + выдачу/снятие креатива.
        });



    }
}
