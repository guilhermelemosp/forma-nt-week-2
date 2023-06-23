package com.example.exercisesTest.exerciseTest2.utils;

import java.util.Scanner;

import com.example.exercisesTest.exerciseTest2.CaesarCipherTest;

public class EstructureTest extends CaesarCipherTest{
    
    public EstructureTest(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o texto: ");
        String text = scanner.nextLine();
        System.out.println("Digite a chave: ");
        int key = scanner.nextInt();
        System.out.println("Digite 1 para criptografar ou 2 para descriptografar: ");
        int option = scanner.nextInt();
        scanner.close();
    
        if (option == 1) {
            System.out.println(encrypt(text, key));
        } else if (option == 2) {
            System.out.println(decrypt(text, key));
        } else {
            System.out.println("Opção inválida!");
        }
    }
}