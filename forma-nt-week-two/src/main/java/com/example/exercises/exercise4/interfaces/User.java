package com.example.exercises.exercise4.interfaces;

public interface User {
    double getValorDesconto(double valorProduto);
    String getTipoUsuario();
    double getValorFreteDesconto(double valorFrete, double valorProduto);
}
