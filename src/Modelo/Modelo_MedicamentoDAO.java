/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author I'm Max
 */
public class Modelo_MedicamentoDAO {
    Conexion con = new Conexion();

    public Modelo_MedicamentoDAO() {
    }
    public DefaultTableModel CargarMedicamentos (){
        
        String [] ArrayTitulos = {"ID Medicamentos", "Nombre", "Laboratorio"};
        String [] Registros = new String[50];
        
        String SQL_AllPacientes="SELECT * FROM medicamentos;";
        
        DefaultTableModel model = new DefaultTableModel(null, ArrayTitulos);
        
        Connection accesoBD = con.getConnection();
        
        try {
            Statement st = accesoBD.createStatement();
            ResultSet rs = st.executeQuery(SQL_AllPacientes);
            
            while (rs.next()) {
                Registros[0]=Integer.toString(rs.getInt(1));
                Registros[1]=rs.getString(2);
                Registros[2]=rs.getString(3);
                
                model.addRow(Registros);
            }
        } catch (Exception e) {
            System.out.println("Error al cargar la tabla de medicamentos"+e);
        }
        
        return model;
    }
    public Modelo_Medicamento consultaExistencia (int id){
        Modelo_Medicamento Medicamento = null;
        //Conectamos a la BD
            Conexion con = new Conexion();
            Connection accesoBD = con.getConnection();
            
            //Verificamos la existencia en BD la cédula a agregar o modificar
            String SQL_BUSQUEDA_CEDULA= "select * from medicamentos where idmedicamentos ="+id+";";
            
            //Try-CatchVerificacion
            try {
                Statement st = accesoBD.createStatement();
                ResultSet rs = st.executeQuery(SQL_BUSQUEDA_CEDULA);
                while (rs.next()) {
                    Medicamento = new Modelo_Medicamento();
                    Medicamento.setIdmedicamento(rs.getInt(1));
                }  
                } catch (Exception e) {
                    System.out.println("Error al buscar la id del medicamento en la BD"+e);
                }
        return Medicamento;
    }
    public Modelo_Medicamento eliminar (int id){
        Modelo_Medicamento Medicamento = new Modelo_Medicamento();
            //Sentecia para borrar el registro
        String SQL_BORRAR_REGISTRO="DELETE FROM `medicamentos` WHERE (idmedicamentos = "+id+");";
        //JOptionPane.showMessageDialog(null, "El ID del medicamentos a buscar es: "+id);
        Conexion con = new Conexion();
        Connection accesoBD = con.getConnection();
        try {
            Statement st = accesoBD.createStatement();
            int resultado=st.executeUpdate(SQL_BORRAR_REGISTRO);
            if (resultado>0) {
                JOptionPane.showMessageDialog(null, "Registro Borrado");
            } else {
                JOptionPane.showMessageDialog(null, "Error Borrando Registro");
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar el medicamento \n"+e);
        }  
        return Medicamento;
        
    }
    public Modelo_Medicamento agregar (int id, String nombre, String laboratorio){
        Modelo_Medicamento Medicamento = new Modelo_Medicamento();
        //Sentencia para agregar el nuevo registro
        String SQL_ADDPacientes = "INSERT INTO `medicamentos` (`idmedicamentos`, `Nombre`, `Laboratorio`) "
                + "                     VALUES ("+id+", '"+nombre+"', '"+laboratorio+"');";
 
        Connection accesoBD = con.getConnection();
        try {
            Statement st = accesoBD.createStatement();
            int resultado = st.executeUpdate(SQL_ADDPacientes);
            if (resultado>0) {
                JOptionPane.showMessageDialog(null, "Registro Agregado");
            } else {
                JOptionPane.showMessageDialog(null, "Error Agregando Registro");
            }
        } catch (Exception e) {
            
            System.out.println("Error al agregar el medicamento \n"+e);
        }
        return Medicamento;
    }
}

    