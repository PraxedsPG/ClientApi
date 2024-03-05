package com.client.br.ClientApi.repository;

import com.client.br.ClientApi.Model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ClientInMemoryRepository implements IClientRepository{

    private List<Client> clients;

    public ClientInMemoryRepository() {
        this.clients = new ArrayList<>();
    }

    @Override
    public Client findByName(String name) {
        Optional<Client> optionalClient = this.clients.stream().filter(client -> client.getName().equals(name)).findFirst();
        return optionalClient.orElse(null);
    }

    @Override
    public Client save(Client client) {
        this.clients.add(client);
        client.setId(UUID.randomUUID());
        return client;
    }
}
