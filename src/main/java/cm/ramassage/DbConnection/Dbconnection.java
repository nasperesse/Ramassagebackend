package cm.ramassage.DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

import static java.lang.Class.forName;

public class Dbconnection {



    public static Connection getConnection(){

        Connection con = null;
        String url = null;
        String user = null;
        String pass = null;
        String driver = null;

        try {

            driver = "com.mysql.jdbc.Driver";

            forName(driver);

            url = "jdbc:mysql://localhost/db_reise?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

            user = "nasperesse";

            pass = "mysql";

         con = DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return con;
    }
}
