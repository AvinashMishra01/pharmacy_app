package Application_App;

import java.sql.*;

public class Dbcon {
    
    public Connection con;
    public Statement stmt;
    public PreparedStatement pstmt;
    public ResultSet rst;
    public Dbcon()
    {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","root");
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
}
