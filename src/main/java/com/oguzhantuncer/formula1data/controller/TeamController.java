package com.oguzhantuncer.formula1data.controller;

import com.oguzhantuncer.formula1data.model.entity.Team;
import com.oguzhantuncer.formula1data.model.request.TeamRequest;
import com.oguzhantuncer.formula1data.service.TeamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/team")
@RestController
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService){
        this.teamService = teamService;
    }

    @PostMapping
    public Team save(@RequestBody TeamRequest teamRequest){
        return teamService.save(teamRequest);
    }

    @PutMapping ("/{id}")
    public Team update(@PathVariable Long id, @RequestBody TeamRequest teamRequest){
        return teamService.update(id, teamRequest);
    }

    @GetMapping
    public List<Team> getAll(){
        return teamService.findAll();
    }

    @GetMapping("/{name}")
    public Optional<Team> getTeamName(@PathVariable String name){
        return teamService.findByTeamName(name);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        teamService.delete(id);
    }
}
