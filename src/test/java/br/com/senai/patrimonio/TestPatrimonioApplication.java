package br.com.senai.patrimonio;

import org.springframework.boot.SpringApplication;

public class TestPatrimonioApplication {

	public static void main(String[] args) {
		SpringApplication.from(PatrimonioApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
