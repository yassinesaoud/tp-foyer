package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Model.Bloc;
import tn.esprit.tpfoyer.Model.TypeChambre;
import tn.esprit.tpfoyer.Service.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/blocs")
public class BlocController {
    IBlocService blocService;

    @GetMapping("/all")
    public List<Bloc> getBlocs() {
        List<Bloc> listBlocs = blocService.retrieveAllBlocs();
        return listBlocs;
    }

    @PostMapping("/add")
    public Bloc addBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.addBloc(b);
        return bloc;
    }

    @PutMapping("/update")
    public Bloc updateBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.updateBloc(b);
        return bloc;
    }

    @GetMapping("/retrieve/{idBloc}")
    public Bloc retrieveBloc(@PathVariable("idBloc") Long idBloc) {
        return blocService.retrieveBloc(idBloc);
    }

    @DeleteMapping("/remove/{idBloc}")
    public void removeBloc(@PathVariable("idBloc") Long idBloc) {
        blocService.removeBloc(idBloc);
    }

    @GetMapping("/by-foyer-capacite/{capaciteFoyer}")
    public List<Bloc> getBlocsByFoyerCapacite(@PathVariable("capaciteFoyer") String capaciteFoyer) {
        return blocService.retrieveBlocsByFoyerCapacite(capaciteFoyer);
    }

    @GetMapping("/by-chambre-type/{typeChambre}")
    public List<Bloc> getBlocsByChambreType(@PathVariable("typeChambre") TypeChambre typeChambre) {
        return blocService.retrieveBlocsByChambreType(typeChambre);
    }

    @GetMapping("/by-capacite-range/{lessThan}/{greaterThan}")
    public List<Bloc> getBlocsByCapaciteRange(@PathVariable("lessThan") long lessThan, @PathVariable("greaterThan") long greaterThan) {
        return blocService.retrieveBlocsByCapaciteRange(lessThan, greaterThan);
    }
}
