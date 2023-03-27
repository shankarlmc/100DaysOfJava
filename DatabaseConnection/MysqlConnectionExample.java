import java.sql.*;

class MysqlCon {
    public static void main(String args[]) {
        try {
            // class name is com.mysql.cj.jdbc.Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // connection driver class
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expense_tracker", "root", "shankar");
            // here expense_tracker is database name, root is username and password

            // create the statement
            Statement stmt = con.createStatement();
            // execute query
            ResultSet rs = stmt.executeQuery("select * from amount");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}