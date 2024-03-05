package com.client.br.ClientApi.repository;

import com.client.br.ClientApi.Model.Client;

public interface IClientRepository {

    public Client findByName(String name);

    public Client save(Client client);

}
