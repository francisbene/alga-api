package com.fmmayer.algaapi.controller;

import com.fmmayer.algaapi.model.ClienteModel;
import com.fmmayer.algaapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    @GetMapping
    public List<ClienteModel> listar(){
        List<ClienteModel > clienteModel = clienteService.listar();
        return clienteModel;
    }
    @PostMapping
    public ClienteModel add(@RequestBody ClienteModel clienteModel) {
        return clienteService.salvar(clienteModel);
    }
}
