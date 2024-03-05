package com.client.br.ClientApi.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "client")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    private String cpf;

}
