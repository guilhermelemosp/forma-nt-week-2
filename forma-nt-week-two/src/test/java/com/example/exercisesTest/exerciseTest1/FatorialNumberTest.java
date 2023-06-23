package com.example.exercisesTest.exerciseTest1;
import java.util.Scanner;
import com.example.exercises.exercise1.FatorialNumber;

public class FatorialNumberTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int number = scanner.nextInt();
        scanner.close();
        FatorialNumber fatorialNumber = new FatorialNumber(number);
        System.out.println(fatorialNumber.getMessage());
    }
}
