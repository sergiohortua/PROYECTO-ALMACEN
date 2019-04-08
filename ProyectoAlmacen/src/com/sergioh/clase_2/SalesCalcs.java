/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergioh.clase_2;

/**
 *
 * @author PC-48
 */
public interface SalesCalcs {

    public static final String reportTitle = "\n==Static List Report==";

    public String getName();

    public double calcSaleprice();//calculo de precios

    public double calcCost();//calculo de costo

    public double clacProfit();//calculo de ganancia

    public static void printItemArray(SalesCalcs[] items) {
        System.out.println(reportTitle);
        for (SalesCalcs item : items) {
            System.out.println("--" + item.getName() + " Report--");
            System.out.println("Sales Price: " + item.calcSaleprice());
            System.out.println("Cost: " + item.calcCost());
            System.out.println("Profit: " + item.clacProfit());
        }
    }

    public default void printItemReport() {
        System.out.println("--" + this.getName() + " Report--");
        System.out.println("Sales Price: " + this.calcSaleprice());
        System.out.println("Cost: " + this.calcCost());
        System.out.println("Profit: " + this.clacProfit());
    }

}
