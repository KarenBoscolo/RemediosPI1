package com.RemediosPI1.RemediosPI1.services;

import com.RemediosPI1.RemediosPI1.models.PacienteModel;
import com.RemediosPI1.RemediosPI1.models.PrescricaoModel;

import java.util.List;
import java.util.Optional;

public interface PrescricaoService {
    List<PrescricaoModel> getAllPrescricoes();
    Optional<PrescricaoModel> getPrescricaoById(Long id);
    PrescricaoModel savePrescricao(PrescricaoModel prescricao);
    void deletePrescricao(Long id);
}
