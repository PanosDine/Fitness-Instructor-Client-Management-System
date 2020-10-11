import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    JFrame myFrame = new JFrame();
    JLabel l1, l2, l3;
    JTextField t1;
    JPasswordField p1;
    JButton b1, b2;

    public void Login() {


        myFrame.setTitle("Login Form");
        myFrame.setBounds(40,40,400,300);
        myFrame.getContentPane().setBackground(Color.white);
        myFrame.getContentPane().setLayout(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setResizable(true);

        l1 = new JLabel("Sign in");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        l2 = new JLabel("Email");
        l3 = new JLabel("Password");

        t1 = new JTextField();
        p1 = new JPasswordField();
        b1 = new JButton("Submit");
        b2 = new JButton("Clear");
        b1.addActionListener(this);
        b2.addActionListener(this);

        l1.setBounds(165, 30, 400, 30);
        l2.setBounds(40, 70, 200, 30);
        l3.setBounds(40, 110, 200, 30);

        t1.setBounds(160,70,200,30);
        p1.setBounds(160,110,200,30);
        b1.setBounds(80, 160, 100, 30);
        b2.setBounds(200, 160, 100, 30);

        myFrame.add(l1);
        myFrame.add(l2);
        myFrame.add(l3);
        myFrame.add(t1);
        myFrame.add(p1);
        myFrame.add(b1);
        myFrame.add(b2);

        myFrame.setLocationRelativeTo(null);
        myFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            char[] s4 = p1.getPassword();
            String s9 = new String(s4);
            String m="^&%*$&(^%*$%&;";
            //String n = "^&%*$&(^%*$%&;";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myapp", "root", "root");
                PreparedStatement ps = con.prepareStatement("select email, password from customers where email='"+t1.getText()+"'");

                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    //n=rs.getString("email");
                    m=rs.getString("password");
                }
                if (m.equals(s9) ) {  //&& n.equals(t1.getText())
                    JOptionPane.showMessageDialog(myFrame, "Successful login!");
                    UserProfile myProfile = new UserProfile();
                    myProfile.UserProfile();
                }
                else {
                    JOptionPane.showMessageDialog(myFrame, "Email or password is incorrect, please try again!");
                }
            }
            catch (Exception ex) {
                System.out.println(ex);
            }
        }
        else {
            t1.setText("");
            p1.setText("");
        }

    }
}
