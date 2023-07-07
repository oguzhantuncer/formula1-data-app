package com.oguzhantuncer.formula1data.service;


import com.oguzhantuncer.formula1data.model.entity.Formula;
import com.oguzhantuncer.formula1data.model.request.FormulaRequest;
import com.oguzhantuncer.formula1data.repository.FormulaRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Log4j2
@Service
public class FormulaService {

    private final FormulaRepository formulaRepository;

    public FormulaService(FormulaRepository formulaRepository) {
        this.formulaRepository = formulaRepository;
    }

    public Formula save(FormulaRequest formulaRequest) {
        Optional<Formula> formula1DataRepository1 = formulaRepository.findByTeamName(formulaRequest.getTeamName());
        Formula formula = Formula.toEntity(formulaRequest);
        return formulaRepository.save(formula);
    }
}
