import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        Registration myRegistration = new Registration();
        myRegistration.createWindow();

        DatabaseConnection myConnection = new DatabaseConnection();
        myConnection.mySQLconnection();
    }

}