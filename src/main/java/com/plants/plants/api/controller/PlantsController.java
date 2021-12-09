package com.plants.plants.api.controller;

import com.plants.plants.api.entity.Plants;
import com.plants.plants.api.service.PlantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/plants", produces = MediaType.APPLICATION_JSON_VALUE)
@EnableWebSecurity
public class PlantsController {

    @Autowired
    private PlantsService plantsService;

    @PostMapping("")
    public Plants savePlant(@Valid @RequestBody Plants plants) {
        return plantsService.savePlant(plants);
    }

    @GetMapping("")
    public List<Plants> fetchAllPlants() {
        return plantsService.fetchAllPlants();
    }

    @GetMapping("/{id}")
    public Optional<Plants> fetchPlantById(@PathVariable Long id) {
        return plantsService.fetchPlantById(id);
    }

    @GetMapping("/name/")
    public List<Plants> fetchPlantByName(@RequestParam("name") String plantName) {
        return plantsService.fetchPlantByName(plantName);
    }


    @GetMapping("/")
    public List<Plants> fetchNNumberOfPlants(@RequestParam("n") int numberOfPlants) {
        return plantsService.fetchNNumberOfPlants(numberOfPlants);
    }

    @GetMapping("/{stateName}/")
    public List<Plants> fetchNNumberOfPlantsInState(@PathVariable String stateName, @RequestParam("n") int numberOfPlants) {
        return plantsService.fetchNNumberOfPlantsInState(stateName, numberOfPlants);
    }

    @GetMapping("/states")
    public List<String> fetchStatesName() {
        return plantsService.fetchStatesName();
    }

    @DeleteMapping("/{id}")
    public String deletePlantById(@PathVariable Long id) {
        plantsService.deletePlantById(id);
        return "Plant Deleted Successfully";
    }

}
