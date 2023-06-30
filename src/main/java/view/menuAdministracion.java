/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.LoadImage;

/**
 *
 * @author DELL
 */
public class menuAdministracion extends javax.swing.JFrame {

    /**
     * Creates new form menuAdministracion
     */
    public menuAdministracion() {
        initComponents();
        LoadImage logo=new LoadImage ("/img/agua.jpg",lblfondo.getHeight(),lblfondo.getWidth());
        lblfondo.setIcon(logo.getImg());
        LoadImage fondo=new LoadImage ("/img/Logo.png",lblF.getHeight(),lblF.getWidth());
        lblF.setIcon(fondo.getImg());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_gest_pedidos = new javax.swing.JButton();
        btn_ges_ingres_egresos = new javax.swing.JButton();
        btn_generar_report = new javax.swing.JButton();
        btn_ges_trabajadores = new javax.swing.JButton();
        lblfondo = new javax.swing.JLabel();
        lblF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_gest_pedidos.setText("GESTIONAR PEDIDOS");
        btn_gest_pedidos.setName(""); // NOI18N
        btn_gest_pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gest_pedidosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_gest_pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        btn_ges_ingres_egresos.setText("GESTIONAR INGRESOS EGRESOS");
        btn_ges_ingres_egresos.setName(""); // NOI18N
        jPanel1.add(btn_ges_ingres_egresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        btn_generar_report.setText("GENERAR REPORTE");
        btn_generar_report.setName(""); // NOI18N
        jPanel1.add(btn_generar_report, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        btn_ges_trabajadores.setText("GESTIONAR TRABAJADORES");
        btn_ges_trabajadores.setName(""); // NOI18N
        jPanel1.add(btn_ges_trabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));
        jPanel1.add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 330));
        jPanel1.add(lblF, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 150, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gest_pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gest_pedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gest_pedidosActionPerformed

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
            java.util.logging.Logger.getLogger(menuAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuAdministracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_generar_report;
    public javax.swing.JButton btn_ges_ingres_egresos;
    public javax.swing.JButton btn_ges_trabajadores;
    public javax.swing.JButton btn_gest_pedidos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblF;
    private javax.swing.JLabel lblfondo;
    // End of variables declaration//GEN-END:variables
}
