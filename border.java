

import java.awt.*;

public class border extends Frame {

    public static void main(String[] args) {
        
        border f = new border();
        f.setSize(300, 200);
        f.setVisible(true);
        f.setLayout(new BorderLayout());

        Button east = new Button("East");
        Button west = new Button("West");
        Button north = new Button("North");
        Button south = new Button("South");

        f.add(east, BorderLayout.EAST);
        f.add(west, BorderLayout.WEST);
        f.add(north, BorderLayout.NORTH);
        f.add(south, BorderLayout.SOUTH);

    }
}
