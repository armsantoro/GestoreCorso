package dst.corso.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "docente")
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "personaId", nullable = false)
    private long persona;
    @Column(name = "id_corso", nullable = false)
    private long idCorso;
}
