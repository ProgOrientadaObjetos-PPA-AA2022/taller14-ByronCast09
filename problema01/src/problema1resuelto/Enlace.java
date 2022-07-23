/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1resuelto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Enlace {

    private Connection conn;

    public void establecerConexion() {
        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.bd";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public Connection obtenerConexion(){
        return conn;
    }
    public void insertarTrabajador(Trabajador tb) { 
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO trabajadores (cedula,"
                    + "nombres "
                    + "correo"
                    +"sueldo"
                    +"mesSueldo('%s', %s,%s,%.2f,%s)", 
                    tb.obtenerCedula(),tb.obtenerNombres(),tb.obtenerCorreo(),
                    tb.obtenerSueldo(),tb.obtenerMesSueldo());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
    public ArrayList<Trabajador> obtenerDataTrabajador() {  
        ArrayList<Trabajador> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from trabajadores;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                Trabajador trab = new Trabajador(rs.getString("cedula"),
                rs.getString("nombre"),rs.getString("correo"),rs.getDouble("sueldo"),
                        rs.getString("mesSueldo"));
                lista.add(trab);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarCiudad");
             System.out.println(e.getMessage());  
        }  
        return lista;
    }
}
