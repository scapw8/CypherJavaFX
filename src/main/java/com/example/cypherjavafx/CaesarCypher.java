package com.example.cypherjavafx;

public class CaesarCypher  {

     static int cypherKey;

    public CaesarCypher(int cypherKey) {
        CaesarCypher.cypherKey = cypherKey;
    }

    public String cypher(String text) {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i < text.length(); i++) {
            char c = (char) (text.charAt(i) + cypherKey);
            builder.append(c);
        }
        return builder.toString();
    }

    public int getCypherKey() {
        return cypherKey;
    }

    public void setCypherKey(int cypherKey) {
        this.cypherKey = cypherKey;
    }

    public String decypher(String text) {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i < text.length(); i++) {
            char c = (char) (text.charAt(i) - cypherKey);
            builder.append(c);
        }
        return builder.toString();
    }

}
