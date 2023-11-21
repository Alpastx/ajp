// Design your biodata by using various AWT components.

import java.awt.*;


public class biodata extends Frame {
    public static void main(String[] args) {
        biodata f = new biodata();
        f.setSize(300, 200);
        f.setVisible(true);
        Label name = new Label("Name");
        Label nameval = new Label("Alpesh Bhagwatkar");
        Label roll = new Label("Roll No.");
        Label rollval = new Label("21203B0024");
        Label branch = new Label("Branch");
        Label branchval = new Label("CO");
        Label college = new Label("College");
        Label collegeval = new Label("VP");
        f.setLayout(new GridLayout(4, 2));
        f.add(name);
        f.add(nameval);
        f.add(roll);
        f.add(rollval);
        f.add(branch);
        f.add(branchval);
        f.add(college);
        f.add(collegeval);
    }
}