// WAP to demonstrate various mouse events using MouseListener and MouseMotionListener interface

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mouselistener extends JFrame implements MouseListener, MouseMotionListener {

    public static void main(String[] args) {
        mouselistener f = new mouselistener();
        f.setTitle("Mouse Events");
        f.setSize(400, 400);
        f.setVisible(true);

        Container c = f.getContentPane();
        c.setLayout(new FlowLayout());

        f.addMouseListener(f);
        f.addMouseMotionListener(f);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse Dragged");
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse Moved");
    }
    
}
