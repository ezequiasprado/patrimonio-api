package br.com.senai.patrimonio.atividades;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonificacao() {
        return getSalarioBase() * 0.15;
    }
}
