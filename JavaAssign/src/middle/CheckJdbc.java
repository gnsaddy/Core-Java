package middle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by gnsad on 12-11-2017.
 */
public class CheckJdbc {

        private Connection con;
        private Statement st;
        private ResultSet rs;

        private String strCon =
                "jdbc:sqlserver://localhost\\SQLEXPRESS:1434;"
                        +"database=DB1;"
                        +"user=sa;"
                        +"password=1234";
        private String strJDBC =
                "com.microsoft.sqlserver.jdbc.SQLServerDriver";

        public CheckJdbc()throws ClassNotFoundException, SQLException
        {
            Class.forName(strJDBC);
            con=DriverManager.getConnection(strCon);
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM Employees where Salary>5000");

            System.out.print("ID\tFNAME\tLNAME\tAGE\tDEPARTMENT\tSALARY");
            System.out.println("");
            while(rs.next())
            {
                System.out.print(rs.getInt(1)+"\t"+rs.getString(2)+"\t"
                        +rs.getString(3)+"\t"+rs.getInt(4)+"\t"
                        +rs.getString(5)+"\t"+rs.getInt(6));
                System.out.println("");
            }
            st.close();
            con.close();
        }

        public static void main(String[] args) throws ClassNotFoundException , SQLException{

        new  CheckJdbc();
        }
    }


