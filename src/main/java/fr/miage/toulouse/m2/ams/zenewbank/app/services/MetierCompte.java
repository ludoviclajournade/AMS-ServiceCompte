package fr.miage.toulouse.m2.ams.zenewbank.app.services;

import fr.miage.toulouse.m2.ams.zenewbank.app.entities.compte.Compte;
import fr.miage.toulouse.m2.ams.zenewbank.app.repo.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetierCompte {

    @Autowired
    private CompteRepository compteRepository;

    // TODO: ask Claire retrait et depot

    public boolean debiter(Compte c, double somme) {
        c.setSolde(somme+c.getSolde());
        return true;
    }
}
