package com.company;


public class LexemValue {
    private final Lexems lex;
    private final String val;

    public LexemValue(Lexems l, String v)
    {
        lex = l;
        val = v;
    }

    public String displayResults() {
        return lex + " - " + val + "\n";
    }
}