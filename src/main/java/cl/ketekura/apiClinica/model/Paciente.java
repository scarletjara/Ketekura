package cl.ketekura.apiClinica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @Column(name = "pac_run")
    private Long pacRut;

    @Column(name = "pnombre")
    private String pnombre;

    @Column(name = "apaterno")
    private String apaterno;

    @Column(name = "telefono")
    private String telefono;
}