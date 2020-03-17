package fr.miage.toulouse.m2.ams.zenewbank.app.entities.compte;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ludoviclajournade
 */
@Document(collection = "Compte")
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
    public Long client;

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

    public Long getClient() {
        return client;
    }

    public void setClient(Long client) {
        this.client = client;
    }
    
}
