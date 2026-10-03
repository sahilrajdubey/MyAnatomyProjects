import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/students";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static void main(String[] args) {
        
        String insertQuery = "INSERT INTO students (id, name, email) VALUES (3, 'chirag', 'chirag@gmail.com')";
        String selectQuery = "SELECT id, name, email FROM students";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()) {

    
            int rowsInserted = stmt.executeUpdate(insertQuery);
            System.out.println("Data successfully inserted! Rows affected: " + rowsInserted + "\n");

            try (ResultSet rs = stmt.executeQuery(selectQuery)) {
                
                String format = "| %-5s | %-20s | %-30s |%n";
                String divider = "+-------+----------------------+--------------------------------+";

                System.out.println(divider);
                System.out.printf(format, "ID", "Name", "Email");
                System.out.println(divider);

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");

                    System.out.printf(format, id, name, email);
                }

                System.out.println(divider);
            }

        } catch (SQLException e) {
            System.err.println("Database connection or query execution failed!");
            e.printStackTrace();
        }
    }
}