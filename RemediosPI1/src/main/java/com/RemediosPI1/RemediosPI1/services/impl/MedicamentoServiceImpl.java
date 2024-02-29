package com.RemediosPI1.RemediosPI1.services.impl;

import com.RemediosPI1.RemediosPI1.models.MedicamentoModel;
import com.RemediosPI1.RemediosPI1.services.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {
    @Override
    public List<MedicamentoModel> getAllMedicamentos() {
        return null;
    }

    @Override
    public Optional<MedicamentoModel> getMedicamentoById(Long id) {
        return Optional.empty();
    }

    @Override
    public MedicamentoModel saveMedicamento(MedicamentoModel medicamento) {
        return null;
    }

    @Override
    public void deleteMedicamento(Long id) {

    }
}

