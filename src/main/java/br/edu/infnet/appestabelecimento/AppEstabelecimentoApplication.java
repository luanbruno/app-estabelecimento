package br.edu.infnet.appestabelecimento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class AppEstabelecimentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppEstabelecimentoApplication.class, args);
	}

}
