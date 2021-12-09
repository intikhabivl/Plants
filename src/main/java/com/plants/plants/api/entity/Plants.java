package com.plants.plants.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Plants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stateName;
    private String plantName;
    private String Owner_name;
    private String Coutry_name;
    private Double LAT;
    private Double LON;
    private Long net_caol_generation;
    private Long net_oil_generation;
    private Long net_gas_generation;
    private Long net_nuclear_generation;
    private Long net_hydro_generation;
    private Long new_biomass_generation;
    private Long net_wind_generation;
    private Long net_solar_generation;
    private Long net_geothermal_generation;
    private Long net_fossil_generation;
    private Long net_unknownfuel_generation;
    private Long net_nonrenewables_generation;
    private Long net_renewables_generation;
    private Long net_nonhydrorenewables_generations;
    private Long net_combustion_generation;
    private Long net_noncombusition_generation;
    private Long coal_generation_percentage;
    private Long oil_generation_percentage;
    private Long gas_generation_percentage;
    private Long nuclear_generation_percentage;
    private Long hydro_generation_percentage;
    private Long biomass_generation_percentage;
    private Long wind_generation_percentage;
    private Long solar_generation_percentage;
    private Long geothermal_generation_percentage;
    private Long fossile_generation_percentage;
    private Long unknowfuel_genertion_percentage;
    private Long nonrenewable_generation_percentage;
    private Long renewable_generation_percentage;
    private Long nonhydrorenewable_generation_percentage;
    private Long combustion_generation_percentage;
    private Long noncombustion_generation_percentage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
