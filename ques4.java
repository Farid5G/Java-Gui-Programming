// package Practice Questions;
// 9. Write a program to perform addition of two nos using event.
import java.awt.*;
import java.awt.event.*;
public class ques4 {
    Frame f;
    Label l1,l2;
    Button Add;
    TextField tf1,tf2,op;
    ques4(String s){
        f = new Frame(s);
        f.setVisible(true);
        f.setSize(600,400);
        f.setLayout(null);
        l1 = new Label("Enter the First Number");
        l2 = new Label("Enter the Second Number");
        Add = new Button("Add");
        tf1 = new TextField();
        tf2 = new TextField();
        op = new TextField();
        l1.setBounds(20,40,120,30);
        tf1.setBounds(150,40,50,30);
        l2.setBounds(20,100,120,30);
        tf2.setBounds(150,100,50,30);
        Add.setBounds(20,150,80,30);
        op.setBounds(120,150,100,30);
        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(Add);
        f.add(op);
        Add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int num1 = Integer.parseInt(tf1.getText());
                int num2 = Integer.parseInt(tf2.getText());
                int result = num1 + num2;
                String ans = String.valueOf(result);
                op.setText(ans);
            }
        });
    }
    public static void main(String args[]){
        System.out.println(" Write a program to perform addition of two nos using event.");
        new ques4("Question 4");
    }
}
