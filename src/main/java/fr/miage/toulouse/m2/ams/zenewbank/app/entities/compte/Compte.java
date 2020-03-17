package fr.miage.toulouse.m2.ams.zenewbank.app.entities.compte;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fr.miage.toulouse.m2.ams.zenewbank.app.entities.client.Client;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ludoviclajournade
 */
@Entity
public class Compte {
    
    @Id
    public long id;

    public long getId() {
        return id;
    }


    @NotNull
    public double solde;

    @NotNull
    public String idclient;

    @ManyToOne
    public Client client;

    public void setId(long id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getIdclient() {
        return idclient;
    }

    public void setIdclient(String idclient) {
        this.idclient = idclient;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
}
