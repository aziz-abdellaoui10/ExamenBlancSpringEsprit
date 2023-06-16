package Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Formation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFormation;

    private String titre;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    private Date dateDebut;
    private Date dateFin;
    private int nbrHeures;
    private int nrbMaxParticipant;
    private int frais;
    @ManyToOne
    private Formateur formateur;

}
