package com.klima.Models;

import java.util.List;

public class Installment {
    List<AirConditioner> installedAirConditioners;
    String address;
    List<AnnualRepair> annualRepairs;
    Person client;

    public Installment(List<AirConditioner> installedAirConditioners, String address, List<AnnualRepair> annualRepairs, Person client) {
        this.installedAirConditioners = installedAirConditioners;
        this.address = address;
        this.annualRepairs = annualRepairs;
        this.client = client;
    }
}
