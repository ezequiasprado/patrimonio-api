package br.com.senai.patrimonio;

import br.com.senai.patrimonio.atividades.*;
import br.com.senai.patrimonio.avaliacao.Participante;
import br.com.senai.patrimonio.avaliacao.enums.Nivel;
import br.com.senai.patrimonio.model.*;
import br.com.senai.patrimonio.model.Funcionario;
import br.com.senai.patrimonio.model.enums.Cargo;
import br.com.senai.patrimonio.model.enums.EstadoConservacao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatrimonioApplication {

	public static void main(String[] args) {

		SpringApplication.run(PatrimonioApplication.class, args);

		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Senai LTDA");
		System.out.println(empresa.getRazaoSocial());

		Endereco endereco = new Endereco();
		endereco.setRua("Bela vista");
		System.out.println(endereco.getRua());
		System.out.println(endereco.getBairro());

		empresa.setEndereco(endereco);
		System.out.println(empresa.getEndereco().getRua());

		Endereco enderecoComArgumentos = new Endereco("Líbano jose gomes",
				"489", "Perto do posto de saúde",
				"Santa luzia","Criciúma", "SC");
		System.out.println(enderecoComArgumentos.getBairro());

		Sala sala = new Sala();

		Funcionario funcionario = new Funcionario(
				35L,"Mariazinha","13456789",
				Cargo.GERENTE, empresa, sala
		);

		System.out.println(funcionario.getCpf());

		Participante participante = new Participante(
			"João", "joao@gmail.com","04898745236",
			"45678", Nivel.INICIANTE
		);

		Empresa empresaInterface = new Empresa();

		Bloco blocoInterface = new Bloco(1L, "Bloco 2", empresaInterface);

		Sala salaInterface = new Sala(2L, "Lab 2", "45678",
				blocoInterface, empresaInterface);

		System.out.println(salaInterface.getDescricaoLocalizavel());


		Patrimonio patrimonio = new Patrimonio();
		System.out.println(patrimonio.validarEstadoConservacao());

		patrimonio.setEstado(EstadoConservacao.INSERVIVEL);
		System.out.println(patrimonio.validarEstadoConservacao());

		Bem bem = new Bem();
		System.out.println(bem.getEmpresaVinculada());

		Empresa empresa1 = new Empresa();
		bem.setEmpresa(empresa1);
		System.out.println(bem.getEmpresaVinculada());

		empresa1.setNome("Senai");
		System.out.println(bem.getEmpresaVinculada());

		System.out.println("Teste do Bloco:");
		Bloco bloco = new Bloco();
		System.out.println(bloco.getEmpresaVinculada());

		bloco.setEmpresa(empresa1);
		System.out.println(bloco.getEmpresaVinculada());

		System.out.println("Teste de funcionário");
		Funcionario funcionario1 = new Funcionario();
		System.out.println(funcionario1.getEmpresaVinculada());

		funcionario1.setEmpresa(empresa1);
		System.out.println(funcionario1.getEmpresaVinculada());

		System.out.println("Teste de Sala");
		Sala sala1 = new Sala();
		System.out.println(sala1.getEmpresaVinculada());

		sala1.setEmpresa(empresa1);
		System.out.println(sala1.getEmpresaVinculada());

		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Joãozinho");
		pessoa.setCpf("45787878");
		System.out.println(pessoa.getIdentificacao());

		funcionario1.setNome("Mariazinha");
		funcionario1.setCpf("12345678");
		funcionario1.setCargo(Cargo.DIRETOR);
		System.out.println(funcionario1.getIdentificacao());

		Equipamento equipamento = new Equipamento("Mesa", 800.00);
		Equipamento computador = new Computador("Notebook", 5000.00);
		Equipamento veiculo = new Veiculo("Fusca", 98000.00);

		exibirRelatorio(equipamento);
		exibirRelatorio(computador);
		exibirRelatorio(veiculo);


		/************TESTE DE FUNCIONÁRIO COM POLIMORFISMO*************/
		br.com.senai.patrimonio.atividades.Funcionario funcionario2 =
				new br.com.senai.patrimonio.atividades.Funcionario("João", 5000.00);

		br.com.senai.patrimonio.atividades.Funcionario gerente =
				new Gerente("Maathey", 50000.00);

		br.com.senai.patrimonio.atividades.Funcionario desenvolvedor =
				new Desenvolvedor("Andrei", 15000.00);

		imprimirContraCheque(funcionario2);
		imprimirContraCheque(gerente);
		imprimirContraCheque(desenvolvedor);
	}

	public static void exibirRelatorio(Equipamento item) {
		System.out.println("Item: " + item.getNome());
		System.out.println("Valor inicial: " + item.getValorInicial());
		System.out.println("Depreciação: " + item.calcularDepreciacao());
		System.out.println("---------------------------------------------------");
	}

	// Método auxiliar que demonstra o polimorfismo
	public static void imprimirContraCheque(br.com.senai.patrimonio.atividades.Funcionario funcionario) {
		System.out.println("Funcionário: " + funcionario.getNome());
		System.out.println("Salário Base: R$ " + funcionario.getSalarioBase());

		System.out.println(funcionario.calcularBonificacao());

		System.out.println(funcionario.getSalarioBase() +
				funcionario.calcularBonificacao());

		System.out.println("-------------------------------------------");
	}
}
