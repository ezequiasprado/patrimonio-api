package br.com.senai.patrimonio.model;
/**
 * CONCEITO DE POO: ENCAPSULAMENTO + ABSTRACAO
 * --------------------------------------------
 * Os campos de endereco (rua, numero, complemento, bairro, cidade, estado)
 * apareciam soltos dentro de Empresa. Agrupa-los em um objeto de valor
 * (@Embeddable) encapsula a responsabilidade de "montar um endereco" em
 * uma unica classe coesa, evitando duplicar esses 6 campos caso outra
 * entidade precise de endereco no futuro.
 * <p>
 * Os atributos sao privados e só podem ser lidos/alterados atraves dos
 * getters/setters (nenhuma classe externa acessa "rua" diretamente).
 */
public class Endereco {
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(){}

    public Endereco(String rua, String numero, String complemento, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
