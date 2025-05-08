package dbutils;
import java.sql.*;

public class DBUtilsPatient 
{
    public static ResultSet GetAllPatients(Connection conn)
    {
        ResultSet rs = null;
        try
        {
            String qryStoredProc = "{CALL GetAllPatients}";
            CallableStatement cs = conn.prepareCall(qryStoredProc);
            rs = cs.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
        return rs;
    }
    public static ResultSet GetPatient_FromID(Connection conn, int pid)
    {
        ResultSet rs = null;
        try
        {
            String qryStoredProc = "{CALL GetPatient_FromID(?)}";
            CallableStatement cs = conn.prepareCall(qryStoredProc);
            cs.setInt(1, pid);
            rs = cs.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
        return rs;
    }
    public static ResultSet GetPatient_LastName(Connection conn, String lname)
    {
        ResultSet rs = null;
        try
        {
            String qryStoredProc = "{CALL GetPatient_LastName(?)}";
            CallableStatement cs = conn.prepareCall(qryStoredProc);
            cs.setString(1, lname);
            rs = cs.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
        return rs;
    }
}
