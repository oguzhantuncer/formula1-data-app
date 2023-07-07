package com.oguzhantuncer.formula1data.controller;

import com.oguzhantuncer.formula1data.model.entity.Formula;
import com.oguzhantuncer.formula1data.model.request.FormulaRequest;
import com.oguzhantuncer.formula1data.service.FormulaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/formula1data")
@RestController
public class FormulaController {

    private final FormulaService formulaService;

    public FormulaController(FormulaService formulaService){
        this.formulaService = formulaService;
    }

    @PostMapping
    public Formula save(@RequestBody FormulaRequest formulaRequest){
        return formulaService.save(formulaRequest);
    }

}
