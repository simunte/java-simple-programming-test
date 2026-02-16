package org.example;

public class DiagonalDifference {
    public static void main(String[] args) {
        int[][] input = {
                {2, 4, 3},
                {4, 5, 6},
                {1, 8, -10}
        };

        System.out.println("Diagonal Difference: " + diagonalDiff(input));
    }

    private static int diagonalDiff(int[][] input) {
        int rows = input.length;
        int columns = input[0].length;

        if (rows != columns || rows < 3 || columns > 10) {
            return 0;
        }

        int firstDiagonalTotal = 0;
        int secondDiagonalTotal = 0;

        for (int idx = 0; idx < rows; idx++) {
            int firstDiagonal = input[idx][idx];
            firstDiagonalTotal += firstDiagonal;

            int secondDiagonal = input[idx][rows - 1 - idx];
            secondDiagonalTotal += secondDiagonal;
        }

        System.out.println("First: " +firstDiagonalTotal + "\nSecond: " + secondDiagonalTotal);

        return Math.abs(firstDiagonalTotal - secondDiagonalTotal);
    }
}
