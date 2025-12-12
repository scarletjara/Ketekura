package cl.ketekura.apiClinica.dto;

import java.util.List;
import cl.ketekura.apiClinica.model.Paciente;
import cl.ketekura.apiClinica.model.Medico;
import cl.ketekura.apiClinica.model.Medicamento;
import lombok.Data;

@Data
public class RecetaDetalleDTO {

    private String idReceta;

    private Paciente paciente;
    private Medico medico;

    private String fechaReceta;
    private String diagnostico;

    private List<Medicamento> medicamentos;
}