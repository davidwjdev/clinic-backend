package com.backend.clinic.medico;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "medicos")
public class MedicoModel {
    @Id
    private String _id;
    private String nome;
    private String especialidadeId;
}
