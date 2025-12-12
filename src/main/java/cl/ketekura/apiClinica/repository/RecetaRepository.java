package cl.ketekura.apiClinica.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import cl.ketekura.apiClinica.model.RecetaMedica;

public interface RecetaRepository extends MongoRepository<RecetaMedica, String> {
    List<RecetaMedica> findByPacRut(Long pacRut);
}
