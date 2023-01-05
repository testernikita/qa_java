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
public class LionTest {

    @Mock
    private Feline feline;

    @Test(expected = Exception.class)
    public void getExceptionLionIncorrectLionSex() throws Exception{
        final Lion lion = new Lion("не определён", feline);
    }

    @Test
    public void getExceptionLionTextIncorrectLionSex() throws AssertionError{
        try {
            final Lion lion = new Lion("не определён", feline);
        } catch (Exception thrown) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
        }
    }

    @Test
    public void getKittenslionCorrectCountValue() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);

        final Lion lion = new Lion("Самка", feline);
        final int expectedLionKittensCount = 1;
        final int actualLionKittensCounts = lion.getKittens();

        assertEquals("Ожидаемое количество львят: 1", expectedLionKittensCount, actualLionKittensCounts);
    }

    @Test
    public void doesHaveManeReturnTrueValue() throws Exception {
        final Lion lion = new Lion("Самец", feline);
        final boolean doesHeHaveMane = lion.doesHaveMane();

        assertTrue("Ожидаемое значение ложно", doesHeHaveMane);
    }

    @Test
    public void getFoodLionMeatListValues() throws Exception{
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));

        final Lion lion = new Lion("Самец", feline);
        final List<String> expectedLionMeatList = Arrays.asList("Животные", "Птицы", "Рыба");
        final List<String> actualLionMeatList = lion.getFood();

        assertEquals(expectedLionMeatList, actualLionMeatList);
    }

}
