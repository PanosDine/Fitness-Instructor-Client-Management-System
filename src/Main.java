import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        /** FOR LATER IN THE PROJECT
         String first_name = JOptionPane.showInputDialog("Hi, what's your name?");
        JOptionPane.showMessageDialog(null, "Hi " + first_name , "Greetings from Panos", JOptionPane.INFORMATION_MESSAGE);
        */
        DatabaseConnection myConnection = new DatabaseConnection();
        myConnection.mySQLconnection();
    }

}