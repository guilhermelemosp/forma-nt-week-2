package com.example.exercises.exercise3;

import com.example.exercises.exercise3.utils.EncryptedText;
import com.example.exercises.exercise3.utils.DecryptedText;

public class VigenereCipher {
    public static String encrypt(String message, String key) {
        return EncryptedText.encrypt(message, key);
    }

    public static String decrypt(String message, String key) {
        return DecryptedText.decrypt(message, key);
    }
}
