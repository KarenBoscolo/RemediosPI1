package com.RemediosPI1.RemediosPI1.controllers;

import com.RemediosPI1.RemediosPI1.models.PacienteModel;
import com.RemediosPI1.RemediosPI1.models.PrescricaoModel;
import com.RemediosPI1.RemediosPI1.services.PrescricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/prescricoes")
public class PrescricaoController {

    private final PrescricaoService prescricaoService;

    @Autowired
    public PrescricaoController(PrescricaoService prescricaoService) {
        this.prescricaoService = prescricaoService;
    }

    @GetMapping
    public ResponseEntity<List<PrescricaoModel>> getAllPrescricoes() {
        List<PrescricaoModel> prescricoes = prescricaoService.getAllPrescricoes();
        return ResponseEntity.ok(prescricoes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrescricaoModel> getPrescricaoById(@PathVariable Long id) {
        Optional<PrescricaoModel> prescricao = prescricaoService.getPrescricaoById(id);
        return prescricao.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PrescricaoModel> savePrescricao(@RequestBody PrescricaoModel prescricao) {
        PrescricaoModel savedPrescricao = prescricaoService.savePrescricao(prescricao);
        return ResponseEntity.ok(savedPrescricao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrescricao(@PathVariable Long id) {
        prescricaoService.deletePrescricao(id);
        return ResponseEntity.noContent().build();
    }
}
