package be.vdab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SayMyTest {

    @Test
    void testMyName() {
        SayMyName smn = new SayMyName();
        String result = smn.methodToTestWhichShouldReturnMyName();
        assertTrue(
                "elias".equalsIgnoreCase(result),
                "this method should return my name!");

    }
}
