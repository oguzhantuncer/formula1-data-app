package com.oguzhantuncer.formula1data.service;


import com.oguzhantuncer.formula1data.exception.BusinessException;
import com.oguzhantuncer.formula1data.exception.DomainNotFoundException;
import com.oguzhantuncer.formula1data.model.entity.Team;
import com.oguzhantuncer.formula1data.model.request.TeamRequest;
import com.oguzhantuncer.formula1data.repository.TeamRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Team save(TeamRequest teamRequest) {
        log.info("TeamService.save() triggered for this request: {}", teamRequest);
        Optional<Team> formula1DataRepository1 = teamRepository.findByName(teamRequest.getName());
        if (formula1DataRepository1.isPresent()) {
            log.error("Kayit edilmek istenen veri zaten mevcuttur");
            throw new BusinessException("team.is.already.exists");
        }
        Team team = Team.toEntity(teamRequest);
        log.info("TeamService.save() is completed. Persisted team is {}", team);
        return teamRepository.save(team);
    }

    public Team update(Long id, TeamRequest teamRequest) {
        log.info("TeamService.update() triggered for this id: {} and request: {}", id, teamRequest);
        Optional<Team> byId = teamRepository.findById(id);
        if (byId.isEmpty()) {
            log.error("Takim veri tabanında bulunamdi");
            throw new DomainNotFoundException("team.is.not.found");
        }
        Team team = byId.get();
        team.setName(teamRequest.getName());
        team.setChief(teamRequest.getChief());
        team.setBase(teamRequest.getBase());
        team.setChassis(teamRequest.getChassis());
        team.setPowerUnit(teamRequest.getPowerUnit());
        team.setYear(teamRequest.getYear());
        log.info("TeamSevice.update() is completed. Updated team is {}", teamRequest);
        return teamRepository.save(team);
    }

    public List<Team> findAll() {
        log.info("TeamService.findAll() triggered");
        return teamRepository.findAll();
    }

    public Optional<Team> findByTeamName(String teamName) {
        log.info("TeamService.findByTeamName() triggered for this name: {}", teamName);
        return teamRepository.findByName(teamName);
    }

    @Transactional
    public void delete(Long id) {
        log.info("TeamService.delete() triggered");
        teamRepository.deleteById(id);
    }
}
