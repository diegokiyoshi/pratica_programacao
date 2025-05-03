package br.com.maxxy.pasteis.controller;

import br.com.maxxy.pasteis.dtos.ClienteDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.maxxy.pasteis.models.Cliente;
import br.com.maxxy.pasteis.service.ClienteService;

@RestController
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	@GetMapping("/cliente")
	public Cliente getUser(@RequestParam(value = "Nome_Cliente", defaultValue = "Nome Cliente") String Nome_Cliente,
						   @RequestParam(value = "Endereco_Cliente", defaultValue = "Rua Cliente, 22") String Endereco_Cliente) {
		Cliente cliente = new Cliente();
		cliente.setClienteId((long) 1.0000);
		cliente.setNomeCliente(Nome_Cliente);
		cliente.setEnderecoCliente(Endereco_Cliente);
		return cliente;
						
						   }
	
	@PostMapping("/cliente")
	public Cliente postUser(@RequestBody ClienteDto clienteDto) {
		System.out.println("nome Cliente " + clienteDto.getNomeCliente());
		Cliente cliente = new Cliente();
		BeanUtils.copyProperties(clienteDto,cliente);


		clienteService.save(cliente);
		return cliente;
	}
							
	@PatchMapping("/cliente")
	public Cliente patchUser(@RequestBody Cliente cliente) {
		clienteService.save(cliente);
		return cliente;
	}


}
