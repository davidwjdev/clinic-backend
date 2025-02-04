package com.backend.clinic.consulta;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "consultas")
public class ConsultaModel {
    @Id
    private String _id;
    private String data;
    private String hora;
    private String status;
    private String especialidadeId;
    private String especialidadeNome;
    private String medicoId;
    private String medicoNome;
    private String pacienteId;
    private String pacienteNome;
}
