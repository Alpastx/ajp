// Design an applet/Application using List components to add names of 10 different cities.

import java.awt.*;
import java.applet.*;

/* <applet code="listcomp" width="300" height="200"></applet> */

public class listcomp extends Applet {

    public void init() {
        List cities = new List(10);
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Nagpur");
        cities.add("Nashik");
        cities.add("Aurangabad");
        cities.add("Kolhapur");
        cities.add("Solapur");
        cities.add("Amravati");
        cities.add("Akola");
        cities.add("Latur");
        add(cities);

        setSize(300, 200);
        setVisible(true);
    }

    
}
