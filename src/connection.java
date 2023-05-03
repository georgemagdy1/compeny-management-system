
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class connection {

   public static Connection con;
  public void connect() throws SQLException{
     try{
      String path = "jdbc:sqlserver://localhost;databasename=company";
      String user = "sa";
      String pass = "123";
      
      con = DriverManager.getConnection(path, user, pass);
     }catch(Exception e){
         System.out.println(e.getMessage());
     }
  }
  
  
  
public static boolean excuteNonquary(String sqlStatement){// to update,delete,insert}
    try{
        //connect To SQL();
        Statement stmt=con.createStatement();
        stmt.execute(sqlStatement);
        return true;
    }   catch(Exception e)  {
        System.out.println(e);
        return false;
    }
    }
    
    
}


}
