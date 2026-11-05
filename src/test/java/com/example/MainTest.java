package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void addTwoNumbers() {
        assertEquals(7, Main.add(3, 4));
    }
}
