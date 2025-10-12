package tn.esprit.tpfoyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Model.Foyer;
import tn.esprit.tpfoyer.Repository.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImp {
    FoyerRepository foyerRepository;
    
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    
    public Foyer retrieveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }

    
    public void removeFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }
}
