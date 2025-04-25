package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void add() {
        Assertions.assertEquals(3, Main.add(1,2));
    }
}