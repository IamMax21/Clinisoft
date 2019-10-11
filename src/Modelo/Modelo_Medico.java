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
public class Modelo_Medico {
    
    //Agregamos los atributos correspondientes a los campos de nuestra tabla medicos en nuestra base de datos
    private int idmedico;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String contraseña;
    private String telefono;

    //Constructor para medicos vacios
    public Modelo_Medico() {
        this.idmedico=0;
        this.cedula = "";
        this.nombres = "";
        this.apellidos = "";
        this.contraseña = "";
        this.telefono = "";
    }
    
    //Constructor para medicos con todos los datos
    public Modelo_Medico(int idmedico, String cedula, String nombres, String apellidos, String contraseña, String telefono) {
        this.idmedico=idmedico;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.telefono = telefono;
    }

    public int getIdmedico() {
        return idmedico;
    }

    public void setIdmedico(int idmedico) {
        this.idmedico = idmedico;
    }
    
    //Getters and Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

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


