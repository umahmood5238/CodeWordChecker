package com.company;

public class Runner {
    public static void main(String[] args) {
        CodeWordChecker food = new CodeWordChecker("food");
        CodeWordChecker drink = new CodeWordChecker("drink", 1, 10);

        System.out.println(food.isValid())
    }
}
