package tn.esprit.tpfoyer.Service;

import tn.esprit.tpfoyer.Model.Chambre;
import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre(Chambre c);
    Chambre retrieveChambre(Long idChambre);
    void removeChambre(Long idChambre);
}
