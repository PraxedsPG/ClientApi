package com.client.br.ClientApi.controller;

import com.client.br.ClientApi.Model.Client;
import com.client.br.ClientApi.service.CreateClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private CreateClientService service;

    @PostMapping()
    public Client createClient(@RequestBody Client client) {
        return service.execute(client);
    }

}
