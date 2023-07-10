package com.oguzhantuncer.formula1data.service;


import com.oguzhantuncer.formula1data.model.entity.Team;
import com.oguzhantuncer.formula1data.model.request.TeamRequest;
import com.oguzhantuncer.formula1data.repository.TeamRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Team save(TeamRequest teamRequest) {
        Optional<Team> formula1DataRepository1 = teamRepository.findByName(teamRequest.getName());
        Team team = Team.toEntity(teamRequest);
        return teamRepository.save(team);
    }

    public Team update(Long id, TeamRequest teamRequest) {
        Optional<Team> byId = teamRepository.findById(id);
        Team team = byId.get();
        team.setName(teamRequest.getName());
        team.setChief(teamRequest.getChief());
        team.setBase(teamRequest.getBase());
        team.setChassis(teamRequest.getChassis());
        team.setPowerUnit(teamRequest.getPowerUnit());
        team.setYear(teamRequest.getYear());
        return teamRepository.save(team);
    }

    public List<Team> findAll() {
        return teamRepository.findAll();
    }

    public Optional<Team> findByTeamName(String teamName) {
        return teamRepository.findByName(teamName);
    }

    public void delete(Long id) {
        teamRepository.deleteById(id);
    }
}
