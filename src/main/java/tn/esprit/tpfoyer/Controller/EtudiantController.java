package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Model.Etudiant;
import tn.esprit.tpfoyer.Service.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiants")
public class EtudiantController {
    IEtudiantService etudiantService;

    @GetMapping("/all")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }

    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }

    @PutMapping("/update")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.updateEtudiant(e);
        return etudiant;
    }

    @GetMapping("/retrieve/{idEtudiant}")
    public Etudiant retrieveEtudiant(@PathVariable("idEtudiant") Long idEtudiant) {
        return etudiantService.retrieveEtudiant(idEtudiant);
    }

    @DeleteMapping("/remove/{idEtudiant}")
    public void removeEtudiant(@PathVariable("idEtudiant") Long idEtudiant) {
        etudiantService.removeEtudiant(idEtudiant);
    }
}
