package com.admin.vitoriadev.interfaces;

//tem objetivo de proporcionar que mesmo classes se heranca, tenham comportamentos especificos
public interface Rendimento {

    // assinatura - regra, todas devem ser abstratas
    // métodos sem corpo são abstratos implicitamente
    public abstract double calcularRendimento(int meses);

}
