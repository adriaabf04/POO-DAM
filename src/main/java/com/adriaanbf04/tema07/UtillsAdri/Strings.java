package com.adriaanbf04.tema07.UtillsAdri;
public class Strings {
    /** 
     * This method return the {@code message} modifing the {@code first letter} to {@code upperCase}. 
     * <blockquote><pre>
     * modifierMessage("¡hola mundo!")
     * //outputs "Hola Mundo"
     * </blockquote></pre>
     * <p>
     * @param message The initial {@code message}
     * @return The modified {@code message}m
    */
    public static String modifierMessage(String message) {
        message = message.trim();
        String res = "";
        int index = 0;
        char c = message.charAt(index);
        while (!(Character.isLetter(c)) && index < message.length()) {
            index ++;
        }
        if (index < message.length()) {
            String inicio = message.substring(0, index);
            String fin = message.substring(index, message.length());
            String firstString = String.valueOf(fin);
            String inicioString = String.valueOf(inicio);
            fin.replaceFirst(inicioString, inicioString.toUpperCase());
            res = inicioString + firstString;
        }
        /*
            SOLO HARIA LA PRIMERA LETRA DE TODA LA FRASE
            String firstLetter = Character.toString(c);
            String upper = firstLetter.toUpperCase();
            char d = upper.charAt(0);
            res = message.replace(c, d);
            return res;
         */
        return res;
    }
    /** 
     * In this method we will request a {@code String} with the purpose to count words returning an {@code int}
     * <blockquote><pre>
     * countWords("Hola mundo");
     * //outputs 9 (the number of words)
     * </blockquote></pre> 
     * @param oneString
     * @return The number of character of the String
    */
    public static int countWords(String oneString) {
        int cont = 0;
        for (int i = 0; i < oneString.length(); i ++) {
            char c = oneString.charAt(i);
            cont ++;
        }
        return cont;
    }
    /**
     * In this method we will request the message with the purpose to repeat the message times introduced in timesRepeated
     * @param message
     * @param timesRepeated
     */
    public static String repeat(String message, int timesRepeated) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < timesRepeated; i ++) {
            sb.append(message).append("\n");
        }
        return sb.toString();
    }
    public static String separateWords(String message) {
        StringBuilder sb = new StringBuilder();
        message = message.trim();
        String[] words = message.split("\\s+");
        for (String word : words) {
            sb.append(word).append("\n");
        }
        return sb.toString();
    }
    /**
     * This method count the odd words with the purpose to output it in terminal
     * <p>
     * <blockquote><pre>
     * oddWords("Hola Mundo");
     * //outputs oaud 
     * </blockquote></pre>
     * @param message The initial message
     * @return The message with the odd index
     */
    public static String oddWords(String message) {
        StringBuilder res = new StringBuilder();
        message = message.trim();
        String[] words = message.split("\\s+");
        for (String word: words) {
            for (int i = 0; i < word.length(); i ++) {
                if (!(i % 2 == 0)) {
                    char c = word.charAt(i);
                    res.append(c);
                }
                
            }
        }
        return res.toString();
    }
    /**
     * In this method we will reverse the message with the purpose to use to compare the initial message convert to lower case
     * <p>
     * Example: 
     * <p>
     * <blockquote><pre>
     * readEnd("Hola")
     * // outputs aloh 
     * </blockquote></pre>
     * @param message
     * @return
     */
    public static String readEnd(String message) {
        message = message.trim();
        String messageWithoutAccent = deleteAccent(message);
        messageWithoutAccent = message.toLowerCase();
        StringBuilder res = new StringBuilder();
        for (int i = message.length()-1; i >= 0; i --) {
            char c = message.charAt(i);
            res.append(c);
        }
        return res.toString();
    }
    public static String deleteAccent(String text){
        String origin = "áàéèíòóú";
        String destiny = "aaeeioouu";
        for (int i = 0; i < origin.length(); i ++) {
            text = text.replace(origin.charAt(i), destiny.charAt(i));
        }
        return text;
    }
    /**
     * ACTIVITY 11 B UNIT 6
     */
    public static String nFirstCharacters(String text, int characters) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i <= characters; i ++) {
            res.append(text.charAt(i));
        }
        return res.toString();
    }
    /**
     * ACT 11 C UNIT 6
     * @param text
     * @param characters
     * @return
     */
    public static String nLastCharacters(String text, int characters) {
        StringBuilder res = new StringBuilder();
        for (int i = text.length()-1; i >= characters; i--) {
            res.append(text.charAt(i));
        }
        return res.toString();
    }
}