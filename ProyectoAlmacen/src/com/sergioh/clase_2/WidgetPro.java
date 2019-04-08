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
public class WidgetPro extends Widget implements WidgetSalesCalcs{

    
    private String type;
    
    
    public WidgetPro(double salesPrice, double cost, double quantity) {
        super(salesPrice, cost, quantity);
    }

    @Override
    public String getWidgetType() {
        return type;

    }
    
}
