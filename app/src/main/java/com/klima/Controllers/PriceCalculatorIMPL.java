package com.klima.Controllers;

import com.klima.Controllers.Interfaces.PriceCalculator;
import com.klima.Models.ConfigParameters;

public class PriceCalculatorIMPL implements PriceCalculator {

    public double calculation(int Metre, boolean ConsolePrice, boolean isWallPlus) {
        double sum= 0;
        sum += ConfigParameters.avarageInstallPrice;
        sum += ConsolePrice ? ConfigParameters.consolePrice : 0;
        sum += isWallPlus ? ConfigParameters.wallPlusPrice : 0;
        sum += (Metre * ConfigParameters.installPerMetre);
        return sum;
    }

    public void sendEmail(String email) {

    }
}
