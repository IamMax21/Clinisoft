/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author I'm Max
 */
public class Modelo_Administrador {
    //Agregamos los atributos correspondientes a los campos de nuestra tabla administrador en nuestra base de datos
    private String nombres;
    private String apellidos;
    private String contraseña;
    private String telefono;

    //Constructor para administrador vacio
    public Modelo_Administrador() {
        this.nombres = "";
        this.apellidos = "";
        this.contraseña = "";
        this.telefono = "";
    }
    
    //Constructor para administradores con todos los datos
    public Modelo_Administrador(String nombres, String apellidos, String contraseña, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.telefono = telefono;
    }

    //Getters and Setters
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

