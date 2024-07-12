import java.awt.Font;
import java.awt.Color;
import javax.swing.BorderFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;

    public MyFrame() {
        ImageIcon icon1 = new ImageIcon("../imgs/point.png");

        button = new JButton();
        button.setBounds(150, 200, 200, 70);
        button.setText("I'm a button!");
        button.setIcon(icon1);
        button.setFont(new Font("SANS_SERIF", Font.PLAIN, 16));
        button.setForeground(Color.RED);
        button.setFocusable(false);
        button.addActionListener(this);
        button.setHorizontalTextPosition(JButton.LEFT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Set what the CloseButton does
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);// Make frame visible
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Clicked");
        }
    }

}