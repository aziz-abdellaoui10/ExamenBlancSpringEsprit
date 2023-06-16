package Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Formateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFormateur;

    private String nom;
    private String prenom;
    private int tarifHoraire;
    private String email;
    @OneToMany(mappedBy = "formateur")
    private List<Formation> formationList;
}
