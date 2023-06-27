package com.example.exercises.exercise3.utils;

import com.example.exercises.exercise3.VigenereCipher;

public class EncryptedText extends VigenereCipher{
    
     public static String encrypt(String message, String key) {
        StringBuilder encryptedText = new StringBuilder();
        int keyIndex = 0;
        for (int i = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            if (Character.isLowerCase(letter)) {
                int base = 'a'; // valor 97 na tabela ASCII
                int keyValue = key.charAt(keyIndex) - 'a'; // recupera o valor da chave na posição 'keyIndex' e subtrai o valor de 'a' na tabela ASCII. Ex: 'k' - 'a' = 107 - 97 = 10. 'k' é a chave no índice 0 e 'a' é o valor da letra 'a' na tabela ASCII
                int encryptedValue = (letter - base + keyValue) % 26; // formula para criptografar. 'letter' é o valor da letra na tabela ASCII, 'base' é o valor da letra 'a' na tabela ASCII, 'keyValue' é o valor da chave acima. +26 para evitar negativos e %26 para evitar valores maiores que 26.
                char encryptedLetter = (char) (base + encryptedValue);
                encryptedText.append(encryptedLetter);
                keyIndex = (keyIndex + 1) % key.length(); // incrementa o índice da chave e verifica se o índice é maior que o tamanho da chave. Se for, retorna para o índice 0.
            }
        }
        return encryptedText.toString(); // converte o StringBuilder para String
    }
}
