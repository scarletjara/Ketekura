package cl.ketekura.apiClinica.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "recetas_medicas")
public class RecetaMedica {

    @Id
    private String id;

    @Field("pac_run")
    private Long pacRut;

    @Field("medico_run")
    private Long medicoRut;

    @Field("fecha_receta")
    private String fechaReceta;
    
    private String diagnostico;
    private List<Medicamento> medicamentos;
}