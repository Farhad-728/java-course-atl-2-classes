package az.atlacademy.module01.lesson19;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;

import static az.atlacademy.module01.lesson19.SerializationApp.RESOURCE;

public class JsonPersonApp {
    public static void main(String[] args) {

        final String RESOURCE = "/home/farhad/IdeaProjects/java-course-atl-2-classes/src/main/java/az/atlacademy/module01/lesson19/resource/";

        Person person = new Person(1,"Farhad", "Salamov");

        try {
            ObjectMapper objectMapper = new ObjectMapper();

            String jsonPerson = objectMapper.writeValueAsString(person);
            System.out.println(jsonPerson);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        try {
            XmlMapper xmlMapper = new XmlMapper();
            String xmlFormat = xmlMapper.writeValueAsString(person);
            System.out.println(xmlFormat);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(RESOURCE + "people.ser")))
        ) {
            oos.writeObject(person);
            System.out.println(oos);
        }
         catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
