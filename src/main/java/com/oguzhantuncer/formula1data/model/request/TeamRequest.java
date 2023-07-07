package com.oguzhantuncer.formula1data.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamRequest {
    private String name;
    private String chief;
    private String base;
    private String chassis;
    private String powerUnit;
    private Integer year;
}
