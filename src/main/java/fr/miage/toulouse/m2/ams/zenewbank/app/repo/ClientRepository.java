package fr.miage.toulouse.m2.ams.zenewbank.app.repo;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fr.miage.toulouse.m2.ams.zenewbank.app.entities.client.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ludoviclajournade
 */
@Repository
public interface ClientRepository extends CrudRepository<Client,String> {
    
    Client getClientByNom(String nom);
}
