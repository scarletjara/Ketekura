package cl.ketekura.apiClinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.ketekura.apiClinica.dto.RecetaDetalleDTO;
import cl.ketekura.apiClinica.model.RecetaMedica;
import cl.ketekura.apiClinica.repository.RecetaRepository;

@Service
public class RecetaService {

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private MedicoService medicoService;

    @Autowired
    private RecetaRepository recetaRepository;

    public RecetaDetalleDTO obtenerDetalle(String idReceta) {

    RecetaMedica receta = recetaRepository.findById(idReceta).orElse(null);
    if (receta == null) return null;

    RecetaDetalleDTO dto = new RecetaDetalleDTO();

    dto.setIdReceta(receta.getId());
    dto.setFechaReceta(receta.getFechaReceta());
    dto.setDiagnostico(receta.getDiagnostico());
    dto.setMedicamentos(receta.getMedicamentos());

    // Buscar en PostgreSQL
    dto.setPaciente(pacienteService.getByRut(receta.getPacRut()));
    dto.setMedico(medicoService.getByRut(receta.getMedicoRut()));

    return dto;
    }

    public List<RecetaMedica> getAlList() {
        return recetaRepository.findAll();
    }

    public RecetaMedica crearReceta(RecetaMedica receta) {
        return recetaRepository.save(receta);
    }

    public List<RecetaMedica> obtenerPorRut(Long pacRut) {
        return recetaRepository.findByPacRut(pacRut);
    }

    public boolean eliminarReceta(String idReceta) {
    if (!recetaRepository.existsById(idReceta)) {
        return false;
    }
    recetaRepository.deleteById(idReceta);
    return true;
    }

    public RecetaMedica actualizarReceta(String id, RecetaMedica datosActualizados) {

        RecetaMedica receta = recetaRepository.findById(id).orElse(null);
        if (receta == null) {
            return null;
        }
    
        receta.setFechaReceta(datosActualizados.getFechaReceta());
        receta.setDiagnostico(datosActualizados.getDiagnostico());
        receta.setMedicamentos(datosActualizados.getMedicamentos());
    
        return recetaRepository.save(receta);
    }

}

