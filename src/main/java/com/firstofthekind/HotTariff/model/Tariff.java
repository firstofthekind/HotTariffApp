package com.firstofthekind.HotTariff.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@RequiredArgsConstructor
public class Tariff implements Serializable {
    private long id;
    private String title;
    private double price;
    private double connectionCost;
    @JsonProperty("supplementDtoSet")
    private Set<Supplement> supplementDtoSet;
    private boolean isDeleted;
    private long count;
}
