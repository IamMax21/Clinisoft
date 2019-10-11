/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.Controlador_Login;
import Modelo.Modelo_AdministradorDAO;
import Modelo.Modelo_MedicoDAO;
import Modelo.Modelo_Paciente;
import Modelo.Modelo_PacienteDAO;
import Vistas.Vista_Login;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author I'm Max
 */
public class Main {
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        Vista_Login VistaL = new Vista_Login();
        Modelo_AdministradorDAO ModeloAdminDAO = new Modelo_AdministradorDAO();
        Modelo_MedicoDAO ModeloMedDAO= new Modelo_MedicoDAO();
        Modelo_PacienteDAO ModeloPacDAO= new Modelo_PacienteDAO();
        Controlador_Login ControladorL = new Controlador_Login(VistaL, ModeloAdminDAO, ModeloMedDAO, ModeloPacDAO);
        ControladorL.InicializarLogin();
        
    }
}
