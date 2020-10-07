import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserProfile extends JFrame implements ActionListener {
    JFrame frame = new JFrame("Profile");
    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2, t3, t4, t5;
    JButton b1, b2;

    public void UserProfile() {
        frame.setTitle("User's profile");
        frame.setBounds(40,40,400,600);
        frame.getContentPane().setBackground(Color.white);
        frame.getContentPane().setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);

        l1 = new JLabel("Find out your BMI");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        l2 = new JLabel("Height in metres");
        l3 = new JLabel("Weight in kilograms");
        l4 = new JLabel("Age");
        l5 = new JLabel("Gender");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        b1 = new JButton("Submit");
        b2 = new JButton("Clear");
        b1.addActionListener(this);
        b2.addActionListener(this);

        l1.setBounds(145, 30, 400, 30);
        l2.setBounds(40, 70, 200, 30);
        l3.setBounds(40, 110, 200, 30);
        l4.setBounds(40, 150, 200, 30);
        l5.setBounds(40, 190, 200, 30);

        t1.setBounds(160,70,200,30);
        t2.setBounds(160,110,200,30);
        t3.setBounds(160,150,200,30);
        t4.setBounds(160,190,200,30);

        b1.setBounds(80, 430, 100, 30);
        b2.setBounds(200, 430, 100, 30);

        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        frame.add(t4);
        frame.add(b1);
        frame.add(b2);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
