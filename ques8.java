// package Practice Questions;
// Program to demonstrate the use of Grid layout .
import java.awt.*;
public class ques8 extends Frame{
    // Button b1;
    ques8(String s){
        super(s);
        int b = 1;
        // b1 = new Button("btn");
        setLayout(new GridLayout(4,4,5,5));
        for(int i = 0;i <12 ;i++){
            add(new Button("Button"+b));
            b++;
        }
        setVisible(true);
        setSize(500,500);
    }
    public static void main(String args[]){
        new ques8("Calcu");
    }
}

