package com.example.exercises.exercise4;
import com.example.exercises.exercise4.interfaces.User;

public class StandartUser implements User{

    private double desconto;

       @Override
    public double getValorDesconto(double valorProduto) {
        double desconto = 0;
        if (valorProduto > 200) {
            desconto =  valorProduto * 0.15;
        }
        return desconto;
    }

    @Override
    public String getTipoUsuario() {
         return "Usuário STANDARD";
    }

    @Override
    public double getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 200) {
            return Math.max(0, valorFrete * 0.90 - desconto); 
        }
        return Math.max(0, valorFrete - desconto);
    }
    
}
