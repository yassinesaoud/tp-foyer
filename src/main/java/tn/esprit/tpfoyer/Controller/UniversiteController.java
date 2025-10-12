package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Model.Universite;
import tn.esprit.tpfoyer.Service.UniversiteServiceImp;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universites")
public class UniversiteController {
    UniversiteServiceImp universiteService;

    @GetMapping("/all")
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = universiteService.retrieveAllUniversites();
        return listUniversites;
    }

    @PostMapping("/add")
    public Universite addUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.addUniversite(u);
        return universite;
    }

    @PutMapping("/update")
    public Universite updateUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.updateUniversite(u);
        return universite;
    }

    @GetMapping("/retrieve/{idUniversite}")
    public Universite retrieveUniversite(@PathVariable("idUniversite") Long idUniversite) {
        return universiteService.retrieveUniversite(idUniversite);
    }

    @DeleteMapping("/remove/{idUniversite}")
    public void removeUniversite(@PathVariable("idUniversite") Long idUniversite) {
        universiteService.removeUniversite(idUniversite);
    }
}
