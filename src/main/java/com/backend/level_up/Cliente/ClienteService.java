package com.backend.level_up.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
	
    @Autowired
    private ClienteRepository clienteRepository;

    public Iterable<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public Cliente getClienteById(Long id_cliente) {
        return clienteRepository.findById(id_cliente).orElse(null);
    }

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deleteCliente(Long id_cliente) {
        clienteRepository.deleteById(id_cliente);
    }
}

