package com.kamiltalowski;
import java.sql.*;


public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/kamil";
        String username = "root";
        String pass = "1234";
        //fetch
        /*String query = "select username from student where id = 3";*/
        //String query = "select * from student";
        int uId = 6;
        String uName= "Adam";


        //String query = "insert into student values('"+uId+"','"+uName+"')";
        String query = "insert into student values(?,?)";

        /*Class.forName("com.mysql.jdbc.Driver");//old*/
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, pass);
        //Statement st = con.createStatement();
        PreparedStatement st = con.prepareStatement(query); //prepared statement
        st.setInt(1, uId);
        st.setString(2, uName);
        //fetch
        ResultSet rs = st.executeQuery(query); //DDL create, DML updating value , DQL fetch data, TCL gain/change permission
        int count = st.executeUpdate();

        //fetch
        //String userData;

        System.out.println(count + " row/s affected");


        //fetch
        /*rs.next();
        String name = rs.getString("username");
        */
       /* while(rs.next()) {
            userData = rs.getInt(1) + " : " + rs.getString(2);
            System.out.println(userData);
        }*/

        st.close();
        con.close();

    }
}
