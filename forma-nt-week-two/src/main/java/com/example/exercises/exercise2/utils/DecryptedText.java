package com.example.exercises.exercise2.utils;

import com.example.exercises.exercise2.CaesarCipher;

public class DecryptedText extends CaesarCipher {

     public static String decrypt(String text, int key) {
        String decryptedText = "";
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                letter = (char) (letter - key);
                if (letter < 'a') {
                    letter = (char) (letter + 'z' - 'a' + 1);
                }
                decryptedText += letter;
            } else if (letter >= 'A' && letter <= 'Z') {
                letter = (char) (letter - key);
                if (letter < 'A') {
                    letter = (char) (letter + 'Z' - 'A' + 1);
                }
                decryptedText += letter;
            } else {
                decryptedText += letter;
            }
        }
        return decryptedText;
    }
}
