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
public class Widget implements SalesCalcs{
    
    private String name = "widget";
    private double salesPrice = 0;
    private double cost = 0;
    private double quantity = 0;

    public Widget(double salesPrice, double cost, double quantity) {

        this.salesPrice = salesPrice;
        this.cost = cost;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return name;

    }

    @Override
    public double calcSaleprice() {
        return this.salesPrice*this.quantity;

    }

    @Override
    public double calcCost() {
        return cost*quantity;

    }

    @Override
    public double clacProfit() {
        return calcSaleprice()-calcCost();

    }
    
    
}
