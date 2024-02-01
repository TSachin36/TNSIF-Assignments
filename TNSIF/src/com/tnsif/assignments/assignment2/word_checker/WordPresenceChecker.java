package com.tnsif.assignments.assignment2.word_checker;
import java.util.Scanner;
public class WordPresenceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String inputSentence = scanner.nextLine();

        System.out.println("Enter the word");
        String inputWord = scanner.nextLine();

        Sentence sentenceProcessor = new Sentence(inputSentence);
        sentenceProcessor.checkWordPresence(inputWord);
    }
}