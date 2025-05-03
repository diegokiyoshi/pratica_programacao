package br.com.maxxy.pasteis.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maxxy.pasteis.models.Pedido;
import br.com.maxxy.pasteis.repository.PedidoRepository;

@Service
public class PedidoServiceImpl implements PedidoService{
	@Autowired
	private PedidoRepository pedidoRepository;
	@Transactional
	public Pedido save(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	

}
