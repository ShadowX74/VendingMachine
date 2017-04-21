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

    public static void main(String[] args) {
        stockMachine();
        askUser();
    }

    private static void stockMachine() {
        for (int k = 0; k < machine.length; k++) {
            for (int i = 0; i < machine[0].length; i++) {
                Random rand = new Random();
                int candies = rand.nextInt(10) + 1;
                machine[k][i] = new ArrayList<Candy>();
                for (int j = 0; j < candies; j++) {
                    Candy c = null;
                    if (k == 0) {
                        if (i == 0) {
                            c = new Candy("Triple Bubble", "Gum", 0, 0.50);
                        } else if (i == 1) {
                            c = new Candy("Himshey's", "Chocolate", 100, 1.50);
                        } else {
                            c = new Candy("200 Grand", "Chocolate", 110, 1.50);
                        }
                    } else if (k == 1) {
                        if (i == 0) {
                            c = new Candy("Chuckles", "Chocolate", 120, 1.50);
                        } else if (i == 1) {
                            c = new Candy("Andromeda", "Chocolate", 100, 1.50);
                        } else {
                            c = new Candy("Gummy Bears", "Gummies", 200, 1.00);
                        }
                    } else if (k == 2) {
                        if (i == 0) {
                            c = new Candy("Dit Dogs", "Chocolate Wafer", 80, 1.25);
                        } else if (i == 1) {
                            c = new Candy("Tarty Sweets", "Hard Candy", 70, 1.50);
                        } else {
                            c = new Candy("Smiling Cowboys", "Hard Candy", 70, 1.50);
                        }
                    }
                    machine[k][i].add(c);
                }
            }
        }
    }

    private static void askUser() {
        printMachine();
        System.out.println("What would you like to buy?");
    }

    private static void printMachine() {
        System.out.println("   123");
        System.out.println("   __________________________");
        System.out.println("1 |" + machine[0][0].get(0).name + "|" + machine[0][1].get(0).name + "   |" + machine[0][2].get(0).name + "\t|");
        System.out.println("  |_____________|____________|_____________|");
        System.out.println("2 |" + machine[1][0].get(0).name + "\t|" + machine[1][1].get(0).name + "   |" + machine[1][2].get(0).name + "\t|");
        System.out.println("  |_____________|____________|______|");
        System.out.println("3 |" + machine[2][0].get(0).name + "\t|" + machine[2][1].get(0).name + "|" + machine[2][2].get(0).name + "\t|");
        System.out.println("  |_____________|____________|______|");
    }
}
