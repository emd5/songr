package com.mahoneyliz.Java.Songr;

import org.junit.Test;

import static org.junit.Assert.*;


public class SongrControllerTest {

    // Check root router works
    @Test
    public void getRoot() {
        SongrController songrController = new SongrController();
        assertEquals("Should return welcome", "Welcome to Songr", songrController.getRoot());
    }

    // Test hello router
    @Test
    public void getHello() {
        SongrController songrController = new SongrController();
        assertTrue("Should return true", songrController.getHelloWorld().contains("World"));
    }

    @Test
    public void getCapitalize() {
        SongrController songrController = new SongrController();

        String capitalize = songrController.getCapitalize("Hello World");
        assertEquals("Should return All caps word", "HELLO WORLD", capitalize);
    }

    @Test
    public void getReverse() {
        SongrController songrController = new SongrController();

        String reverse = songrController.getReverse("Hello World");
        assertEquals("Should return reverse word", "World Hello", reverse);
    }
}