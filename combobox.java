import java.awt.*;
 import javax.swing.*; 
public class combobox extends JFrame
 { combobox()
{ Container contentPane = getContentPane();
 setSize(500,500); setTitle("JComboBox");
 contentPane.setLayout(new FlowLayout());
 JComboBox states = new JComboBox(); 
states.addItem("Maharashtra"); 
states.addItem("Goa");
 states.addItem("Himachal Pradesh");
 contentPane.add(states); 
setVisible(true);
 } 
public static void main(String[] args) 
{ 
combobox p = new combobox();
 } }
