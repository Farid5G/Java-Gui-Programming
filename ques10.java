// 10. Program using AWT to create a menubar in an applet window.
import java.awt.*;
public class ques10 {
    Frame f;
    MenuBar mbr;
    Menu m;
    MenuItem m1,m2,m3,m4,m5;
    ques10(String s)
    {
        f = new Frame(s);
        mbr = new MenuBar();
        m = new Menu("Color");
        m1 = new MenuItem("Black");
        m2 = new MenuItem("Yellow");
        m3 = new MenuItem("Green");
        m4 = new MenuItem("Red");
        m5 = new MenuItem("pink");
        m5.setEnabled(false);
        m.add(m1);
        m.add(m2);
        m.add(m3);
        m.add(m4);
        m.add(m5);
        mbr.add(m);
        f.setMenuBar(mbr);
        f.setVisible(true);
        f.setSize(400,400);
    }
    public  static void main(String args[])
    {
        new ques10("MenuBar");
        System.out.println("10. Program using AWT to create a menubar in an applet window.");
    }
}
