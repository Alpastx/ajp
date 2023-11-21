//  WAP which creates Menu of different colors and disable menu item for Black color.

import java.awt.*;

public class menuitem extends Frame {

    public static void main(String[] args) {
        
        menuitem f = new menuitem();
        f.setTitle("Menu");
        f.setSize(400, 400);
        f.setVisible(true);

        MenuBar mb = new MenuBar();
        f.setMenuBar(mb);

        Menu m1 = new Menu("Color");
        mb.add(m1);

        MenuItem mi1 = new MenuItem("Red");
        m1.add(mi1);

        MenuItem mi2 = new MenuItem("Green");
        m1.add(mi2);

        MenuItem mi3 = new MenuItem("Blue");
        m1.add(mi3);

        MenuItem mi4 = new MenuItem("Black");
        m1.add(mi4);

        mi4.setEnabled(false);

        MenuItem mi5 = new MenuItem("White");
        m1.add(mi5);

        
    }
}