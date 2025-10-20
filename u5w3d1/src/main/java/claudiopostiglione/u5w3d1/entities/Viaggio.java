package claudiopostiglione.u5w3d1.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "viaggio")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Viaggio {

    //Attributi
    @Id
    @GeneratedValue
    private UUID id;
    @Column(name = "Destinazione")
    private String destinazione;
    @Column(name = "Data")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dataDestinazione;
    @Column(name = "Orario_Partenza")
    private LocalTime orarioPartenza;
    @Column(name = "Stato_Destinazione")
    @Enumerated(EnumType.STRING)
    private StatoDestinazione stato;

    @JsonIgnore
    @OneToMany(mappedBy = "viaggio")
    private List<Prenotazione> listaPrenotazione;

    //Costruttori
    public Viaggio(String destinazione, LocalDate dataDestinazione,LocalTime orarioPartenza, StatoDestinazione stato){
        this.destinazione = destinazione;
        this.dataDestinazione = dataDestinazione;
        this.orarioPartenza = orarioPartenza;
        this.stato = stato;
    }

    //Metodi

}
