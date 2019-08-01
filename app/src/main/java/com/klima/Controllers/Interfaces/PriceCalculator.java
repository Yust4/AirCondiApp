package com.klima.Controllers.Interfaces;

public interface PriceCalculator {

    double calculation(int Metre, boolean ConsolePrice, boolean isWallPlus);
    void sendEmail(String email);

}
