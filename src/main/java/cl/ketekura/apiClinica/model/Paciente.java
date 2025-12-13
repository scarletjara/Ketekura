package cl.ketekura.apiClinica.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @Column(name = "pac_run")
    private Long pacRut;  // Clave primaria

    @Column(name = "dv_run", nullable = false, length = 255)
    private String dvRun;  // Dígito verificador del RUN, obligatorio

    @Column(name = "pnombre", nullable = false, length = 255)
    private String pnombre;  // Primer nombre, obligatorio

    @Column(name = "snombre", nullable = false, length = 15)
    private String snombre;  // Segundo nombre, obligatorio

    @Column(name = "apaterno", nullable = false, length = 255)
    private String apaterno;  // Apellido paterno, obligatorio

    @Column(name = "amaterno", nullable = false, length = 15)
    private String amaterno;  // Apellido materno, obligatorio

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;  // Fecha de nacimiento, obligatorio

    @Column(name = "telefono", nullable = false, length = 255)
    private String telefono;  // Teléfono, obligatorio

    @ManyToOne
    @JoinColumn(name = "sal_id", referencedColumnName = "sal_id", nullable = false)
    private Salud salud;  // Relación con la tabla 'salud', clave foránea
}