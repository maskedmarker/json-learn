package org.example.learn.json.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.learn.json.commons.model.Person;
import org.junit.Test;

import java.io.IOException;

public class ObjectMapperTest {

    @Test
    public void test0() throws IOException {
        Person person = new Person("John", 30);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(person);
        System.out.println(jsonString);
    }

    @Test
    public void test1() throws IOException {
        Person person = new Person("John", 30);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(person);
        System.out.println(jsonString);

        objectMapper.writeValue(new java.io.File("src/test/resources/person.json"), person);
    }
}
