package com.example.exercises.exercise4;

import com.example.exercises.exercise4.interfaces.User;

public class BaseUser implements User {

    private double desconto;

    @Override
    public double getValorDesconto(double valorProduto) {
        double desconto = 0;
        if (valorProduto > 300) {
            desconto = valorProduto * 0.05;
        }
        return desconto;
    }

    @Override
    public String getTipoUsuario() {
        return "Usuário BASE";
    }

    @Override
    public double getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 300) {
            return Math.max(0, valorFrete * 0.95 - desconto);
        }
            return Math.max(0, valorFrete - desconto);
    }
}
