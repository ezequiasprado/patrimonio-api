package br.com.senai.patrimonio.model;

import br.com.senai.patrimonio.model.enums.Cargo;

public class Funcionario extends Pessoa {
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
}
