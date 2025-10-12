package tn.esprit.tpfoyer.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idEtudiant;
     String nomEt;
     String prenomEt;
     long cin;
     String ecole;
    @Temporal(TemporalType.DATE)
     Date dateNaissance;
    @ManyToMany(mappedBy = "etudiants")
    List<Reservation>reservations;


}
