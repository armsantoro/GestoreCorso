package dst.corso.model;

import jakarta.persistence.*;
import lombok.Data;

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
    @Column(name = "docenteID", nullable = false)
    private long docenteID;
    @Column(name = "studenteID", nullable = false)
    private long studenteID;
    @Column(name = "cittaID", nullable = false)
    private long cittaID;
}
