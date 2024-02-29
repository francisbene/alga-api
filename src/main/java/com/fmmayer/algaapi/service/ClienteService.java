package com.fmmayer.algaapi.service;

import com.fmmayer.algaapi.model.ClienteModel;
import com.fmmayer.algaapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModel> listar(){
        return clienteRepository.findAll();
    }
    public ClienteModel salvar(ClienteModel clienteModel) {
        return clienteRepository.save(clienteModel);
    }

}
