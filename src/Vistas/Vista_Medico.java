/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;
import Conexion.Conexion;
import Controlador.Controlador_Login;
import Modelo.Modelo_AdministradorDAO;
import Modelo.Modelo_MedicoDAO;
import Modelo.Modelo_PacienteDAO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import static javafx.scene.input.DataFormat.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author I'm Max
 */
public class Vista_Medico extends javax.swing.JFrame {
    DefaultTableModel model;
    /**
     * Creates new form Vista_Medico
     */
    public Vista_Medico() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../img/sena4.png")).getImage());
        LBL_CEDULA_PACIENTE_EN_MEDICO.setEditable(false);
        LBL_NOMBRE_PACIENTE_EN_MEDICO.setEditable(false);
        LBL_APELLIDO_PACIENTE_EN_MEDICO.setEditable(false);
        LBL_NACIMIENTO_PACIENTE_EN_MEDICO.setEditable(false);
        LBL_ESTADO_PACIENTE_EN_MEDICO.setEditable(false);
        LBL_ENFERMEDAD_PACIENTE_EN_MEDICO.setEditable(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PANEL_CENTRAL = new javax.swing.JPanel();
        PERFIL_MEDICO = new javax.swing.JPanel();
        LBL_LOGO = new javax.swing.JLabel();
        DATOS_PERSONALES_MEDICO = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_ID_MEDICO = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_NOMBRES_MEDICO = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_APELLIDOS_MEDICO = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_TELEFONO_MEDICO = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Separador1 = new javax.swing.JSeparator();
        LISTA_PACIENTES = new javax.swing.JPanel();
        PANEL_NORTE_LISTA_PACIENTES = new javax.swing.JPanel();
        TXT_BUSCAR_PACIENTE = new javax.swing.JTextField();
        BTN_BUSCAR_PACIENTE_EN_MEDICO = new javax.swing.JButton();
        PANEL_LISTA_PACIENTES = new javax.swing.JPanel();
        SCROLL_TABLA = new javax.swing.JScrollPane();
        TABLA_PACIENTES_DEL_MEDICO = new javax.swing.JTable();
        Separador2 = new javax.swing.JSeparator();
        PERFIL_PACIENTE = new javax.swing.JPanel();
        PANEL_NORTE_PACIENTE = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LBL_FOTO_PACIENTE = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BTN_MOSTRAR_DATOS_PACIENTE = new javax.swing.JButton();
        BTN_EDITAR_DATOS_PACIENTE = new javax.swing.JButton();
        BTN_AGREGAR_DATOS_PACIENTE2 = new javax.swing.JButton();
        DATOS_PERSONALES_MEDICO1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        LBL_CEDULA_PACIENTE_EN_MEDICO = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        LBL_NOMBRE_PACIENTE_EN_MEDICO = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        LBL_APELLIDO_PACIENTE_EN_MEDICO = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        LBL_NACIMIENTO_PACIENTE_EN_MEDICO = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        LBL_ESTADO_PACIENTE_EN_MEDICO = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        LBL_ENFERMEDAD_PACIENTE_EN_MEDICO = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        BARRA_MENU = new javax.swing.JMenuBar();
        MENU_ARCHIVO = new javax.swing.JMenu();
        ItemMn_CerrarSesion = new javax.swing.JMenuItem();
        MENU_AYUDA = new javax.swing.JMenu();
        ItemMn_Acerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Médico - Clinisoft");

        PANEL_CENTRAL.setPreferredSize(new java.awt.Dimension(1650, 790));

        PERFIL_MEDICO.setPreferredSize(new java.awt.Dimension(350, 785));

        LBL_LOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/doctor2.png"))); // NOI18N
        LBL_LOGO.setPreferredSize(new java.awt.Dimension(320, 300));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel1.setText("ID Médico");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lbl_ID_MEDICO.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lbl_ID_MEDICO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ID_MEDICO.setText("ID DEL MEDICO");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel2.setText("Nombres");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lbl_NOMBRES_MEDICO.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lbl_NOMBRES_MEDICO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NOMBRES_MEDICO.setText("NOMBRE DEL MEDICO");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setText("Apellidos");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lbl_APELLIDOS_MEDICO.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lbl_APELLIDOS_MEDICO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_APELLIDOS_MEDICO.setText("APELLIDO DEL MEDICO");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setText("Teléfono");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lbl_TELEFONO_MEDICO.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lbl_TELEFONO_MEDICO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TELEFONO_MEDICO.setText("TELEFONO DEL MEDICO");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText(" Todos los derechos reservador por Copyright  © 2019");

        javax.swing.GroupLayout DATOS_PERSONALES_MEDICOLayout = new javax.swing.GroupLayout(DATOS_PERSONALES_MEDICO);
        DATOS_PERSONALES_MEDICO.setLayout(DATOS_PERSONALES_MEDICOLayout);
        DATOS_PERSONALES_MEDICOLayout.setHorizontalGroup(
            DATOS_PERSONALES_MEDICOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lbl_ID_MEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lbl_NOMBRES_MEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lbl_APELLIDOS_MEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lbl_TELEFONO_MEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        DATOS_PERSONALES_MEDICOLayout.setVerticalGroup(
            DATOS_PERSONALES_MEDICOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DATOS_PERSONALES_MEDICOLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl_ID_MEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl_NOMBRES_MEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl_APELLIDOS_MEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl_TELEFONO_MEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout PERFIL_MEDICOLayout = new javax.swing.GroupLayout(PERFIL_MEDICO);
        PERFIL_MEDICO.setLayout(PERFIL_MEDICOLayout);
        PERFIL_MEDICOLayout.setHorizontalGroup(
            PERFIL_MEDICOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LBL_LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(DATOS_PERSONALES_MEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PERFIL_MEDICOLayout.setVerticalGroup(
            PERFIL_MEDICOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PERFIL_MEDICOLayout.createSequentialGroup()
                .addComponent(LBL_LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(DATOS_PERSONALES_MEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Separador1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Separador1.setPreferredSize(new java.awt.Dimension(2, 600));

        LISTA_PACIENTES.setPreferredSize(new java.awt.Dimension(750, 785));

        PANEL_NORTE_LISTA_PACIENTES.setPreferredSize(new java.awt.Dimension(750, 50));
        PANEL_NORTE_LISTA_PACIENTES.setLayout(new java.awt.BorderLayout());

        TXT_BUSCAR_PACIENTE.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        PANEL_NORTE_LISTA_PACIENTES.add(TXT_BUSCAR_PACIENTE, java.awt.BorderLayout.CENTER);

        BTN_BUSCAR_PACIENTE_EN_MEDICO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/lupa.png"))); // NOI18N
        PANEL_NORTE_LISTA_PACIENTES.add(BTN_BUSCAR_PACIENTE_EN_MEDICO, java.awt.BorderLayout.EAST);

        PANEL_LISTA_PACIENTES.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N

        TABLA_PACIENTES_DEL_MEDICO = new javax.swing.JTable(){
            public boolean isCellEditable (int row, int colIndex){
                return false;
            }
        };
        TABLA_PACIENTES_DEL_MEDICO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombres", "Apellidos", "Fecha de Nacimiento", "Estado", "Enfermedad"
            }
        ));
        TABLA_PACIENTES_DEL_MEDICO.setFocusable(false);
        SCROLL_TABLA.setViewportView(TABLA_PACIENTES_DEL_MEDICO);

        javax.swing.GroupLayout PANEL_LISTA_PACIENTESLayout = new javax.swing.GroupLayout(PANEL_LISTA_PACIENTES);
        PANEL_LISTA_PACIENTES.setLayout(PANEL_LISTA_PACIENTESLayout);
        PANEL_LISTA_PACIENTESLayout.setHorizontalGroup(
            PANEL_LISTA_PACIENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
            .addGroup(PANEL_LISTA_PACIENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_LISTA_PACIENTESLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(SCROLL_TABLA, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PANEL_LISTA_PACIENTESLayout.setVerticalGroup(
            PANEL_LISTA_PACIENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(PANEL_LISTA_PACIENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PANEL_LISTA_PACIENTESLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(SCROLL_TABLA, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout LISTA_PACIENTESLayout = new javax.swing.GroupLayout(LISTA_PACIENTES);
        LISTA_PACIENTES.setLayout(LISTA_PACIENTESLayout);
        LISTA_PACIENTESLayout.setHorizontalGroup(
            LISTA_PACIENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PANEL_NORTE_LISTA_PACIENTES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(PANEL_LISTA_PACIENTES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        LISTA_PACIENTESLayout.setVerticalGroup(
            LISTA_PACIENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LISTA_PACIENTESLayout.createSequentialGroup()
                .addComponent(PANEL_NORTE_LISTA_PACIENTES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PANEL_LISTA_PACIENTES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Separador2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Separador2.setPreferredSize(new java.awt.Dimension(2, 600));

        PERFIL_PACIENTE.setPreferredSize(new java.awt.Dimension(480, 785));

        PANEL_NORTE_PACIENTE.setPreferredSize(new java.awt.Dimension(580, 200));
        PANEL_NORTE_PACIENTE.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        LBL_FOTO_PACIENTE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_FOTO_PACIENTE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/paciente2.png"))); // NOI18N
        jPanel1.add(LBL_FOTO_PACIENTE);

        PANEL_NORTE_PACIENTE.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridLayout(3, 1));

        BTN_MOSTRAR_DATOS_PACIENTE.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BTN_MOSTRAR_DATOS_PACIENTE.setText("Ver Datos del Paciente");
        jPanel2.add(BTN_MOSTRAR_DATOS_PACIENTE);

        BTN_EDITAR_DATOS_PACIENTE.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BTN_EDITAR_DATOS_PACIENTE.setText("Editar Paciente");
        jPanel2.add(BTN_EDITAR_DATOS_PACIENTE);

        BTN_AGREGAR_DATOS_PACIENTE2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BTN_AGREGAR_DATOS_PACIENTE2.setText("Guardar Edición");
        jPanel2.add(BTN_AGREGAR_DATOS_PACIENTE2);

        PANEL_NORTE_PACIENTE.add(jPanel2, java.awt.BorderLayout.EAST);

        DATOS_PERSONALES_MEDICO1.setLayout(new java.awt.GridLayout(13, 0));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel12.setText("Cédula");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        DATOS_PERSONALES_MEDICO1.add(jLabel12);

        LBL_CEDULA_PACIENTE_EN_MEDICO.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        DATOS_PERSONALES_MEDICO1.add(LBL_CEDULA_PACIENTE_EN_MEDICO);

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel14.setText("Nombres");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        DATOS_PERSONALES_MEDICO1.add(jLabel14);

        LBL_NOMBRE_PACIENTE_EN_MEDICO.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        DATOS_PERSONALES_MEDICO1.add(LBL_NOMBRE_PACIENTE_EN_MEDICO);

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setText("Apellidos");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        DATOS_PERSONALES_MEDICO1.add(jLabel16);

        LBL_APELLIDO_PACIENTE_EN_MEDICO.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        DATOS_PERSONALES_MEDICO1.add(LBL_APELLIDO_PACIENTE_EN_MEDICO);

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel18.setText("Fecha de Nacimiento");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        DATOS_PERSONALES_MEDICO1.add(jLabel18);

        LBL_NACIMIENTO_PACIENTE_EN_MEDICO.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        DATOS_PERSONALES_MEDICO1.add(LBL_NACIMIENTO_PACIENTE_EN_MEDICO);

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel20.setText("Estado");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        DATOS_PERSONALES_MEDICO1.add(jLabel20);

        LBL_ESTADO_PACIENTE_EN_MEDICO.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        DATOS_PERSONALES_MEDICO1.add(LBL_ESTADO_PACIENTE_EN_MEDICO);

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel23.setText("Enfermedad");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        DATOS_PERSONALES_MEDICO1.add(jLabel23);

        LBL_ENFERMEDAD_PACIENTE_EN_MEDICO.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        DATOS_PERSONALES_MEDICO1.add(LBL_ENFERMEDAD_PACIENTE_EN_MEDICO);

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText(" Todos los derechos reservador por Copyright  © 2019");
        DATOS_PERSONALES_MEDICO1.add(jLabel22);

        javax.swing.GroupLayout PERFIL_PACIENTELayout = new javax.swing.GroupLayout(PERFIL_PACIENTE);
        PERFIL_PACIENTE.setLayout(PERFIL_PACIENTELayout);
        PERFIL_PACIENTELayout.setHorizontalGroup(
            PERFIL_PACIENTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PANEL_NORTE_PACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(DATOS_PERSONALES_MEDICO1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PERFIL_PACIENTELayout.setVerticalGroup(
            PERFIL_PACIENTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PERFIL_PACIENTELayout.createSequentialGroup()
                .addComponent(PANEL_NORTE_PACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(DATOS_PERSONALES_MEDICO1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout PANEL_CENTRALLayout = new javax.swing.GroupLayout(PANEL_CENTRAL);
        PANEL_CENTRAL.setLayout(PANEL_CENTRALLayout);
        PANEL_CENTRALLayout.setHorizontalGroup(
            PANEL_CENTRALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_CENTRALLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(PERFIL_MEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(LISTA_PACIENTES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(PERFIL_PACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PANEL_CENTRALLayout.setVerticalGroup(
            PANEL_CENTRALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_CENTRALLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(PERFIL_MEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PANEL_CENTRALLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PANEL_CENTRALLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(LISTA_PACIENTES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PANEL_CENTRALLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PANEL_CENTRALLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(PERFIL_PACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MENU_ARCHIVO.setText("Archivo");
        MENU_ARCHIVO.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        ItemMn_CerrarSesion.setText("Cerrar Sesión");
        ItemMn_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMn_CerrarSesionActionPerformed(evt);
            }
        });
        MENU_ARCHIVO.add(ItemMn_CerrarSesion);

        BARRA_MENU.add(MENU_ARCHIVO);

        MENU_AYUDA.setText("Ayuda");
        MENU_AYUDA.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        ItemMn_Acerca.setText("Acerca de");
        ItemMn_Acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMn_AcercaActionPerformed(evt);
            }
        });
        MENU_AYUDA.add(ItemMn_Acerca);

        BARRA_MENU.add(MENU_AYUDA);

        setJMenuBar(BARRA_MENU);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PANEL_CENTRAL, javax.swing.GroupLayout.PREFERRED_SIZE, 1656, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(PANEL_CENTRAL, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemMn_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMn_CerrarSesionActionPerformed
        Vista_Login VistaL = new Vista_Login();
        Modelo_AdministradorDAO ModeloAdmin = new Modelo_AdministradorDAO();
        Modelo_MedicoDAO ModeloMed= new Modelo_MedicoDAO();
        Modelo_PacienteDAO ModeloPac= new Modelo_PacienteDAO();
        Controlador_Login ControladorL = new Controlador_Login(VistaL, ModeloAdmin, ModeloMed, ModeloPac);
        VistaL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ItemMn_CerrarSesionActionPerformed

    private void ItemMn_AcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMn_AcercaActionPerformed
        JOptionPane.showMessageDialog(null, "Este Software fue elaborado como desarrollo de guía de aprendizaje SENA. \n"
                + "Elaborado Por: \n"
                + "Jesus Herrera \n"
                + "Max Jimenez \n"
                + "Richard Vidal", "Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_ItemMn_AcercaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Medico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BARRA_MENU;
    public javax.swing.JButton BTN_AGREGAR_DATOS_PACIENTE2;
    public javax.swing.JButton BTN_BUSCAR_PACIENTE_EN_MEDICO;
    public javax.swing.JButton BTN_EDITAR_DATOS_PACIENTE;
    public javax.swing.JButton BTN_MOSTRAR_DATOS_PACIENTE;
    private javax.swing.JPanel DATOS_PERSONALES_MEDICO;
    private javax.swing.JPanel DATOS_PERSONALES_MEDICO1;
    private javax.swing.JMenuItem ItemMn_Acerca;
    private javax.swing.JMenuItem ItemMn_CerrarSesion;
    public javax.swing.JTextField LBL_APELLIDO_PACIENTE_EN_MEDICO;
    public javax.swing.JTextField LBL_CEDULA_PACIENTE_EN_MEDICO;
    public javax.swing.JTextField LBL_ENFERMEDAD_PACIENTE_EN_MEDICO;
    public javax.swing.JTextField LBL_ESTADO_PACIENTE_EN_MEDICO;
    private javax.swing.JLabel LBL_FOTO_PACIENTE;
    private javax.swing.JLabel LBL_LOGO;
    public javax.swing.JTextField LBL_NACIMIENTO_PACIENTE_EN_MEDICO;
    public javax.swing.JTextField LBL_NOMBRE_PACIENTE_EN_MEDICO;
    private javax.swing.JPanel LISTA_PACIENTES;
    private javax.swing.JMenu MENU_ARCHIVO;
    private javax.swing.JMenu MENU_AYUDA;
    private javax.swing.JPanel PANEL_CENTRAL;
    private javax.swing.JPanel PANEL_LISTA_PACIENTES;
    private javax.swing.JPanel PANEL_NORTE_LISTA_PACIENTES;
    private javax.swing.JPanel PANEL_NORTE_PACIENTE;
    private javax.swing.JPanel PERFIL_MEDICO;
    private javax.swing.JPanel PERFIL_PACIENTE;
    private javax.swing.JScrollPane SCROLL_TABLA;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    public javax.swing.JTable TABLA_PACIENTES_DEL_MEDICO;
    public javax.swing.JTextField TXT_BUSCAR_PACIENTE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lbl_APELLIDOS_MEDICO;
    public javax.swing.JLabel lbl_ID_MEDICO;
    public javax.swing.JLabel lbl_NOMBRES_MEDICO;
    public javax.swing.JLabel lbl_TELEFONO_MEDICO;
    // End of variables declaration//GEN-END:variables

    private void buscarPaciente() {
        
    }
}
