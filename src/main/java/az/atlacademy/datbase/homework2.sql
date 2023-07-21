package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        Class pgDriverClass = Class.forName("org.postgresql.Driver");
        Constructor pgDriverClassconstructor = pgDriverClass.getDeclaredConstructor();
        Object pgDriverObject = pgDriverClassconstructor.newInstance();

        DriverManager.registerDriver((Driver) pgDriverObject);
        Connection dbConnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/lesson6db", "postgres", "postgres");

        Statement stat = dbConnection.createStatement();

        ResultSet resultSet1 = stat.executeQuery("SELECT * FROM users");
//        ResultSet resultSet2 = statement.executeQuery("SELECT * FROM Users WHERE id = 2");
//        ResultSet resultSet3 = statement.executeQuery("SELECT *  FROM Users WHERE email LIKE '%far%'");

        while (resultSet1.next()) {
            String name = resultSet1.getString("name");
            String email = resultSet1.getString("email");
            long phone = resultSet1.getLong("phone");

            System.out.println("\n name : " + name + "\n email : " + email + "\n phone : " + phone);
        }
        resultSet1.close();
        stat.close();
        dbConnection.close();
    }
}