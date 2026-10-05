package br.com.senai.patrimonio.model;

import br.com.senai.patrimonio.model.enums.Cargo;

public class Funcionario extends Pessoa implements Localizavel, BuscarEmpresaVinculada{
    private Cargo cargo;
    private Empresa empresa;
    private Sala salasResponsavel;

    public Funcionario(){}

    public Funcionario(Cargo cargo, Empresa empresa, Sala salasResponsavel) {
        this.cargo = cargo;
        this.empresa = empresa;
        this.salasResponsavel = salasResponsavel;
    }

    public Funcionario(Long id, String nome, String cpf, Cargo cargo, Empresa empresa, Sala salasResponsavel) {
        super(id, nome, cpf);
        this.cargo = cargo;
        this.empresa = empresa;
        this.salasResponsavel = salasResponsavel;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Sala getSalasResponsavel() {
        return salasResponsavel;
    }

    public void setSalasResponsavel(Sala salasResponsavel) {
        this.salasResponsavel = salasResponsavel;
    }

    @Override
    public String getDescricaoLocalizavel() {
        return "Responsabilidade de "+ getNome() + " (" + cargo + ")";
    }

    @Override
    public String getEmpresaVinculada() {
        return empresa != null ? "Empresa: " + empresa.getNome() :
                "Empresa não informada";
    }

    /**
     * CONCEITO DE POO: POLIMORFISMO (sobrescrita / @Override)
     * --------------------------------------------------------
     * Funcionário redefine o comportamento herdado de {@link Pessoa#getIdentificacao()}
     * incluindo o cargo na descrição. Quem chama pessoa. "pessoa.getIdentificacao()"
     * através de referência do tipoo Pessoa não precisa se o
     * o objeto real é um funcionário a versão correta é executada em
     * tempo de execução (polimosrfismo dinamico)
     */
    @Override
    public String getIdentificacao(){
        return super.getIdentificacao() + " - " + cargo;
    }
}
