import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener {

    JTextField pin, repin;
    JButton change, back;

    PinChange(String pinchange){
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 600, 600);
        add(image);

        JLabel text = new JLabel("Change Your Pin");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(110, 200, 400, 35);
        image.add(text);

        JLabel pintext = new JLabel("New Pin:");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System", Font.BOLD, 12));
        pintext.setBounds(110, 240, 200, 35);
        image.add(pintext);

        pin = new JTextField();
        pin.setFont(new Font("Raleway", Font.BOLD, 16));
        pin.setBounds(220, 240, 100, 20);
        image.add(pin);

        JLabel repintext = new JLabel("Re-enter new Pin:");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System", Font.BOLD, 12));
        repintext.setBounds(110, 280, 200, 35);
        image.add(repintext);

        repin = new JTextField();
        repin.setFont(new Font("Raleway", Font.BOLD, 16));
        repin.setBounds(220, 280, 100, 20);
        image.add(repin);

        change = new JButton("Change");
        change.setBounds(220, 320, 100, 20);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("Back");
        back.setBounds(220, 345, 100, 20);
        back.addActionListener(this);
        image.add(back);

        setSize(600, 600);
        setLocation(300, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == change){
            try {
                String npin = pin.getText();
                String rpin = repin.getText();

                if (!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null, "Entered Pin Does not match");
                    return;
                }

                if (npin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter New Pin");
                    return;
                }

                if (rpin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Re-Enter New Pin");
                    return;
                }

                Conn conn = new Conn();
            } catch(Exception e){
                System.out.println(e);
            }
        } else {
            setVisible(false);
            new Transcations(pinnumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }
}


