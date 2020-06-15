/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.par.impar;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ex1ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
        
        System.out.println ("Digite um número");
        int n = entrada.nextInt();
        
        System.out.println (n%2 == 0? "Par" : "Impar");
    }
    
}
