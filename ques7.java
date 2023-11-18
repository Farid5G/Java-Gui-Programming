
// package Practice Questions;
//Develop an applet using List components to add names of 10 different cities.
import java.awt.*;

public class ques7 {
    Frame f;
    List cityList;

    ques7(String s) {
        f = new Frame(s);
        cityList = new List(10);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        cityList.add("New York");
        cityList.add("Los Angeles");
        cityList.add("Chicago");
        cityList.add("Houston");
        cityList.add("Phoenix");
        cityList.add("Philadelphia");
        cityList.add("San Antonio");
        cityList.add("San Diego");
        cityList.add("Dallas");
        cityList.add("San Jose");

        // Add the list to the applet
        f.add(cityList);
    }

    public static void main(String args[]) {
        new ques7("Question 7");
    }
}
