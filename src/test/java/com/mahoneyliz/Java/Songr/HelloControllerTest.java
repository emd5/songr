package com.mahoneyliz.Java.Songr;

import org.junit.Test;

import static org.junit.Assert.*;


public class HelloControllerTest {

    // Check root router works
    @Test
    public void getRoot() {
        HelloController helloController = new HelloController();
        assertEquals("Should return welcome", "Welcome to Songr", helloController.getRoot());
    }

    // Test hello router
    @Test
    public void getHello() {
        HelloController helloController = new HelloController();
        assertTrue("Should return true", helloController.getHelloWorld().contains("World"));
    }

    @Test
    public void getCapitalize() {
        HelloController helloController = new HelloController();

        String capitalize = helloController.getCapitalize("Hello World");
        assertEquals("Should return All caps word", "HELLO WORLD", capitalize);
    }

    @Test
    public void getReverse() {
        HelloController helloController = new HelloController();

        String reverse = helloController.getReverse("Hello World");
        assertEquals("Should return reverse word", "World Hello", reverse);
    }
}