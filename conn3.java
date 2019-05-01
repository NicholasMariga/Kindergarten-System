package first;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conn3 {
    // Connection con=null;

    Connection conn;
    Statement st;
    String URL = "jdbc:mysql://localhost:3306/sem2";

    // Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public static Connection star() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sem2", "root", "");

        return conn;
    }

    public void stop() throws SQLException {
        conn.close();
    }

}
