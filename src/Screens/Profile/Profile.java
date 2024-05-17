/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens.Profile;

import java.awt.Toolkit;
import java.util.Calendar;
import javax.swing.JLabel;

/**
 *
 * @author tutaa
 */
public class Profile extends javax.swing.JFrame {

	/**
	 * Creates new form Principal
	 */
	public Profile() {
		initComponents();

		this.setTitle("Ingresar");
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		this.setIconImage(Toolkit.getDefaultToolkit()
			.getImage(getClass().getResource("/img/icon.png")));

	}

	public static String obtenerAño() {
		return String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
	}

	public static void ponerTextoEtiqueta(JLabel label, String texto) {
		label.setText(texto);
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                ventanaProfile = new javax.swing.JPanel();
                panelMenu = new javax.swing.JPanel();
                imgCasa = new javax.swing.JLabel();
                imgVolver = new javax.swing.JLabel();
                imgUsuario = new javax.swing.JLabel();
                imgMenuBar = new javax.swing.JLabel();
                lbContraseña = new javax.swing.JLabel();
                btnGuardarBiografia = new javax.swing.JButton();
                btnCancelarBiografia = new javax.swing.JButton();
                lbPerfil = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                txtMostrarBiografia = new javax.swing.JTextArea();
                jScrollPane2 = new javax.swing.JScrollPane();
                tfCambiarBiografia = new javax.swing.JTextPane();
                lbBiografía = new javax.swing.JLabel();
                lbNombre = new javax.swing.JLabel();
                lbEdad = new javax.swing.JLabel();
                lbCorreo = new javax.swing.JLabel();
                lbPonerUbicacion = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                ventanaProfile.setBackground(new java.awt.Color(22, 22, 26));
                ventanaProfile.setPreferredSize(new java.awt.Dimension(1080, 720));
                ventanaProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                panelMenu.setBackground(new java.awt.Color(22, 22, 26));
                panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                imgCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/casa.png"))); // NOI18N
                imgCasa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                panelMenu.add(imgCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

                imgVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
                imgVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                panelMenu.add(imgVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

                imgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/perfilHover2.png"))); // NOI18N
                imgUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                panelMenu.add(imgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

                imgMenuBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                imgMenuBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lineaVertical.png"))); // NOI18N
                imgMenuBar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
                panelMenu.add(imgMenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

                ventanaProfile.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 230, 60, 220));

                lbContraseña.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                lbContraseña.setForeground(new java.awt.Color(255, 255, 254));
                lbContraseña.setText("CAMBIAR BIOGRAFÍA: ");
                ventanaProfile.add(lbContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));

                btnGuardarBiografia.setBackground(new java.awt.Color(127, 90, 240));
                btnGuardarBiografia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                btnGuardarBiografia.setForeground(new java.awt.Color(255, 255, 254));
                btnGuardarBiografia.setText("Guardar");
                btnGuardarBiografia.setActionCommand("Ingresar");
                btnGuardarBiografia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnGuardarBiografia.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnGuardarBiografiaActionPerformed(evt);
                        }
                });
                ventanaProfile.add(btnGuardarBiografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, -1, -1));

                btnCancelarBiografia.setBackground(new java.awt.Color(127, 90, 240));
                btnCancelarBiografia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                btnCancelarBiografia.setForeground(new java.awt.Color(255, 255, 254));
                btnCancelarBiografia.setText("Cancelar");
                btnCancelarBiografia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnCancelarBiografia.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnCancelarBiografiaActionPerformed(evt);
                        }
                });
                ventanaProfile.add(btnCancelarBiografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 650, -1, -1));

                lbPerfil.setFont(new java.awt.Font("Crabs", 1, 100)); // NOI18N
                lbPerfil.setForeground(new java.awt.Color(255, 255, 254));
                lbPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbPerfil.setText("Perfil");
                ventanaProfile.add(lbPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1080, -1));

                txtMostrarBiografia.setEditable(false);
                txtMostrarBiografia.setBackground(new java.awt.Color(22, 22, 26));
                txtMostrarBiografia.setColumns(1);
                txtMostrarBiografia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                txtMostrarBiografia.setForeground(new java.awt.Color(148, 161, 178));
                txtMostrarBiografia.setRows(3);
                txtMostrarBiografia.setBorder(null);
                txtMostrarBiografia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                txtMostrarBiografia.setFocusable(false);
                jScrollPane1.setViewportView(txtMostrarBiografia);

                ventanaProfile.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 380, 100));

                tfCambiarBiografia.setBackground(new java.awt.Color(22, 22, 26));
                tfCambiarBiografia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                tfCambiarBiografia.setForeground(new java.awt.Color(148, 161, 178));
                tfCambiarBiografia.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                tfCambiarBiografiaKeyReleased(evt);
                        }
                });
                jScrollPane2.setViewportView(tfCambiarBiografia);

                ventanaProfile.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 380, 80));

                lbBiografía.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                lbBiografía.setForeground(new java.awt.Color(255, 255, 254));
                lbBiografía.setText("BIOGRAFÍA: ");
                ventanaProfile.add(lbBiografía, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

                lbNombre.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
                lbNombre.setForeground(new java.awt.Color(148, 161, 178));
                lbNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbNombre.setText("Adrián Camilo Tuta Cortes");
                ventanaProfile.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1080, -1));

                lbEdad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                lbEdad.setForeground(new java.awt.Color(148, 161, 178));
                lbEdad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbEdad.setText("19 años");
                ventanaProfile.add(lbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1080, -1));

                lbCorreo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                lbCorreo.setForeground(new java.awt.Color(148, 161, 178));
                lbCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbCorreo.setText("camilotuta2004@gmail.com");
                ventanaProfile.add(lbCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 1080, -1));

                lbPonerUbicacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                lbPonerUbicacion.setForeground(new java.awt.Color(148, 161, 178));
                lbPonerUbicacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lbPonerUbicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/marcador.png"))); // NOI18N
                lbPonerUbicacion.setText("Chía - Cundinamarca");
                ventanaProfile.add(lbPonerUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, -1));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ventanaProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ventanaProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void btnGuardarBiografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarBiografiaActionPerformed
		// TODO add your handling code here:
        }//GEN-LAST:event_btnGuardarBiografiaActionPerformed

        private void btnCancelarBiografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBiografiaActionPerformed
		// TODO add your handling code here:
        }//GEN-LAST:event_btnCancelarBiografiaActionPerformed

        private void tfCambiarBiografiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCambiarBiografiaKeyReleased
                // TODO add your handling code here:
        }//GEN-LAST:event_tfCambiarBiografiaKeyReleased

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
			java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(() -> {
			new Profile().setVisible(true);
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnCancelarBiografia;
        private javax.swing.JButton btnGuardarBiografia;
        private javax.swing.JLabel imgCasa;
        private javax.swing.JLabel imgMenuBar;
        private javax.swing.JLabel imgUsuario;
        private javax.swing.JLabel imgVolver;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JLabel lbBiografía;
        private javax.swing.JLabel lbContraseña;
        private javax.swing.JLabel lbCorreo;
        private javax.swing.JLabel lbEdad;
        private javax.swing.JLabel lbNombre;
        private javax.swing.JLabel lbPerfil;
        private javax.swing.JLabel lbPonerUbicacion;
        private javax.swing.JPanel panelMenu;
        private javax.swing.JTextPane tfCambiarBiografia;
        private javax.swing.JTextArea txtMostrarBiografia;
        private javax.swing.JPanel ventanaProfile;
        // End of variables declaration//GEN-END:variables
}