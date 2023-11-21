
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class jtextfield extends JFrame implements ActionListener {

    public static JTextField username;
    public static JPasswordField password;
    public static JButton submit;
    public static JLabel message;

    public static void main(String[] args) {
        jtextfield f = new jtextfield();
        f.setTitle("Login");
        f.setSize(400, 400);
        f.setVisible(true);

        Container c = f.getContentPane();
        c.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Username");
        f.add(l1);

        username = new JTextField(20);
        f.add(username);

        JLabel l2 = new JLabel("Password");
        f.add(l2);

        password = new JPasswordField(20);
        f.add(password);

        submit = new JButton("Submit");
        f.add(submit);

        message = new JLabel("");
        f.add(message);

        submit.addActionListener(f);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String user = username.getText();
        String pass = password.getText();

        if (e.getSource() == submit) {
            if (user.equals("admin") && pass.equals("admin")) {
                message.setText("Login Successful");
            } else {
                message.setText("Login Failed");
            }
        }
    }
}