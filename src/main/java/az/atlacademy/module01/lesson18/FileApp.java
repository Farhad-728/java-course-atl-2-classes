package az.atlacademy.module01.lesson18;

import java.io.*;

public class FileApp {
    public static final String RESOURCE = "/home/farhad/IdeaProjects/java-course-atl-2-classes/src/main/java/az/atlacademy/module01/lesson18/resource/";

    public static void main(String[] args) {

        try {
            File dataTxt = new File(RESOURCE + "data.txt");
            FileReader fr = new FileReader(dataTxt);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void mainV1(String[] args) {
        try {
            FileWriter fw = new FileWriter(RESOURCE + "data2.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello, Elvin");
            bw.close();
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
