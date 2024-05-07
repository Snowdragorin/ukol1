package com.engeto.bioCarrot;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListOfCustomers {

    //define of variables

    String nameOfTrade = getNameOfTrader("Jan", "Novotny");
    LocalDate dateOfBirth = getDateOfBirth(LocalDate.of(1989, 10, 8));
    String nameOfTown = getNameOfTown("Praha");
    String registrationPlate = getRegistrationPlate("5U5521");
    double fuelPer100Km = getFuelPer100Km(6.5);
    String iPV4 = getIpV4Address("192.168.10.10");

    //calculates average count of Carrots per Contract
    public static void prumernyProdejMrkve() {
        int soldCarrot = getAmountOfSoldCarrot(2000);
        int amountOfContracts = getAmountOfContracts(30);
        double averageCountCarrotPerContract = soldCarrot / amountOfContracts;
        System.out.println("Průměrný počet prodané mrkve na jednu smlouvu je: " + averageCountCarrotPerContract);
    }

    //returns Name and surname of Trader
    public static String getNameOfTrader(String name, String surname) {
        return "Jméno: " + name + " příjmení:" + surname;
    }

    //returns date of birth of Trader
    public static LocalDate getDateOfBirth(LocalDate date) {
        return date;
    }

    //returns amount of Contracts
    public static int getAmountOfContracts(int numberOfContracts) {
        return numberOfContracts;
    }

    //returns amount of sold Carrots
    public static int getAmountOfSoldCarrot(int soldCarrot) {
        return soldCarrot;
    }

    //returns name of the trader's Town
    public static String getNameOfTown(String townName) {
        return townName;
    }

    //returns registration plate
    public static String getRegistrationPlate(String registrationPlate) {
        return registrationPlate;
    }

    //returns fuel per 100km
    public static double getFuelPer100Km(double fuelPer100Km) {
        return fuelPer100Km;
    }

    //returns and validate IP V4 address
    public static String getIpV4Address(String IpAddress) {
        String regex = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(IpAddress);
        matcher.matches();
        return IpAddress;
    }

}
