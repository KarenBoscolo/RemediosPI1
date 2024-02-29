package com.RemediosPI1.RemediosPI1.controllers;

import com.RemediosPI1.RemediosPI1.models.MedicamentoModel;
import com.RemediosPI1.RemediosPI1.services.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/medicamentos")
public class MedicamentoController {

    private final MedicamentoService medicamentoService;

    @Autowired
    public MedicamentoController(MedicamentoService medicamentoService) {
        this.medicamentoService = medicamentoService;
    }

    @GetMapping
    public ResponseEntity<List<MedicamentoModel>> getAllMedicamentos() {
        List<MedicamentoModel> medicamentos = medicamentoService.getAllMedicamentos();
        return ResponseEntity.ok(medicamentos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MedicamentoModel> getMedicamentoById(@PathVariable Long id) {
        Optional<MedicamentoModel> medicamento = medicamentoService.getMedicamentoById(id);
        return medicamento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<MedicamentoModel> saveMedicamento(@RequestBody MedicamentoModel medicamento) {
        MedicamentoModel savedMedicamento = medicamentoService.saveMedicamento(medicamento);
        return ResponseEntity.ok(savedMedicamento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedicamento(@PathVariable Long id) {
        medicamentoService.deleteMedicamento(id);
        return ResponseEntity.noContent().build();
    }
}
