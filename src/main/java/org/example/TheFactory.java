package org.example;

public class TheFactory {
    public static void main(String[] args) {
        String words = "BALBAL";
        int wordLength = 14;
        char search = 'B';
        System.out.println("Thread factory: " + threadNeed(words, wordLength, search));
    }

    private static int threadNeed (String words, int length, char search) {
        int foundSearch = 0;
        for (char word : words.toCharArray()) {
            if (word == search) {
                foundSearch++;
            }
        }

        int repetitions = length / words.length();
        int remaining = length % words.length();
        foundSearch = foundSearch * repetitions;

        for (int i = 0; i < remaining; i ++) {
            if (words.charAt(i) == search) {
                foundSearch ++;
            }
        }

        return foundSearch;
    }
}
