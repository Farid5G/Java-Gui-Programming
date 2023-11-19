
// Program to display the key pressed on Applet Window.
import java.awt.*;
import java.awt.event.*;

public class ques9 {
    Frame f;
    TextField tf;

    ques9(String s) {
        f = new Frame(s);
        f.setVisible(true);
        f.setSize(400, 400);
        f.setLayout(null);

        tf = new TextField();
        tf.setBounds(30, 30, 100, 40);
        f.add(tf);
        tf.addKeyListener(new keyEventListener());
    }

    public static void main(String args[]) {
        new ques9("Question 9");
        // System.out.println("hello world");
    }

}

class keyEventListener extends KeyAdapter {
    public void keyTyped(KeyEvent e) {
        // System.out.println(e.getKeyChar());
        char keyChar = e.getKeyChar();
        if (Character.isAlphabetic(keyChar)) {
            System.out.println(keyChar + " is an alphabet");
        } else {
            System.out.println("Please enter a letter from a-z");
        }
    }
}