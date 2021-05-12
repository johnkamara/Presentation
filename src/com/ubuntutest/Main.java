package com.ubuntutest;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// create new objects
        Dimension dimension = new Dimension(24, 25);
        Case case1 = new Case("D260", "DELL", "IPTECH", "LLP21", new Dimension(20,20));
        MotherBoard motherBoard = new MotherBoard("D260", "LLPTECH221", "4 * 4", "D4.23", "V.24");
        Monitor monitor = new Monitor("FF10", "SAMSUN", 245, "2024");
        Resolution resolution = new Resolution(20, 20);

        PC pc = new PC(case1, motherBoard, monitor);
        pc.powerOn();
//        pc.drawLogo();
////        pc.getMonitor();
////        pc.getMotherBoard();
////        pc.getTheCase();



    }
//    public void sumOfNumbers(int r, int p){
//        int iobj = 23;
//        int   i = iobj;
//        double sum = r + p;
//        System.out.println(iobj);
//    }
}
