/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Conexion.Conexion;
import Controlador.Controlador_Login;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author I'm Max
 */
public class Modelo_PacienteDAO {
    Conexion con = new Conexion();

    public Modelo_PacienteDAO() {
    }
    public DefaultTableModel CargarPacientes (){
        
        String [] ArrayTitulos = {"Cédula", "Nombres", "Apellidos", "Contraseña", "Fecha de Nacimiento", "Estado", "Enfermedad"};
        String [] Registros = new String[10];
        
        String SQL_AllPacientes="SELECT * FROM pacientes;";
        
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
                Registros[6]=rs.getString(7);
                
                model.addRow(Registros);
            }
        } catch (Exception e) {
            System.out.println("Error al cargar la tabla de pacientes"+e);
        }
        return model;
    }
    public Modelo_Paciente verificaCredenciales (int cedula, String contraseña){
        Modelo_Paciente paciente = null;
        Connection accesoBD=con.getConnection();
        try {
            Statement st=accesoBD.createStatement();
            ResultSet rs=st.executeQuery("select nombres, apellidos, contraseña, fecha_nacimiento, estado, enfermedad from pacientes where cedula="+cedula+" and contraseña='"+contraseña+"';");
            if (rs.next()) {
                paciente = new Modelo_Paciente();
                paciente.setNombres(rs.getString(1));
                paciente.setApellidos(rs.getString(2));
                paciente.setContraseña(rs.getString(3));
                paciente.setFecha_nacimiento(rs.getString(4));
                paciente.setEstado(rs.getString(5));
                paciente.setEnfermedad(rs.getString(6));
            }
        
        } catch (Exception e) {
            System.out.println("Error al validar la credencial en la tabla paciente");
        }
        //Retornamos la variable paciente
        return paciente;
    }
    public Modelo_Paciente consultaExistencia (int id){
        JOptionPane.showMessageDialog(null, "Entrando a consultaExistencia DAO");
        Modelo_Paciente Paciente = null;
            //Consulta SQL
            String SQL_BUSQUEDA_CEDULA= "select * from pacientes where cedula ="+id+";";
            //Conectamos a la BD
            Connection accesoBD = con.getConnection();
            //Try-CatchVerificacion
            try {
                Statement st = accesoBD.createStatement();
                ResultSet rs = st.executeQuery(SQL_BUSQUEDA_CEDULA);
                while (rs.next()) {
                    Paciente = new Modelo_Paciente();
                    Paciente.setCedula(rs.getInt(1));
                    Paciente.setNombres(rs.getString(2));
                    Paciente.setApellidos(rs.getString(3));
                    Paciente.setContraseña(rs.getString(4));
                    Paciente.setFecha_nacimiento(rs.getString(5));
                    Paciente.setEstado(rs.getString(6));
                    Paciente.setEnfermedad(rs.getString(7));
                }  
                } catch (Exception e) {
                    System.out.println("Error al buscar al paciente en la BD"+e);
                }
        return Paciente;
    }
    public Modelo_Paciente eliminar (int id){
        Modelo_Paciente Paciente = new Modelo_Paciente();
            String SQL_BORRAR_REGISTRO="DELETE FROM `pacientes` WHERE (Cedula = "+id+");";
            JOptionPane.showMessageDialog(null, "La cedula a buscar es: "+id);
            
            Connection accesoBD = con.getConnection();
            try {
                Statement st = accesoBD.createStatement();
                int resultado=st.executeUpdate(SQL_BORRAR_REGISTRO);
                if (resultado>0) {
                    JOptionPane.showMessageDialog(null, "Registro Borrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error Borrando Paciente");
                }
            } catch (Exception e) {
                System.out.println("Error al eliminar el usuario \n"+e);
            }
            
                
        return Paciente;
        
    }
    public Modelo_Paciente agregar (int cedula, String nombres, String apellidos, String contraseña, String fecha_nacimiento, String estado, String enfermedad){
        Modelo_Paciente Paciente = new Modelo_Paciente();
        String SQL_ADDPacientes = "INSERT INTO `pacientes` (`Cedula`, `Nombres`, `Apellidos`, `Contraseña`, `Fecha_Nacimiento`, `Estado`, `Enfermedad`) VALUES ("+cedula+", '"+nombres+"', '"+apellidos+"', '"+contraseña+"', '"+fecha_nacimiento+"', '"+estado+"', '"+enfermedad+"');";

            Connection accesoBD = con.getConnection();
            try {
                Statement st = accesoBD.createStatement();
                int resultado = st.executeUpdate(SQL_ADDPacientes);
                if (resultado>0) {
                    JOptionPane.showMessageDialog(null, "Registro Agregado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error de Registro");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "La fecha tiene un formato no valido \nEl formato valido es: AAAA-MM-DD");
                System.out.println("Error al agregar el usuario \n"+e);
            }
        return Paciente;
    }
    public Modelo_Paciente actualizar (int cedula, String nombres, String apellidos, String fecha_nacimiento, String estado, String enfermedad){
        Modelo_Paciente Paciente = new Modelo_Paciente();
        //Sentencia para agregar el nuevo registro
        String SQL_UPPacientes = "UPDATE `bd_clinisoft`.`pacientes` SET `Nombres` = '"+nombres+"', `Apellidos` = '"+apellidos+"', `Fecha_Nacimiento` = '"+fecha_nacimiento+"', `Estado` = '"+estado+"', `Enfermedad` = '"+enfermedad+"' WHERE (`Cedula` = "+cedula+");";

        Connection accesoBD = con.getConnection();
        try {
            Statement st = accesoBD.createStatement();
            int resultado = st.executeUpdate(SQL_UPPacientes);
            if (resultado>0) {
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Error Actualizando Registro");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La fecha tiene un formato no valido \nEl formato valido es: AAAA-MM-DD");
            System.out.println("Error al agregar el usuario \n"+e);
        }
        return Paciente;
    }
    public DefaultTableModel buscar (String busqueda){
        //Modelo de la tabla

        String [] ArrayTitulos = {"Cédula", "Nombres", "Apellidos", "Contraseña", "Fecha de Nacimiento", "Estado", "Enfermedad"};
        String [] Registros = new String[50];
        
        DefaultTableModel model = new DefaultTableModel(null, ArrayTitulos);
        String SQL_BuscaPaciente="select * from pacientes where cedula like '%"+busqueda+"%' or nombres like '%"+busqueda+"%' or apellidos like '%"+busqueda+"%' or contraseña like '%"+busqueda+"%' or estado like '%"+busqueda+"%' or enfermedad like '%"+busqueda+"%'; ";
        
        Connection accesoBD = con.getConnection();
        
        try {
            Statement st = accesoBD.createStatement();
            ResultSet rs = st.executeQuery(SQL_BuscaPaciente);
            
            while (rs.next()) {
                Registros[0]=Integer.toString(rs.getInt(1));
                Registros[1]=rs.getString(2);
                Registros[2]=rs.getString(3);
                Registros[3]=rs.getString(4);
                Registros[4]=rs.getString(5);
                Registros[5]=rs.getString(6);
                Registros[6]=rs.getString(7);
                
                model.addRow(Registros);
            }
        } catch (Exception e) {
            System.out.println("Error buscando el paciente \n"+e);
        }
        
        return model;
    }
    public DefaultTableModel CargarCalendario (int id){
        //Haciento tabla de medicamentos del paciente
                
        String [] ArrayTitulos = {"Fecha", "Hora", "Medicamento"};
        String [] Registros = new String[10];

        DefaultTableModel model = new DefaultTableModel(null, ArrayTitulos);
        Connection accesoBD = con.getConnection();

        try {
            Statement st = accesoBD.createStatement();
            ResultSet rs = st.executeQuery("select fecha, hora, medicamentos.nombre, pacientes.nombres, pacientes.cedula from horarios  inner join medicamentos  on horarios.medicamentos_idmedicamentos = medicamentos.idmedicamentos inner join pacientes on horarios.pacientes_cedula = pacientes.cedula where pacientes.cedula="+id+" order by fecha; ");

            while (rs.next()) {
                Registros[0]=rs.getString(1);
                Registros[1]=rs.getString(2);
                Registros[2]=rs.getString(3);
                model.addRow(Registros);
            }

        }   catch (SQLException ex) {
            Logger.getLogger(Controlador_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
    }
}
