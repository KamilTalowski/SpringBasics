package com.kamiltalowski;

public class Main {

    public static void main(String[] args) {
        StudentDAO dao= new StudentDAO();
        dao.connect();
        Student s1 = dao.getStudent(8);

         Student s2 = new Student();
         s2.id = 9;
         s2.sName = "Karol";

        dao.addStudent(s2);
        System.out.println(s1.sName);

    }
}
