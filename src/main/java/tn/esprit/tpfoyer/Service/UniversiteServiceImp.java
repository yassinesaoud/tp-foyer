package tn.esprit.tpfoyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Model.Universite;
import tn.esprit.tpfoyer.Repository.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImp {
    UniversiteRepository universiteRepository;
    
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    
    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    
    public void removeUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }
}
