/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1resuelto;

/**
 *
 * @author SALA I
 */
public class Trabajador {
    private String cedula;
    private String nombre;
    private String correo;
    private double sueldo;
    private String mesSueldo;

    public Trabajador(String cedula, String nombre, String correo, double sueldo, String mesSueldo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.sueldo = sueldo;
        this.mesSueldo = mesSueldo;
    }
    
    
    public void establecerCedula(String c) {
        cedula = c;
    }
    public void establecerNombre(String n) {
        nombre = n;
    }
    public void establecerCorreo(String co) {
        correo = co;
    }
    public void establecerSueldo(double s) {
        sueldo = s;
    }
    public void establecerMesSueldo(String m) {
        mesSueldo = m;
    }
    //-------------
    public String obtenerCedula() {
        return cedula;
    }
    public String obtenerNombres() {
        return nombre;
    }
    public String obtenerCorreo() {
        return correo;
    }
    public double obtenerSueldo() {
        return sueldo;
    }
    public String obtenerMesSueldo() {
        return mesSueldo;
    }
    
}
