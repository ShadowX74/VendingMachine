/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

/**
 *
 * @author ShadowX
 */
public class Candy {
    String name, type;
    double price, calPerServ;

    public Candy(String n, String t, double cal, double p) {
        name = n;
        type = t;
        calPerServ = cal;
        price = p;
    }
    
    @Override
    public String toString() {
        return name + "\nType: " + type + "\nCalories per Serving: " + calPerServ + "\n Price: " + price;
    }
}
