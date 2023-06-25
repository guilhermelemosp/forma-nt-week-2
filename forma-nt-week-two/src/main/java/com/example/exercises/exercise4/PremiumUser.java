// crie uma classe e implemente esta interface
/*USUARIO PREMIUM
  getValorDesconto = ganha 30% se o valorProduto for maior que 200 reais
  getTipoUsuario = retorna que é Usuário premium
  getValorFreteDesconto = ganha frete grátis se o valorProduto for maior que 100 reais */
package com.example.exercises.exercise4;
import com.example.exercises.exercise4.interfaces.User;

public class PremiumUser implements User{
    @Override
    public double getValorDesconto(double valorProduto) {
        if (valorProduto > 200) {
            return valorProduto * 0.3;
        }
        return 0;
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