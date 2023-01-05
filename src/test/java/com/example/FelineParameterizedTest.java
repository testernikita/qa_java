package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int expectedAmount;

    public FelineParameterizedTest(int expectedAmount) {
        this.expectedAmount = expectedAmount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensFelineAmount() {
        return new Object[][] {
                {2},
                {5},
                {10}
        };
    }

    @Test
    public void shouldHaveKittensFelineAmount() {
        Feline feline = new Feline();
        int actualAmount = feline.getKittens(expectedAmount);

        assertEquals(expectedAmount, actualAmount);
    }

}
