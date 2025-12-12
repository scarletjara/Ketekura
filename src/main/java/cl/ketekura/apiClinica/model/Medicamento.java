package cl.ketekura.apiClinica.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Medicamento {
    
    private String nombre;
    private String dosis;
    private String frecuencia;
    private String duracion;
}

