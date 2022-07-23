/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1resuelto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Trabajador> lista;

        boolean bandera = true;
        int salir = 0;
        System.out.print("----- SUELDO DE TRABAJADORES -----");
        System.out.println("Cuantos Trabajadores desea ingresa: ");
        int numTrab = sc.nextInt();
        for (int i = 0; i < numTrab; i++) {
            while (bandera) {
                
                System.out.println("Ingrese la cedula: ");
                String cedula = sc.nextLine();
                sc.nextLine();
                System.out.println("Ingrese el nombre: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el correo: ");
                String correo = sc.nextLine();
                System.out.println("Ingrese el sueldo: ");
                double sueldo = sc.nextDouble();
                System.out.println("Ingrese el mes del sueldo: ");
                String mesSueldo = sc.nextLine();
                Trabajador t1 = new Trabajador(cedula,nombre,correo,sueldo,mesSueldo);
                System.out.println(t1);
                
                
                System.out.println("Para salir pulse el numero 2 ");
                salir = sc.nextInt();
                if (salir == 2) {
                    bandera = false;
                }
                sc.nextLine();
            }
        }

    }

}
