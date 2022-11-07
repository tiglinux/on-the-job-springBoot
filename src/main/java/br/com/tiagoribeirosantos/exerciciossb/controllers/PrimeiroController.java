package br.com.tiagoribeirosantos.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController									//Notação para um Controller Rest
public class PrimeiroController {
	
	//Método GET permite chamar quando /olaMundo for chamado.
	@RequestMapping(method = RequestMethod.GET, path = "/olaMundo")	
	public String olaMundo() {
		return "Hello SpringBoot!";
	}
	
	@GetMapping(path = "/olaMundo2")			//Outra forma de usar método GET
	public String olaMundo2() {
		return "Hello SpringBoot2";
	}
	
	@PostMapping(path = "/olaMundo")
	public String olaMundoPost() {
		return "Hello SpringBoot (POST)";
	}
}
