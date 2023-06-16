package Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Apprenant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idApprenant;

    private String nom;
    private String prenom;
    private int telephone;
    private String email;
}
