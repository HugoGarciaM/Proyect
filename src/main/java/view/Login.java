/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import controller.LoadImage;
import javax.swing.Icon;
import controller.loginController;
import javax.swing.JOptionPane;
/**
 *
 * @author HUGO GARCIA
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        LoadImage logo=new LoadImage ("/img/llave.png",jLabel4.getHeight(),jLabel4.getWidth());
        jLabel4.setIcon(logo.getImg());
        LoadImage logo1=new LoadImage ("/img/logoemp.jpg",lblLogin.getHeight(),lblLogin.getWidth());
        lblLogin.setIcon(logo1.getImg());
        LoadImage logo2 =new LoadImage ("/img/Fondo.jpg",lblFondo.getHeight(),lblFondo.getWidth());
        lblFondo.setIcon(logo2.getImg());
        new loginController(this);
        
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
        jLabel4 = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblBienvenido = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        lblLogin = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 180, 140));

        lblContraseña.setText("Contraseña:");
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        lblUsuario.setText("Usuario:");
        lblUsuario.setToolTipText("Usuario:");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        lblBienvenido.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(82, 200, 217));
        lblBienvenido.setText("BIENVENIDO");
        jPanel1.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        txtContraseña.setText("jPasswordField1");
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));
        jPanel1.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 110, 100));

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
try{
            //FlatArcOrangeIJTheme.setup();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblFondo;
    public javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblUsuario;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
