package az.atlacademy.module02;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JdbcApp {

    public static final String getAllStudentsSql = "SELECT * FROM students;";
    private static int age;

    public static void main(String[] args) {
        getAllStudents().forEach(System.out::println);
    }

    private static List<Student> getAllStudents() {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "postgres")) {
            PreparedStatement query = conn.prepareStatement(getAllStudentsSql);
            ResultSet resultSet = query.executeQuery();
            List<Student> students = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String pin = resultSet.getString("age");
                students.add(new Student(id, name, age));
            }
            return students;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

}