package cl.ketekura.apiClinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.ketekura.apiClinica.model.Medico;
import cl.ketekura.apiClinica.service.MedicoService;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {

    @Autowired
    private MedicoService service;

    @PostMapping
    public Medico crearMedico(@RequestBody Medico m) {
        return service.crear(m);
    }

    @GetMapping
    public List<Medico> obtenerTodos() {
        return service.getAll();
    }

    @GetMapping("/{rut}")
    public Medico obtenerPorRut(@PathVariable ("rut")Long medRut) {
        return service.getByRut(medRut);
    }
}