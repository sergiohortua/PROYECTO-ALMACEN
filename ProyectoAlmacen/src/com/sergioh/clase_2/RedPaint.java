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
public class RedPaint implements SalesCalcs{

    private String name = "red paint";
    private double salesPrice = 0;
    private double cost = 0;
    private double gallons = 0;

    public RedPaint(double salesPrice, double cost, double gallons) {

        this.salesPrice = salesPrice;
        this.cost = cost;
        this.gallons = gallons;
    }

    @Override
    public String getName() {
        return name;

    }

    @Override
    public double calcSaleprice() {
        return this.salesPrice*this.gallons;

    }

    @Override
    public double calcCost() {
        return cost*gallons;

    }

    @Override
    public double clacProfit() {
        return calcSaleprice()-calcCost();

    }

}
