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
public class CrushedRock implements SalesCalcs{

    private String name= "Crushed Rock";
    private double salesPrice = 0;
    private double cost = 0;
    private double weight = 0;
    

    public CrushedRock(double salesPrice, double cost, double weight) {

        this.salesPrice = salesPrice;
        this.cost = cost;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
        
    }

    @Override
    public double calcSaleprice() {
        return this.salesPrice*this.weight;

    }

    @Override
    public double calcCost() {
        return cost*weight;

    }

    @Override
    public double clacProfit() {
        return calcSaleprice()-calcCost();

    }

    
    
    
    
    
    
    
    

}
