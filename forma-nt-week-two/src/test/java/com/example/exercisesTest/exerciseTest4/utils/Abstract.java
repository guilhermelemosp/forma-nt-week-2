package com.example.exercisesTest.exerciseTest4.utils;

import java.util.Scanner;

import com.example.exercises.exercise4.BaseUser;
import com.example.exercises.exercise4.PremiumUser;
import com.example.exercises.exercise4.StandartUser;

public abstract class Abstract {

    public void structure(BaseUser baseUser, StandartUser standartUser, PremiumUser premiumUser) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        System.out.println("Digite o valor do frete: ");
        double valorFrete = scanner.nextDouble();
        

        // USUÁRIO BASE
        System.out.println("----------------------------------------------");

        System.out.println("Tipo de usuário: " + baseUser.getTipoUsuario());

        System.out.println("Valor final do produto: " + (valorProduto - baseUser.getValorDesconto(valorProduto)) + " R$");
        System.out.println("Valor final do frete: " + baseUser.getValorFreteDesconto(valorFrete, valorProduto));
        System.out.println("Total a se Pagar: " + (valorProduto - baseUser.getValorDesconto(valorProduto) + baseUser.getValorFreteDesconto(valorFrete, valorProduto)) + " R$");
        

        // USUÁRIO STANDART
        System.out.println("----------------------------------------------");

        System.out.println("Tipo de usuário: " + standartUser.getTipoUsuario());

        System.out.println("Valor final do produto: " + (valorProduto - standartUser.getValorDesconto(valorProduto)) + " R$");
        System.out.println("Valor final do frete: " + standartUser.getValorFreteDesconto(valorFrete, valorProduto));
        System.out.println("Total a se Pagar: " + (valorProduto - standartUser.getValorDesconto(valorProduto) + standartUser.getValorFreteDesconto(valorFrete, valorProduto)) + " R$");


        // USUÁRIO PREMIUM
        System.out.println("----------------------------------------------");      

        System.out.println("Tipo de usuário: " + premiumUser.getTipoUsuario());
        System.out.println("Valor final do produto: " + (valorProduto - premiumUser.getValorDesconto(valorProduto)) + " R$");
        System.out.println("Valor final do frete: " + premiumUser.getValorFreteDesconto(valorFrete, valorProduto));
        System.out.println("Total a se Pagar: " + (valorProduto - premiumUser.getValorDesconto(valorProduto) + premiumUser.getValorFreteDesconto(valorFrete, valorProduto)) + " R$");

    }
}
