package com.example.exercisesTest.exerciseTest3.utils;
import com.example.exercisesTest.exerciseTest3.VigenereCipherTest;
import java.util.Scanner;

public class EstructureVigenereTest extends VigenereCipherTest {
     public EstructureVigenereTest(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a chave: ");
        String key = scanner.nextLine();
        System.out.println("Digite a mensagem: ");
        String message = scanner.nextLine();
        System.out.println("Digite 1 para criptografar ou 2 para descriptografar: ");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println(encrypt(message, key));
        } else if (option == 2) {
            System.out.println(decrypt(message, key));
        } else {
            System.out.println("Opção inválida");
        }
    }
}
