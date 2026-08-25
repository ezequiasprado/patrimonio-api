package br.com.senai.patrimonio.model;

public class Bem {
    private Long id;
    private String nome;
    private String codigo;
    private Empresa empresa;

    public Bem(){}

    public Bem(Long id, String nome, String codigo, Empresa empresa) {
        this.id = id;
        this.nome = nome;
        this.codigo = codigo;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
