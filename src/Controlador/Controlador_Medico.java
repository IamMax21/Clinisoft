/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo_Medico;
import Modelo.Modelo_MedicoDAO;
import Modelo.Modelo_Paciente;
import Modelo.Modelo_PacienteDAO;
import Vistas.Vista_Login;
import Vistas.Vista_Medico;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author I'm Max
 */
public class Controlador_Medico implements ActionListener, KeyListener{
    
    Vista_Medico VistaMed = new Vista_Medico();
    Modelo_PacienteDAO ModeloPacDAO = new Modelo_PacienteDAO();
    Modelo_MedicoDAO ModeloMedDAO = new Modelo_MedicoDAO();

    public Controlador_Medico(Vista_Medico VistaMed, Modelo_PacienteDAO ModeloPacDAO, Modelo_MedicoDAO ModeloMedDAO) {
        this.VistaMed=VistaMed;
        this.ModeloPacDAO=ModeloPacDAO;
        this.ModeloMedDAO=ModeloMedDAO;
        this.VistaMed.BTN_MOSTRAR_DATOS_PACIENTE.addActionListener(this);
        this.VistaMed.BTN_EDITAR_DATOS_PACIENTE.addActionListener(this);
        this.VistaMed.BTN_AGREGAR_DATOS_PACIENTE2.addActionListener(this);
        this.VistaMed.BTN_BUSCAR_PACIENTE_EN_MEDICO.addActionListener(this);
        this.VistaMed.TXT_BUSCAR_PACIENTE.addKeyListener(this);
    }
    
    public void Inicializar(int id_medico){
        traerPerfil(id_medico);
        cargarPacientes();
        VistaMed.setVisible(true);
        VistaMed.setResizable(false);
        VistaMed.setLocationRelativeTo(null);
    }
    
    public void cargarPacientes (){
        VistaMed.TABLA_PACIENTES_DEL_MEDICO.setModel(ModeloPacDAO.CargarPacientes());
    }
    
    public void traerPerfil (int id_medico){
        //Obtenemos ID del médico
        Modelo_Medico Medico = new Modelo_Medico();
        Medico=ModeloMedDAO.consultaExistencia(id_medico);
        //Colocamos los datos del medico obtenido en los Label's
        VistaMed.lbl_ID_MEDICO.setText(Integer.toString(Medico.getIdmedico()));
        VistaMed.lbl_NOMBRES_MEDICO.setText(Medico.getNombres());
        VistaMed.lbl_APELLIDOS_MEDICO.setText(Medico.getApellidos());
        VistaMed.lbl_TELEFONO_MEDICO.setText(Medico.getTelefono());
    }

    public boolean verificaCampos(){
        boolean validaCampos =true;
        
        if (VistaMed.LBL_CEDULA_PACIENTE_EN_MEDICO.getText().equals("") || 
            VistaMed.LBL_NOMBRE_PACIENTE_EN_MEDICO.getText().equals("") || 
            VistaMed.LBL_APELLIDO_PACIENTE_EN_MEDICO.getText().equals("") || 
            VistaMed.LBL_NACIMIENTO_PACIENTE_EN_MEDICO.getText().equals("") || 
            VistaMed.LBL_ESTADO_PACIENTE_EN_MEDICO.getText().equals("") ||
            VistaMed.LBL_ENFERMEDAD_PACIENTE_EN_MEDICO.getText().equals("")) {
                validaCampos= false;
                JOptionPane.showMessageDialog(null, "Rellene todos los campos por favor");
            } else {
                validaCampos= true;}
        return validaCampos;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==VistaMed.BTN_MOSTRAR_DATOS_PACIENTE) {
            //Guardamos el index de la fila seleccionada
            int Fila_Seleccionada = VistaMed.TABLA_PACIENTES_DEL_MEDICO.getSelectedRow();

            //Mandamos los textos de los registros de la tabla a los cuadros de texto
            VistaMed.LBL_CEDULA_PACIENTE_EN_MEDICO.setText(VistaMed.TABLA_PACIENTES_DEL_MEDICO.getModel().getValueAt(Fila_Seleccionada, 0).toString());
            VistaMed.LBL_NOMBRE_PACIENTE_EN_MEDICO.setText(VistaMed.TABLA_PACIENTES_DEL_MEDICO.getModel().getValueAt(Fila_Seleccionada, 1).toString());
            VistaMed.LBL_APELLIDO_PACIENTE_EN_MEDICO.setText(VistaMed.TABLA_PACIENTES_DEL_MEDICO.getModel().getValueAt(Fila_Seleccionada, 2).toString());
            VistaMed.LBL_NACIMIENTO_PACIENTE_EN_MEDICO.setText(VistaMed.TABLA_PACIENTES_DEL_MEDICO.getModel().getValueAt(Fila_Seleccionada, 4).toString());
            VistaMed.LBL_ESTADO_PACIENTE_EN_MEDICO.setText(VistaMed.TABLA_PACIENTES_DEL_MEDICO.getModel().getValueAt(Fila_Seleccionada, 5).toString());
            VistaMed.LBL_ENFERMEDAD_PACIENTE_EN_MEDICO.setText(VistaMed.TABLA_PACIENTES_DEL_MEDICO.getModel().getValueAt(Fila_Seleccionada, 6).toString());
        }
        
        if (e.getSource()==VistaMed.BTN_EDITAR_DATOS_PACIENTE) {
            VistaMed.LBL_CEDULA_PACIENTE_EN_MEDICO.setBackground(new Color(200,200,200));
            VistaMed.LBL_NOMBRE_PACIENTE_EN_MEDICO.requestFocus();
            VistaMed.LBL_NOMBRE_PACIENTE_EN_MEDICO.setEditable(true);
            VistaMed.LBL_APELLIDO_PACIENTE_EN_MEDICO.setEditable(true);
            VistaMed.LBL_NACIMIENTO_PACIENTE_EN_MEDICO.setEditable(true);
            VistaMed.LBL_ESTADO_PACIENTE_EN_MEDICO.setEditable(true);
            VistaMed.LBL_ENFERMEDAD_PACIENTE_EN_MEDICO.setEditable(true);
        }
        
        if (e.getSource()==VistaMed.BTN_AGREGAR_DATOS_PACIENTE2) {
            //Verificando campos llenos
            if (verificaCampos()==true) {
                JOptionPane.showMessageDialog(null, "Pase el metodo de verificacion de campos vacios");
                String cedula_nueva=VistaMed.LBL_CEDULA_PACIENTE_EN_MEDICO.getText();
                String nombres_nuevo=VistaMed.LBL_NOMBRE_PACIENTE_EN_MEDICO.getText();
                String apellidos_nuevo=VistaMed.LBL_APELLIDO_PACIENTE_EN_MEDICO.getText();
                String nacimiento_nuevo=VistaMed.LBL_NACIMIENTO_PACIENTE_EN_MEDICO.getText();
                String estado_nuevo=VistaMed.LBL_ESTADO_PACIENTE_EN_MEDICO.getText();
                String enfermedad_nuevo=VistaMed.LBL_ENFERMEDAD_PACIENTE_EN_MEDICO.getText();
                
                Modelo_Paciente Paciente = new Modelo_Paciente();
                Paciente=ModeloPacDAO.actualizar(Integer.parseInt(cedula_nueva), nombres_nuevo, apellidos_nuevo, nacimiento_nuevo, estado_nuevo, enfermedad_nuevo);
                cargarPacientes();
            }
        }
        if (e.getSource()==VistaMed.BTN_BUSCAR_PACIENTE_EN_MEDICO) {
            String busqueda= VistaMed.TXT_BUSCAR_PACIENTE.getText();
            VistaMed.TABLA_PACIENTES_DEL_MEDICO.setModel(ModeloPacDAO.buscar(busqueda));
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource()==VistaMed.TXT_BUSCAR_PACIENTE) {
            
            if (e.getKeyCode()==KeyEvent.VK_ENTER) {
                VistaMed.BTN_BUSCAR_PACIENTE_EN_MEDICO.doClick();
            }
            String busqueda= VistaMed.TXT_BUSCAR_PACIENTE.getText();
            VistaMed.TABLA_PACIENTES_DEL_MEDICO.setModel(ModeloPacDAO.buscar(busqueda));
        }
        
    }
    
    
    
    
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}

}
    


