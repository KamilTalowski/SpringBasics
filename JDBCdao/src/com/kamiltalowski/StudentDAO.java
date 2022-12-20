package com.kamiltalowski;

import java.sql.*;


public class StudentDAO {
    Connection con = null;
    void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kamil","root","1234");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public Student getStudent(int id){
        Student s = new Student();
        s.id= id;

        try {
            String query = " select username from student where id ="+id;

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            rs.next();
            String name = rs.getString(1);
            s.sName = name;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return s;

    }
    public void addStudent(Student s)  {
        String query = "insert into Student values (?,?) ";
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement(query);
            pst.setInt(1, s.id);
            pst.setString(2, s.sName);
            System.out.println(pst.executeUpdate() + " row/s affected");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
