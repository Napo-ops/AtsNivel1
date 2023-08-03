/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtsNivel1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class entradaYSalidaDeDatosJava {

    public static void main(String[] args) {
        //Es una entrada de datos que se instancia con un objeto
        Scanner entrada = new Scanner(System.in);
        int numero;
        //Pedimpos un que digite un numero10

        System.out.println("Ingresa un numero: ");
        numero = entrada.nextInt();

        System.out.println("En numero digitado es: " + numero);
    }

}
