package org.talowski;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlienRepo {
    List<Alien> aliens;
    Connection con = null;

    public AlienRepo(){
       /* aliens = new ArrayList<>();

        Alien a1= new Alien();
        a1.setId(101);
        a1.setName("Kamil");
        a1.setPoints(60);

        Alien a2= new Alien();
        a2.setId(102);
        a2.setName("Artur");
        a2.setPoints(50);

        aliens.add(a1);
        aliens.add(a2);*/
        String url = "jdbc:mysql://localhost:3306/restdb";
        String username ="root";
        String password = "1234";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public List<Alien> getAliens(){

        List<Alien> aliens = new ArrayList<>();
        String sql= "select * from alien";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                Alien a = new Alien();
                a.setId(rs.getInt(1));
                a.setName(rs.getString(2));
                a.setPoints(rs.getInt(3));


                aliens.add(a);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return aliens;
    }
    public Alien getAlien(int id){

        /*for(Alien a : aliens){
            if(a.getId()==id){
                return a;
            }
        }
        return  new Alien(); //before return null*/
        String sql= "select * from alien where id="+id;
        Alien a = new Alien();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()){
                a.setId(rs.getInt(1));
                a.setName(rs.getString(2));
                a.setPoints(rs.getInt(3));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return a;
    }

    public void create(Alien a) {
        //aliens.add(a);
        String sql = "insert into alien values (?,?,?)";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, a.getId());
            st.setString(2, a.getName());
            st.setInt(3, a.getPoints());
            st.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void update(Alien a) {
        //aliens.add(a);
        String sql = "update alien set name=?,points=? where id= ?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, a.getId());
            st.setString(2, a.getName());
            st.setInt(3, a.getPoints());
            st.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "delete from alien where id=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
