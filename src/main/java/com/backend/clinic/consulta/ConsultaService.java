package com.backend.clinic.consulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {
    @Autowired
    private ConsultaRepository consultaRepository;

    public List<ConsultaModel> getAllConsultas() {
        return consultaRepository.findAllConsultas();
    }

    public List<ConsultaModel> getConsultasByMedicoNome(String nome) {
        return consultaRepository.findByMedicoNome(nome);
    }

}
