package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Client;

import java.util.List;

public interface IClientService {
    Client ajoutterClient(Client client);
    Client modifierClient(Client client);
    Client afficherClient(Long id);
    List<Client> afficherAllClients();
    void supprimerClient(Long id);
}
