package cl.ketekura.apiClinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.ketekura.apiClinica.model.Paciente;
import cl.ketekura.apiClinica.repository.PacienteRepository;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository PacienteRepository;

    public Paciente crear(Paciente p) {
        return PacienteRepository.save(p);
    }

    public List<Paciente> getAll() {
        return PacienteRepository.findAll();
    }

    public Paciente getByRut(Long pacRut) {
        return PacienteRepository.findById(pacRut).orElse(null);
    }
}