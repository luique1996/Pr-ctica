

package Formularios;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


/**
 *
 * @author israis007
 */
public class Presentacion extends javax.swing.JFrame {
private int auxiliar = 0;
private boolean realizado = false;
hilo ejecutar = new hilo();
    /**
     * Creates new form welcome
     */
    public Presentacion() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        //com.sun.awt.AWTUtilities.setWindowOpacity(this, 0.7f);
        
       
        
        Presentacion.this.getRootPane().setOpaque(false);        
        Presentacion.this.getContentPane ().setBackground (new Color (0, 0, 0, 0));
        Presentacion.this.setBackground (new Color (0, 0, 0, 0)); 
       
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JLabel();
        barra = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setBackground(new java.awt.Color(51, 255, 153));
        text.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        text.setForeground(new java.awt.Color(45, 28, 28));
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));
        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 340, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevas imagenes/159222.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(realizado == false){
        realizado = true;
        barra.setMaximum(49);
        barra.setMinimum(0);
        barra.setStringPainted(true);
        ejecutar.start();
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Presentacion().setVisible(true);
        });
    }

    private void setIconImage(ImageIcon imageIcon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    private class hilo extends Thread{

      
    @Override
    public void run(){
   
      
        
        try {while(true){
            auxiliar++;
            barra.setValue(auxiliar);
            repaint();
            switch(auxiliar){
                case 3:
                    text.setText("Cargando");
                    break;
                case 20:
                    text.setText("ShoppingList");
                    break;
                case 50:
                    text.setText("Carga finalizada");
                    break;
                case 60:
                    Iniciar_sesion objeto = new Iniciar_sesion();
                    objeto.setVisible(true);
                    objeto.setLocationRelativeTo(Presentacion.this);
                    Presentacion.this.dispose();
                    break;                    
            }
            Thread.sleep(45);}
        } catch (InterruptedException ex) {
            Logger.getLogger(Presentacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}

