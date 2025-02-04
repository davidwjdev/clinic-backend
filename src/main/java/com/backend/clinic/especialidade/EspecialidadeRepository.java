package com.backend.clinic.especialidade;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;

public interface EspecialidadeRepository extends MongoRepository<EspecialidadeModel, String> {
    @Query("{ 'nome': { $regex: ?0, $options: 'i' } }")
    List<EspecialidadeModel> findByNome(String nome);
}
