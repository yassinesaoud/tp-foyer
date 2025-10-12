package tn.esprit.tpfoyer.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idFoyer;
     String nomFoyer;
     String capaciteFoyer;
    @OneToOne(mappedBy = "foyer")
     Universite universite ;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "foyer")
    List<Bloc> blocs;
}
