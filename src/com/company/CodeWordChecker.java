package com.company;

public class CodeWordChecker {
    private String word;
    private int start;
    private int end;

    public CodeWordChecker(String word) {
        this.word = word;
        this.start = 6;
        this.end = 12;
    }

    public CodeWordChecker(String word, int start, int end) {
        this.word = word;
        this.start = start;
        this.end = end;
    }

    public boolean isValid(String str)
    {
        String str2 = str.substring(start, end);
        return (!(str2.indexOf(word) >= 0));
    }
}
