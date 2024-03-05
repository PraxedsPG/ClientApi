package com.client.br.ClientApi;

import com.client.br.ClientApi.Model.Client;
import com.client.br.ClientApi.repository.ClientInMemoryRepository;
import com.client.br.ClientApi.service.CreateClientService;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class CreateClientServiceTest {

    @Test
    public void should_be_able_to_create_a_new_client() {

        Client client = new Client();
        client.setName("Client_Name");
        client.setDateOfBirth("Client_Date_Of_Birth");
        client.setCpf("24655341285");

        ClientInMemoryRepository repository = new ClientInMemoryRepository();

        CreateClientService createClientService = new CreateClientService(repository);
        Client createdClient = createClientService.execute(client);

        assertNotNull(createdClient.getId());

    }

    @Test(expected = Error.class)
    public void should_not_be_able_to_create_a_new_client_if_exists() {
        Client client = new Client();
        client.setName("Client_Name");
        client.setDateOfBirth("Client_Date_Of_Birth");
        client.setCpf("24655341285");

        ClientInMemoryRepository repository = new ClientInMemoryRepository();

        CreateClientService createClientService = new CreateClientService(repository);
        createClientService.execute(client);
        createClientService.execute(client);

    }

}
