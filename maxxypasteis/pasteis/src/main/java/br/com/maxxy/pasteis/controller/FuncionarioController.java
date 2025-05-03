package br.com.maxxy.pasteis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.maxxy.pasteis.models.Funcionario;
import br.com.maxxy.pasteis.service.FuncionarioService;

@RestController
public class FuncionarioController {
	@Autowired
	private FuncionarioService funcionarioService;
	@GetMapping("/funcionario")
	public Funcionario getUser(@RequestParam(value = "nome", defaultValue = "Funcionario Um") String nome) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		return funcionario;
	}
	
	@PostMapping("/funcionario")
	public Funcionario postUser(@RequestBody Funcionario funcionario) {
		funcionarioService.save(funcionario);
		return funcionario;
	}
	
	@PatchMapping("/funcionario")
	public Funcionario patchUser(@RequestBody Funcionario funcionario) {
		funcionarioService.save(funcionario);
		return funcionario;
	}

}
