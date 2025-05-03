package br.com.maxxy.pasteis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.maxxy.pasteis.models.Cliente;
import br.com.maxxy.pasteis.models.Pedido;
import br.com.maxxy.pasteis.service.PedidoService;

@RestController
public class PedidoController {
	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping("/pedido")
	public Pedido getUser(@RequestParam(value = "id_Cliente", defaultValue = "01")Cliente id_cliente) {
		Pedido pedido = new Pedido();
		pedido.setId_pedido((long) 10);

		return pedido;
	}
	
	@PostMapping("/pedido")
	public Pedido postUser(@RequestBody Pedido pedido) {
		pedidoService.save(pedido);
		return pedido;
	}
	
	@PatchMapping("/pedido")
	public Pedido patchUser(@RequestBody Pedido pedido) {
		pedidoService.save(pedido);
		return pedido;
	}
}
