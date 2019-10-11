/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo_MedicamentoDAO;
import Modelo.Modelo_Medico;
import Modelo.Modelo_Paciente;
import Modelo.Modelo_PacienteDAO;
import Vistas.Vista_Paciente;

/**
 *
 * @author I'm Max
 */
public class Controlador_Paciente {
    Vista_Paciente VistaPac = new Vista_Paciente();
    Modelo_PacienteDAO ModeloPacDAO = new Modelo_PacienteDAO();
    Modelo_MedicamentoDAO ModeloMedicamDAO = new Modelo_MedicamentoDAO();

    public Controlador_Paciente(Vista_Paciente VistaPac, Modelo_PacienteDAO ModeloPacDAO, Modelo_MedicamentoDAO ModeloMedicamDAO) {
        this.VistaPac =VistaPac;
        this.ModeloPacDAO=ModeloPacDAO;
        this.ModeloMedicamDAO=ModeloMedicamDAO;
    }
    
    public void Inicializar (int id_paciente){
        traerPerfil(id_paciente);
        cargarCalendario(id_paciente);
        VistaPac.setVisible(true);
        VistaPac.setResizable(false);
        VistaPac.setLocationRelativeTo(null);
    }

    private void traerPerfil(int id_paciente) {
        //Obtenemos ID del paciente
        Modelo_Paciente Paciente = new Modelo_Paciente();
        Paciente=ModeloPacDAO.consultaExistencia(id_paciente);
        
        //Colocamos los datos del medico obtenido en los Label's
        VistaPac.lbl_CEDULA_PACIENTE.setText(Integer.toString(id_paciente));
        VistaPac.lbl_NOMBRES_PACIENTE.setText(Paciente.getNombres());
        VistaPac.lbl_APELLIDOS_PACIENTE.setText(Paciente.getApellidos());
        VistaPac.lbl_NACIMIENTO_PACIENTE.setText(Paciente.getFecha_nacimiento());
        VistaPac.lbl_ESTADO_PACIENTE.setText(Paciente.getEstado());
        VistaPac.lbl_ENFERMEDAD_PACIENTE.setText(Paciente.getEnfermedad());
    }

    private void cargarCalendario(int id_paciente) {
        VistaPac.TABLA_CALENDARIO.setModel(ModeloPacDAO.CargarCalendario(id_paciente));
    }
    
    
    
}
