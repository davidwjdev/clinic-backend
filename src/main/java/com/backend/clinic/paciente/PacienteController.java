package com.backend.clinic.paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")

public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public List<PacienteModel> getAllPacientes() {
        return pacienteService.getAllPacientes();
    }

    @GetMapping("/{nome}")
    public List<PacienteModel> getPacienteByNome(@PathVariable String nome) {
        return pacienteService.getPacienteByNome(nome);
    }

}
