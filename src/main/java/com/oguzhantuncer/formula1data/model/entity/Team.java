package com.oguzhantuncer.formula1data.model.entity;

import com.oguzhantuncer.formula1data.model.request.TeamRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "chief")
    private String chief;

    @Column(name = "base")
    private String base;

    @Column(name = "chassis")
    private String chassis;

    @Column(name = "power_unit")
    private String powerUnit;

    @Column(name = "year")
    private Integer year;


    public static Team toEntity(TeamRequest teamRequest) {
        Team team = new Team();
        team.setName(teamRequest.getName());
        team.setChief(teamRequest.getChief());
        team.setBase(teamRequest.getBase());
        team.setChassis(teamRequest.getChassis());
        team.setPowerUnit(teamRequest.getPowerUnit());
        team.setYear(teamRequest.getYear());
        return team;
    }
}
