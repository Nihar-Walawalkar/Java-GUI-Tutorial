import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JFrame title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // prevent frame from being resized
        frame.setSize(420, 420);
        ImageIcon image = new ImageIcon("../imgs/logo.png"); // Set a image for be the GUI Icon
        frame.setIconImage(image.getImage()); // Set a image for be the GUI Icon
        frame.setVisible(true); // makes frame visible
        frame.getContentPane().setBackground(new Color(0xFFFFFF));
    }
}
