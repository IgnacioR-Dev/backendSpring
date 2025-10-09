package com.backend.level_up.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/registro")
    public String greetings(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello {" + name + "}";
    }

    @GetMapping
    public List<Cliente> getAllClientes() {
        return (List<Cliente>) clienteService.getAllClientes();
    }

    @GetMapping("/{id_cliente}")
    public Cliente getClienteById(@PathVariable Long id_cliente) {
        return clienteService.getClienteById(id_cliente);
    }

    @PostMapping
    public Cliente saveCliente(@RequestBody Cliente cliente) {
        return clienteService.saveCliente(cliente);
    }

    @DeleteMapping("/{id_cliente}")
    public void deleteCliente(@PathVariable Long id_cliente) {
        clienteService.deleteCliente(id_cliente);
    }
    
}




