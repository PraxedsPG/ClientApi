package com.client.br.ClientApi.repository;

import com.client.br.ClientApi.Model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientRepository implements IClientRepository{


    @Autowired
    ClientJpaRepository repository;

    @Override
    public Client findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public Client save(Client client) {
        return this.repository.save(client);
    }
}
