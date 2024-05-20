package Code;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CambiarIU {
    public static void setImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(),
                        Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
    }

    public static void setImageLabelSize(JLabel labelName, String root, int width, int height) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(width, height,
                        Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
    }
}
