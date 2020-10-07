import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Registration extends JFrame implements ActionListener {

    JFrame myFrame = new JFrame();
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
    JTextField t1, t2, t3, t6, t7, t8;
    JButton b1, b2;
    JPasswordField p1, p2;

    public void Registration() {

        /**FRAME LAYOUT*/
        myFrame.setTitle("Registration Form");
        myFrame.setBounds(40,40,400,600);
        myFrame.getContentPane().setBackground(Color.white);
        myFrame.getContentPane().setLayout(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setResizable(true);


        /**LABELS, TEXTFIELDS AND BUTTONS*/
        l1 = new JLabel("Register");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        l2 = new JLabel("First Name");
        l3 = new JLabel("Last Name");
        l4 = new JLabel("Email");
        l5 = new JLabel("Password");
        l6 = new JLabel("Confirm Password");
        l7 = new JLabel("Address");
        l8 = new JLabel("City");
        l9 = new JLabel("Postcode");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        p1 = new JPasswordField();
        p2 = new JPasswordField();
        t6 = new JTextField();
        t7 = new JTextField();
        t8 = new JTextField();
        b1 = new JButton("Register");
        b2 = new JButton("Clear");
        b1.addActionListener(this);
        b2.addActionListener(this);


        l1.setBounds(145, 30, 400, 30);
        l2.setBounds(40, 70, 200, 30);
        l3.setBounds(40, 110, 200, 30);
        l4.setBounds(40, 150, 200, 30);
        l5.setBounds(40, 190, 200, 30);
        l6.setBounds(40, 230, 200, 30);
        l7.setBounds(40, 270, 200, 30);
        l8.setBounds(40, 310, 200, 30);
        l9.setBounds(40, 350, 200, 30);

        t1.setBounds(160,70,200,30);
        t2.setBounds(160,110,200,30);
        t3.setBounds(160,150,200,30);
        p1.setBounds(160,190,200,30);
        p2.setBounds(160,230,200,30);
        t6.setBounds(160,270,200,30);
        t7.setBounds(160,310,200,30);
        t8.setBounds(160,350,200,30);
        b1.setBounds(80, 430, 100, 30);
        b2.setBounds(200, 430, 100, 30);


        myFrame.add(l1);
        myFrame.add(l2);
        myFrame.add(l3);
        myFrame.add(l4);
        myFrame.add(l5);
        myFrame.add(l6);
        myFrame.add(l7);
        myFrame.add(l8);
        myFrame.add(l9);

        myFrame.add(t1);
        myFrame.add(t2);
        myFrame.add(t3);
        myFrame.add(p1);
        myFrame.add(p2);
        myFrame.add(t6);
        myFrame.add(t7);
        myFrame.add(t8);
        myFrame.add(b1);
        myFrame.add(b2);

        myFrame.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int x = 0;
            String s1 = t1.getText();
            String s2 = t2.getText();
            String s3 = t3.getText();
            char[] s4 = p1.getPassword();
            char[] s5 = p2.getPassword();
            String s9 = new String(s4);
            String s10 = new String(s5);
            String s6 = t6.getText();
            String s7 = t7.getText();
            String s8 = t8.getText();
            if (s9.equals(s10)) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myapp", "root", "root");
                    PreparedStatement ps = con.prepareStatement("insert into customers values(?,?,?,?,?,?,?,?) ");
                    ps.setInt(1, 0);
                    ps.setString(2, s1);
                    ps.setString(3, s2);
                    ps.setString(4, s3);
                    ps.setString(5, s9);
                    ps.setString(6, s6);
                    ps.setString(7, s7);
                    ps.setString(8, s8);
                    ps.executeUpdate();
                    x++;
                    if (x > 0) {
                        JOptionPane.showMessageDialog(b1, "Thank you for registering!");
                    }
                }
                catch (Exception ex) {
                    System.out.println(ex);
                }
            }
            else {
                JOptionPane.showMessageDialog(b1, "Passwords don't match!");
            }

        }
        else {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            p1.setText("");
            p2.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
        }
    }
}

