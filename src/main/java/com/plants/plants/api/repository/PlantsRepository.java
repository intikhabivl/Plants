package com.plants.plants.api.repository;

import com.plants.plants.api.entity.Plants;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlantsRepository extends JpaRepository<Plants, Long> {

    public List<Plants> findByStateNameIgnoreCase(String stateName, Pageable pageable);

    @Query("select distinct stateName from Plants")
    public List<String> fetchStatesNames();

    public List<Plants> findByPlantName(String plantName);
}
