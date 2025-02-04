package com.backend.clinic.consulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @GetMapping
    public List<ConsultaModel> getAllConsultas() {
        return consultaService.getAllConsultas();
    }

    @GetMapping("/{nome}")
    public List<ConsultaModel> getConsultasByMedicoNome(@PathVariable String nome) {
        return consultaService.getConsultasByMedicoNome(nome);
    }

}
