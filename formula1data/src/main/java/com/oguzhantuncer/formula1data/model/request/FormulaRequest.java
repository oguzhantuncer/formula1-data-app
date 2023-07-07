package com.oguzhantuncer.formula1data.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormulaRequest {
    private String teamName;
    private String teamChief;
    private String base;
    private String chasis;
    private String powerUnit;
    private Integer year;
}
