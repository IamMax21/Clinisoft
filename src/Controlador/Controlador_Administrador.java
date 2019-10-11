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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author I'm Max
 */
public class Controlador_Administrador implements ActionListener {
    
    //Atributos que necesita el controlador para poder iniciar su funcionamiento (La vista, el modelo base y el modelo DAO)
    
    Vista_Administrador VistaAdmin = new Vista_Administrador(); //Este es la vista
    
    Modelo_PacienteDAO ModeloPacDAO = new Modelo_PacienteDAO();
    Modelo_MedicoDAO ModeloMedDAO = new Modelo_MedicoDAO();
    Modelo_MedicamentoDAO ModeloMedicamDAO = new Modelo_MedicamentoDAO();
    
    //Es decir, la vista utiliza un objeto basico para que en él se guarden los datos obtenidos de una consulta realizada con algun metodo del modelo Dao, el cual es el que tiene conexión directa con la base de datos.
    
    //Iniciamos el constructor de la clase que va a tomar los objetos necesarios para los posteriores calculos
    public Controlador_Administrador(Vista_Administrador VistaAdmin, Modelo_PacienteDAO ModeloPacDAO, Modelo_MedicoDAO ModeloMedDAO, Modelo_MedicamentoDAO ModeloMedicamDAO) {
       this.VistaAdmin= VistaAdmin;
       this.ModeloPacDAO= ModeloPacDAO;
       this.ModeloMedDAO= ModeloMedDAO;
       this.ModeloMedicamDAO= ModeloMedicamDAO;
       
       //Eventos Btn Pacientes
       this.VistaAdmin.btn_AGREGAR_PACIENTES.addActionListener(this); //Agregar y Modificar
       this.VistaAdmin.btn_EDITAR_PACIENTES.addActionListener(this); //Editar
       this.VistaAdmin.btn_ELIMINAR_PACIENTES.addActionListener(this); //Eliminar
       
       //Eventos Btn Medicos
       this.VistaAdmin.btnAGREGAR_MEDICO.addActionListener(this); //Agregar y Modificar
       this.VistaAdmin.btnEDITAR_MEDICO.addActionListener(this); //Editar
       this.VistaAdmin.btnELIMINAR_MEDICO.addActionListener(this); //Eliminar
       
       //Eventos Btn Medicamentos
       this.VistaAdmin.btnAGREGAR_MEDICAMENTO.addActionListener(this); //Agregar y Modificar
       this.VistaAdmin.btnEDITAR_MEDICAMENTO.addActionListener(this); //Editar
       this.VistaAdmin.btnELIMINAR_MEDICAMENTO.addActionListener(this); //Eliminar
    }
   
    public void Inicializar(){
        VistaAdmin.setVisible(true);
        VistaAdmin.setLocationRelativeTo(null);
        VistaAdmin.setResizable(false);
        cargarPacientes();
        cargarMedicos();
        cargarMedicamentos();
    }
    public boolean verificaCampos(String tipodeUsuario){
        
        boolean validaCampos =true;
        
        //Verificacion de Pacientes
        if (tipodeUsuario.equals("Paciente")) {
            if (VistaAdmin.txtCEDULA_PACIENTE.getText().equals("") || 
                VistaAdmin.txtNOMBRE_PACIENTE.getText().equals("") || 
                VistaAdmin.txtAPELLIDO_PACIENTE.getText().equals("") || 
                VistaAdmin.txtCONTRASEÑA_PACIENTE.getText().equals("") || 
                VistaAdmin.txtNACIMIENTO_PACIENTE.getText().equals("") ||
                VistaAdmin.txtESTADO_PACIENTE.getText().equals("") ||
                VistaAdmin.txtENFERMEDAD_PACIENTE.getText().equals("")) {
                validaCampos= false;
                JOptionPane.showMessageDialog(null, "Rellene todos los campos por favor");
            } else {
                validaCampos= true;}
        //Verificacion de Medicos    
        } else if (tipodeUsuario.equals("Medico")) {
            if (VistaAdmin.txtID_MEDICO.getText().equals("") || 
                VistaAdmin.txtCEDULA_MEDICO.getText().equals("") ||
                VistaAdmin.txtNOMBRES_MEDICO.getText().equals("") || 
                VistaAdmin.txtAPELLIDOS_MEDICO.getText().equals("") || 
                VistaAdmin.txtCONTRASEÑA_MEDICO.getText().equals("") ||
                VistaAdmin.txtTELEFONO_MEDICO.getText().equals("")) {
                validaCampos= false;
                JOptionPane.showMessageDialog(null, "Rellene todos los campos por favor");
            } else {
                validaCampos= true;}
                
        //Verificacion de Medicamentos        
        } else if (tipodeUsuario.equals("Medicamento")) {
            if (VistaAdmin.txt_IDMEDICAMENTO.getText().equals("") || 
                VistaAdmin.txt_NOMBRE_MEDICAMENTO.getText().equals("") ||
                VistaAdmin.txt_LABORATORIO_MEDICAMENTO.getText().equals("")) {
                validaCampos= false;
                JOptionPane.showMessageDialog(null, "Rellene todos los campos por favor");
            } else {
                validaCampos= true;}
        }
        return validaCampos;
    }
    public void editar(String tipoUsuario){
        if (tipoUsuario.equals("Paciente")) {
            JOptionPane.showMessageDialog(null, "Presionaste Editar Paciente");
            
            //Guardamos el index de la fila seleccionada
            int Fila_Seleccionada = VistaAdmin.TABLA_PACIENTES.getSelectedRow();

            //Mandamos los textos de los registros de la tabla a los cuadros de texto
            VistaAdmin.txtCEDULA_PACIENTE.setText(VistaAdmin.TABLA_PACIENTES.getModel().getValueAt(Fila_Seleccionada, 0).toString());
            VistaAdmin.txtNOMBRE_PACIENTE.setText(VistaAdmin.TABLA_PACIENTES.getModel().getValueAt(Fila_Seleccionada, 1).toString());
            VistaAdmin.txtAPELLIDO_PACIENTE.setText(VistaAdmin.TABLA_PACIENTES.getModel().getValueAt(Fila_Seleccionada, 2).toString());
            VistaAdmin.txtCONTRASEÑA_PACIENTE.setText(VistaAdmin.TABLA_PACIENTES.getModel().getValueAt(Fila_Seleccionada, 3).toString());
            VistaAdmin.txtNACIMIENTO_PACIENTE.setText(VistaAdmin.TABLA_PACIENTES.getModel().getValueAt(Fila_Seleccionada, 4).toString());
            VistaAdmin.txtESTADO_PACIENTE.setText(VistaAdmin.TABLA_PACIENTES.getModel().getValueAt(Fila_Seleccionada, 5).toString());
            VistaAdmin.txtENFERMEDAD_PACIENTE.setText(VistaAdmin.TABLA_PACIENTES.getModel().getValueAt(Fila_Seleccionada, 6).toString());
        }
        if (tipoUsuario.equals("Medico")) {
            //Guardamos el index de la fila seleccionada
            int Fila_Seleccionada = VistaAdmin.TABLA_MEDICOS.getSelectedRow();

            //Mandamos los textos de los registros de la tabla a los cuadros de texto
            VistaAdmin.txtID_MEDICO.setText(VistaAdmin.TABLA_MEDICOS.getModel().getValueAt(Fila_Seleccionada, 0).toString());
            VistaAdmin.txtCEDULA_MEDICO.setText(VistaAdmin.TABLA_MEDICOS.getModel().getValueAt(Fila_Seleccionada, 1).toString());
            VistaAdmin.txtNOMBRES_MEDICO.setText(VistaAdmin.TABLA_MEDICOS.getModel().getValueAt(Fila_Seleccionada, 2).toString());
            VistaAdmin.txtAPELLIDOS_MEDICO.setText(VistaAdmin.TABLA_MEDICOS.getModel().getValueAt(Fila_Seleccionada, 3).toString());
            VistaAdmin.txtCONTRASEÑA_MEDICO.setText(VistaAdmin.TABLA_MEDICOS.getModel().getValueAt(Fila_Seleccionada, 4).toString());
            VistaAdmin.txtTELEFONO_MEDICO.setText(VistaAdmin.TABLA_MEDICOS.getModel().getValueAt(Fila_Seleccionada, 5).toString());
        }
        if (tipoUsuario.equals("Medicamento")) {
            JOptionPane.showMessageDialog(null, "Presionaste Editar Medicamento");
            //Guardamos el index de la fila seleccionada
            int Fila_Seleccionada = VistaAdmin.TABLA_MEDICAMENTOS.getSelectedRow();
            //Mandamos los textos de los registros de la tabla a los cuadros de texto
            VistaAdmin.txt_IDMEDICAMENTO.setText(VistaAdmin.TABLA_MEDICAMENTOS.getModel().getValueAt(Fila_Seleccionada, 0).toString());
            VistaAdmin.txt_NOMBRE_MEDICAMENTO.setText(VistaAdmin.TABLA_MEDICAMENTOS.getModel().getValueAt(Fila_Seleccionada, 1).toString());
            VistaAdmin.txt_LABORATORIO_MEDICAMENTO.setText(VistaAdmin.TABLA_MEDICAMENTOS.getModel().getValueAt(Fila_Seleccionada, 2).toString());
        }
    }
   
    
    /**********************************Carga de tablas**************************************************/
    public void cargarPacientes (){
        VistaAdmin.TABLA_PACIENTES.setModel(ModeloPacDAO.CargarPacientes());
    }
    public void cargarMedicos (){
        VistaAdmin.TABLA_MEDICOS.setModel(ModeloMedDAO.CargarMedicos());
    }
    public void cargarMedicamentos (){
        VistaAdmin.TABLA_MEDICAMENTOS.setModel(ModeloMedicamDAO.CargarMedicamentos());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
    /************************************************************Eventos Pacientes *************************************************************/
        Modelo_Paciente Paciente = new Modelo_Paciente();
        //Boton Agregar Paciente
        if (e.getSource()==VistaAdmin.btn_AGREGAR_PACIENTES) {
            JOptionPane.showMessageDialog(null, "Presionaste Agregar Paciente");
            
            //Verificando campos llenos
            if (verificaCampos("Paciente")==true) {
                JOptionPane.showMessageDialog(null, "Pase el metodo de verificacion de campos vacios");
                
                //Creacion de variables para los metodos posteriores
                int cedula_nuevo=Integer.parseInt(VistaAdmin.txtCEDULA_PACIENTE.getText());
                String nombre_nuevo=VistaAdmin.txtNOMBRE_PACIENTE.getText();
                String apellido_nuevo=VistaAdmin.txtAPELLIDO_PACIENTE.getText();
                String contraseña_nuevo=VistaAdmin.txtCONTRASEÑA_PACIENTE.getText();
                String nacimiento_nuevo=VistaAdmin.txtNACIMIENTO_PACIENTE.getText();
                String estado_nuevo=VistaAdmin.txtESTADO_PACIENTE.getText();
                String enfermedad_nuevo=VistaAdmin.txtENFERMEDAD_PACIENTE.getText();
                
                
                //Verificando Existencia
                Paciente = ModeloPacDAO.consultaExistencia(cedula_nuevo);
                JOptionPane.showMessageDialog(null, "Este es el valor de paciente por el metodo de paciente DAO \n"+Paciente);
                
                if (Paciente!=null) { //Si existe el paciente
                   JOptionPane.showMessageDialog(null, "El paciente existe");
                   
                    //Verificando Edición
                    int opcion_editar=JOptionPane.showConfirmDialog(null, "¿Dese modificar dicho registro?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                        //Si, quiero editarlo
                        if (opcion_editar==JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(null, "Escogiste que si");
                            //Borrando
                            JOptionPane.showMessageDialog(null, "Entrando a borrar");
                            Paciente=ModeloPacDAO.eliminar(cedula_nuevo);
                            cargarPacientes();
                            //Agregando
                            JOptionPane.showMessageDialog(null, "Agregando el registro");
                            Paciente=ModeloPacDAO.agregar(cedula_nuevo, nombre_nuevo, apellido_nuevo, contraseña_nuevo, nacimiento_nuevo, estado_nuevo, enfermedad_nuevo);
                            cargarPacientes();
                        }

                        //No, no quiero editarlo
                        if (opcion_editar==JOptionPane.NO_OPTION) {
                            JOptionPane.showMessageDialog(null, "Escogiste que no");
                        }
                }

                else if (Paciente==null) { //No existe el paciente
                    JOptionPane.showMessageDialog(null, "El paciente NO existe");
                    JOptionPane.showMessageDialog(null, "Agregando el registro");
                    Paciente=ModeloPacDAO.agregar(cedula_nuevo, nombre_nuevo, apellido_nuevo, contraseña_nuevo, nacimiento_nuevo, estado_nuevo, enfermedad_nuevo);
                    cargarPacientes();
                }
            } 
        }
        //Boton Editar Paciente
        if (e.getSource()==VistaAdmin.btn_EDITAR_PACIENTES) {
            editar("Paciente");
        }
        //Boton Eliminar Paciente
        if (e.getSource()==VistaAdmin.btn_ELIMINAR_PACIENTES) {
            //Guardamos el index de la fila seleccionada
            int Fila_Seleccionada = 0;
            //En caso de que no se haya seleccionado ninguna fila, el método devolverá -1 y con eso podremos hacer el condicional posterior.
            Fila_Seleccionada =VistaAdmin.TABLA_PACIENTES.getSelectedRow();
            if (Fila_Seleccionada ==-1) {
                JOptionPane.showMessageDialog(null, "Escoja un registro de la tabla");
            } else if (Fila_Seleccionada !=-1) {
                String cedula_nueva= VistaAdmin.TABLA_PACIENTES.getModel().getValueAt(Fila_Seleccionada, 0).toString();
                Paciente=ModeloPacDAO.eliminar(Integer.parseInt(cedula_nueva));
                cargarPacientes();
            } 
        }
        
    /************************************************************Eventos Medicos*************************************************************/
        Modelo_Medico Medico = new Modelo_Medico();
        
        //Boton Agregar Medicos
        if (e.getSource()==VistaAdmin.btnAGREGAR_MEDICO) {
            JOptionPane.showMessageDialog(null, "Presionaste Agregar Medico");
            
                //Verificando campos llenos
            if (verificaCampos("Medico")==true) {
                JOptionPane.showMessageDialog(null, "Pase el metodo de verificacion de campos vacios");

                //Creacion de variables para los metodos posteriores
                int idmedico_nuevo=Integer.parseInt(VistaAdmin.txtID_MEDICO.getText());
                String cedula_nuevo=VistaAdmin.txtCEDULA_MEDICO.getText();
                String nombre_nuevo=VistaAdmin.txtNOMBRES_MEDICO.getText();
                String apellido_nuevo=VistaAdmin.txtAPELLIDOS_MEDICO.getText();
                String contraseña_nuevo=VistaAdmin.txtCONTRASEÑA_MEDICO.getText();
                String telefono_nuevo=VistaAdmin.txtTELEFONO_MEDICO.getText();

                //Verificando Existencia
                Medico = ModeloMedDAO.consultaExistencia(idmedico_nuevo);
                JOptionPane.showMessageDialog(null, "Este es el valor de medico por el metodo de medico DAO \n"+Medico);

                if (Medico!=null) { //Si existe el medico
                   JOptionPane.showMessageDialog(null, "El medico existe");

                    //Verificando Edición
                    int opcion_editar=JOptionPane.showConfirmDialog(null, "¿Dese modificar dicho registro?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                        //Si, quiero editarlo
                        if (opcion_editar==JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(null, "Escogiste que si");
                            //Borrando
                            JOptionPane.showMessageDialog(null, "Entrando a borrar");
                            Medico=ModeloMedDAO.eliminar(idmedico_nuevo);
                            
                            //Agregando
                            JOptionPane.showMessageDialog(null, "Agregando el registro");
                            Medico=ModeloMedDAO.agregar(idmedico_nuevo, cedula_nuevo, nombre_nuevo, apellido_nuevo, contraseña_nuevo, telefono_nuevo);
                            cargarMedicos();
                        }

                        //No, no quiero editarlo
                        if (opcion_editar==JOptionPane.NO_OPTION) {
                            JOptionPane.showMessageDialog(null, "Escogiste que no");
                        }
                }

                else if (Medico==null) { //No existe el medico
                    JOptionPane.showMessageDialog(null, "El medico NO existe");
                    JOptionPane.showMessageDialog(null, "Agregando el registro");
                    Medico=ModeloMedDAO.agregar(idmedico_nuevo, cedula_nuevo, nombre_nuevo, apellido_nuevo, contraseña_nuevo, telefono_nuevo);
                    cargarMedicos();
                }
            } 
            
        }
        //Boton Editar Medico
        if (e.getSource()==VistaAdmin.btnEDITAR_MEDICO) {
            editar("Medico");
        }
        //Boton Eliminar Medico
        if (e.getSource()==VistaAdmin.btnELIMINAR_MEDICO) {
            //Guardamos el index de la fila seleccionada
            int Fila_Seleccionada = 0;
            //En caso de que no se haya seleccionado ninguna fila, el método devolverá -1 y con eso podremos hacer el condicional posterior.
            Fila_Seleccionada =VistaAdmin.TABLA_MEDICOS.getSelectedRow();
            if (Fila_Seleccionada ==-1) {
                JOptionPane.showMessageDialog(null, "Escoja un registro de la tabla");
            } else if (Fila_Seleccionada !=-1) {
                String id= VistaAdmin.TABLA_MEDICOS.getModel().getValueAt(Fila_Seleccionada, 0).toString();
                Medico=ModeloMedDAO.eliminar(Integer.parseInt(id));
                cargarMedicos();
            } 
        }
        
    /************************************************************Eventos Medicamentos*************************************************************/
    Modelo_Medicamento Medicamento = new Modelo_Medicamento();
    
        //Boton Agregar Medicamentos
        if (e.getSource()==VistaAdmin.btnAGREGAR_MEDICAMENTO) {
            JOptionPane.showMessageDialog(null, "Presionaste Agregar Medicamento");
            
            //Verificando campos llenos
            if (verificaCampos("Medicamento")==true) {
                JOptionPane.showMessageDialog(null, "Pase el metodo de verificacion de campos vacios");
                
                //Creacion de variables para los metodos posteriores
                int idmedicamento_nuevo=Integer.parseInt(VistaAdmin.txt_IDMEDICAMENTO.getText());
                String nombre_nuevo=VistaAdmin.txt_NOMBRE_MEDICAMENTO.getText();
                String laboratorio_nuevo=VistaAdmin.txt_LABORATORIO_MEDICAMENTO.getText();

                //Verificando Existencia
                Medicamento = ModeloMedicamDAO.consultaExistencia(idmedicamento_nuevo);
                JOptionPane.showMessageDialog(null, "Este es el valor de medicamento por el metodo de medicamento DAO \n"+Medicamento);

                if (Medicamento!=null) { //Si existe el medicamento
                   JOptionPane.showMessageDialog(null, "El medico existe");

                    //Verificando Edición
                    int opcion_editar=JOptionPane.showConfirmDialog(null, "¿Dese modificar dicho registro?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                        //Si, quiero editarlo
                        if (opcion_editar==JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(null, "Escogiste que si");
                            //Borrando
                            JOptionPane.showMessageDialog(null, "Entrando a borrar");
                            Medicamento=ModeloMedicamDAO.eliminar(idmedicamento_nuevo);
                            
                            //Agregando
                            JOptionPane.showMessageDialog(null, "Agregando el registro");
                            Medicamento=ModeloMedicamDAO.agregar(idmedicamento_nuevo, nombre_nuevo, laboratorio_nuevo);
                            cargarMedicamentos();
                        }

                        //No, no quiero editarlo
                        if (opcion_editar==JOptionPane.NO_OPTION) {
                            JOptionPane.showMessageDialog(null, "Escogiste que no");
                        }
                }

                else if (Medicamento==null) { //No existe el medico
                    JOptionPane.showMessageDialog(null, "El medico NO existe");
                    JOptionPane.showMessageDialog(null, "Agregando el registro");
                    Medicamento=ModeloMedicamDAO.agregar(idmedicamento_nuevo, nombre_nuevo, laboratorio_nuevo);
                    cargarMedicamentos();
                }
            } 
        }
        //Boton Editar Medicamento
        if (e.getSource()==VistaAdmin.btnEDITAR_MEDICAMENTO) {
            editar("Medicamento");
        }
        //Boton Eliminar Medicamento
        if (e.getSource()==VistaAdmin.btnELIMINAR_MEDICAMENTO) {
            editar("Medicamento");
            //Guardamos el index de la fila seleccionada
            int Fila_Seleccionada = 0;
            //En caso de que no se haya seleccionado ninguna fila, el método devolverá -1 y con eso podremos hacer el condicional posterior.
            Fila_Seleccionada =VistaAdmin.TABLA_MEDICAMENTOS.getSelectedRow();
            if (Fila_Seleccionada ==-1) {
                JOptionPane.showMessageDialog(null, "Escoja un registro de la tabla");
            } else if (Fila_Seleccionada !=-1) {
                String id= VistaAdmin.TABLA_MEDICAMENTOS.getModel().getValueAt(Fila_Seleccionada, 0).toString();
                Medicamento=ModeloMedicamDAO.eliminar(Integer.parseInt(id));
                cargarMedicamentos();
            }
        }
    }
}
