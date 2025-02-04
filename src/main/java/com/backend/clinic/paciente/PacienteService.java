package com.backend.clinic.paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    public List<PacienteModel> getAllPacientes() {
        return pacienteRepository.findAll();
    }

    public List<PacienteModel> getPacienteByNome(String nome) {
        return pacienteRepository.findByNome(nome);
    }
}
