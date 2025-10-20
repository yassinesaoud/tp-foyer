package tn.esprit.tpfoyer.Service;

import tn.esprit.tpfoyer.Model.Universite;
import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversites();
    Universite addUniversite(Universite u);
    Universite updateUniversite(Universite u);
    Universite retrieveUniversite(Long idUniversite);
    void removeUniversite(Long idUniversite);
}
