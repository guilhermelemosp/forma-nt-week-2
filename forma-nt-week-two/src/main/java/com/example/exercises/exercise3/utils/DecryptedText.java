package com.example.exercises.exercise3.utils;

import com.example.exercises.exercise3.VigenereCipher;

public class DecryptedText extends VigenereCipher{
    
    public static String decrypt(String message, String key) {
        StringBuilder decryptedText = new StringBuilder();
        int keyIndex = 0;
        for (int i = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            if (Character.isLowerCase(letter)) {
                int base = 'a';
                int keyValue = key.charAt(keyIndex) - 'a';
                int decryptedValue = (letter - base - keyValue + 26) % 26;
                char decryptedLetter = (char) (base + decryptedValue);
                decryptedText.append(decryptedLetter);
                keyIndex = (keyIndex + 1) % key.length();
            }
        }
        return decryptedText.toString();
    }
}
