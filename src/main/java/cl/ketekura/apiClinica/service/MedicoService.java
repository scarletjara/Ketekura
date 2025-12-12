package cl.ketekura.apiClinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.ketekura.apiClinica.model.Medico;
import cl.ketekura.apiClinica.repository.MedicoRepository;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public Medico crear(Medico m) {
        return medicoRepository.save(m);
    }

    public List<Medico> getAll() {
        return medicoRepository.findAll();
    }

    public Medico getByRut(Long medRut) {
        return medicoRepository.findById(medRut).orElse(null);
    }
}