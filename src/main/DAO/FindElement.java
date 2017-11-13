package DAO;

import java.sql.*;
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
            String query;
           if(currentName.isEmpty()){
                query="SELECT * FROM users WHERE surname LIKE '" + currentSurname + "';";
           }
            else if(currentSurname.isEmpty()){
                query="SELECT * FROM users WHERE name LIKE '" + currentName +"';";
            }
            else {
                query="SELECT * FROM users WHERE name LIKE '" + currentName +"' AND surname LIKE '" + currentSurname + "';";
            }
            System.out.println(query);
            rs=st.executeQuery(query);


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}