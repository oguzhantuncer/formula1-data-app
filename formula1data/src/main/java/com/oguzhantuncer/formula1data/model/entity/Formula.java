package com.oguzhantuncer.formula1data.model.entity;

import com.oguzhantuncer.formula1data.model.request.FormulaRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Teams")
public class Formula {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "teamName")
    private String teamName;

    @Column(name = "teamChief")
    private String teamChief;

    @Column(name = "base")
    private String base;

    @Column(name = "chasis")
    private String chasis;

    @Column(name = "powerUnit")
    private String powerUnit;

    @Column(name = "year")
    private Integer year;


    public static Formula toEntity(FormulaRequest formulaRequest) {
        Formula formula = new Formula();
        formula.setTeamName(formulaRequest.getTeamName());
        formula.setTeamChief(formulaRequest.getTeamChief());
        formula.setBase(formulaRequest.getBase());
        formula.setChasis(formulaRequest.getChasis());
        formula.setPowerUnit(formulaRequest.getPowerUnit());
        formula.setYear(formulaRequest.getYear());
        return formula;
    }
}
