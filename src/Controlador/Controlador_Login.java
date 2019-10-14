/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conexion;
import Modelo.Modelo_Administrador;
import Modelo.Modelo_AdministradorDAO;
import Modelo.Modelo_Medicamento;
import Modelo.Modelo_MedicamentoDAO;
import Modelo.Modelo_Medico;
import Modelo.Modelo_MedicoDAO;
import Modelo.Modelo_Paciente;
import Modelo.Modelo_PacienteDAO;
import Vistas.Vista_Administrador;
import Vistas.Vista_Login;
import Vistas.Vista_Medico;
import Vistas.Vista_Paciente;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author I'm Max
 */
public class Controlador_Login implements ActionListener{
    
    //Objeto de tipo vistaLogin para poder acceder a los componentes
    Vista_Login VistaLog = new Vista_Login();
    
    //Administrador
        //Objeto de tipo administradordao para poder llamar al atributo verificaCredenciales
        Modelo_AdministradorDAO ModeloAdminDAO = new Modelo_AdministradorDAO();

        //Objeto de tipo administador para poder darle los atributos rescatados del dao
        Modelo_Administrador Administrador = new Modelo_Administrador();
    
    //Medico
        //Objeto de tipo pacientedao para poder llamar al atributo verificaCredenciales
        Modelo_MedicoDAO ModeloMedDAO = new Modelo_MedicoDAO();
    
        //Objeto de tipo paciente para poder darle los atributos rescatados del dao
        Modelo_Medico Medico = new Modelo_Medico();
    
    //Paciente
        //Objeto de tipo pacientedao para poder llamar al atributo verificaCredenciales
        Modelo_PacienteDAO ModeloPacDAO = new Modelo_PacienteDAO();

        //Objeto de tipo paciente para poder darle los atributos rescatados del dao
        Modelo_Paciente Paciente = new Modelo_Paciente();
        
    //Medicamento
        //Objeto de tipo medicamentodao
        Modelo_MedicamentoDAO ModeloMedicamDAO = new Modelo_MedicamentoDAO();

        //Objeto de tipo medicamento
        Modelo_Medicamento Medicamento = new Modelo_Medicamento();
        
    
    //Constructor
    public Controlador_Login (Vista_Login VistaLog, Modelo_AdministradorDAO ModeloAdminDAO, Modelo_MedicoDAO ModeloMedDAO, Modelo_PacienteDAO ModeloPacDAO){
        this.VistaLog= VistaLog;
        this.ModeloAdminDAO= ModeloAdminDAO;
        this.ModeloMedDAO=ModeloMedDAO;
        this.ModeloPacDAO=ModeloPacDAO;
        this.VistaLog.btnINGRESAR.addActionListener(this);
    }
    
    public void InicializarLogin (){
        VistaLog.setVisible(true);
        VistaLog.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Definimos el tipo de usuario gracias al privilegio
        String privilegio = String.valueOf(VistaLog.cboPRIVILEGIO.getSelectedItem());
        
        //JOptionPane.showMessageDialog(null, "El privilegio es de nivel "+privilegio); **************************************************
        
        //Administrador
        if (privilegio.equals("Administrador")) {
            //Toma de Credenciales
            int id = Integer.parseInt(VistaLog.txtUSER.getText());
            String contraseña = String.valueOf(VistaLog.txtPASS.getPassword());
            //Metodo de verificación
            Administrador=ModeloAdminDAO.verificaCredenciales(id, contraseña);
            //JOptionPane.showMessageDialog(null, Administrador);
            //Resultado de consulta
            if (Administrador==null) {
                JOptionPane.showMessageDialog(null, "ID y/o Contraseña son incorrectos.");
            } else{
                //Mensaje de Bienvenida
                JOptionPane.showMessageDialog(null, "Bienvenido "+Administrador.getNombres()+" "+Administrador.getApellidos());
                //Iniciamos controlador del administrador
                Vista_Administrador VistaAdmin = new Vista_Administrador();
                Controlador_Administrador Ctr_Admin = new Controlador_Administrador(VistaAdmin, ModeloPacDAO, ModeloMedDAO, ModeloMedicamDAO);
                //Inicializamos la pantalla y configuraciones generales del administrador
                Ctr_Admin.Inicializar();
                VistaLog.dispose();
            }
            
        }
        
        //Medico
        if (privilegio.equals("Medico")) {
            //Toma de Credenciales
            int id = Integer.parseInt(VistaLog.txtUSER.getText());
            String contraseña = String.valueOf(VistaLog.txtPASS.getPassword());
            //Metodo de verificación
            Medico=ModeloMedDAO.verificaCredenciales(id, contraseña);
            //JOptionPane.showMessageDialog(null, Medico);
            //Resultado de consulta
            if (Medico==null) {
                JOptionPane.showMessageDialog(null, "ID y/o Contraseña son incorrectos.");
            } else{
                JOptionPane.showMessageDialog(null, "Bienvenido "+Medico.getNombres()+" "+Medico.getApellidos());
                Vista_Medico VistaMed = new Vista_Medico();
                Controlador_Medico Ctr_Med = new Controlador_Medico(VistaMed, ModeloPacDAO, ModeloMedDAO);
                Ctr_Med.Inicializar(id);
                VistaLog.dispose();
            }
        }
        
        //Si es el paciente
        if (privilegio.equals("Paciente")) {
            int cedula = Integer.parseInt(VistaLog.txtUSER.getText());
            String contraseña = String.valueOf(VistaLog.txtPASS.getPassword());
            
            Paciente=ModeloPacDAO.verificaCredenciales(cedula, contraseña);
            //JOptionPane.showMessageDialog(null, Paciente);
            
            if (Paciente==null) {
                JOptionPane.showMessageDialog(null, "ID y/o Contraseña son incorrectos.");
            } else{
                JOptionPane.showMessageDialog(null, "Bienvenido "+Paciente.getNombres()+" "+Paciente.getApellidos());
                
                Vista_Paciente VistaPac =new Vista_Paciente();
                Controlador_Paciente Ctr_Pac = new Controlador_Paciente(VistaPac, ModeloPacDAO, ModeloMedicamDAO);
                Ctr_Pac.Inicializar(cedula);
                VistaLog.dispose();
            }
        }
    }
}
