/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author ShadowX
 */
public class VendingMachine {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Candy>[][] machine = new ArrayList[3][3];
    static HashMap<Integer, Candy> types = new HashMap();
    
    public static void main(String[] args) {
        setup();
        askUser();
    }
    
    private static void setup() {
        types.put(1, new Candy("Triple Bubble", "Gum", 0, 0.50));
        types.put(2, new Candy("Himshey's", "Chocolate", 100, 1.50));
        types.put(3, new Candy("200 Grand", "Chocolate", 110, 1.50));
        types.put(4, new Candy("Chuckles", "Chocolate", 120, 1.50));
        types.put(5, new Candy("Andromeda", "Chocolate", 100, 1.50));
        types.put(6, new Candy("Skittlers", "Sugar", 200, 1.00));
        types.put(7, new Candy("Dit Dogs", "Chocolate Wafer", 80, 1.25));
        types.put(8, new Candy("Tarty Sweets", "Hard Candy", 70, 1.50));
        types.put(9, new Candy("Smiling Cowboys", "Hard Candy", 70, 1.50));
        stockMachine();
    }
    
    private static void stockMachine() {
        for (int k = 0; k < machine.length; k++) {
            for (int i = 0; i < machine[k].length; i++) {
                Random rand = new Random();
                int candies = rand.nextInt(10);
                for (int j = 0; j < candies; j++) {
                    machine[k][i].add(types.get((i + 1) * (k + 1)));
                }
            }
        }
    }
    
    private static void askUser() {
    }
    
    private static void printMachine() {
    }
}
