package com.tnsif.assignments.assignment2.word_checker;

class Sentence {
    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public void checkWordPresence(String word) {
        if (sentence.contains(word)) {
            System.out.println(word + " is present in the sentence");
        } else {
            System.out.println(word + " is not present in the sentence");
        }
    }
}
