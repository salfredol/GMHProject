package dbutils;
import java.sql.*;

public class DBUtilsAT 
{
    public static ResultSet GetATRecordsFromPID(Connection conn, int pid)
    {
        ResultSet rs = null;
        try
        {
            String qryStoredProc = "{CALL GetATRecordsFromPID(?)}";
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
    public static ResultSet GetATRecordFromATID(Connection conn, int atid)
    {
        ResultSet rs = null;
        try
        {
            String qryStoredProc = "{CALL GetATRecordFromATID(?)}";
            CallableStatement cs = conn.prepareCall(qryStoredProc);
            cs.setInt(1, atid);
            rs = cs.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
        return rs;
    }
    public static int InsertATRecord(Connection conn, int pid,
            String atDate, String atTime, String activity, int dectolerance, int actqty)
    {
        int insertStatus = 0;
        try
        {
            String qryStoredProc = "{CALL InsertGMHRecord(?, ?, ?, ?, ?, ?)}";
            CallableStatement cs = conn.prepareCall(qryStoredProc);
            cs.setInt(1, pid);
            cs.setString(2, atDate);
            cs.setString(3, atTime);
            cs.setString(4, activity);
            cs.setInt(5, dectolerance);
            cs.setInt(6, actqty);
            
            insertStatus = cs.executeUpdate();
            return insertStatus;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
        return insertStatus;
    }
    public static void UpdateATRecord(Connection conn, int atid,
            String atDate, String atTime, String activity, int dectolerance, int actqty)
    {
        try
        {
            String qryStoredProc = "{CALL UpdateATRecord(?, ?, ?, ?, ?, ?,)}";
            CallableStatement cs = conn.prepareCall(qryStoredProc);
            cs.setInt(1, atid);
            cs.setString(2, atDate);
            cs.setString(3, atTime);
            cs.setString(4, activity);
            cs.setInt(5, dectolerance);
            cs.setInt(6, actqty);
            
            cs.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
    }
    public static void DeleteATRecord(Connection conn, int atid)
    {
        try
        {
            String qryStoredProc = "{CALL DeleteATRecord(?)}";
            CallableStatement cs = conn.prepareCall(qryStoredProc);
            cs.setInt(1, atid);
            cs.executeUpdate();
            //maybe add integer return to confirm successful deletion
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
    }
}
