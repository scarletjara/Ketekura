package cl.ketekura.apiClinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.ketekura.apiClinica.model.Paciente;



public interface PacienteRepository extends JpaRepository<Paciente, Long> {}