package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void getPredatorEatMeatListValues() throws Exception {
        final Feline feline = new Feline();
        final List<String> expectedMeatList = Arrays.asList("Животные", "Птицы", "Рыба");
        final List<String> actualMeatList = feline.getFood("Хищник");

        assertEquals("Ожидаются значения в списке: \"Животные\", \"Птицы\", \"Рыба\"", expectedMeatList, actualMeatList);
    }

    @Test
    public void getFamilyFelineValue() {
        final Feline feline = new Feline();
        final String expectedFamily = "Кошачьи";
        final String actualFamily = feline.getFamily();

        assertEquals("Ожидается значение для семейства: \"Кошачьи\"", expectedFamily, actualFamily);
    }

    @Test
    public void getKittensFelineCorrectCountValue() {
        final Feline feline = new Feline();
        final int expectedFelineKittensCount = 1;
        final int actualFelineKittensCounts = feline.getKittens();

        assertEquals("Ожидаемое количество котят семейства кошачьи: 1", expectedFelineKittensCount, actualFelineKittensCounts);
    }

}
