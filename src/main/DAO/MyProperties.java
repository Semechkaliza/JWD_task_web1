package DAO;

import java.util.Properties;
public class MyProperties {
    private static final String DB_URL="jdbc:mysql://localhost:3306/jwd_task_03";
    private static final String DB_DIVER_NAME="com.mysql.jdbc.Driver";
    private static final Properties DB_PROPERTIES=new Properties();

    static {
        DB_PROPERTIES.setProperty("user","root");
        DB_PROPERTIES.setProperty("password","root");
        DB_PROPERTIES.setProperty("useSSL","false");
        DB_PROPERTIES.setProperty("autoReconnect","true");
    }

    public static String getDbUrl(){return DB_URL;}

    public static String getDbDiverName(){
        return DB_DIVER_NAME;
    }

    public static Properties getDbProperties(){return DB_PROPERTIES;}

}
