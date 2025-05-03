package br.com.maxxy.pasteis.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.maxxy.pasteis.dtos.CardapioDto;
import br.com.maxxy.pasteis.models.Cardapio;
import br.com.maxxy.pasteis.models.Produto;
import br.com.maxxy.pasteis.service.CardapioService;
@RestController
public class CardapioController {
	@Autowired
	private CardapioService cardapioService;
	@GetMapping("/cardapio")
	public Cardapio getUser(@RequestParam(value = "nome", defaultValue = "Salgados") String nome,
							Produto id_produto) {
		Cardapio cardapio = new Cardapio();
		cardapio.setNome(nome);
		return cardapio;
	}

	@PostMapping("/cardapio")
	public Cardapio postUser(@RequestBody CardapioDto cardapioDto) {
		Cardapio cardapio = new Cardapio();
		BeanUtils.copyProperties(cardapioDto, cardapio);
		cardapioService.save(cardapio);
		return cardapio;
	}
	
	@PatchMapping("/cardapio")
	public Cardapio patchUser(@RequestBody Cardapio cardapio) {
		cardapioService.save(cardapio);
		return cardapio;
	}
}
