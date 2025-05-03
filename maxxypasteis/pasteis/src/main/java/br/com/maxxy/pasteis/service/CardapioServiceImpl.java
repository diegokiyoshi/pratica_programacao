package br.com.maxxy.pasteis.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maxxy.pasteis.models.Cardapio;
import br.com.maxxy.pasteis.repository.CardapioRepository;

@Service
public class CardapioServiceImpl implements CardapioService{
	@Autowired
	private CardapioRepository cardapioRepository;
	@Transactional
	public Cardapio save(Cardapio cardapio) {
		return cardapioRepository.save(cardapio);
	}
	
	

}
