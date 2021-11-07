package com.example;

import java.util.List;

public class Alex extends Lion{
    private static final Feline feline = new Feline();
    private static final String sex = "Самец";

    public Alex() throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }

    public List<String>  getFriends() {
        return List.of("Глория", "Марти", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский Зоопарк";
    }

}
