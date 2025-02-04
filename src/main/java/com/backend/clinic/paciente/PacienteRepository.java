package com.backend.clinic.paciente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PacienteRepository extends MongoRepository<PacienteModel, String> {
    @Query("{ 'nome': { $regex: ?0, $options: 'i' } }")
    List<PacienteModel> findByNome(String nome);
}

