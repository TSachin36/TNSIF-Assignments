package com.tnsif.assignments.assignment2.alphabetical_order;
import java.util.Scanner;
public class WordSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String inputSentence = scanner.nextLine();

        AlphabeticalSorter sorter = new AlphabeticalSorter(inputSentence);
        sorter.arrangeLettersAlphabetically();
    }
}