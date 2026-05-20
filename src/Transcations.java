import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transcations  extends JFrame implements ActionListener{

    JButton deposit, withdrawl, ministatement, pinchange, fastcash, balanceenquiry, exit;
    String pinnumber;
    Transcations(String pinnumber){

        this.pinnumber = pinnumber;

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

        deposit = new JButton("Deposit");
        deposit.setBounds(105, 270, 100, 23);
        deposit.addActionListener(this);
        image.add(deposit);

        withdrawl = new JButton("Withdrawl");
        withdrawl.setBounds(230, 270, 100, 23);
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        fastcash = new JButton("FCash");
        fastcash.setBounds(105, 296, 100, 23);
        fastcash.addActionListener(this);
        image.add(fastcash);

        ministatement = new JButton("MiniStatement");
        ministatement.setBounds(230, 296, 100, 23);
        ministatement.addActionListener(this);
        image.add(ministatement);

        pinchange = new JButton("PinChange");
        pinchange.setBounds(105, 322, 100, 23);
        pinchange.addActionListener(this);
        image.add(pinchange);

        balanceenquiry = new JButton("Enquiry");
        balanceenquiry.setBounds(230, 322, 100, 23);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);

        exit = new JButton("Exit");
        exit.setBounds(230, 348, 100, 20);
        exit.addActionListener(this);
        image.add(exit);

        setSize(600, 600);
        setLocation(300, 100);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == exit){
            System.exit(0);
        } else if (ae.getSource() == deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        } else if (ae.getSource() == withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber);
        } else if (ae.getSource() == fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Transcations("");
    }
}
