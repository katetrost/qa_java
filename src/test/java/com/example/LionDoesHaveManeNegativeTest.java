package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionDoesHaveManeNegativeTest {
    private final String sex;

    private final Boolean hasMane;

    public LionDoesHaveManeNegativeTest(String sex, Boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[] getSex() {
        return new Object[][]{
                {"Неизвестно", true}
        };
    }

    @Test(expected = Exception.class)
    public void doesHaveManeNegativeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        boolean expected = lion.doesHaveMane();
        assertEquals(expected, hasMane);
    }
}
