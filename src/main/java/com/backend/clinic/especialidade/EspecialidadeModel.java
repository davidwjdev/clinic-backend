package com.backend.clinic.especialidade;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "especialidades")
public class EspecialidadeModel {
    @Id
    private String _id;
    private String nome;    
}
