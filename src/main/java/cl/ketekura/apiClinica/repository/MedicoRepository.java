package cl.ketekura.apiClinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.ketekura.apiClinica.model.Medico;


public interface MedicoRepository extends JpaRepository<Medico, Long> {}