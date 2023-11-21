// WAP to demonstrate the use of WindowAdapter class
import java.awt.*;
import java.awt.event.*;

public class adapter extends Frame {
    public adapter() {
        setSize(400, 300);

        addWindowListener(new MyWindowAdapter());

        setVisible(true);
    }

    class MyWindowAdapter extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.out.println("Window is closing...");
            System.exit(0);
        }

        public void windowActivated(WindowEvent e) {
            System.out.println("Window is activated");
        }

        public void windowDeactivated(WindowEvent e) {
            System.out.println("Window is deactivated");
        }
    }

    public static void main(String[] args) {
        new adapter();
    }
}