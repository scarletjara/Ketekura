package cl.ketekura.apiClinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.ketekura.apiClinica.dto.RecetaDetalleDTO;
import cl.ketekura.apiClinica.model.RecetaMedica;
import cl.ketekura.apiClinica.service.RecetaService;

@RestController
@RequestMapping("api/recetas")
public class RecetaController {
    
    @Autowired
    private RecetaService recetaService;

    @GetMapping
    public List<RecetaMedica> getAll() {
        return recetaService.getAlList();
    }
    

    @PostMapping
    public RecetaMedica crearReceta(@RequestBody RecetaMedica receta) {
        return recetaService.crearReceta(receta);
}

    @GetMapping("/{rut}")
    public List<RecetaMedica> obtenerRecetasPorRut(@PathVariable("rut") Long pacRut) {
        return recetaService.obtenerPorRut(pacRut);
    }

    @GetMapping("/detalle/{id}")
    public RecetaDetalleDTO obtenerDetalleReceta(@PathVariable("id") String id) {
        return recetaService.obtenerDetalle(id);
    }

    @DeleteMapping("/{id}")
public ResponseEntity<String> eliminarReceta(@PathVariable("id") String id) {
    boolean eliminado = recetaService.eliminarReceta(id);

    if (!eliminado) {
        return ResponseEntity.notFound().build();
    }

    return ResponseEntity.ok("Receta eliminada correctamente");
    }

}
