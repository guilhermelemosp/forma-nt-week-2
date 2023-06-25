package com.example.exercises.exercise4;
import com.example.exercises.exercise4.interfaces.User;

public class PremiumUser implements User{

    // private double desconto;

    @Override
    public double getValorDesconto(double valorProduto) {
        double desconto = 0;
        if (valorProduto > 200) {
            desconto = valorProduto * 0.3;
        }
        return desconto;
    }

    @Override
    public String getTipoUsuario() {
        return "Usuário PREMIUM";
    }

    @Override
    public double getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 100) {
            return valorFrete = 0;
        }
        return valorFrete;
    }
}