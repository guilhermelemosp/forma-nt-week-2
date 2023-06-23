package com.example.exercises.exercise2;

import com.example.exercises.exercise2.utils.EncryptedText;

public class CaesarCipher {
    
    public static String encrypt(String text, int key) {
        return EncryptedText.encrypt(text, key);
    }

    public static String decrypt(String text, int key) {
        return EncryptedText.decrypt(text, key);
    }
}


