package dst.corso.model;

import lombok.Data;
import dst.corso.model.Studente;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "corso")
public class Corso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nome", nullable = false, length = 30)
    private String nome;
    @Column(name = "lezioni", nullable = false)
    private int lezioni;
    @OneToOne
    private Docente docenteID;
    @OneToMany
    private List<Studente> studenteID;
    @Column(name = "cittaID", nullable = false)
    private long cittaID;
}
