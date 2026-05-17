import javax.swing.*;
import java.awt.*;

public class Transcations  extends JFrame{
    Transcations(){

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 600, 600);
        add(image);

        setSize(600, 600);
        setLocation(300, 0);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Transcations();
    }
}
