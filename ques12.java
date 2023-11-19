// Write a program using swing to display a JcomboBox in an applet
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ques12 implements ItemListener{
    JFrame jf;
    JLabel jl;
    JComboBox jcb;
    ques12(String s)
    {
        jf = new JFrame(s);
        jf.setLayout(new FlowLayout());
        jf.setVisible(true);
        jf.setSize(300,300);
        String option[] = {"Pune","Mumbai","Thane","Nahur","Mulund"};
        jcb = new JComboBox(option);
        jcb.addItemListener(this);
        jf.add(jcb);
        jl  = new JLabel();
        jf.add(jl);

    }
    public void itemStateChanged(ItemEvent e)
    {
        String stateName = (String)e.getItem();
        jl.setText("You are in: "+stateName);
    }
    public static void  main(String args[])
    {
        new ques12("JComboBox");
        System.out.println("Write a program using swing to display a JcomboBox in an applet");
    }
}
