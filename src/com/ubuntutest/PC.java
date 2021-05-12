package com.ubuntutest;

import java.awt.*;

public class PC {

    private Case TheCase;
    private MotherBoard MotherBoard;
    private Monitor Monitor;

    public PC(Case theCase, com.ubuntutest.MotherBoard motherBoard, com.ubuntutest.Monitor monitor) {
        TheCase = theCase;
        MotherBoard = motherBoard;
        Monitor = monitor;
    }

    public Case getTheCase() {
        return TheCase;
    }

    public com.ubuntutest.MotherBoard getMotherBoard() {
        return MotherBoard;
    }

    public com.ubuntutest.Monitor getMonitor() {
        return Monitor;
    }

    //power PC on
    public void powerOn(){
TheCase.pressPowerButton();
drawLogo();
    }
    //graphic designing
    public void drawLogo(){
        Monitor.drawPixelAt(12, 23,"blue");

    }
}
