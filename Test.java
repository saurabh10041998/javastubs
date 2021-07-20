
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
    public static void main(String []args) {
        System.out.println("[*] Connecting to sql server...");
        
        String connectionUrl = "jdbc:sqlserver://host_ip:1433;databaseName=DBName;user=username;password=your_password";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(connectionUrl);
            System.out.println("[*] Connected to sql server...");
            System.out.println("[*] Executing the sql query");
            String query = "SELECT * FROM dbo.test"; 
            Statement stmt = connection.createStatement(); 
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("[*] Generating output...");
            while(rs.next()) {
                System.out.println(rs.getInt(1) + "   " + rs.getString(2));
            }
            System.out.println("[*] All done...");
        }catch(SQLException sqlException) {
            System.out.println("[!!] SQL Exception occured. Printing the stack trace...");
            System.out.println(sqlException);
        }catch(ClassNotFoundException classNotFoundException) {
            System.out.println("[!!] Class not found exeption. Printing the stack trace...");
            System.out.println(classNotFoundException);
        }
    }
}