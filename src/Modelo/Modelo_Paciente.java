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
public class Modelo_Paciente {
    //Agregamos los atributos correspondientes a los campos de nuestra tabla pacientes en nuestra base de datos
    private int cedula;
    private String nombres;
    private String apellidos;
    private String contraseña;
    private String fecha_nacimiento;
    private String estado;
    private String enfermedad;
    
    //Constructor para pacientes vacios
    public Modelo_Paciente() {
        this.cedula = 0;
        this.nombres = "";
        this.apellidos = "";
        this.contraseña = "";
        this.fecha_nacimiento = "";
        this.estado = "";
        this.enfermedad = "";
    }
    
    //Constructor para pacientes con todos los datos

    public Modelo_Paciente(int cedula, String nombres, String apellidos, String contraseña, String fecha_nacimiento, String estado, String enfermedad) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.fecha_nacimiento = fecha_nacimiento;
        this.estado = estado;
        this.enfermedad = enfermedad;
    }
    
    //Getters and Setters

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
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

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
    
    
    

}
