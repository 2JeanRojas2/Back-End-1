package com.example.BasesDeDatosNoRelacionalesMB.repository;

import com.example.BasesDeDatosNoRelacionalesMB.model.Torneo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TorneoRepository extends MongoRepository<Torneo, Integer> {
}
