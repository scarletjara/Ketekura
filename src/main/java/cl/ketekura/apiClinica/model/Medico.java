package cl.ketekura.apiClinica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @Column(name = "med_run")
    private Long medRut;

    @Column(name = "pnombre")
    private String pnombre;

    @Column(name = "apaterno")
    private String apaterno;

    @Column(name = "telefono")
    private String telefono;
}