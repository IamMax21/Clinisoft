/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.Conexion;
import java.sql.*;

/**
 *
 * @author I'm Max
 */
public class Modelo_AdministradorDAO {
    
    //Instanciamos la variable de tipo conexion
    Conexion con = new Conexion();
    
    //Constructor

    public Modelo_AdministradorDAO() {
    }
    
    public Modelo_Administrador verificaCredenciales (int idadmin, String contraseña) {
        /*Ya que este metodo debe devolver una variable de tipo administrador, entonces tenemos que crearla para luego
        retornarla*/
        
        //Instanciando variable de tipo administrador
        Modelo_Administrador administrador=null;
        
        //Creamos objeto de tipo conexion (accesoBD)
        Connection accesoDB = con.getConnection();
        /*Aqui toca explicar que la clase padre (Connection) se invocap para ser instanciado de tipo hija (en este
        caso "co" de la clase Conexion) y utilizamos el método getConnection creado en nuestra clase Conexion*/
        
        //Usamos el try-catch
        try {
            //Creamos un objeto de tipo Statement y que solo se creará si accesoBD resulta true y servira para ejecutar sentencias SQL
            Statement st=accesoDB.createStatement();
            
            //Usamos el objeto de tipo Statement para crear un objeto de tipo Resulset que va a almacenar los valores que devuelve la sentencia SQL del Statement
            ResultSet rs=st.executeQuery("select nombres, apellidos, contraseña, telefono from admin where idadmin="+idadmin+" and contraseña='"+contraseña+"';");
            /*Dentro de executeQuery es donde vamos a escribir la consulta*/
            
            /*Si rs devuelve algun valor, que se instancie la variable empleado con los atributos que se deben recuperar 
            de la base de datos*/
            if (rs.next()) {
                //Inicializamos la variable empleado creada anteriormente...
                administrador = new Modelo_Administrador();
                //Rellenamos sus atributos
                administrador.setNombres(rs.getString(1));
                administrador.setApellidos(rs.getString(2));
                administrador.setContraseña(rs.getString(3));
                administrador.setTelefono(rs.getString(4));
                }
        } catch (Exception e) {
            System.out.println("Error al validar la credencial en la tabla administrador");
        }
        //Retornamos la variable administrador
        return administrador;
    }
    
}
