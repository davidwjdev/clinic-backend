package com.backend.clinic.paciente;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "pacientes")
public class PacienteModel {
    @Id
    private String _id;
    private String nome;
    private String idade;
    
}
