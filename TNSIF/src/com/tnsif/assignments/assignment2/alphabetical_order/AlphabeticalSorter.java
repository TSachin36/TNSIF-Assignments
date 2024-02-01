package com.tnsif.assignments.assignment2.alphabetical_order;

import java.util.Arrays;

class AlphabeticalSorter {
    private String sentence;

    public AlphabeticalSorter(String sentence) {
        this.sentence = sentence;
    }

    public void arrangeLettersAlphabetically() {
        if (isValidInput()) {
            String[] words = sentence.split(" ");

            for (String word : words) {
                char[] letters = word.toCharArray();
                Arrays.sort(letters);
                System.out.print(new String(letters) + " ");
            }
        }
    }

    private boolean isValidInput() {
        for (char c : sentence.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ') {
                System.out.println(sentence + " is an invalid input");
                return false;
            }
        }
        return true;
    }
}
