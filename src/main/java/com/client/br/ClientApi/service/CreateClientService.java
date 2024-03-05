package com.client.br.ClientApi.service;

import com.client.br.ClientApi.Model.Client;
import com.client.br.ClientApi.repository.IClientRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateClientService {

    private IClientRepository repository;

    public CreateClientService(IClientRepository repository) {
        this.repository = repository;
    }

    public Client execute(Client client) {

        Client existedClient = this.repository.findByName(client.getName());


        if (existedClient != null) {
            throw new Error("Cliente já cadastrado!");
        }

        return this.repository.save(client);
    }

}
