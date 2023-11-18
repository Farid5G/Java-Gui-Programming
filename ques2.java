// package Practice Questions;
// Develop a program to select multiple languages know to user (Marathi ,Hindi ,English ,Sanskrit)
import java.awt.*;
public class ques2 extends Frame{
    Label L;
    Checkbox Marathi,Hindi,English,Sanskrit;
    ques2(String l){
        L = new Label("Languages");
        Marathi = new Checkbox("Marathi");
        English = new Checkbox("English",true);
        Hindi = new Checkbox("Hindi");
        Sanskrit = new Checkbox("Sanskrit");
        add(L);
        add(Marathi);
        add(Hindi);
        add(English);
        add(Sanskrit);
        setSize(600,600);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public static void main(String args[])
    {
        System.out.println("Hello Question 2");
        new ques2("Question 2");
    }
}
