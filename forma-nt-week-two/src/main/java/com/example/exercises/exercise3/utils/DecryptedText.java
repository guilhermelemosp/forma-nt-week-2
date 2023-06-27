package com.example.exercises.exercise3.utils;

import com.example.exercises.exercise3.VigenereCipher;

public class DecryptedText extends VigenereCipher{
    
    public static String decrypt(String message, String key) {
        StringBuilder decryptedText = new StringBuilder();
        int keyIndex = 0; //Armazena o índice da chave
        for (int i = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            if (Character.isLowerCase(letter)) {
                int base = 'a'; //valor 97 na tabela ASCII
                int keyValue = key.charAt(keyIndex) - 'a'; // recupera o valor da chave na posição 'keyIndex' e subtrai o valor de 'a' na tabela ASCII. Ex: 'k' - 'a' = 107 - 97 = 10. 'k' é a chave no índice 0 e 'a' é o valor da letra 'a' na tabela ASCII
                int decryptedValue = (letter - base - keyValue + 26) % 26; // formula para descriptografar. 'letter' é o valor da letra na tabela ASCII, 'base' é o valor da letra 'a' na tabela ASCII, 'keyValue' é o valor da chave acima. +26 para evitar negativos e %26 para evitar valores maiores que 26.
                char decryptedLetter = (char) (base + decryptedValue);
                decryptedText.append(decryptedLetter);
                keyIndex = (keyIndex + 1) % key.length(); // incrementa o índice da chave e verifica se o índice é maior que o tamanho da chave. Se for, retorna para o índice 0.
            }
        }
        return decryptedText.toString(); // converte o StringBuilder para String
    }
}


//StringBuilder() = https://www.devmedia.com.br/a-classe-stringbuilder-em-java/25609
//tabela ASCII = https://www.ricardoarrigoni.com/tabela-ascii-completa/
// https://javahungry.blogspot.com/2019/12/vigenere-cipher-in-java.html
// https://www.geeksforgeeks.org/vigenere-cipher/
//https://www.sanfoundry.com/java-program-implement-vigenere-cipher/