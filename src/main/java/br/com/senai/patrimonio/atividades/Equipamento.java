package br.com.senai.patrimonio.atividades;

public class Equipamento {
    private String nome;
    private double valorInicial;

    public Equipamento(String nome, double valorInicial) {
        this.nome = nome;
        this.valorInicial = valorInicial;
    }

    public String getNome() {
        return nome;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    // TODO: Retornar a depreciação padrão de 5% do valor inicial (valorInicial * 0.05)
    public double calcularDepreciacao() {
        return this.valorInicial * 0.05;
    }
}
