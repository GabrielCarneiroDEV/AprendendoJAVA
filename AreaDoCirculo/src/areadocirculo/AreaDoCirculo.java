/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areadocirculo;

import java.util.Scanner;


/**
 *
 * @author gabri
 */
public class AreaDoCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Scanner input = new Scanner(System.in);
        double raio = input.nextDouble();
      double pipi = 3.14159;
      
      double area = pipi *(raio*raio);
        System.out.printf("A = %.4f \n", area);
    }
    
}
