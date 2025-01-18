package com.padwan.test.repository;

import com.padwan.test.model.Jedi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface JediRepository extends JpaRepository<Jedi, Long> {

    @Query(value = "SELECT mestre.name AS mestreNome, " +
                   "aprendiz.name AS aprendizNome " +
                   "FROM jedi AS mestre " +
                   "LEFT JOIN jedi AS aprendiz " +
                   "ON mestre.name = aprendiz.mentor " +
                   "WHERE mestre.status = 'mestre jedi'",
           nativeQuery = true)
    List<Object[]> findAllMestresWithApprentices();

    @Query(value = "SELECT * FROM jedi WHERE status = 'jedi' AND midichlorians > 9000", nativeQuery = true)
    List<Jedi> findByMidichloriansGreaterThan9000();
    
    @Query("SELECT j.status, COUNT(j) FROM Jedi j GROUP BY j.status")
    List<Object[]> countJedisByStatus();
}