package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private Feline feline = new Feline();
    private final String genderValue;
    private final boolean expectedValue;

    public LionParameterizedTest(String GenderValue, boolean expectedValue) {
        this.genderValue = GenderValue;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Object[][] getMane() {
        return new Object[][] {
                { "Самец", true },
                { "Самка", false },
        };
    }

    @Test
    public void shouldHaveManeValue() throws Exception {
        Lion lion = new Lion(genderValue, feline);
        boolean hasMane = lion.doesHaveMane();

        assertEquals(expectedValue, hasMane);
    }

}
