package com.backend.clinic.especialidade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/especialidades")
public class EspecialidadeController {
        @Autowired
    private EspecialidadeService especialidadeService;

    @GetMapping
    public List<EspecialidadeModel> getAllEspecialidades() {
        return especialidadeService.getAllEspecialidades();
    }

    @GetMapping("/{nome}")
    public List<EspecialidadeModel> getEspecialidadeByNome(@PathVariable String nome) {
        return especialidadeService.getEspecialidadeByNome(nome);
    }

}
