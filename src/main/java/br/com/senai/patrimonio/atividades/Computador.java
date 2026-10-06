package br.com.senai.patrimonio.atividades;

public class Computador extends Equipamento {
    public Computador(String nome, double valorInicial) {
        super(nome, valorInicial);
    }

    @Override
    public double calcularDepreciacao() {
        return getValorInicial() * 0.20;
    }
}
