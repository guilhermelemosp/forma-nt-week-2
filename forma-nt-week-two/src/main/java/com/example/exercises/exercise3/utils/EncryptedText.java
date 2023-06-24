package com.example.exercises.exercise3.utils;

import com.example.exercises.exercise3.VigenereCipher;

public class EncryptedText extends VigenereCipher{
    
     public static String encrypt(String message, String key) {
        StringBuilder encryptedText = new StringBuilder();
        int keyIndex = 0;
        for (int i = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            if (Character.isLowerCase(letter)) {
                int base = 'a';
                int keyValue = key.charAt(keyIndex) - 'a';
                int encryptedValue = (letter - base + keyValue) % 26;
                char encryptedLetter = (char) (base + encryptedValue);
                encryptedText.append(encryptedLetter);
                keyIndex = (keyIndex + 1) % key.length();
            }
        }
        return encryptedText.toString();
    }
}
