package com.RemediosPI1.RemediosPI1.services;

import com.RemediosPI1.RemediosPI1.models.MedicamentoModel;
import com.RemediosPI1.RemediosPI1.models.PacienteModel;

import java.util.List;
import java.util.Optional;

public interface PacienteService {
    List<PacienteModel> getAllPacientes();
    Optional<PacienteModel> getPacienteById(Long id);
    PacienteModel savePaciente(PacienteModel paciente);
    void deletePaciente(Long id);
}
