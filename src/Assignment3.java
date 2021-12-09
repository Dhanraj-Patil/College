import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Assignment3 {
    public static void main(String [] args){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","PASS@123");
            PreparedStatement s=con.prepareStatement("INSERT INTO STUDENT VALUES(?,?)");
            s.setString(1,"Dhanraj");
            s.setInt(2,447);
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
