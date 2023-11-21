// Develop a program to demonstrate the use of tree component in swing.

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class trees extends JFrame {

    public static void main(String[] args) {
        trees f = new trees();
        f.setTitle("Tree");
        f.setSize(400, 400);
        f.setVisible(true);
        
        Container c = f.getContentPane();
        c.setLayout(new FlowLayout());
        
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode states = new DefaultMutableTreeNode("States");
        DefaultMutableTreeNode cars = new DefaultMutableTreeNode("Cars");
        DefaultMutableTreeNode andhra = new DefaultMutableTreeNode("Andhra Pradesh");
        DefaultMutableTreeNode arunachal = new DefaultMutableTreeNode("Arunachal Pradesh");
        DefaultMutableTreeNode assam = new DefaultMutableTreeNode("Assam");
        DefaultMutableTreeNode lamborghini = new DefaultMutableTreeNode("Lamborghini");
        DefaultMutableTreeNode ferrari = new DefaultMutableTreeNode("Ferrari");
        DefaultMutableTreeNode bugatti = new DefaultMutableTreeNode("Bugatti");

        root.add(states);
        root.add(cars);
        states.add(andhra);
        states.add(arunachal);
        states.add(assam);
        cars.add(lamborghini);
        cars.add(ferrari);
        cars.add(bugatti);

        JTree tree = new JTree(root);
        c.add(tree);
    }
}
