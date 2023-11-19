// Write a program which creates Menu of different colors and disable menu item for Black color.
import  java.awt.*;
public class ques11 {
    Frame f ;
    MenuBar mbr;
    Menu m;
    MenuItem m1,m2,m3;
    ques11(String s)
    {
        f = new Frame(s);
        mbr = new MenuBar();
        m = new Menu("colors");
        m1 = new MenuItem("Red");
        m2 = new MenuItem("Green");
        m3 = new MenuItem("Black");
        m3.setEnabled(false);
        m.add(m1);
        m.add(m2);
        m.add(m3);
        mbr.add(m);
        f.setMenuBar(mbr);
        f.setVisible(true);
        f.setSize(300,300);
    }
    public static void main(String args[])
    {
        System.out.println("Write a program which creates Menu of different colors and disable menu item for Black color.");
        new ques11("MenuBar");
    }
}
