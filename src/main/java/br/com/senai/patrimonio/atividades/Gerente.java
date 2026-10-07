package br.com.senai.patrimonio.atividades;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonificacao() {
        return getSalarioBase() * 0.20;
    }
}
