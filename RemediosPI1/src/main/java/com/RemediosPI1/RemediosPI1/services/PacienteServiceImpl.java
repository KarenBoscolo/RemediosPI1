package com.RemediosPI1.RemediosPI1.services;

import com.RemediosPI1.RemediosPI1.models.PacienteModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteServiceImpl implements PacienteService{
    @Override
    public List<PacienteModel> getAllPacientes() {
        return null;
    }

    @Override
    public Optional<PacienteModel> getPacienteById(Long id) {
        return Optional.empty();
    }

    @Override
    public PacienteModel savePaciente(PacienteModel paciente) {
        return null;
    }

    @Override
    public void deletePaciente(Long id) {

    }
}
