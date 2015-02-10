
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package financialconsultant;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.security.util.Password;
/**
 *
 * @author MAX
 */
public class Javaconnect {
    public static Connection con;
    public Statement st;
    public ResultSet results;
  
    
  public static Connection ConnectDb() {
         try{
            Class.forName("com.mysql.jdbc.Driver");
            String host = "jdbc:mysql://localhost:2222/w1429655?0";
            String Username = "w1429655";
            String Password = "8jnbFbggrE3W";
            
             con = DriverManager.getConnection(host,Username,Password);
            
             
        } catch(Exception ex){
            
             System.out.println("");
        }
          return con;
  }
        
  
  
}
    
    /**
     *
     * @throws SQLException
     */
   
    



//    public void getData() throws SQLException{
//        try{
//            String query = "select * from income";
//            results = st.executeQuery(query);
//            System.out.println("Records from database");
//            while(results.next()){
//                int ID = results.getInt(ID);
//                int homepay = results.getInt(homepay);
//                
//                
//            }

//    }
    
    
    

