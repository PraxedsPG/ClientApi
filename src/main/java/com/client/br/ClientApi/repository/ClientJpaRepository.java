package com.client.br.ClientApi.repository;

import com.client.br.ClientApi.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientJpaRepository extends JpaRepository<Client, UUID> {

    public Client findByName(String name);
}
