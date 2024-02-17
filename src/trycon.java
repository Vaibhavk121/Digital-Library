// This code is for establishing connection with MySQL
// database and retrieving data
// from db Java Database connectivity

/*
 *1. import --->java.sql
 *2. load and register the driver ---> com.jdbc.
 *3. create connection
 *4. create a statement
 *5. execute the query
 *6. process the results
 *7. close
 */

import java.io.*;
import java.sql.*;

class trycon {
    public static void main(String[] args)
    {
        String url
                = "jdbc:mysql://localhost:3306/test"; // table details
        String username = "root"; // MySQL credentials
        String password = "";

        try{
            Connection con=DriverManager.getConnection(url,username,password);
            Statement statement=con.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from student;");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3));
            }
            con.close();
        }catch (Exception e) {
            System.out.println(e);
        }
    }

}
