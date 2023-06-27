package com.example.exercises.exercise2.utils;

import com.example.exercises.exercise2.CaesarCipher;

public class EncryptedText extends CaesarCipher {

public static String encrypt(String text, int key) {
        String encryptedText = "";
        for (int i = 0; i < text.length(); i++) {
            // recupera o caractere na posição index
            char letter = text.charAt(i);
            // se for uma letra dentro do alfabeto e minúscula, o valor de letter será acrescido do valor da key e criptografado.
            if (letter >= 'a' && letter <= 'z') {
                letter = (char) (letter + key);
            // se o resultado da soma for maior que 'z', resultando em uma letra maiúscula, o valor de letter será somado a 26, que é o número de letras do alfabeto, retornando a letra minúscula.
                if (letter > 'z') {
                    letter = (char) (letter - 'z' + 'a' - 1);
                }
                encryptedText += letter;
            // Em caso de letras maiúsculas
            } else if (letter >= 'A' && letter <= 'Z') {
                letter = (char) (letter + key);
                if (letter > 'Z') {
                    letter = (char) (letter - 'Z' + 'A' - 1);
                }
                encryptedText += letter;
            // se nao for uma letra, o caractere será adicionado ao texto criptografado
            } else {
                encryptedText += letter;
            }
        }
        return encryptedText;
    }
}
