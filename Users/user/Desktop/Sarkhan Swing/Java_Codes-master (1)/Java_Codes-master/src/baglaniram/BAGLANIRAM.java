package baglaniram;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BAGLANIRAM {
    public static void main(String[] args) {
        try {
            // 1. Connection to DB
            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/projelerim", "root", "AA12345aa!");

            // 2. Create statement
            Statement myStmt = (Statement) myConn.createStatement();

            // 1. Execute SQL query
            ResultSet myRs = myStmt.executeQuery("SELECT * FROM world.countrylanguage;");

            // 1. Process the result set
            while (myRs.next()) {
                System.out.println(myRs.getString("CountryCode") + " ----- " + myRs.getString("Language") + " ----- " + myRs.getFloat("Percentage"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
