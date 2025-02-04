package com.backend.clinic.medico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicoService {
    @Autowired
    private MedicoRepository medicoRepository;

    public List<MedicoModel> getAllMedicos() {
        return medicoRepository.findAll();
    }

    public List<MedicoModel> getMedicoByNome(String nome) {
        return medicoRepository.findByNome(nome);
    }
}
