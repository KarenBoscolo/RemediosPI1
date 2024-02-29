package com.RemediosPI1.RemediosPI1.services.impl;

import com.RemediosPI1.RemediosPI1.models.PrescricaoModel;
import com.RemediosPI1.RemediosPI1.services.PrescricaoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrescricaoServiceImpl implements PrescricaoService {
    @Override
    public List<PrescricaoModel> getAllPrescricoes() {
        return null;
    }

    @Override
    public Optional<PrescricaoModel> getPrescricaoById(Long id) {
        return Optional.empty();
    }

    @Override
    public PrescricaoModel savePrescricao(PrescricaoModel prescricao) {
        return null;
    }

    @Override
    public void deletePrescricao(Long id) {

    }
}
