package com.oguzhantuncer.formula1data.repository;

import com.oguzhantuncer.formula1data.model.entity.Formula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FormulaRepository extends JpaRepository<Formula,Long> {
    Optional<Formula> findByTeamName(String teamName);
}
