package com.plants.plants.api.service;

import com.plants.plants.api.entity.Plants;

import java.util.List;
import java.util.Optional;

public interface PlantsService {

    public Plants savePlant(Plants plants);

    public List<Plants> fetchAllPlants();

    public Optional<Plants> fetchPlantById(Long id);

    public List<Plants> fetchPlantByName(String plantName);

    public List<Plants> fetchNNumberOfPlants(int numberOfPlants);

    public List<Plants> fetchNNumberOfPlantsInState(String stateName, int numberOfPlants);

    public List<String> fetchStatesName();

    public void deletePlantById(Long id);

}
