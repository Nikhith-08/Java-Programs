import java.sql.*;

public class DisplayRecords {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/your_database", 
                "username", 
                "password");
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM your_table");
            while (rs.next()) System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            conn.close();
        } catch (Exception e) { e.printStackTrace(); }
    }
}
