package com.ubuntutest;

public class MotherBoard {

    //class variables

    private String model;
    private String manufacturer;
    private String ramSlots;
    private String cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer, String ramSlots, String cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgramme(String programmeName){
        System.out.println("the programmes " + programmeName + ", is running " );

    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getRamSlots() {
        return ramSlots;
    }

    public String getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setRamSlots(String ramSlots) {
        this.ramSlots = ramSlots;
    }

    public void setCardSlots(String cardSlots) {
        this.cardSlots = cardSlots;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}
