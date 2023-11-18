
// package Practice Questions;
// 3. Develop an applet/application to select multiple names of news Papers.
import java.awt.*;

public class ques3 {
    Frame f;
    List l;

    ques3(String s) {
        f = new Frame(s);
        l = new List();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        // l.setMultipleMode(true);
        l.add("hidustans Time");
        l.add("Economics Times");
        l.add("Indian Times");
        l.add("Stock Market");
        f.add(l);
        l.select(0);
        l.select(1);
        l.select(2);
        l.select(3);

        String[] msg = l.getSelectedItems();
        for (String count : msg) {
            System.out.println(count);
        }
    }

    public static void main(String args[]) {
        new ques3("Question 3");
    }
}
