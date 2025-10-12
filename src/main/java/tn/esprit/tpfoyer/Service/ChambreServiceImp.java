package tn.esprit.tpfoyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Model.Chambre;
import tn.esprit.tpfoyer.Repository.ChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImp {
    ChambreRepository chambreRepository;
    
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    
    public void removeChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }
}
