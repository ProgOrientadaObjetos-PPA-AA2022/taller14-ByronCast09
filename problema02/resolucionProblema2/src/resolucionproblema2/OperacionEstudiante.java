/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucionproblema2;

import java.util.ArrayList;

/**
 *
 * @author USUARIO 2020
 */
public class OperacionEstudiante {
     private ArrayList<Estudiante> lista = new ArrayList<>();
    private double promedio;

    public OperacionEstudiante(ArrayList<Estudiante> e) {
        lista = e; 
    }

    public void establecerLista(ArrayList<Estudiante> lista) {
        lista = lista;
    }
    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }
    public void establecerPromedio(Estudiante e) {
        promedio = (e.obtenerCalificacion1() + e.obtenerCalificacion2() +
                e.obtenerCalificacion3())/3;
    }
    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadenafinal = " ";
        for (int i = 0; i < obtenerLista().size(); i++) {
            establecerPromedio(obtenerLista().get(i));
            cadenafinal = String.format("%s%sPromedio: %.2f\n",
                    cadenafinal,obtenerLista().get(i),obtenerPromedio());
        }
        return cadenafinal;
    }
}
