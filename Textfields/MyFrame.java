import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JTextField textField;

    public MyFrame(){
        textField = new JTextField();// Text Box
        textField.setPreferredSize(new Dimension(250, 40));// textbox size(X,Y)
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));// Font
        textField.setForeground(new Color(0x00FF00));// Color of lyrics
        textField.setBackground(Color.black);// Backgound color
        textField.setCaretColor(Color.red);// Cor do cursor
        // textField.setText("Write here");// Set a initial text
        textField.setEditable(true);// Set if the Textbox is editable or not

        button = new JButton("Submit");
        button.addActionListener(this);

        this.add(button);
        this.add(textField);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();// Set the width and height according the size o content
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(textField.getText());
            // label.setText(textLabel + textField.getText());
        }
    }
    
}
