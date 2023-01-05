package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void getSoundCatMeow() {
        final Feline feline = new Feline();
        final Cat cat = new Cat(feline);
        final String expectedSound = "Мяу";
        final String actualSound = cat.getSound();

        assertEquals("Ожидается звук: \"Мяу\"", expectedSound, actualSound);
    }

    @Test
    public void getFoodCatMeatListValues() throws Exception{
        final Feline feline = new Feline();
        final Cat cat = new Cat(feline);
        final List<String> expectedCatMeatList = Arrays.asList("Животные", "Птицы", "Рыба");
        final List<String> actualCatMeatList = cat.getFood();

        assertEquals("Ожидаются значения в списке: \"Животные\", \"Птицы\", \"Рыба\"", expectedCatMeatList, actualCatMeatList);
    }

}
