/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Conexion.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author I'm Max
 */
public class Modelo_MedicoDAO {
    
    //Creamos la variable de tipo conexion
    Conexion con = new Conexion();

    public Modelo_MedicoDAO() {
    }
    public DefaultTableModel CargarMedicos (){
        
        String [] ArrayTitulos = {"ID Médico", "Cédula", "Nombres", "Apellidos", "Contraseña", "Teléfono"};
        String [] Registros = new String[50];
        
        String SQL_AllPacientes="SELECT * FROM medicos;";
        
        DefaultTableModel model = new DefaultTableModel(null, ArrayTitulos);
        
        Connection accesoBD = con.getConnection();
        
        try {
            Statement st = accesoBD.createStatement();
            ResultSet rs = st.executeQuery(SQL_AllPacientes);
            
            while (rs.next()) {
                Registros[0]=Integer.toString(rs.getInt(1));
                Registros[1]=rs.getString(2);
                Registros[2]=rs.getString(3);
                Registros[3]=rs.getString(4);
                Registros[4]=rs.getString(5);
                Registros[5]=rs.getString(6);             
                model.addRow(Registros);
            }
        } catch (Exception e) {
            System.out.println("Error al cargar la tabla de medicos"+e);
        }
        
        return model;
    }
    public Modelo_Medico verificaCredenciales (int idmedico, String contraseña){
        //Creamos el objeto de tipo medico que posteriormente va a ser regresado en el metodo
        Modelo_Medico medico = null;
        
        //Creamos el acceso a la bd
        Connection accesoBD = con.getConnection();
        
        //Metodo TRY-CATCH
        try {
            //Preparamos el statment
            Statement st = accesoBD.createStatement();
            //Preparamos la sentencia con la clase resultset para poder pedir los datos de la tabla medicos en la bd
            ResultSet rs= st.executeQuery("select idmedico, nombres, apellidos, contraseña, telefono from medicos where idmedico="+idmedico+" and contraseña='"+contraseña+"';");
            //Colocamos los atributos correspondientes al objeto de tipo medico
            if (rs.next()) {
                medico = new Modelo_Medico();
                medico.setIdmedico(rs.getInt(1));
                medico.setNombres(rs.getString(2));
                medico.setApellidos(rs.getString(3));
                medico.setContraseña(rs.getString(4));
                medico.setTelefono(rs.getString(5));
            }
        } catch (Exception e) {
            System.out.println("Error al validar la credencial en la tabla médico");
        }
        return medico;
    }
    public Modelo_Medico consultaExistencia (int id){
        Modelo_Medico Medico = null;
        //Conectamos a la BD
            Connection accesoBD = con.getConnection();
            
            //Verificamos la existencia en BD la cédula a agregar o modificar
            String SQL_BUSQUEDA_CEDULA= "select * from medicos where idMedico ="+id+";";
            
            //Try-CatchVerificacion
            try {
                Statement st = accesoBD.createStatement();
                ResultSet rs = st.executeQuery(SQL_BUSQUEDA_CEDULA);
                while (rs.next()) {
                    Medico = new Modelo_Medico();
                    Medico.setIdmedico(rs.getInt(1));
                    Medico.setCedula(rs.getString(2));
                    Medico.setNombres(rs.getString(3));
                    Medico.setApellidos(rs.getString(4));
                    Medico.setContraseña(rs.getString(5));
                    Medico.setTelefono(rs.getString(6));
                }  
                } catch (Exception e) {
                    System.out.println("Error al buscar el ID del médico en la BD"+e);
                }
        return Medico;
    }
    public Modelo_Medico eliminar (int id){
        Modelo_Medico Medico = new Modelo_Medico();
        //Sentecia para borrar el registro
        String SQL_BORRAR_REGISTRO="DELETE FROM `medicos` WHERE (idmedico = "+id+");";
        JOptionPane.showMessageDialog(null, "El ID de médico a buscar es: "+id);
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
            System.out.println("Error al eliminar el medico \n"+e);
        }
        return Medico;
        
    }
    public Modelo_Medico agregar (int id_medico, String cedula, String nombres, String apellidos, String contraseña, String telefono){
        Modelo_Medico Medico = new Modelo_Medico();
        //Sentencia para agregar el nuevo registro
        String SQL_ADDMedicos = "INSERT INTO `medicos` (idMedico, `Cedula`, `Nombres`, `Apellidos`, `Contraseña`, `Telefono`) "
                + "             VALUES ("+id_medico+",'"+cedula+"', '"+nombres+"', '"+apellidos+"', '"+contraseña+"', '"+telefono+"');";
        Connection accesoBD = con.getConnection();
        try {
            Statement st = accesoBD.createStatement();
            int resultado = st.executeUpdate(SQL_ADDMedicos);
            if (resultado>0) {
                JOptionPane.showMessageDialog(null, "Registro Agregado");
            } else {
                JOptionPane.showMessageDialog(null, "Error de Registro");
            }
        } catch (Exception e) {
            
            System.out.println("Error al agregar médico \n"+e);
        }
        return Medico;
    }
}

