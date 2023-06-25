package com.example.exercises.exercise4;
import com.example.exercises.exercise4.interfaces.User;

public class StandartUser implements User{

       @Override
    public double getValorDesconto(double valorProduto) {
        if (valorProduto > 200) {
            return valorProduto * 0.15;
        }
        return 0;
    }

    @Override
    public String getTipoUsuario() {
         return "Usuário STANDARD";
    }

    @Override
    public double getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 200) {
            return valorFrete * 0.90;
        }
        return valorProduto;
    }
    
}
