
// 17. Write a program using JPasswordField and JTextField to demonstrate the use of user authentication
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;

import javax.swing.*;

public class ques15 implements ActionListener {
    JFrame jf;
    JTextField tf1;
    JPasswordField tf2;
    JButton b1;
    JLabel jl1, jl2, jl3;

    ques15(String s) {
        jf = new JFrame(s);
        jf.setVisible(true);
        jf.setSize(500, 300);
        jf.setLayout(new GridBagLayout());
        jl1 = new JLabel("Enter the UserName");
        jl2 = new JLabel("Enter the Password");
        jl3 = new JLabel();
        tf1 = new JTextField(20);
        tf2 = new JPasswordField(20);
        b1 = new JButton("Submit");
        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 0;
        g.gridy = 0;
        jf.add(jl1, g);
        g.gridx = 1;
        g.gridy = 0;
        jf.add(tf1, g);
        g.gridx = 0;
        g.gridy = 1;
        jf.add(jl2, g);
        g.gridx = 1;
        g.gridy = 1;
        jf.add(tf2, g);
        g.gridx = 1;
        g.gridy = 2;
        jf.add(b1, g);
        g.gridx = 1;
        g.gridy = 3;
        jf.add(jl3,g);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        tf2.setEchoChar('#');

    }

    public static void main(String args[]) {
        new ques15("User Authentication");
        System.out.println(
                "17. Write a program using JPasswordField and JTextField to demonstrate the use of user authentication");
    }

    public void actionPerformed(ActionEvent e) {
        String Username = tf1.getText();
        String Password = tf2.getText();
        String User = "Farid";
        String Pass = "fk2027";
        if (e.getSource() == b1) {
            if (Username.equals(User) && Password.equals(Pass)) {
                jl3.setText("Successfully  Logined!!");
            } else {
                jl3.setText("Invalid Id and Password!!");

            }
        }
    }
}