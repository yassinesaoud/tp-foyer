package tn.esprit.tpfoyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Model.Etudiant;
import tn.esprit.tpfoyer.Repository.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImp {
    EtudiantRepository etudiantRepository;
    
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    
    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }
}
