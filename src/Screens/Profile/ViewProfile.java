/*
 cSpell:ignore Ubicacion
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens.Profile;

import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JLabel;

import Code.Conexion;

/**
 *
 * @author tutaa
 */
public class ViewProfile extends javax.swing.JFrame {
        public static int idUsuarioMostrar;

        /**
         * Creates new form ViewProfile
         */
        public ViewProfile() {
                initComponents();

                this.setResizable(false);
                this.setLocationRelativeTo(null);

                this.setIconImage(Toolkit.getDefaultToolkit()
                                .getImage(getClass().getResource("/img/icon.png")));
                ponerInformacion();

        }

        public static String obtenerAño() {
                return String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
        }

        public static void ponerTextoEtiqueta(JLabel label, String texto) {
                label.setText(texto);
        }

        public void ponerInformacion() {
                try {
                        var datos = Conexion.seleccionar(String.format("SELECT * FROM usuarios where id_usuario = %d",
                                        idUsuarioMostrar),
                                        new String[] { "nombre", "correo", "departamento", "ciudad", "edad",
                                                        "seguidores",
                                                        "biografia" });

                        lbPonerNombre.setText((String) datos.get(0).get(0));
                        lbPonerCorreo.setText((String) datos.get(0).get(1));
                        lbPonerUbicacion.setText(
                                        ((String) datos.get(0).get(3)) + " - " + ((String) datos.get(0).get(2)));

                        lbPonerEdad.setText(datos.get(0).get(4) + " años");
                        lbPonerSeguidores.setText(datos.get(0).get(5) + " Seguidores");
                        txtMostrarBiografia.setText((String) datos.get(0).get(6));

                        this.setTitle((String) datos.get(0).get(0));
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                ventanaMostrarIncidente = new javax.swing.JPanel();
                lbPonerUbicacion = new javax.swing.JLabel();
                lbPonerSeguidores = new javax.swing.JLabel();
                lbPonerNombre = new javax.swing.JLabel();
                lbPonerEdad = new javax.swing.JLabel();
                lbPonerCorreo = new javax.swing.JLabel();
                lbBiografía = new javax.swing.JLabel();
                scrollPonerBiografia = new Screens.Principal.Custom.ScrollPaneWin11();
                txtMostrarBiografia = new javax.swing.JTextArea();
                btnSalir = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                ventanaMostrarIncidente.setBackground(new java.awt.Color(22, 22, 26));
                ventanaMostrarIncidente.setPreferredSize(new java.awt.Dimension(1080, 720));
                ventanaMostrarIncidente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                lbPonerUbicacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                lbPonerUbicacion.setForeground(new java.awt.Color(148, 161, 178));
                lbPonerUbicacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lbPonerUbicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/marcador.png"))); // NOI18N
                lbPonerUbicacion.setText("-");
                ventanaMostrarIncidente.add(lbPonerUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, -1));

                lbPonerSeguidores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                lbPonerSeguidores.setForeground(new java.awt.Color(148, 161, 178));
                lbPonerSeguidores.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                lbPonerSeguidores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seguidores.png"))); // NOI18N
                lbPonerSeguidores.setText("-");
                ventanaMostrarIncidente.add(lbPonerSeguidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 170, -1));

                lbPonerNombre.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
                lbPonerNombre.setForeground(new java.awt.Color(127, 90, 240));
                lbPonerNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbPonerNombre.setText("-");
                ventanaMostrarIncidente.add(lbPonerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 500, -1));

                lbPonerEdad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                lbPonerEdad.setForeground(new java.awt.Color(148, 161, 178));
                lbPonerEdad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbPonerEdad.setText("-");
                ventanaMostrarIncidente.add(lbPonerEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 500, -1));

                lbPonerCorreo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                lbPonerCorreo.setForeground(new java.awt.Color(148, 161, 178));
                lbPonerCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbPonerCorreo.setText("-");
                ventanaMostrarIncidente.add(lbPonerCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 500, -1));

                lbBiografía.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                lbBiografía.setForeground(new java.awt.Color(255, 255, 254));
                lbBiografía.setText("BIOGRAFÍA: ");
                ventanaMostrarIncidente.add(lbBiografía, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

                txtMostrarBiografia.setEditable(false);
                txtMostrarBiografia.setBackground(new java.awt.Color(22, 22, 26));
                txtMostrarBiografia.setColumns(1);
                txtMostrarBiografia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                txtMostrarBiografia.setForeground(new java.awt.Color(148, 161, 178));
                txtMostrarBiografia.setLineWrap(true);
                txtMostrarBiografia.setRows(3);
                txtMostrarBiografia.setWrapStyleWord(true);
                txtMostrarBiografia.setBorder(null);
                txtMostrarBiografia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                txtMostrarBiografia.setFocusable(false);
                scrollPonerBiografia.setViewportView(txtMostrarBiografia);

                ventanaMostrarIncidente.add(scrollPonerBiografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 380, 150));

                btnSalir.setBackground(new java.awt.Color(127, 90, 240));
                btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                btnSalir.setForeground(new java.awt.Color(255, 255, 254));
                btnSalir.setText("Salir");
                btnSalir.setActionCommand("Ingresar");
                btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnSalir.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSalirActionPerformed(evt);
                        }
                });
                ventanaMostrarIncidente.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, -1, -1));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ventanaMostrarIncidente, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ventanaMostrarIncidente, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {
                this.setVisible(false);

        }

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(ViewProfile.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(ViewProfile.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(ViewProfile.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(ViewProfile.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(() -> {
                        new ViewProfile().setVisible(true);
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnSalir;
        private javax.swing.JLabel lbBiografía;
        private javax.swing.JLabel lbPonerCorreo;
        private javax.swing.JLabel lbPonerEdad;
        private javax.swing.JLabel lbPonerNombre;
        private javax.swing.JLabel lbPonerSeguidores;
        private javax.swing.JLabel lbPonerUbicacion;
        private javax.swing.JScrollPane scrollPonerBiografia;
        private javax.swing.JTextArea txtMostrarBiografia;
        private javax.swing.JPanel ventanaMostrarIncidente;
        // End of variables declaration//GEN-END:variables
}
