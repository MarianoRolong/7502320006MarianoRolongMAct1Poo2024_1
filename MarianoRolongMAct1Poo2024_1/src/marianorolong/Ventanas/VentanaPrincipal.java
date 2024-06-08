/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package marianorolong.Ventanas;

import marianorolong.Ventanas.Usuarios.VentanaUsuarios;
import marianorolong.Ventanas.Usuarios.VentanaLogin;
import marianorolong.Ventanas.Usuarios.VentanaReporteUsuarios;
import marianorolong.Ventanas.Candidatos.VentanaCandidatos;
import javax.swing.JOptionPane;
import marianorolong.Ventanas.Candidatos.VentanaReporteCandidatos;
import marianorolong.Ventanas.Castings.VentanaCasting;
import marianorolong.Ventanas.Castings.VentanaReporteCastings;
import marianorolong.base.Candidato;
import marianorolong.base.Persona;

/**
 *
 * @author maria
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanasPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        menuUsuarios = new javax.swing.JMenu();
        itemIniciarSesionUsuarios = new javax.swing.JMenuItem();
        itemAgregarUsuarios = new javax.swing.JMenuItem();
        itemConsultarUsuarios = new javax.swing.JMenuItem();
        itemDatosUsuario = new javax.swing.JMenuItem();
        itemEliminarUsuario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemReportesUsuario = new javax.swing.JMenu();
        itemReportesUsuarioTodos = new javax.swing.JMenuItem();
        itemReportesUsuarioPorNombre = new javax.swing.JMenuItem();
        itemReportesUsuarioPorTelefono = new javax.swing.JMenuItem();
        menuCandidato = new javax.swing.JMenu();
        itemAgregarCandidato = new javax.swing.JMenuItem();
        itemConsultarCandidatos = new javax.swing.JMenuItem();
        itemEditarCandidatos = new javax.swing.JMenuItem();
        itemEliminarCandidatos = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itemReportesCandidatoPorNombres = new javax.swing.JMenu();
        itemReportesCandidatoTodos = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        itemReportesCandidatoPorEdad = new javax.swing.JMenuItem();
        menuCasting = new javax.swing.JMenu();
        itemAgregarCasting = new javax.swing.JMenuItem();
        itemConsultarCasting = new javax.swing.JMenuItem();
        itemEditarCasting = new javax.swing.JMenuItem();
        itemEliminarCasting = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        itemReportesCastingPorCosto = new javax.swing.JMenu();
        itemReportesCastingPorTipo = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        itemAgregarClientes = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        itemConsultarClientes = new javax.swing.JMenuItem();
        itemEditarClientes = new javax.swing.JMenuItem();
        itemEliminarClientes = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu6 = new javax.swing.JMenu();
        itemReportesClientePorNombre = new javax.swing.JMenuItem();
        itemReportesClientePorActividad = new javax.swing.JMenuItem();
        itemAcercaDeAyuda = new javax.swing.JMenu();
        jMenuItem27 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("...GESTION DE CASTINGS");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/fonditoTodo.jpg"))); // NOI18N

        BarraMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/usuarioMenu.png"))); // NOI18N
        menuUsuarios.setText("Usuario");
        menuUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuariosActionPerformed(evt);
            }
        });

        itemIniciarSesionUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemIniciarSesionUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/key.png"))); // NOI18N
        itemIniciarSesionUsuarios.setText("Cerrar Sesion...");
        itemIniciarSesionUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIniciarSesionUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemIniciarSesionUsuarios);

        itemAgregarUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemAgregarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/agregarUsuario.png"))); // NOI18N
        itemAgregarUsuarios.setText("Agregar Usuario...");
        itemAgregarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemAgregarUsuarios);

        itemConsultarUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemConsultarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/consultarDatosUsuario.png"))); // NOI18N
        itemConsultarUsuarios.setText("Consultar Datos...");
        itemConsultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemConsultarUsuarios);

        itemDatosUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemDatosUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/editarUsuario.png"))); // NOI18N
        itemDatosUsuario.setText("Editar Datos...");
        itemDatosUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDatosUsuarioActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemDatosUsuario);

        itemEliminarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/eliminarUsuario.png"))); // NOI18N
        itemEliminarUsuario.setText("Eliminar...");
        menuUsuarios.add(itemEliminarUsuario);
        menuUsuarios.add(jSeparator1);

        itemReportesUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/reportesUsuario.png"))); // NOI18N
        itemReportesUsuario.setText("Reportes...");
        itemReportesUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemReportesUsuarioTodos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemReportesUsuarioTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/reportesUsuario.png"))); // NOI18N
        itemReportesUsuarioTodos.setText("Todos..");
        itemReportesUsuarioTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReportesUsuarioTodosActionPerformed(evt);
            }
        });
        itemReportesUsuario.add(itemReportesUsuarioTodos);

        itemReportesUsuarioPorNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemReportesUsuarioPorNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/reportesUsuario.png"))); // NOI18N
        itemReportesUsuarioPorNombre.setText("Por nombre...");
        itemReportesUsuarioPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReportesUsuarioPorNombreActionPerformed(evt);
            }
        });
        itemReportesUsuario.add(itemReportesUsuarioPorNombre);

        itemReportesUsuarioPorTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemReportesUsuarioPorTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/reportesUsuario.png"))); // NOI18N
        itemReportesUsuarioPorTelefono.setText("Por telefono..");
        itemReportesUsuarioPorTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReportesUsuarioPorTelefonoActionPerformed(evt);
            }
        });
        itemReportesUsuario.add(itemReportesUsuarioPorTelefono);

        menuUsuarios.add(itemReportesUsuario);

        BarraMenu.add(menuUsuarios);

        menuCandidato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/candidatoMenu.png"))); // NOI18N
        menuCandidato.setText("Candidato");
        menuCandidato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemAgregarCandidato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemAgregarCandidato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/agregarUsuario.png"))); // NOI18N
        itemAgregarCandidato.setText("Agregar Candidato...");
        itemAgregarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarCandidatoActionPerformed(evt);
            }
        });
        menuCandidato.add(itemAgregarCandidato);

        itemConsultarCandidatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemConsultarCandidatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/consultarDatosUsuario.png"))); // NOI18N
        itemConsultarCandidatos.setText("Consultar Candidatos...");
        menuCandidato.add(itemConsultarCandidatos);

        itemEditarCandidatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemEditarCandidatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/editarUsuario.png"))); // NOI18N
        itemEditarCandidatos.setText("Editar Candidatos...");
        itemEditarCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarCandidatosActionPerformed(evt);
            }
        });
        menuCandidato.add(itemEditarCandidatos);

        itemEliminarCandidatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemEliminarCandidatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/eliminarUsuario.png"))); // NOI18N
        itemEliminarCandidatos.setText("Eliminar Candidatos...");
        menuCandidato.add(itemEliminarCandidatos);
        menuCandidato.add(jSeparator3);

        itemReportesCandidatoPorNombres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/reportesUsuario.png"))); // NOI18N
        itemReportesCandidatoPorNombres.setText("Reportes...");
        itemReportesCandidatoPorNombres.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemReportesCandidatoTodos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemReportesCandidatoTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/reportesUsuario.png"))); // NOI18N
        itemReportesCandidatoTodos.setText("Todos...");
        itemReportesCandidatoTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReportesCandidatoTodosActionPerformed(evt);
            }
        });
        itemReportesCandidatoPorNombres.add(itemReportesCandidatoTodos);

        jMenuItem19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/reportesUsuario.png"))); // NOI18N
        jMenuItem19.setText("Por nombre...");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        itemReportesCandidatoPorNombres.add(jMenuItem19);

        itemReportesCandidatoPorEdad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemReportesCandidatoPorEdad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/reportesUsuario.png"))); // NOI18N
        itemReportesCandidatoPorEdad.setText("Por Edad...");
        itemReportesCandidatoPorEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReportesCandidatoPorEdadActionPerformed(evt);
            }
        });
        itemReportesCandidatoPorNombres.add(itemReportesCandidatoPorEdad);

        menuCandidato.add(itemReportesCandidatoPorNombres);

        BarraMenu.add(menuCandidato);

        menuCasting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/castingMenu.png"))); // NOI18N
        menuCasting.setText("Casting");
        menuCasting.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemAgregarCasting.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemAgregarCasting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/agregarUsuario.png"))); // NOI18N
        itemAgregarCasting.setText("Agregar Casting...");
        itemAgregarCasting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarCastingActionPerformed(evt);
            }
        });
        menuCasting.add(itemAgregarCasting);

        itemConsultarCasting.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemConsultarCasting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/consultarDatosUsuario.png"))); // NOI18N
        itemConsultarCasting.setText("Consultar Casting...");
        menuCasting.add(itemConsultarCasting);

        itemEditarCasting.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemEditarCasting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/editarUsuario.png"))); // NOI18N
        itemEditarCasting.setText("Editar Casting...");
        itemEditarCasting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarCastingActionPerformed(evt);
            }
        });
        menuCasting.add(itemEditarCasting);

        itemEliminarCasting.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemEliminarCasting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/eliminarUsuario.png"))); // NOI18N
        itemEliminarCasting.setText("Eliminar Casting...");
        menuCasting.add(itemEliminarCasting);
        menuCasting.add(jSeparator4);

        itemReportesCastingPorCosto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/reportesUsuario.png"))); // NOI18N
        itemReportesCastingPorCosto.setText("Reportes...");
        itemReportesCastingPorCosto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemReportesCastingPorTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemReportesCastingPorTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/reportesUsuario.png"))); // NOI18N
        itemReportesCastingPorTipo.setText("Todos..");
        itemReportesCastingPorTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReportesCastingPorTipoActionPerformed(evt);
            }
        });
        itemReportesCastingPorCosto.add(itemReportesCastingPorTipo);

        jMenuItem25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/reportesUsuario.png"))); // NOI18N
        jMenuItem25.setText("Por Costo..");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        itemReportesCastingPorCosto.add(jMenuItem25);

        menuCasting.add(itemReportesCastingPorCosto);

        BarraMenu.add(menuCasting);

        itemAgregarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/clienteMenu.png"))); // NOI18N
        itemAgregarClientes.setText("Cliente");
        itemAgregarClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/agregarUsuario.png"))); // NOI18N
        jMenuItem9.setText("Agregar Clientes...");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        itemAgregarClientes.add(jMenuItem9);

        itemConsultarClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemConsultarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/consultarDatosUsuario.png"))); // NOI18N
        itemConsultarClientes.setText("Consultar Clientes...");
        itemConsultarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarClientesActionPerformed(evt);
            }
        });
        itemAgregarClientes.add(itemConsultarClientes);

        itemEditarClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemEditarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/editarUsuario.png"))); // NOI18N
        itemEditarClientes.setText("Editar Clientes...");
        itemEditarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarClientesActionPerformed(evt);
            }
        });
        itemAgregarClientes.add(itemEditarClientes);

        itemEliminarClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemEliminarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/eliminarUsuario.png"))); // NOI18N
        itemEliminarClientes.setText("Eliminar Clientes...");
        itemAgregarClientes.add(itemEliminarClientes);
        itemAgregarClientes.add(jSeparator2);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/reportesUsuario.png"))); // NOI18N
        jMenu6.setText("Reportes...");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemReportesClientePorNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemReportesClientePorNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/reportesUsuario.png"))); // NOI18N
        itemReportesClientePorNombre.setText("Por nombre...");
        itemReportesClientePorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReportesClientePorNombreActionPerformed(evt);
            }
        });
        jMenu6.add(itemReportesClientePorNombre);

        itemReportesClientePorActividad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemReportesClientePorActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/reportesUsuario.png"))); // NOI18N
        itemReportesClientePorActividad.setText("Por Tipo de Actividad..");
        itemReportesClientePorActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReportesClientePorActividadActionPerformed(evt);
            }
        });
        jMenu6.add(itemReportesClientePorActividad);

        itemAgregarClientes.add(jMenu6);

        BarraMenu.add(itemAgregarClientes);

        itemAcercaDeAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/ayudaMenu.png"))); // NOI18N
        itemAcercaDeAyuda.setText("Ayuda");
        itemAcercaDeAyuda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marianorolong/Ventanas/iconos/consultarDatosUsuario.png"))); // NOI18N
        jMenuItem27.setText("Acerca de...");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        itemAcercaDeAyuda.add(jMenuItem27);

        BarraMenu.add(itemAcercaDeAyuda);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 1459, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemIniciarSesionUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIniciarSesionUsuariosActionPerformed
        
        
        formWindowOpened(null);
        
        
        
    }//GEN-LAST:event_itemIniciarSesionUsuariosActionPerformed

    private void itemAgregarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarUsuariosActionPerformed

    VentanaUsuarios ventana = new VentanaUsuarios(this, true);
    ventana.setLocationRelativeTo(this);
    ventana.setVisible(true);
    
    }//GEN-LAST:event_itemAgregarUsuariosActionPerformed

    private void itemDatosUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDatosUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemDatosUsuarioActionPerformed

    private void itemReportesUsuarioPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReportesUsuarioPorNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReportesUsuarioPorNombreActionPerformed

    private void itemReportesUsuarioPorTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReportesUsuarioPorTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReportesUsuarioPorTelefonoActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void itemEditarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarClientesActionPerformed

    private void itemReportesClientePorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReportesClientePorNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReportesClientePorNombreActionPerformed

    private void itemReportesClientePorActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReportesClientePorActividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReportesClientePorActividadActionPerformed

    private void itemAgregarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarCandidatoActionPerformed
      
        VentanaCandidatos ventana = new VentanaCandidatos(this, true);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
        
    }//GEN-LAST:event_itemAgregarCandidatoActionPerformed

    private void itemEditarCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarCandidatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarCandidatosActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void itemReportesCandidatoPorEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReportesCandidatoPorEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReportesCandidatoPorEdadActionPerformed

    private void itemReportesCandidatoTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReportesCandidatoTodosActionPerformed
        
           
     if(Candidato.candidatosBD == null || Candidato.candidatosBD.isEmpty()){
        JOptionPane.showMessageDialog(this, "No existen candidatos en el sistema", 
                "Resultado Negativo", JOptionPane.WARNING_MESSAGE);
        return;
                
        }
        
     VentanaReporteCandidatos ventana = new VentanaReporteCandidatos(this,true);
     ventana.setLocationRelativeTo(this);
     ventana.setVisible(true);
        
        
    }//GEN-LAST:event_itemReportesCandidatoTodosActionPerformed

    private void itemAgregarCastingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarCastingActionPerformed
        
        VentanaCasting ventana = new VentanaCasting(this, true);
    ventana.setLocationRelativeTo(this);
    ventana.setVisible(true);
    }//GEN-LAST:event_itemAgregarCastingActionPerformed

    private void itemEditarCastingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarCastingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarCastingActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void itemReportesCastingPorTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReportesCastingPorTipoActionPerformed


        VentanaReporteCastings ventana = new VentanaReporteCastings(this, true);
    ventana.setLocationRelativeTo(this);
    ventana.setVisible(true);
        
    }//GEN-LAST:event_itemReportesCastingPorTipoActionPerformed

    private void itemConsultarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarUsuariosActionPerformed

        itemAgregarUsuariosActionPerformed(evt);
    }//GEN-LAST:event_itemConsultarUsuariosActionPerformed

    private void itemConsultarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemConsultarClientesActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void itemReportesUsuarioTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReportesUsuarioTodosActionPerformed
       
     if(Persona.usuariosBD == null || Persona.usuariosBD.isEmpty()){
        JOptionPane.showMessageDialog(this, "No existen usuarios en el sistema", 
                "Resultado Negativo", JOptionPane.WARNING_MESSAGE);
        return;
                
        }
        
     VentanaReporteUsuarios ventana = new VentanaReporteUsuarios(this,true);
     ventana.setLocationRelativeTo(this);
     ventana.setVisible(true);
        
        
        
    }//GEN-LAST:event_itemReportesUsuarioTodosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    VentanaLogin ventana = new VentanaLogin(this, true);
    ventana.setLocationRelativeTo(this);
    ventana.setVisible(true);
        
        
    }//GEN-LAST:event_formWindowOpened

    private void menuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu itemAcercaDeAyuda;
    private javax.swing.JMenuItem itemAgregarCandidato;
    private javax.swing.JMenuItem itemAgregarCasting;
    private javax.swing.JMenu itemAgregarClientes;
    private javax.swing.JMenuItem itemAgregarUsuarios;
    private javax.swing.JMenuItem itemConsultarCandidatos;
    private javax.swing.JMenuItem itemConsultarCasting;
    private javax.swing.JMenuItem itemConsultarClientes;
    private javax.swing.JMenuItem itemConsultarUsuarios;
    private javax.swing.JMenuItem itemDatosUsuario;
    private javax.swing.JMenuItem itemEditarCandidatos;
    private javax.swing.JMenuItem itemEditarCasting;
    private javax.swing.JMenuItem itemEditarClientes;
    private javax.swing.JMenuItem itemEliminarCandidatos;
    private javax.swing.JMenuItem itemEliminarCasting;
    private javax.swing.JMenuItem itemEliminarClientes;
    private javax.swing.JMenuItem itemEliminarUsuario;
    private javax.swing.JMenuItem itemIniciarSesionUsuarios;
    private javax.swing.JMenuItem itemReportesCandidatoPorEdad;
    private javax.swing.JMenu itemReportesCandidatoPorNombres;
    private javax.swing.JMenuItem itemReportesCandidatoTodos;
    private javax.swing.JMenu itemReportesCastingPorCosto;
    private javax.swing.JMenuItem itemReportesCastingPorTipo;
    private javax.swing.JMenuItem itemReportesClientePorActividad;
    private javax.swing.JMenuItem itemReportesClientePorNombre;
    private javax.swing.JMenu itemReportesUsuario;
    private javax.swing.JMenuItem itemReportesUsuarioPorNombre;
    private javax.swing.JMenuItem itemReportesUsuarioPorTelefono;
    private javax.swing.JMenuItem itemReportesUsuarioTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenu menuCandidato;
    private javax.swing.JMenu menuCasting;
    private javax.swing.JMenu menuUsuarios;
    // End of variables declaration//GEN-END:variables

    
}

