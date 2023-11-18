// package Practice Questions;
// Program to demonstrate the use of Border layout
import java.awt.*;
public class ques5 {
    Frame f;
    Button east,WEST,NORTH,SOUTH,CENTER;
    ques5(String s){
        f = new Frame(s);
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(new BorderLayout());
        east = new Button("EAST");
        f.add(east,BorderLayout.EAST);
        WEST = new Button("WEST");
        f.add(WEST,BorderLayout.WEST);
        NORTH = new Button("NORTH");
        f.add(NORTH,BorderLayout.NORTH);
        SOUTH = new Button("SOUTH");
        f.add(SOUTH,BorderLayout.SOUTH);
        CENTER = new Button("CENTER");
        f.add(CENTER,BorderLayout.CENTER);


    }
    public static void main(String args[])
    {
        System.out.println("Program to demonstrate the use of Border layout");
        new ques5("Question 5");
    }
}
