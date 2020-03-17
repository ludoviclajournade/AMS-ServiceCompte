package fr.miage.toulouse.m2.ams.zenewbank.app.rest;

import fr.miage.toulouse.m2.ams.zenewbank.app.entities.client.Client;
import fr.miage.toulouse.m2.ams.zenewbank.app.repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @PostMapping("/")
    Client postClient(@RequestBody Client client) {
        return this.clientRepository.save(client);
    }

    @GetMapping("/{id}")
    Client getClient(@PathVariable("id") Client c) {
        return c;
    }
}
