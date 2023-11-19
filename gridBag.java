// 17. Write a program using JPasswordField and JTextField to demonstrate the use of user authentication
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;
// import javax.swing.GrindBag

public class gridBag {
    JFrame jf;
    JButton b1,b2,b3;
    gridBag(String s){
        jf = new JFrame(s);
        jf.setVisible(true);
        jf.setSize(400,400);
        jf.setLayout(new GridBagLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1 = new JButton("UserName");
        b2 = new JButton("Password");
        b3 = new JButton("Submit");
        GridBagConstraints g = new GridBagConstraints();
        g.gridx=0;
        g.gridy=0;
        jf.add(b1,g);
        g.gridx=1;
        g.gridy=1;
        jf.add(b2,g);
        g.gridx=2;
        g.gridy=2;
        jf.add(b3,g);
    }
    public static void main(String args[])
    {
        new gridBag("GridBagLayout");
        System.out.println("17. Write a program using JPasswordField and JTextField to demonstrate the use of user authentication");
    }
}
