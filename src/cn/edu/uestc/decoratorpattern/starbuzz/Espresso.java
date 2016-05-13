/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.uestc.decoratorpattern.starbuzz;

/**
 *
 * @author Liranan
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double coat() {
        return 1.99;
    }
}
