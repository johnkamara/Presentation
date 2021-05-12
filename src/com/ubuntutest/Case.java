package com.ubuntutest;

import java.awt.*;

public class Case {

    //class variables

    private String model;
    private String manufacturer;
    private String powerSupply;
    private String motherBoard;
    private Dimension dimension;


    public Case(String model, String manufacturer, String powerSupply, String motherBoard, Dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.motherBoard = motherBoard;
        this.dimension = dimension;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public Dimension getDimension() {
        return dimension;
    }

    //press power button on case
  public void   pressPowerButton(){
        System.out.println("the power button is pressed ");
    }

}
