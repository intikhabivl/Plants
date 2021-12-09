package com.plants.plants.api.service;

import com.plants.plants.api.entity.Plants;
import com.plants.plants.api.repository.PlantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlantsServiceImp implements PlantsService{

    @Autowired
    private PlantsRepository plantsRepository;

    @Override
    public Plants savePlant(Plants plants) {
        return plantsRepository.save(plants);
    }

    @Override
    public List<Plants> fetchAllPlants() {
        return plantsRepository.findAll();
    }

    @Override
    public Optional<Plants> fetchPlantById(Long id) {
        return plantsRepository.findById(id);
    }

    @Override
    public List<Plants> fetchPlantByName(String plantName) {
        return plantsRepository.findByPlantName(plantName);
    }

    @Override
    public List<Plants> fetchNNumberOfPlants(int numberOfPlants) {
        Pageable pageable= PageRequest.ofSize(numberOfPlants);
        Page<Plants> pageResult=plantsRepository.findAll(pageable);
        return pageResult.toList();
    }

    @Override
    public List<Plants> fetchNNumberOfPlantsInState(String stateName, int numberOfPlants) {
        Pageable pageable= PageRequest.ofSize(numberOfPlants);
        return plantsRepository.findByStateNameIgnoreCase(stateName, pageable);
    }

    @Override
    public List<String> fetchStatesName() {
        return plantsRepository.fetchStatesNames();
    }

    @Override
    public void deletePlantById(Long id) {
        plantsRepository.deleteById(id);
    }

}
