package com.backend.clinic.consulta;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ConsultaRepository extends MongoRepository<ConsultaModel, String> {

    @Aggregation(pipeline = {
            "{ $lookup: { from: 'medicos', localField: 'medicoId', foreignField: '_id', as: 'medico' } }",
            "{ $unwind: '$medico' }",
            "{ $lookup: { from: 'pacientes', localField: 'pacienteId', foreignField: '_id', as: 'paciente' } }",
            "{ $unwind: '$paciente' }",
            "{ $lookup: { from: 'especialidades', localField: 'medico.especialidadeId', foreignField: '_id', as: 'especialidade' } }",
            "{ $unwind: '$especialidade' }",
            "{ $project: { " +
                    "_id: 1, " +
                    "data: 1, " +
                    "hora: 1, " +
                    "status: 1, " +
                    "especialidadeId: '$medico.especialidadeId', " +
                    "especialidadeNome: '$especialidade.nome', " +
                    "medicoId: 1, " +
                    "medicoNome: '$medico.nome', " +
                    "pacienteId: 1, " +
                    "pacienteNome: '$paciente.nome' " +
                    "} }"
    })
    List<ConsultaModel> findAllConsultas();

    @Aggregation(pipeline = {
            "{ $lookup: { from: 'medicos', localField: 'medicoId', foreignField: '_id', as: 'medico' } }",
            "{ $unwind: '$medico' }",
            "{ $lookup: { from: 'pacientes', localField: 'pacienteId', foreignField: '_id', as: 'paciente' } }",
            "{ $unwind: '$paciente' }",
            "{ $lookup: { from: 'especialidades', localField: 'medico.especialidadeId', foreignField: '_id', as: 'especialidade' } }",
            "{ $unwind: '$especialidade' }",
            "{ $match: { 'medico.nome': { $regex: ?0, $options: 'i' } } }",
            "{ $project: { " +
                    "_id: 1, " +
                    "data: 1, " +
                    "hora: 1, " +
                    "status: 1, " +
                    "especialidadeId: '$medico.especialidadeId', " +
                    "especialidadeNome: '$especialidade.nome', " +
                    "medicoId: 1, " +
                    "medicoNome: '$medico.nome', " +
                    "pacienteId: 1, " +
                    "pacienteNome: '$paciente.nome' " +
                    "} }"
    })
    List<ConsultaModel> findByMedicoNome(String nome);

}
