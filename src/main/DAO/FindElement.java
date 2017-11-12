package DAO;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;
public class FindElement {
    public static ResultSet find(String currentName, String currentSurname) {
        String url = "jdbc:mysql://localhost:3306/jwd_task_03";


        Connection cn = null;
        ResultSet rs = null;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            cn = DriverManager.getConnection(MyProperties.getDbUrl(), MyProperties.getDbProperties());
            Statement st = null;
            st = cn.createStatement();
            String query="SELECT * FROM users WHERE name LIKE '" + currentName +"' AND surname LIKE '" + currentSurname + "';";
            System.out.println(query);
            rs=st.executeQuery(query);


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}