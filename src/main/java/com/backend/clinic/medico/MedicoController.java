package com.backend.clinic.medico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {
    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public List<MedicoModel> getAllMedicos() {
        return medicoService.getAllMedicos();
    }

    @GetMapping("/{nome}")
    public List<MedicoModel> getMedicoByNome(@PathVariable String nome) {
        return medicoService.getMedicoByNome(nome);
    }

}
