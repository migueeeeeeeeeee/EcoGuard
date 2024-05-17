/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens.Singup;

import java.awt.Toolkit;
import java.util.Calendar;
import javax.swing.JLabel;

/**
 *
 * @author tutaa
 */
public class Singup extends javax.swing.JFrame {

	/**
	 * Creates new form Singup
	 */
	public Singup() {
		initComponents();

		this.setTitle("Ingresar");
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		this.setIconImage(Toolkit.getDefaultToolkit()
			.getImage(getClass().getResource("/img/icon.png")));

		ponerTextoEtiqueta(txtMostrarCopy, "©" + obtenerAño() + " EcoGuard . Todos los derechos reservados.");

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

                ventanaLogIn = new javax.swing.JPanel();
                lbContraseña = new javax.swing.JLabel();
                lbCorreo = new javax.swing.JLabel();
                pfContraseña = new javax.swing.JPasswordField();
                logoGrande = new javax.swing.JLabel();
                btnRegistrarse = new javax.swing.JButton();
                btnIngresar = new javax.swing.JButton();
                tfCorreo = new javax.swing.JTextField();
                txtMostrarCopy = new javax.swing.JLabel();
                btnErroresComunes = new javax.swing.JButton();
                jLabel8 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                ventanaLogIn.setBackground(new java.awt.Color(22, 22, 26));
                ventanaLogIn.setPreferredSize(new java.awt.Dimension(1080, 720));
                ventanaLogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                lbContraseña.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                lbContraseña.setForeground(new java.awt.Color(255, 255, 254));
                lbContraseña.setText("CONTRASEÑA: ");
                ventanaLogIn.add(lbContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

                lbCorreo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                lbCorreo.setForeground(new java.awt.Color(255, 255, 254));
                lbCorreo.setText("CORREO: ");
                ventanaLogIn.add(lbCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

                pfContraseña.setBackground(new java.awt.Color(36, 38, 41));
                pfContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                pfContraseña.setForeground(new java.awt.Color(148, 161, 178));
                pfContraseña.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
                pfContraseña.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                pfContraseñaActionPerformed(evt);
                        }
                });
                ventanaLogIn.add(pfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 310, 30));

                logoGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoPequeño.png"))); // NOI18N
                ventanaLogIn.add(logoGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 160, 190));

                btnRegistrarse.setBackground(new java.awt.Color(127, 90, 240));
                btnRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                btnRegistrarse.setForeground(new java.awt.Color(255, 255, 254));
                btnRegistrarse.setText("Registrarse");
                btnRegistrarse.setActionCommand("Ingresar");
                btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnRegistrarseActionPerformed(evt);
                        }
                });
                ventanaLogIn.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, -1, -1));

                btnIngresar.setBackground(new java.awt.Color(127, 90, 240));
                btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                btnIngresar.setForeground(new java.awt.Color(255, 255, 254));
                btnIngresar.setText("Ingresar");
                btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnIngresar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnIngresarActionPerformed(evt);
                        }
                });
                ventanaLogIn.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, -1, -1));

                tfCorreo.setBackground(new java.awt.Color(36, 38, 41));
                tfCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                tfCorreo.setForeground(new java.awt.Color(148, 161, 178));
                tfCorreo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
                tfCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                tfCorreoKeyPressed(evt);
                        }
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                tfCorreoKeyReleased(evt);
                        }
                });
                ventanaLogIn.add(tfCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 310, 30));

                txtMostrarCopy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                txtMostrarCopy.setForeground(new java.awt.Color(148, 161, 178));
                txtMostrarCopy.setText("©");
                ventanaLogIn.add(txtMostrarCopy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, -1, -1));

                btnErroresComunes.setBackground(new java.awt.Color(127, 90, 240));
                btnErroresComunes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                btnErroresComunes.setForeground(new java.awt.Color(255, 255, 254));
                btnErroresComunes.setText("?");
                btnErroresComunes.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnErroresComunesActionPerformed(evt);
                        }
                });
                ventanaLogIn.add(btnErroresComunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

                jLabel8.setFont(new java.awt.Font("Crabs", 1, 100)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(255, 255, 254));
                jLabel8.setText("EcoGuard");
                ventanaLogIn.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ventanaLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ventanaLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void pfContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfContraseñaActionPerformed
		// TODO add your handling code here:
        }//GEN-LAST:event_pfContraseñaActionPerformed

        private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
		// TODO add your handling code here:
        }//GEN-LAST:event_btnRegistrarseActionPerformed

        private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
		// TODO add your handling code here:
        }//GEN-LAST:event_btnIngresarActionPerformed

        private void tfCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCorreoKeyPressed
		// TODO add your handling code here:
        }//GEN-LAST:event_tfCorreoKeyPressed

        private void tfCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCorreoKeyReleased
		// TODO add your handling code here:
        }//GEN-LAST:event_tfCorreoKeyReleased

        private void btnErroresComunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnErroresComunesActionPerformed

        }//GEN-LAST:event_btnErroresComunesActionPerformed

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
			java.util.logging.Logger.getLogger(Singup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Singup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Singup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Singup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(() -> {
			new Singup().setVisible(true);
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnErroresComunes;
        private javax.swing.JButton btnIngresar;
        private javax.swing.JButton btnRegistrarse;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel lbContraseña;
        private javax.swing.JLabel lbCorreo;
        private javax.swing.JLabel logoGrande;
        private javax.swing.JPasswordField pfContraseña;
        private javax.swing.JTextField tfCorreo;
        private javax.swing.JLabel txtMostrarCopy;
        private javax.swing.JPanel ventanaLogIn;
        // End of variables declaration//GEN-END:variables
}
