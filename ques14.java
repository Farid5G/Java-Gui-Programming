// 12. Write a Jtree program to show root directory and its subFolders of your System.
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.tree.MutableTreeNode.*;

public class ques14 {
    JFrame jf;
    JTree jt;
    DefaultMutableTreeNode a,b,c,d,e,f;
    ques14(String s){
        jf = new JFrame(s);
        jf.setVisible(true);
        jf.setSize(300,300);
        a = new DefaultMutableTreeNode("Desktop");
        b = new DefaultMutableTreeNode("Documents");
        c = new DefaultMutableTreeNode("Ajp Praticals");
        d = new DefaultMutableTreeNode("Ajp Model Paper");
        e = new DefaultMutableTreeNode("Ajp MicroProject");
        f = new DefaultMutableTreeNode("Pictures");

        a.add(b);
        a.add(f);

        b.add(c);
        b.add(d);
        b.add(e);

        jt = new JTree(a);
        jf.add(jt);
    }
    public static void main(String args[])
    {
        System.out.println("12. Write a Jtree program to show root directory and its subFolders of your System.");
        new ques14("JTree");
    }
}
