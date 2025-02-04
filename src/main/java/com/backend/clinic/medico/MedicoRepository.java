package com.backend.clinic.medico;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MedicoRepository extends MongoRepository<MedicoModel, String> {
    @Query("{ 'nome': { $regex: ?0, $options: 'i' } }")
    List<MedicoModel> findByNome(String nome);
}
