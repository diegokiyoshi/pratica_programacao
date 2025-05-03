package br.com.maxxy.pasteis.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.maxxy.pasteis.models.Cliente;
import br.com.maxxy.pasteis.repository.ClienteRepository;
import br.com.maxxy.pasteis.repository.ClienteRepositoryImpl;

@Service
public class ClienteServiceImpl implements ClienteService{
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Transactional
	public Cliente save(Cliente cliente) {
		
		return clienteRepository.save(cliente);
	}

}
