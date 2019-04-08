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
public class ProyectoAlmacen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CrushedRock rock1 = new CrushedRock(12, 10, 50);
        CrushedRock rock2 = new CrushedRock(10, 12, 50);
        System.out.println("Sales Price: " + rock1.calcSaleprice());
        System.out.println("Sales Price: " + rock2.calcSaleprice());
        
        SalesCalcs[] itemList = new SalesCalcs[5];
        ItemReport report = new ItemReport();
        
        itemList[0] = new CrushedRock(12, 10, 50);
        itemList[1] = new CrushedRock(8, 6, 10);
        itemList[2] = new RedPaint(10, 8, 25);
        itemList[3] = new Widget(6.0, 5.0, 10.0);
        itemList[4] = new Widget(14.0, 12.0, 20.0);
        
        System.out.println("===Sales Report===");
        
        for (SalesCalcs item : itemList) {
            item.printItemReport();
        }
        
        SalesCalcs.printItemArray(itemList);
    }
    
}
