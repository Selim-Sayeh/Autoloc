package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Contrat;

import java.util.List;

public interface IContratService {
    Contrat ajoutterContrat(Contrat contrat);
    Contrat modifierContrat(Contrat contrat);
    Contrat afficherContrat(Long id);
    List<Contrat> afficherAllContrat();
    void supprimerContrat(Long id);
}
