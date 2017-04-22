/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ShadowX
 */
public class VendingMachine {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Candy>[][] machine = new ArrayList[3][3];
    static Scanner scan;

    public static void main(String[] args) {
        stockMachine();
        askUser();
    }

    private static void stockMachine() {
        for (int k = 0; k < machine.length; k++) {
            for (int i = 0; i < machine[0].length; i++) {
                Random rand = new Random();
                int candies = rand.nextInt(9) + 1;
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
        boolean play = true;
        while (play) {
            printMachine();
            System.out.println("What would you like to buy?");
            System.out.println("Insert letter, then the number.");

            scan = new Scanner(System.in);
            String action = scan.nextLine().toLowerCase();
            
            System.out.println("\n\n\n");
            if (action.length() >= 2) {
                String letter = action.substring(0, 1);
                String number = action.substring(1, 2);
                if (action.equals("quit")) {
                    play = false;
                } else if (letter.equals("a")) {
                    if (number.equals("1")) {
                        if (machine[0][0].isEmpty()) {
                            System.out.println("This candy has run out, please make another selection.");
                        } else {
                            System.out.println(machine[0][0].get(0).toString());
                            machine[0][0].remove(0);
                        }
                    } else if (number.equals("2")) {
                        if (machine[0][1].isEmpty()) {
                            System.out.println("This candy has run out, please make another selection.");
                        } else {
                            System.out.println(machine[0][1].get(0).toString());
                            machine[0][1].remove(0);
                        }
                    } else if (number.equals("3")) {
                        if (machine[0][2].isEmpty()) {
                            System.out.println("This candy has run out, please make another selection.");
                        } else {
                            System.out.println(machine[0][2].get(0).toString());
                            machine[0][2].remove(0);
                        }
                    }
                } else if (letter.equals("b")) {
                    if (number.equals("1")) {
                        if (machine[1][0].isEmpty()) {
                            System.out.println("This candy has run out, please make another selection.");
                        } else {
                            System.out.println(machine[1][0].get(0).toString());
                            machine[1][0].remove(0);
                        }
                    } else if (number.equals("2")) {
                        if (machine[1][1].isEmpty()) {
                            System.out.println("This candy has run out, please make another selection.");
                        } else {
                            System.out.println(machine[1][1].get(0).toString());
                            machine[1][1].remove(0);
                        }
                    } else if (number.equals("3")) {
                        if (machine[1][2].isEmpty()) {
                            System.out.println("This candy has run out, please make another selection.");
                        } else {
                            System.out.println(machine[1][2].get(0).toString());
                            machine[1][2].remove(0);
                        }
                    }
                } else if (letter.equals("c")) {
                    if (number.equals("1")) {
                        if (machine[2][0].isEmpty()) {
                            System.out.println("This candy has run out, please make another selection.");
                        } else {
                            System.out.println(machine[2][0].get(0).toString());
                            machine[2][0].remove(0);
                        }
                    } else if (number.equals("2")) {
                        if (machine[2][1].isEmpty()) {
                            System.out.println("This candy has run out, please make another selection.");
                        } else {
                            System.out.println(machine[2][1].get(0).toString());
                            machine[2][1].remove(0);
                        }
                    } else if (number.equals("3")) {
                        if (machine[2][2].isEmpty()) {
                            System.out.println("This candy has run out, please make another selection.");
                        } else {
                            System.out.println(machine[2][2].get(0).toString());
                            machine[2][2].remove(0);
                        }
                    }
                } else {
                    System.out.println("Invalid.");
                }
            } else {
                System.out.println("Invalid.");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(VendingMachine.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("\n\n\n");
        }
    }

    private static void printMachine() {
        System.out.println("         1              2             3");
        System.out.println("   ____________________________________________");
        System.out.println("A |Triple Bubble|   Himshey's  |   200 Grand   |");
        System.out.println("  |\t " + machine[0][0].size() + "\t|       " + machine[0][1].size() + "      |       " + machine[0][2].size() + "       |");
        System.out.println("  |_____________|______________|_______________|");
        System.out.println("B |  Chuckles   |   Andromeda  |  Gummy Bears  |");
        System.out.println("  |\t " + machine[1][0].size() + "\t|       " + machine[1][1].size() + "      |       " + machine[1][2].size() + "       |");
        System.out.println("  |_____________|______________|_______________|");
        System.out.println("C |  Dit Dogs   | Tarty Sweets |Smiling Cowboys|");
        System.out.println("  |\t " + machine[2][0].size() + "\t|       " + machine[2][1].size() + "      |       " + machine[2][2].size() + "       |");
        System.out.println("  |_____________|______________|_______________|");
    }
}
