package com.example.exercises.exercise4;

import com.example.exercises.exercise4.interfaces.User;

public class PremiumUser implements User {

       @Override
    public double getValorDesconto(double valorProduto) {

        if (valorProduto > 200) {
            return valorProduto * 0.30;
        }
        return 0;
    }

    @Override
    public String getTipoUsuario() {
         return "Usuário do plano Premium";
    }

    @Override
    public double getValorFreteDesconto(double valorFrete, double valorProduto) 
   
    {
        if (valorProduto > 100) {
            return 0;
        }
        return valorFrete;
    }
    
}
