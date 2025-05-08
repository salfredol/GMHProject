package dbutils;
import Trees.*;
import java.sql.*;

public class GlobalData 
{
    public static int patientID;
    public static String patientName;
    
    public static String BloodTypeResult = "";
    public static String AlcoholUseResult = "";
    public static String DrugUseResult = "";
    public static String TobaccoUseResult = "";
    
    public static Decision BloodTypeQSet;
    public static Decision TobaccoQSet;
    public static Decision AlcoholQSet;
    public static Decision DrugQSet;
    
    public static Connection ConnectToDB(String username, String password)
    {
        String dbURL = "jdbc:mysql://localhost:3306/gmh_interview"
                + "?autoreconnect=true&useSSL=false";
        
        Connection conn = null;
        try 
        {
            //register driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, username, password);
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
        return conn;
    }
}
