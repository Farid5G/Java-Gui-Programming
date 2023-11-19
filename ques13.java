// Write a program to develop a frame to Select the different states of India using JComboBox.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ques13 implements ItemListener {
    JFrame jf ;
    JLabel jl;
    JComboBox jc;
    ques13(String s){
        jf = new JFrame(s);
        jf.setVisible(true);
        jf.setSize(300,300);
        jf.setLayout(new FlowLayout());
        String states[] = {"Maharastra","Karnataka","Tamil Nadu","Delhi"};
        jc = new JComboBox(states);
        jc.addItemListener(this);
        jf.add(jc);
        jl = new JLabel();
        jf.add(jl);
    }
    public void itemStateChanged(ItemEvent e)
    {
        String SName = (String)e.getItem();
        jl.setText("The Name of the Selected State is: "+SName);

    }
    public static void main(String args[])
    {
        new ques13("ComboBox 2");
        System.out.println("Write a program to develop a frame to Select the different states of India using JComboBox.");
    }
}
