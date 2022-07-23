/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1resuelto;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        ArrayList<Trabajador> lista;
        sc.useLocale(Locale.US);
        boolean bandera = true;
        int salir = 0;
        
        System.out.print("----- SUELDO DE TRABAJADORES -----\n");
        
            while (bandera) {
                Enlace c = new Enlace();
                System.out.println("Ingrese la cedula: ");
                String cedula = sc.nextLine();
                sc.nextLine();
                System.out.println("Ingrese el nombre: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el correo: ");
                String correo = sc.nextLine();
                System.out.println("Ingrese el sueldo: ");
                double sueld = sc.nextDouble();
                sc.nextLine();
                System.out.println("Ingrese el mes del sueldo: ");
                String mesSueldo = sc.nextLine();
                Trabajador t1 = new Trabajador(cedula,nombre,correo,sueld,mesSueldo);
                
                c.insertarTrabajador(t1);
                
                System.out.println("Para salir pulse el numero 2 ");
                salir = sc.nextInt();
                if (salir == 2) {
                    bandera = false;
                }
                sc.nextLine();
                
            }
        

    }

}
