package com.example.exercises.exercise2.utils;

import com.example.exercises.exercise2.CaesarCipher;

public class DecryptedText extends CaesarCipher {

     public static String decrypt(String text, int key) {
        String decryptedText = "";
        for (int i = 0; i < text.length(); i++) {
            // recupera o caractere na posição index
            char letter = text.charAt(i);
            // se for uma letra dentro do alfabeto e minúscula, o valor de letter será diminuído do valor da key e descriptografado
            if (letter >= 'a' && letter <= 'z') {
                letter = (char) (letter - key);
                // se o resultado da subtração for menor que 'a', resultando em uma letra maiúscula, o valor de letter será somado a 26, que é o número de letras do alfabeto, retornando a letra minúscula.
                if (letter < 'a') {
                    letter = (char) (letter + 'z' - 'a' + 1);
                }
                decryptedText += letter;
            // Em caso de letras maiúsculas
            } else if (letter >= 'A' && letter <= 'Z') {
                letter = (char) (letter - key);
                if (letter < 'A') {
                    letter = (char) (letter + 'Z' - 'A' + 1);
                }
                decryptedText += letter;
            // se nao for uma letra, o caractere será adicionado ao texto descriptografado
            } else {
                decryptedText += letter;
            }
        }
        return decryptedText;
    }
}
