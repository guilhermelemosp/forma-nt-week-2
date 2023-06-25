package com.example.exercises.exercise4;

import com.example.exercises.exercise4.interfaces.User;

public class baseUser implements User{

    @Override
    public double getValorDesconto(double valorProduto) {
        if (valorProduto > 300) {
            return valorProduto * 0.05;
        }
        return 0;
    }

    @Override
    public String getTipoUsuario() {
         return "Usuário do plano Base";
    }

    @Override
    public double getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 300) {
            return valorFrete * 0.95;
        }
        return valorProduto;
    }
    
}
