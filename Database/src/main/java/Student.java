import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/javaclass";
        Connection conn = DriverManager.getConnection(url, "prashant", "apple123");

        Statement st = conn.createStatement();
        String sql = "UPDATE student SET department='CSIT' WHERE roll=37";
        st.executeUpdate(sql);
        conn.close();
    }
}