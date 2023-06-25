package com.example.exercisesTest.exerciseTest4;

import com.example.exercises.exercise4.BaseUser;
import com.example.exercises.exercise4.PremiumUser;
import com.example.exercises.exercise4.StandartUser;
import com.example.exercises.exercise4.interfaces.User;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        System.out.println("Digite o valor do frete: ");
        double valorFrete = scanner.nextDouble();

        User user1 = new BaseUser();
        User user2 = new StandartUser();
        User user3 = new PremiumUser();


        System.out.println("----------------------------------------------");

        System.out.println("Tipo de usuário: " + user1.getTipoUsuario());

        System.out.println("Valor final do produto: " + (valorProduto - user1.getValorDesconto(valorProduto)) + " R$");
        System.out.println("Valor final do frete: " + user1.getValorFreteDesconto(valorFrete, valorProduto));

        System.out.println("Total a se Pagar: " + (valorProduto - user1.getValorDesconto(valorProduto) + user1.getValorFreteDesconto(valorFrete, valorProduto)) + " R$");
        
        System.out.println("----------------------------------------------");

        System.out.println("Tipo de usuário: " + user2.getTipoUsuario());

        System.out.println("Valor final do produto: " + (valorProduto - user2.getValorDesconto(valorProduto)) + " R$");
        System.out.println("Valor final do frete: " + user2.getValorFreteDesconto(valorFrete, valorProduto));

        System.out.println("Total a se Pagar: " + (valorProduto - user2.getValorDesconto(valorProduto) + user2.getValorFreteDesconto(valorFrete, valorProduto)) + " R$");

        System.out.println("----------------------------------------------");
      
        System.out.println("Tipo de usuário: " + user3.getTipoUsuario());

        System.out.println("Valor final do produto: " + (valorProduto - user3.getValorDesconto(valorProduto)) + " R$");
        System.out.println("Valor final do frete: " + user3.getValorFreteDesconto(valorFrete, valorProduto));
        System.out.println("Total a se Pagar: " + (valorProduto - user3.getValorDesconto(valorProduto) + user3.getValorFreteDesconto(valorFrete, valorProduto)) + " R$");

    }
}