// package Practice Questions;
// Write a program to create three buttons with captions (OK, Cancel, Reset).
import java.awt.*;
public class ques1 {
    Frame f;
    Button b1,b2,b3;
    ques1(String s){
        f = new Frame(s);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
        b1 = new Button("OK");
        b1.setBounds(40,50,50,30);
        f.add(b1);
        b2 = new Button("Cancel");
        b2.setBounds(40,100,50,30);
        f.add(b2);
        b3 = new Button("Reset");
        b3.setBounds(40,150,50,30);
        f.add(b3);
    }
    public static void main(String args[])
    {
        System.out.println("Hello world");
        new ques1("Question 1");
    }
    
}
