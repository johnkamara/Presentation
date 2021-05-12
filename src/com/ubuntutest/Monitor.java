package com.ubuntutest;

public class Monitor {

    private String model;
    private String manufacture;
    private int size;
    private String nativeResolution;


    public Monitor(String model, String manufacture, int size, String nativeResolution) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }
// draw pixel colors
    public void drawPixelAt(double x, double y, String color){
        System.out.println("the pixels are: "+  x + " by " + y + " in color" + color);

    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSize() {
        return size;
    }

    public String getNativeResolution() {
        return nativeResolution;
    }

}
