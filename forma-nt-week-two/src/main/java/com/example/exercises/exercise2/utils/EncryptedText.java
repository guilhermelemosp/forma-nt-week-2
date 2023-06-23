package com.example.exercises.exercise2.utils;

import com.example.exercises.exercise2.CaesarCipher;

public class EncryptedText extends CaesarCipher {

public static String encrypt(String text, int key) {
        String encryptedText = "";
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                letter = (char) (letter + key);
                if (letter > 'z') {
                    letter = (char) (letter - 'z' + 'a' - 1);
                }
                encryptedText += letter;
            } else if (letter >= 'A' && letter <= 'Z') {
                letter = (char) (letter + key);
                if (letter > 'Z') {
                    letter = (char) (letter - 'Z' + 'A' - 1);
                }
                encryptedText += letter;
            } else {
                encryptedText += letter;
            }
        }
        return encryptedText;
    }
}
