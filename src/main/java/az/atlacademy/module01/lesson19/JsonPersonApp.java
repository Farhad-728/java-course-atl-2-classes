package az.atlacademy.module01.lesson19;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonPersonApp {
    public static void main(String[] args) {
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
    }
}
