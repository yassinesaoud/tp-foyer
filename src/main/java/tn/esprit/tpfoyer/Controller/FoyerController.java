package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Model.Foyer;
import tn.esprit.tpfoyer.Service.FoyerServiceImp;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyers")
public class FoyerController {
    FoyerServiceImp foyerService;

    @GetMapping("/all")
    public List<Foyer> getFoyers() {
        List<Foyer> listFoyers = foyerService.retrieveAllFoyers();
        return listFoyers;
    }

    @PostMapping("/add")
    public Foyer addFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerService.addFoyer(f);
        return foyer;
    }

    @PutMapping("/update")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerService.updateFoyer(f);
        return foyer;
    }

    @GetMapping("/retrieve/{idFoyer}")
    public Foyer retrieveFoyer(@PathVariable("idFoyer") Long idFoyer) {
        return foyerService.retrieveFoyer(idFoyer);
    }

    @DeleteMapping("/remove/{idFoyer}")
    public void removeFoyer(@PathVariable("idFoyer") Long idFoyer) {
        foyerService.removeFoyer(idFoyer);
    }
}
