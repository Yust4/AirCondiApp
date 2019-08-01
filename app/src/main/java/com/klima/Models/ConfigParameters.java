package com.klima.Models;

public class ConfigParameters {

    public static int avarageInstallPrice;
    public static int installPerMetre;
    public static int consolePrice;
    public static int wallPlusPrice;

    static void setConfig(int avgInstallPrice, int installPerMetre,int consolePrice, int wallPlusPrice){
        ConfigParameters.avarageInstallPrice = avgInstallPrice;
        ConfigParameters.installPerMetre = installPerMetre;
        ConfigParameters.consolePrice = consolePrice;
        ConfigParameters.wallPlusPrice = wallPlusPrice;
    }


}
