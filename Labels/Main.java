import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("../imgs/dude.png");
        JLabel label = new JLabel(); // create a label
        Border border=BorderFactory.createLineBorder(Color.green,5);
        label.setText("Bro, do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // Set text horizontal position (LEFT,CENTER,RIGHT)
        label.setVerticalTextPosition(JLabel.TOP); //Set text vertical position (TOP,CENTER,BOTTOM)
        label.setForeground(new Color(0x00FF00)); // set text-color
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // Set the font
        label.setIconTextGap(50); // it shifts the text
        label.setBackground(Color.black);// Set bacground color
        label.setOpaque(true);// Display background color in label
        label.setHorizontalAlignment(JLabel.CENTER);// Set label horizontal position (LEFT,CENTER,RIGHT)
        label.setVerticalAlignment(JLabel.CENTER);// Set label vertical position (TOP,CENTER,BOTTOM)
        label.setBorder(border);
        label.setBounds(100, 100, 350, 350);

        JFrame gui = new JFrame();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Set what the CloseButton does
        gui.setSize(500, 500);
        gui.setLayout(null);
        gui.add(label);
        gui.setVisible(true);// Make frame visible
    }
}
