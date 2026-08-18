package br.com.senai.patrimonio.model;

public class Bloco {
    private Long id;
    private String nome;
    private Empresa empresa;

    public Bloco (){}

    public Bloco(Long id, String nome, Empresa empresa) {
        this.id = id;
        this.nome = nome;
        this.empresa = empresa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
