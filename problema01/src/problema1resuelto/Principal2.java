/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1resuelto;

/**
 *
 * @author USUARIO 2020
 */
public class Principal2 {
    public static void main(String[] args) {
        Enlace c = new Enlace();
        for (int i = 0; i < c.obtenerDataTrabajador().size(); i++) {
            System.out.printf("%s",c.obtenerDataTrabajador().get(i));
        }
    }
}
