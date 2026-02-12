package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testGreet() {
        assertEquals("Hello, Buddy!", App.greet("Buddy"));
    }
}
