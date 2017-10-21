/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import MillerRobin.MRValidacion;
import java.util.Scanner;

/**
 *
 * @author Lety
 */
public class ExMillerRobin {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Miller Rabin Primality Algorithm Test\n");
        /** Make an object of MillerRabin class **/
        MRValidacion mr = new MRValidacion();
        /** Accept number **/
        System.out.println("Ingrese numero\n");
        long num = scan.nextLong();
        /** Accept number of iterations **/
        System.out.println("\nIngrese numero de iteraciones");
        int k = scan.nextInt();
        /** check if prime **/
        boolean prime = mr.isPrime(num, k);
        if (prime)
            System.out.println("\n"+ num +" es primo");
        else
            System.out.println("\n"+ num +" es compuesto");
 
    }
}
