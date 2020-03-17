package fr.miage.toulouse.m2.ams.zenewbank.app.rest;

import fr.miage.toulouse.m2.ams.zenewbank.app.entities.compte.Compte;
import fr.miage.toulouse.m2.ams.zenewbank.app.repo.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comptes")
public class CompteController {

    @Autowired
    private CompteRepository compteRepository;

    @PostMapping("/")
    Compte postCompte(@RequestBody Compte compte) {
        return this.compteRepository.save(compte);
    }

    @GetMapping("/{id}")
    Compte getCompte(@PathVariable("id") Compte c) {
        return c;
    }
}
