package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
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

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void getExceptionLionIncorrectLionSex() throws Exception{
        thrown.expect(Exception.class);
        thrown.expectMessage("Используйте допустимые значения пола животного - самец или самка");

        new Lion("не определён", feline);
    }

    @Test
    public void getKittensLionCorrectCountValue() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);

        final Lion lion = new Lion("Самка", feline);
        final int expectedLionKittensCount = 1;
        final int actualLionKittensCounts = lion.getKittens();

        assertEquals("Ожидаемое количество львят: " + expectedLionKittensCount, expectedLionKittensCount, actualLionKittensCounts);
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
