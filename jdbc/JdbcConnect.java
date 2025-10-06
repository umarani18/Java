import java.sql.*;

public class JdbcConnect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/kpr"; 
        String user = "root";
        String pass = "Umarani@2005"; 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected to Database!");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT count(*) as rowcount FROM student");

            while (rs.next()) {
                System.out.println("total " + rs.getInt("rowcount"));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
