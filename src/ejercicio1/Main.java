/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author oquintansocampo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[6];
        for (int i = 0; i < 6; i++) {
            double random = Math.random() * 50 + 1;
            int valor = (int) random;
            numeros[i] = valor;
            System.out.println("Elemento " + (i + 1) + "-->" + numeros[i]);
        }

        System.out.println("\n");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Elemento " + (i + 1) + "-->" + numeros[i]);
        }
    }
}
