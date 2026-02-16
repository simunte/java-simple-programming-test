package org.example;

public class StairCase {
    public static void main(String[] args) {
        int input = 5;
        System.out.println("Total Combination: " + stairCombination(input));
        System.out.println("Total Combination Rec: " + stairCombinationRec(input));
    }

    private static int stairCombination (int input) {
        if (input <= 2) return input;

        int combination = 0;
        int first = 1;
        int second = 2;
        for (int i=3; i <= input; i++) {
            combination = first + second;
            first = second;
            second = combination;
        }

        return combination;
    }

    private static int stairCombinationRec (int input) {
        if (input <= 2) return input;
        return stairCombinationRec(input - 1)
                + stairCombinationRec(input - 2);
    }
}
