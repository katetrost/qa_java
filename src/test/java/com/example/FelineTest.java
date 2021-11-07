package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline(); // создали экземпляр класса
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual); // сравнили ожидаемый результат с фактическим
    }

    @Test
    public void getKittensTestDefault() {
        Feline feline = new Feline(); // создали экземпляр класса
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected, actual); // сравнили ожидаемый результат с фактическим
    }

    @Test
    public void getKittensTestWithParams() {
        Feline feline = new Feline();
        int actual = feline.getKittens(2);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }
}
