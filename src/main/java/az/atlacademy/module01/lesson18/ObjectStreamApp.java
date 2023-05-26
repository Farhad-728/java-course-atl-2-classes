package az.atlacademy.module01.lesson18;

import java.io.*;

public class ObjectStreamApp {
    public static final String RESOURCE = "/home/farhad/IdeaProjects/java-course-atl-2-classes/src/main/java/az/atlacademy/module01/lesson18/resource";


    public static void main(String[] args) {
        String studentsFile = RESOURCE + "students.ser";
        Student elvinBachelor = new Student(24, 93, "Elvin");
        Student natiqCourse = new Student(22, 70, "Natiq");

        try {
            FileOutputStream fos = new FileOutputStream(studentsFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(elvinBachelor);
            oos.close();
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(studentsFile);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object object = ois.readObject();
            if (object instanceof Student) {
                Student student = (Student) object;
                System.out.println(student);
            }
            ois.close();
            bis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            e.printStackTrace();
        }

        try (
                FileOutputStream fos = new FileOutputStream(studentsFile);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                ObjectOutputStream oos = new ObjectOutputStream(bos);

        ) {
            oos.writeObject(natiqCourse);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileInputStream fis = new FileInputStream(studentsFile);
             BufferedInputStream bis = new BufferedInputStream(fis);
             ObjectInputStream ois = new ObjectInputStream(bis);
        ) {
            Object object = ois.readObject();
            if (object instanceof Student) {
                Student student = (Student) object;
                System.out.println(student);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            e.printStackTrace();
        }

    }

}
