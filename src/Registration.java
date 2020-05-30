import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Registration implements ActionListener {

    JFrame myFrame = new JFrame();

    public void createWindow() {
        myFrame.setTitle("Registration Form");
        myFrame.setBounds(40,40,380,600);
        myFrame.getContentPane().setBackground(Color.pink);
        myFrame.getContentPane().setLayout(null);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setResizable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
