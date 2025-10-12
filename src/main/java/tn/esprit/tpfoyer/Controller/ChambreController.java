package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Model.Chambre;
import tn.esprit.tpfoyer.Service.ChambreServiceImp;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambres")
public class ChambreController {
    ChambreServiceImp chambreService;

    @GetMapping("/all")
    public List<Chambre> getChambres() {
        List<Chambre> listChambres = chambreService.retrieveAllChambres();
        return listChambres;
    }

    @PostMapping("/add")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.addChambre(c);
        return chambre;
    }

    @PutMapping("/update")
    public Chambre updateChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.updateChambre(c);
        return chambre;
    }

    @GetMapping("/retrieve/{idChambre}")
    public Chambre retrieveChambre(@PathVariable("idChambre") Long idChambre) {
        return chambreService.retrieveChambre(idChambre);
    }

    @DeleteMapping("/remove/{idChambre}")
    public void removeChambre(@PathVariable("idChambre") Long idChambre) {
        chambreService.removeChambre(idChambre);
    }
}
