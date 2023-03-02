package main;

import java.util.Properties;
import java.sql.*;

public class DatabaseConection {

    String userName = "";
    String pwd = "";
    Connection con;

    public DatabaseConection() {
        System.out.println("test2");
        getConnection();
    }

    public Connection getConnection() {
        try {

            String url = "jdbc:mysql://"+"smcse-stuproj00.city.ac.uk:3306/in2018g06/";
            Properties connectionProps = new Properties();
            connectionProps.put("in2018g06_a", userName);
            connectionProps.put("beh4Yv0f", pwd);

            con = DriverManager.getConnection(url, connectionProps);

            //Statement stmt = con.createStatement();
            //ResultSet rs = stmt.executeQuery("SELECT name FROM Team WHERE id = 1");
            //while (rs.next()) {
               // String name = rs.getString("name");
               // System.out.println(name + "\n");
           // }

            System.out.println("test3");
        }
        catch(Exception e) {
            System.out.print(e);
        }
        finally{
            return con;
        }
    }

}
