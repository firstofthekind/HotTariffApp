package com.firstofthekind.HotTariff.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class Supplement implements Serializable {
    private long id;
    private String title;
    private double price;
    private double connectionCost;
}
