package cl.ketekura.apiClinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.ketekura.apiClinica.model.Paciente;
import cl.ketekura.apiClinica.service.PacienteService;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService service;

    @PostMapping
    public Paciente crearPaciente(@RequestBody Paciente p) {
        return service.crear(p);
    }

    @GetMapping
    public List<Paciente> obtenerTodos() {
        return service.getAll();
    }

    @GetMapping("/{rut}")
    public Paciente obtenerPorRut(@PathVariable("rut") Long pacRut) {
        return service.getByRut(pacRut);
    }
}