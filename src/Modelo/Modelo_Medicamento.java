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
public class Modelo_Medicamento {
    private int idmedicamento;
    private String nombre;
    private String laboratorio;

    
    public Modelo_Medicamento() {
        this.idmedicamento = 0;
        this.nombre = "";
        this.laboratorio = "";
    }
    
    public Modelo_Medicamento(int idmedicamento, String nombre, String laboratorio) {
        this.idmedicamento = idmedicamento;
        this.nombre = nombre;
        this.laboratorio = laboratorio;
    }

    public int getIdmedicamento() {
        return idmedicamento;
    }

    public void setIdmedicamento(int idmedicamento) {
        this.idmedicamento = idmedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }
    
}
