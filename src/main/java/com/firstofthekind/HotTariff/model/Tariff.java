package com.firstofthekind.HotTariff.model;


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
    private Set<Supplement> supplementSet;
    private boolean isDeleted;
    private long count;
}
