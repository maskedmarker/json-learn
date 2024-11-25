package org.example.learn.json.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.learn.json.commons.model.Person;
import org.junit.Test;

import java.io.IOException;

/**
 * A JSON value can be an object, array, number, string, true, false, or null.
 */
public class JsonValueTest {

    @Test
    public void test01() throws IOException {
        Person value = new Person("John", 30);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(value);
        System.out.println(jsonString);
    }

    @Test
    public void test11() throws IOException {
        String value = "hello world";

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(value);
        System.out.println(jsonString);
    }

    @Test
    public void test21() throws IOException {
        int value = 123;

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(value);
        System.out.println(jsonString);
    }

    @Test
    public void test31() throws IOException {
        boolean value = false;

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(value);
        System.out.println(jsonString);
    }

    @Test
    public void test41() throws IOException {
        Object value = null;

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(value);
        System.out.println(jsonString);
    }
}
