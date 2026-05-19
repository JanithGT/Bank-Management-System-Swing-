import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transcations  extends JFrame implements ActionListener{
    Transcations(){

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 600, 600);
        add(image);

        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(110, 200, 400, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 14));
        image.add(text);

        JButton deposit = new JButton("Deposit");
        deposit.setBounds(105, 270, 100, 23);
        image.add(deposit);

        JButton withdrawl = new JButton("Withdrawl");
        withdrawl.setBounds(230, 270, 100, 23);
        image.add(withdrawl);

        JButton fastcash = new JButton("FCash");
        fastcash.setBounds(105, 296, 100, 23);
        image.add(fastcash);

        JButton ministatement = new JButton("MiniStatement");
        ministatement.setBounds(230, 296, 100, 23);
        image.add(ministatement);

        JButton pinchange = new JButton("PinChange");
        pinchange.setBounds(105, 322, 100, 23);
        image.add(pinchange);

        JButton balanceenquiry = new JButton("Enquiry");
        balanceenquiry.setBounds(230, 322, 100, 23);
        image.add(balanceenquiry);

        JButton exit = new JButton("Exit");
        exit.setBounds(230, 348, 100, 20);
        image.add(exit);

        setSize(600, 600);
        setLocation(300, 100);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Transcations();
    }
}
