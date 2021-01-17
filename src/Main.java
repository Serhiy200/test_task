import file.Rand;
import file.mainForm;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        JFrame jf = new mainForm("My form");
        jf.setVisible(true);
        System.out.println(Rand.number(10));
        Rand rand = new Rand();
        rand.array();
    }
}
