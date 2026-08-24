package br.com.senai.patrimonio.model;

public class Sala {
    private Long id;
    private String nome;
    private String qrCode;
    private Bloco bloco;
    private Empresa empresa;

    public Sala() {}

    public Sala(Long id, String nome, String qrCode, Bloco bloco, Empresa empresa) {
        this.id = id;
        this.nome = nome;
        this.qrCode = qrCode;
        this.bloco = bloco;
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

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public Bloco getBloco() {
        return bloco;
    }

    public void setBloco(Bloco bloco) {
        this.bloco = bloco;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
