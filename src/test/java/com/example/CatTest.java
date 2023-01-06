package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getSoundCatMeow() {
        final Feline feline = new Feline();
        final Cat cat = new Cat(feline);
        final String expectedSound = "Мяу";
        final String actualSound = cat.getSound();

        assertEquals("Ожидается звук: " + expectedSound, expectedSound, actualSound);
    }

    @Test
    public void getFoodCatMeatListValues() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));

        final Cat cat = new Cat(feline);
        final List<String> expectedCatMeatList = Arrays.asList("Животные", "Птицы", "Рыба");
        final List<String> actualCatMeatList = cat.getFood();

        assertEquals(expectedCatMeatList, actualCatMeatList);
    }

}
