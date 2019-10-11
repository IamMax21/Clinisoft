/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import Conexion.Conexion;
import Controlador.Controlador_Login;
import Modelo.Modelo_AdministradorDAO;
import Modelo.Modelo_MedicoDAO;
import Modelo.Modelo_PacienteDAO;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author I'm Max
 */
public class Vista_Administrador extends javax.swing.JFrame {
    

    /**
     * Creates new form Vista_Administrador
     */
    public Vista_Administrador() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../img/sena4.png")).getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BOX_PESTAÑAS = new javax.swing.JTabbedPane();
        PANEL_PACIENTES = new javax.swing.JPanel();
        PANEL_CENTRAL_PACIENTES = new javax.swing.JPanel();
        PANEL_DATOS_PACIENTES = new javax.swing.JPanel();
        LBL_LOGO_PACIENTES = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCEDULA_PACIENTE = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNOMBRE_PACIENTE = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtAPELLIDO_PACIENTE = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCONTRASEÑA_PACIENTE = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNACIMIENTO_PACIENTE = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtESTADO_PACIENTE = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtENFERMEDAD_PACIENTE = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        btn_AGREGAR_PACIENTES = new javax.swing.JButton();
        btn_EDITAR_PACIENTES = new javax.swing.JButton();
        btn_ELIMINAR_PACIENTES = new javax.swing.JButton();
        PANEL_LISTA_PACIENTES = new javax.swing.JPanel();
        SCROLL_TABLA_PACIENTES = new javax.swing.JScrollPane();
        TABLA_PACIENTES = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        PANEL_NORTE_PACIENTES = new javax.swing.JPanel();
        PANEL_SUR_PACIENTES = new javax.swing.JPanel();
        PANEL_WEST_PACIENTES = new javax.swing.JPanel();
        PANEL_EAST_PACIENTES = new javax.swing.JPanel();
        PANEL_MEDICOS = new javax.swing.JPanel();
        PANEL_CENTRAL_PACIENTES1 = new javax.swing.JPanel();
        PANEL_DATOS_PACIENTES1 = new javax.swing.JPanel();
        LBL_LOGO_PACIENTES1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtID_MEDICO = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtCEDULA_MEDICO = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtNOMBRES_MEDICO = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtAPELLIDOS_MEDICO = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtCONTRASEÑA_MEDICO = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtTELEFONO_MEDICO = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        btnAGREGAR_MEDICO = new javax.swing.JButton();
        btnEDITAR_MEDICO = new javax.swing.JButton();
        btnELIMINAR_MEDICO = new javax.swing.JButton();
        PANEL_LISTA_PACIENTES1 = new javax.swing.JPanel();
        SCROLL_TABLA_PACIENTES1 = new javax.swing.JScrollPane();
        TABLA_MEDICOS = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        PANEL_NORTE_PACIENTES1 = new javax.swing.JPanel();
        PANEL_SUR_PACIENTES1 = new javax.swing.JPanel();
        PANEL_WEST_PACIENTES1 = new javax.swing.JPanel();
        PANEL_EAST_PACIENTES1 = new javax.swing.JPanel();
        PANEL_MEDICAMENTOS = new javax.swing.JPanel();
        PANEL_CENTRAL_PACIENTES2 = new javax.swing.JPanel();
        PANEL_DATOS_PACIENTES2 = new javax.swing.JPanel();
        LBL_LOGO_PACIENTES2 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txt_IDMEDICAMENTO = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txt_NOMBRE_MEDICAMENTO = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txt_LABORATORIO_MEDICAMENTO = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        btnAGREGAR_MEDICAMENTO = new javax.swing.JButton();
        btnEDITAR_MEDICAMENTO = new javax.swing.JButton();
        btnELIMINAR_MEDICAMENTO = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        PANEL_LISTA_PACIENTES2 = new javax.swing.JPanel();
        SCROLL_TABLA_PACIENTES2 = new javax.swing.JScrollPane();
        TABLA_MEDICAMENTOS = new javax.swing.JTable();
        jPanel30 = new javax.swing.JPanel();
        PANEL_NORTE_PACIENTES2 = new javax.swing.JPanel();
        PANEL_SUR_PACIENTES2 = new javax.swing.JPanel();
        PANEL_WEST_PACIENTES2 = new javax.swing.JPanel();
        PANEL_EAST_PACIENTES2 = new javax.swing.JPanel();
        BARRA_MENU = new javax.swing.JMenuBar();
        Mn_ARCHIVO = new javax.swing.JMenu();
        MnItem_CerrarSesión = new javax.swing.JMenuItem();
        Mn_AYUDA = new javax.swing.JMenu();
        MnItem_Acerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador - Clinisoft");

        BOX_PESTAÑAS.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        BOX_PESTAÑAS.setPreferredSize(new java.awt.Dimension(1800, 900));

        PANEL_PACIENTES.setBackground(new java.awt.Color(255, 255, 255));
        PANEL_PACIENTES.setLayout(new java.awt.BorderLayout());

        PANEL_CENTRAL_PACIENTES.setBackground(new java.awt.Color(102, 102, 102));
        PANEL_CENTRAL_PACIENTES.setLayout(new java.awt.BorderLayout());

        PANEL_DATOS_PACIENTES.setLayout(new java.awt.BorderLayout());

        LBL_LOGO_PACIENTES.setBackground(new java.awt.Color(255, 255, 255));
        LBL_LOGO_PACIENTES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_LOGO_PACIENTES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LogoClinisoft2.png"))); // NOI18N
        LBL_LOGO_PACIENTES.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LBL_LOGO_PACIENTES.setPreferredSize(new java.awt.Dimension(400, 300));
        PANEL_DATOS_PACIENTES.add(LBL_LOGO_PACIENTES, java.awt.BorderLayout.NORTH);

        jPanel1.setLayout(new java.awt.GridLayout(8, 0));

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Cédula");
        jPanel2.add(jLabel1, java.awt.BorderLayout.NORTH);

        txtCEDULA_PACIENTE.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel2.add(txtCEDULA_PACIENTE, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Nombres");
        jPanel3.add(jLabel2, java.awt.BorderLayout.NORTH);

        txtNOMBRE_PACIENTE.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel3.add(txtNOMBRE_PACIENTE, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Apellidos");
        jPanel4.add(jLabel3, java.awt.BorderLayout.NORTH);

        txtAPELLIDO_PACIENTE.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel4.add(txtAPELLIDO_PACIENTE, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Contraseña");
        jPanel5.add(jLabel4, java.awt.BorderLayout.NORTH);

        txtCONTRASEÑA_PACIENTE.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel5.add(txtCONTRASEÑA_PACIENTE, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Fecha de Nacimiento");
        jPanel6.add(jLabel5, java.awt.BorderLayout.NORTH);

        txtNACIMIENTO_PACIENTE.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel6.add(txtNACIMIENTO_PACIENTE, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("Estado");
        jPanel7.add(jLabel6, java.awt.BorderLayout.NORTH);

        txtESTADO_PACIENTE.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel7.add(txtESTADO_PACIENTE, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Enfermedad");
        jPanel8.add(jLabel7, java.awt.BorderLayout.NORTH);

        txtENFERMEDAD_PACIENTE.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel8.add(txtENFERMEDAD_PACIENTE, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel8);

        btn_AGREGAR_PACIENTES.setBackground(new java.awt.Color(0, 123, 223));
        btn_AGREGAR_PACIENTES.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btn_AGREGAR_PACIENTES.setText("Add/Mod");
        btn_AGREGAR_PACIENTES.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_AGREGAR_PACIENTES.setPreferredSize(new java.awt.Dimension(120, 50));
        jPanel10.add(btn_AGREGAR_PACIENTES);

        btn_EDITAR_PACIENTES.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btn_EDITAR_PACIENTES.setText("Editar");
        btn_EDITAR_PACIENTES.setPreferredSize(new java.awt.Dimension(120, 50));
        jPanel10.add(btn_EDITAR_PACIENTES);

        btn_ELIMINAR_PACIENTES.setBackground(new java.awt.Color(255, 60, 50));
        btn_ELIMINAR_PACIENTES.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btn_ELIMINAR_PACIENTES.setText("Eliminar");
        btn_ELIMINAR_PACIENTES.setPreferredSize(new java.awt.Dimension(120, 50));
        jPanel10.add(btn_ELIMINAR_PACIENTES);

        jPanel1.add(jPanel10);

        PANEL_DATOS_PACIENTES.add(jPanel1, java.awt.BorderLayout.CENTER);

        PANEL_CENTRAL_PACIENTES.add(PANEL_DATOS_PACIENTES, java.awt.BorderLayout.WEST);

        PANEL_LISTA_PACIENTES.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        PANEL_LISTA_PACIENTES.setLayout(new java.awt.BorderLayout());

        TABLA_PACIENTES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombres", "Apellidos", "Contraseña", "Fecha de Nacimiento", "Estado", "Enfermedad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SCROLL_TABLA_PACIENTES.setViewportView(TABLA_PACIENTES);

        PANEL_LISTA_PACIENTES.add(SCROLL_TABLA_PACIENTES, java.awt.BorderLayout.CENTER);

        jPanel9.setPreferredSize(new java.awt.Dimension(5, 731));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
        );

        PANEL_LISTA_PACIENTES.add(jPanel9, java.awt.BorderLayout.WEST);

        PANEL_CENTRAL_PACIENTES.add(PANEL_LISTA_PACIENTES, java.awt.BorderLayout.CENTER);

        PANEL_PACIENTES.add(PANEL_CENTRAL_PACIENTES, java.awt.BorderLayout.CENTER);

        PANEL_NORTE_PACIENTES.setPreferredSize(new java.awt.Dimension(1439, 20));

        javax.swing.GroupLayout PANEL_NORTE_PACIENTESLayout = new javax.swing.GroupLayout(PANEL_NORTE_PACIENTES);
        PANEL_NORTE_PACIENTES.setLayout(PANEL_NORTE_PACIENTESLayout);
        PANEL_NORTE_PACIENTESLayout.setHorizontalGroup(
            PANEL_NORTE_PACIENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1439, Short.MAX_VALUE)
        );
        PANEL_NORTE_PACIENTESLayout.setVerticalGroup(
            PANEL_NORTE_PACIENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PANEL_PACIENTES.add(PANEL_NORTE_PACIENTES, java.awt.BorderLayout.NORTH);
        PANEL_NORTE_PACIENTES.getAccessibleContext().setAccessibleDescription("");

        PANEL_SUR_PACIENTES.setPreferredSize(new java.awt.Dimension(1439, 20));

        javax.swing.GroupLayout PANEL_SUR_PACIENTESLayout = new javax.swing.GroupLayout(PANEL_SUR_PACIENTES);
        PANEL_SUR_PACIENTES.setLayout(PANEL_SUR_PACIENTESLayout);
        PANEL_SUR_PACIENTESLayout.setHorizontalGroup(
            PANEL_SUR_PACIENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1439, Short.MAX_VALUE)
        );
        PANEL_SUR_PACIENTESLayout.setVerticalGroup(
            PANEL_SUR_PACIENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PANEL_PACIENTES.add(PANEL_SUR_PACIENTES, java.awt.BorderLayout.SOUTH);

        PANEL_WEST_PACIENTES.setPreferredSize(new java.awt.Dimension(20, 756));

        javax.swing.GroupLayout PANEL_WEST_PACIENTESLayout = new javax.swing.GroupLayout(PANEL_WEST_PACIENTES);
        PANEL_WEST_PACIENTES.setLayout(PANEL_WEST_PACIENTESLayout);
        PANEL_WEST_PACIENTESLayout.setHorizontalGroup(
            PANEL_WEST_PACIENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PANEL_WEST_PACIENTESLayout.setVerticalGroup(
            PANEL_WEST_PACIENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PANEL_PACIENTES.add(PANEL_WEST_PACIENTES, java.awt.BorderLayout.WEST);

        PANEL_EAST_PACIENTES.setPreferredSize(new java.awt.Dimension(20, 756));

        javax.swing.GroupLayout PANEL_EAST_PACIENTESLayout = new javax.swing.GroupLayout(PANEL_EAST_PACIENTES);
        PANEL_EAST_PACIENTES.setLayout(PANEL_EAST_PACIENTESLayout);
        PANEL_EAST_PACIENTESLayout.setHorizontalGroup(
            PANEL_EAST_PACIENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        PANEL_EAST_PACIENTESLayout.setVerticalGroup(
            PANEL_EAST_PACIENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );

        PANEL_PACIENTES.add(PANEL_EAST_PACIENTES, java.awt.BorderLayout.EAST);

        BOX_PESTAÑAS.addTab("Pacientes", PANEL_PACIENTES);

        PANEL_MEDICOS.setBackground(new java.awt.Color(255, 255, 255));
        PANEL_MEDICOS.setLayout(new java.awt.BorderLayout());

        PANEL_CENTRAL_PACIENTES1.setBackground(new java.awt.Color(102, 102, 102));
        PANEL_CENTRAL_PACIENTES1.setLayout(new java.awt.BorderLayout());

        PANEL_DATOS_PACIENTES1.setLayout(new java.awt.BorderLayout());

        LBL_LOGO_PACIENTES1.setBackground(new java.awt.Color(255, 255, 255));
        LBL_LOGO_PACIENTES1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_LOGO_PACIENTES1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LogoClinisoft2.png"))); // NOI18N
        LBL_LOGO_PACIENTES1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LBL_LOGO_PACIENTES1.setPreferredSize(new java.awt.Dimension(400, 300));
        PANEL_DATOS_PACIENTES1.add(LBL_LOGO_PACIENTES1, java.awt.BorderLayout.NORTH);

        jPanel11.setLayout(new java.awt.GridLayout(7, 0));

        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("ID");
        jPanel12.add(jLabel8, java.awt.BorderLayout.NORTH);

        txtID_MEDICO.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel12.add(txtID_MEDICO, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel12);

        jPanel13.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setText("Cédula");
        jPanel13.add(jLabel9, java.awt.BorderLayout.NORTH);

        txtCEDULA_MEDICO.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel13.add(txtCEDULA_MEDICO, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel13);

        jPanel14.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setText("Nombres");
        jPanel14.add(jLabel10, java.awt.BorderLayout.NORTH);

        txtNOMBRES_MEDICO.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel14.add(txtNOMBRES_MEDICO, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel14);

        jPanel15.setLayout(new java.awt.BorderLayout());

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("Apellidos");
        jPanel15.add(jLabel11, java.awt.BorderLayout.NORTH);

        txtAPELLIDOS_MEDICO.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel15.add(txtAPELLIDOS_MEDICO, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel15);

        jPanel16.setLayout(new java.awt.BorderLayout());

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setText("Contraseña");
        jPanel16.add(jLabel12, java.awt.BorderLayout.NORTH);

        txtCONTRASEÑA_MEDICO.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel16.add(txtCONTRASEÑA_MEDICO, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel16);

        jPanel17.setLayout(new java.awt.BorderLayout());

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setText("Teléfono");
        jPanel17.add(jLabel13, java.awt.BorderLayout.NORTH);

        txtTELEFONO_MEDICO.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel17.add(txtTELEFONO_MEDICO, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel17);

        btnAGREGAR_MEDICO.setBackground(new java.awt.Color(0, 123, 223));
        btnAGREGAR_MEDICO.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnAGREGAR_MEDICO.setText("Add/Mod");
        btnAGREGAR_MEDICO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAGREGAR_MEDICO.setPreferredSize(new java.awt.Dimension(120, 50));
        jPanel19.add(btnAGREGAR_MEDICO);

        btnEDITAR_MEDICO.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnEDITAR_MEDICO.setText("Editar");
        btnEDITAR_MEDICO.setPreferredSize(new java.awt.Dimension(120, 50));
        jPanel19.add(btnEDITAR_MEDICO);

        btnELIMINAR_MEDICO.setBackground(new java.awt.Color(255, 60, 50));
        btnELIMINAR_MEDICO.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnELIMINAR_MEDICO.setText("Eliminar");
        btnELIMINAR_MEDICO.setPreferredSize(new java.awt.Dimension(120, 50));
        jPanel19.add(btnELIMINAR_MEDICO);

        jPanel11.add(jPanel19);

        PANEL_DATOS_PACIENTES1.add(jPanel11, java.awt.BorderLayout.CENTER);

        PANEL_CENTRAL_PACIENTES1.add(PANEL_DATOS_PACIENTES1, java.awt.BorderLayout.WEST);

        PANEL_LISTA_PACIENTES1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Médicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        PANEL_LISTA_PACIENTES1.setLayout(new java.awt.BorderLayout());

        TABLA_MEDICOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cedula", "Nombres", "Apellidos", "Contraseña", "Telefono"
            }
        ));
        SCROLL_TABLA_PACIENTES1.setViewportView(TABLA_MEDICOS);

        PANEL_LISTA_PACIENTES1.add(SCROLL_TABLA_PACIENTES1, java.awt.BorderLayout.CENTER);

        jPanel20.setPreferredSize(new java.awt.Dimension(5, 731));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
        );

        PANEL_LISTA_PACIENTES1.add(jPanel20, java.awt.BorderLayout.WEST);

        PANEL_CENTRAL_PACIENTES1.add(PANEL_LISTA_PACIENTES1, java.awt.BorderLayout.CENTER);

        PANEL_MEDICOS.add(PANEL_CENTRAL_PACIENTES1, java.awt.BorderLayout.CENTER);

        PANEL_NORTE_PACIENTES1.setPreferredSize(new java.awt.Dimension(1439, 20));

        javax.swing.GroupLayout PANEL_NORTE_PACIENTES1Layout = new javax.swing.GroupLayout(PANEL_NORTE_PACIENTES1);
        PANEL_NORTE_PACIENTES1.setLayout(PANEL_NORTE_PACIENTES1Layout);
        PANEL_NORTE_PACIENTES1Layout.setHorizontalGroup(
            PANEL_NORTE_PACIENTES1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1439, Short.MAX_VALUE)
        );
        PANEL_NORTE_PACIENTES1Layout.setVerticalGroup(
            PANEL_NORTE_PACIENTES1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PANEL_MEDICOS.add(PANEL_NORTE_PACIENTES1, java.awt.BorderLayout.NORTH);

        PANEL_SUR_PACIENTES1.setPreferredSize(new java.awt.Dimension(1439, 20));

        javax.swing.GroupLayout PANEL_SUR_PACIENTES1Layout = new javax.swing.GroupLayout(PANEL_SUR_PACIENTES1);
        PANEL_SUR_PACIENTES1.setLayout(PANEL_SUR_PACIENTES1Layout);
        PANEL_SUR_PACIENTES1Layout.setHorizontalGroup(
            PANEL_SUR_PACIENTES1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1439, Short.MAX_VALUE)
        );
        PANEL_SUR_PACIENTES1Layout.setVerticalGroup(
            PANEL_SUR_PACIENTES1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PANEL_MEDICOS.add(PANEL_SUR_PACIENTES1, java.awt.BorderLayout.SOUTH);

        PANEL_WEST_PACIENTES1.setPreferredSize(new java.awt.Dimension(20, 756));

        javax.swing.GroupLayout PANEL_WEST_PACIENTES1Layout = new javax.swing.GroupLayout(PANEL_WEST_PACIENTES1);
        PANEL_WEST_PACIENTES1.setLayout(PANEL_WEST_PACIENTES1Layout);
        PANEL_WEST_PACIENTES1Layout.setHorizontalGroup(
            PANEL_WEST_PACIENTES1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PANEL_WEST_PACIENTES1Layout.setVerticalGroup(
            PANEL_WEST_PACIENTES1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PANEL_MEDICOS.add(PANEL_WEST_PACIENTES1, java.awt.BorderLayout.WEST);

        PANEL_EAST_PACIENTES1.setPreferredSize(new java.awt.Dimension(20, 756));

        javax.swing.GroupLayout PANEL_EAST_PACIENTES1Layout = new javax.swing.GroupLayout(PANEL_EAST_PACIENTES1);
        PANEL_EAST_PACIENTES1.setLayout(PANEL_EAST_PACIENTES1Layout);
        PANEL_EAST_PACIENTES1Layout.setHorizontalGroup(
            PANEL_EAST_PACIENTES1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        PANEL_EAST_PACIENTES1Layout.setVerticalGroup(
            PANEL_EAST_PACIENTES1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );

        PANEL_MEDICOS.add(PANEL_EAST_PACIENTES1, java.awt.BorderLayout.EAST);

        BOX_PESTAÑAS.addTab("Médicos", PANEL_MEDICOS);

        PANEL_MEDICAMENTOS.setBackground(new java.awt.Color(255, 255, 255));
        PANEL_MEDICAMENTOS.setLayout(new java.awt.BorderLayout());

        PANEL_CENTRAL_PACIENTES2.setBackground(new java.awt.Color(102, 102, 102));
        PANEL_CENTRAL_PACIENTES2.setLayout(new java.awt.BorderLayout());

        PANEL_DATOS_PACIENTES2.setLayout(new java.awt.BorderLayout());

        LBL_LOGO_PACIENTES2.setBackground(new java.awt.Color(255, 255, 255));
        LBL_LOGO_PACIENTES2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_LOGO_PACIENTES2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LogoClinisoft2.png"))); // NOI18N
        LBL_LOGO_PACIENTES2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LBL_LOGO_PACIENTES2.setPreferredSize(new java.awt.Dimension(400, 300));
        PANEL_DATOS_PACIENTES2.add(LBL_LOGO_PACIENTES2, java.awt.BorderLayout.NORTH);

        jPanel21.setLayout(new java.awt.GridLayout(6, 0));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel18);

        jPanel22.setLayout(new java.awt.BorderLayout());

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setText("ID del Medicamento");
        jPanel22.add(jLabel15, java.awt.BorderLayout.NORTH);

        txt_IDMEDICAMENTO.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel22.add(txt_IDMEDICAMENTO, java.awt.BorderLayout.CENTER);

        jPanel21.add(jPanel22);

        jPanel23.setLayout(new java.awt.BorderLayout());

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setText("Nombre");
        jPanel23.add(jLabel16, java.awt.BorderLayout.NORTH);

        txt_NOMBRE_MEDICAMENTO.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel23.add(txt_NOMBRE_MEDICAMENTO, java.awt.BorderLayout.CENTER);

        jPanel21.add(jPanel23);

        jPanel24.setLayout(new java.awt.BorderLayout());

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setText("Laboratorio");
        jPanel24.add(jLabel17, java.awt.BorderLayout.NORTH);

        txt_LABORATORIO_MEDICAMENTO.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel24.add(txt_LABORATORIO_MEDICAMENTO, java.awt.BorderLayout.CENTER);

        jPanel21.add(jPanel24);

        btnAGREGAR_MEDICAMENTO.setBackground(new java.awt.Color(0, 123, 223));
        btnAGREGAR_MEDICAMENTO.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnAGREGAR_MEDICAMENTO.setText("Add/Mod");
        btnAGREGAR_MEDICAMENTO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAGREGAR_MEDICAMENTO.setPreferredSize(new java.awt.Dimension(120, 50));
        jPanel29.add(btnAGREGAR_MEDICAMENTO);

        btnEDITAR_MEDICAMENTO.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnEDITAR_MEDICAMENTO.setText("Editar");
        btnEDITAR_MEDICAMENTO.setPreferredSize(new java.awt.Dimension(120, 50));
        jPanel29.add(btnEDITAR_MEDICAMENTO);

        btnELIMINAR_MEDICAMENTO.setBackground(new java.awt.Color(255, 60, 50));
        btnELIMINAR_MEDICAMENTO.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnELIMINAR_MEDICAMENTO.setText("Eliminar");
        btnELIMINAR_MEDICAMENTO.setPreferredSize(new java.awt.Dimension(120, 50));
        jPanel29.add(btnELIMINAR_MEDICAMENTO);

        jPanel21.add(jPanel29);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel31);

        PANEL_DATOS_PACIENTES2.add(jPanel21, java.awt.BorderLayout.CENTER);

        PANEL_CENTRAL_PACIENTES2.add(PANEL_DATOS_PACIENTES2, java.awt.BorderLayout.WEST);

        PANEL_LISTA_PACIENTES2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Medicamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        PANEL_LISTA_PACIENTES2.setLayout(new java.awt.BorderLayout());

        TABLA_MEDICAMENTOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Medicamento", "Nombre", "Laboratorio"
            }
        ));
        SCROLL_TABLA_PACIENTES2.setViewportView(TABLA_MEDICAMENTOS);

        PANEL_LISTA_PACIENTES2.add(SCROLL_TABLA_PACIENTES2, java.awt.BorderLayout.CENTER);

        jPanel30.setPreferredSize(new java.awt.Dimension(5, 731));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
        );

        PANEL_LISTA_PACIENTES2.add(jPanel30, java.awt.BorderLayout.WEST);

        PANEL_CENTRAL_PACIENTES2.add(PANEL_LISTA_PACIENTES2, java.awt.BorderLayout.CENTER);

        PANEL_MEDICAMENTOS.add(PANEL_CENTRAL_PACIENTES2, java.awt.BorderLayout.CENTER);

        PANEL_NORTE_PACIENTES2.setPreferredSize(new java.awt.Dimension(1439, 20));

        javax.swing.GroupLayout PANEL_NORTE_PACIENTES2Layout = new javax.swing.GroupLayout(PANEL_NORTE_PACIENTES2);
        PANEL_NORTE_PACIENTES2.setLayout(PANEL_NORTE_PACIENTES2Layout);
        PANEL_NORTE_PACIENTES2Layout.setHorizontalGroup(
            PANEL_NORTE_PACIENTES2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1439, Short.MAX_VALUE)
        );
        PANEL_NORTE_PACIENTES2Layout.setVerticalGroup(
            PANEL_NORTE_PACIENTES2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PANEL_MEDICAMENTOS.add(PANEL_NORTE_PACIENTES2, java.awt.BorderLayout.NORTH);

        PANEL_SUR_PACIENTES2.setPreferredSize(new java.awt.Dimension(1439, 20));

        javax.swing.GroupLayout PANEL_SUR_PACIENTES2Layout = new javax.swing.GroupLayout(PANEL_SUR_PACIENTES2);
        PANEL_SUR_PACIENTES2.setLayout(PANEL_SUR_PACIENTES2Layout);
        PANEL_SUR_PACIENTES2Layout.setHorizontalGroup(
            PANEL_SUR_PACIENTES2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1439, Short.MAX_VALUE)
        );
        PANEL_SUR_PACIENTES2Layout.setVerticalGroup(
            PANEL_SUR_PACIENTES2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PANEL_MEDICAMENTOS.add(PANEL_SUR_PACIENTES2, java.awt.BorderLayout.SOUTH);

        PANEL_WEST_PACIENTES2.setPreferredSize(new java.awt.Dimension(20, 756));

        javax.swing.GroupLayout PANEL_WEST_PACIENTES2Layout = new javax.swing.GroupLayout(PANEL_WEST_PACIENTES2);
        PANEL_WEST_PACIENTES2.setLayout(PANEL_WEST_PACIENTES2Layout);
        PANEL_WEST_PACIENTES2Layout.setHorizontalGroup(
            PANEL_WEST_PACIENTES2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PANEL_WEST_PACIENTES2Layout.setVerticalGroup(
            PANEL_WEST_PACIENTES2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PANEL_MEDICAMENTOS.add(PANEL_WEST_PACIENTES2, java.awt.BorderLayout.WEST);

        PANEL_EAST_PACIENTES2.setPreferredSize(new java.awt.Dimension(20, 756));

        javax.swing.GroupLayout PANEL_EAST_PACIENTES2Layout = new javax.swing.GroupLayout(PANEL_EAST_PACIENTES2);
        PANEL_EAST_PACIENTES2.setLayout(PANEL_EAST_PACIENTES2Layout);
        PANEL_EAST_PACIENTES2Layout.setHorizontalGroup(
            PANEL_EAST_PACIENTES2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        PANEL_EAST_PACIENTES2Layout.setVerticalGroup(
            PANEL_EAST_PACIENTES2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );

        PANEL_MEDICAMENTOS.add(PANEL_EAST_PACIENTES2, java.awt.BorderLayout.EAST);

        BOX_PESTAÑAS.addTab("Medicamentos", PANEL_MEDICAMENTOS);

        getContentPane().add(BOX_PESTAÑAS, java.awt.BorderLayout.CENTER);

        Mn_ARCHIVO.setText("Archivo");
        Mn_ARCHIVO.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        MnItem_CerrarSesión.setText("Cerrar Sesión");
        MnItem_CerrarSesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnItem_CerrarSesiónActionPerformed(evt);
            }
        });
        Mn_ARCHIVO.add(MnItem_CerrarSesión);

        BARRA_MENU.add(Mn_ARCHIVO);

        Mn_AYUDA.setText("Ayuda");
        Mn_AYUDA.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        MnItem_Acerca.setText("Acerca de Clinisoft");
        MnItem_Acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnItem_AcercaActionPerformed(evt);
            }
        });
        Mn_AYUDA.add(MnItem_Acerca);

        BARRA_MENU.add(Mn_AYUDA);

        setJMenuBar(BARRA_MENU);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnItem_CerrarSesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnItem_CerrarSesiónActionPerformed
        Vista_Login VistaL = new Vista_Login();
        Modelo_AdministradorDAO ModeloAdmin = new Modelo_AdministradorDAO();
        Modelo_MedicoDAO ModeloMed= new Modelo_MedicoDAO();
        Modelo_PacienteDAO ModeloPac= new Modelo_PacienteDAO();
        Controlador_Login ControladorL = new Controlador_Login(VistaL, ModeloAdmin, ModeloMed, ModeloPac);
        VistaL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MnItem_CerrarSesiónActionPerformed

    private void MnItem_AcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnItem_AcercaActionPerformed
        JOptionPane.showMessageDialog(null, "Este Software fue elaborado como desarrollo de guía de aprendizaje SENA. \n"
                + "Elaborado Por: \n"
                + "Jesus Herrera \n"
                + "Max Jimenez \n"
                + "Richard Vidal", "Acerca de", JOptionPane.INFORMATION_MESSAGE);
        
        
    }//GEN-LAST:event_MnItem_AcercaActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BARRA_MENU;
    private javax.swing.JTabbedPane BOX_PESTAÑAS;
    private javax.swing.JLabel LBL_LOGO_PACIENTES;
    private javax.swing.JLabel LBL_LOGO_PACIENTES1;
    private javax.swing.JLabel LBL_LOGO_PACIENTES2;
    private javax.swing.JMenuItem MnItem_Acerca;
    private javax.swing.JMenuItem MnItem_CerrarSesión;
    private javax.swing.JMenu Mn_ARCHIVO;
    private javax.swing.JMenu Mn_AYUDA;
    private javax.swing.JPanel PANEL_CENTRAL_PACIENTES;
    private javax.swing.JPanel PANEL_CENTRAL_PACIENTES1;
    private javax.swing.JPanel PANEL_CENTRAL_PACIENTES2;
    private javax.swing.JPanel PANEL_DATOS_PACIENTES;
    private javax.swing.JPanel PANEL_DATOS_PACIENTES1;
    private javax.swing.JPanel PANEL_DATOS_PACIENTES2;
    private javax.swing.JPanel PANEL_EAST_PACIENTES;
    private javax.swing.JPanel PANEL_EAST_PACIENTES1;
    private javax.swing.JPanel PANEL_EAST_PACIENTES2;
    private javax.swing.JPanel PANEL_LISTA_PACIENTES;
    private javax.swing.JPanel PANEL_LISTA_PACIENTES1;
    private javax.swing.JPanel PANEL_LISTA_PACIENTES2;
    private javax.swing.JPanel PANEL_MEDICAMENTOS;
    private javax.swing.JPanel PANEL_MEDICOS;
    private javax.swing.JPanel PANEL_NORTE_PACIENTES;
    private javax.swing.JPanel PANEL_NORTE_PACIENTES1;
    private javax.swing.JPanel PANEL_NORTE_PACIENTES2;
    private javax.swing.JPanel PANEL_PACIENTES;
    private javax.swing.JPanel PANEL_SUR_PACIENTES;
    private javax.swing.JPanel PANEL_SUR_PACIENTES1;
    private javax.swing.JPanel PANEL_SUR_PACIENTES2;
    private javax.swing.JPanel PANEL_WEST_PACIENTES;
    private javax.swing.JPanel PANEL_WEST_PACIENTES1;
    private javax.swing.JPanel PANEL_WEST_PACIENTES2;
    private javax.swing.JScrollPane SCROLL_TABLA_PACIENTES;
    private javax.swing.JScrollPane SCROLL_TABLA_PACIENTES1;
    private javax.swing.JScrollPane SCROLL_TABLA_PACIENTES2;
    public javax.swing.JTable TABLA_MEDICAMENTOS;
    public javax.swing.JTable TABLA_MEDICOS;
    public javax.swing.JTable TABLA_PACIENTES;
    public javax.swing.JButton btnAGREGAR_MEDICAMENTO;
    public javax.swing.JButton btnAGREGAR_MEDICO;
    public javax.swing.JButton btnEDITAR_MEDICAMENTO;
    public javax.swing.JButton btnEDITAR_MEDICO;
    public javax.swing.JButton btnELIMINAR_MEDICAMENTO;
    public javax.swing.JButton btnELIMINAR_MEDICO;
    public javax.swing.JButton btn_AGREGAR_PACIENTES;
    public javax.swing.JButton btn_EDITAR_PACIENTES;
    public javax.swing.JButton btn_ELIMINAR_PACIENTES;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JTextField txtAPELLIDOS_MEDICO;
    public javax.swing.JTextField txtAPELLIDO_PACIENTE;
    public javax.swing.JTextField txtCEDULA_MEDICO;
    public javax.swing.JTextField txtCEDULA_PACIENTE;
    public javax.swing.JTextField txtCONTRASEÑA_MEDICO;
    public javax.swing.JTextField txtCONTRASEÑA_PACIENTE;
    public javax.swing.JTextField txtENFERMEDAD_PACIENTE;
    public javax.swing.JTextField txtESTADO_PACIENTE;
    public javax.swing.JTextField txtID_MEDICO;
    public javax.swing.JTextField txtNACIMIENTO_PACIENTE;
    public javax.swing.JTextField txtNOMBRES_MEDICO;
    public javax.swing.JTextField txtNOMBRE_PACIENTE;
    public javax.swing.JTextField txtTELEFONO_MEDICO;
    public javax.swing.JTextField txt_IDMEDICAMENTO;
    public javax.swing.JTextField txt_LABORATORIO_MEDICAMENTO;
    public javax.swing.JTextField txt_NOMBRE_MEDICAMENTO;
    // End of variables declaration//GEN-END:variables
}
