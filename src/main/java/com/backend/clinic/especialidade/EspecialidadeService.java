package com.backend.clinic.especialidade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EspecialidadeService {
        @Autowired
    private EspecialidadeRepository especialidadeRepository;

    public List<EspecialidadeModel> getAllEspecialidades() {
        return especialidadeRepository.findAll();
    }

    public List<EspecialidadeModel> getEspecialidadeByNome(String nome) {
        return especialidadeRepository.findByNome(nome);
    }
}
