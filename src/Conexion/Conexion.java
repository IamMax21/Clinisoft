/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.sql.*;
/**
 *
 * @author I'm Max
 */
public class Conexion {
    //Objeto Connection
    private static Connection con=null;
    
    //Constructor
    public Conexion() {
    }
    
    //Metodo de Obtencion de Conexion
    public Connection getConnection (){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_clinisoft", "root", "");
            if (con!=null) {
                System.out.println("Conexión Exitosa");
            }
            else{
                System.out.println("Conexión Fallida");
            }
        } catch (Exception e) {
            System.out.println("Error de Conexión");
        }
        return con;
    }
}
