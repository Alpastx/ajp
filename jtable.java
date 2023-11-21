// Develop a program to demonstrate the use of JTable.

import java.awt.*;
import javax.swing.*;

public class jtable extends JFrame {

    public static void main(String[] args) {
        jtable f = new jtable();
        f.setTitle("Table");
        f.setSize(400, 400);
        f.setVisible(true);

        Container c = f.getContentPane();
        c.setLayout(new FlowLayout());

        String data[][] = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        String th[] = {"A", "B", "C"};

        JTable table = new JTable(data, th);

        c.add(table);
    }
}
