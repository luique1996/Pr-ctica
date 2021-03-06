package Formularios;

import help.Help;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Computer
 */
public class Nueva_lista_productos extends javax.swing.JFrame {

    public Image geticonimage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("nuevas imagenes/pp.jpg"));
        return retValue;
    }
    
    public ArrayList<String> lista;
    Adm_sql sql;
    String f2 = "";
    public String usuario;
//    ArrayList<String>lista;

    public Nueva_lista_productos() {
        initComponents();
        try {
            lista=new ArrayList<String>();
            this.setLocationRelativeTo(null);
            setResizable(false);
            setTitle("iMarket - Listas de productos");
            Date fecha = new Date();
            String[] vector;
            SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
            f2 = formateador.format(fecha);
            txttotal.setEditable(false);
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
      
       
   
    }

    public void h(JLabel j, String c) {
        try {
            ArrayList<Image> listaimg = sql.imagproductos(c);
            Image foto = null;
            Icon ico = null;
            foto = listaimg.get(0);
            ico = new ImageIcon(foto.getScaledInstance(j.getWidth(), j.getHeight(), Image.SCALE_DEFAULT));
            j.setIcon(ico);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //w.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblfoto = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jpanel1 = new javax.swing.JPanel();
        lblfoto1 = new javax.swing.JLabel();
        lblpro1 = new javax.swing.JLabel();
        lblprecio1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        jpanel2 = new javax.swing.JPanel();
        lblfoto3 = new javax.swing.JLabel();
        lblpro2 = new javax.swing.JLabel();
        lblprecio2 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        jpanel4 = new javax.swing.JPanel();
        lblfoto4 = new javax.swing.JLabel();
        lblpro4 = new javax.swing.JLabel();
        lblprecio4 = new javax.swing.JLabel();
        btn4 = new javax.swing.JButton();
        jpanel5 = new javax.swing.JPanel();
        lblfoto5 = new javax.swing.JLabel();
        lblpro5 = new javax.swing.JLabel();
        lblprecio5 = new javax.swing.JLabel();
        bnt5 = new javax.swing.JButton();
        jpanel3 = new javax.swing.JPanel();
        lblfoto2 = new javax.swing.JLabel();
        btn3 = new javax.swing.JButton();
        lblprecio3 = new javax.swing.JLabel();
        lblpro3 = new javax.swing.JLabel();
        jpanel6 = new javax.swing.JPanel();
        lblfoto6 = new javax.swing.JLabel();
        lblprecio6 = new javax.swing.JLabel();
        lblpro6 = new javax.swing.JLabel();
        bnt6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 153, 153));
        setIconImage(geticonimage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel1.setText("Lista de Compras");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 34));

        lblfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.jpg"))); // NOI18N
        jPanel3.add(lblfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 34));
        jPanel3.add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 142, 34));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 350, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevas imagenes/blanco.png"))); // NOI18N
        lblfoto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanel1.add(lblfoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lblpro1.setText("jLabel10");
        jpanel1.add(lblpro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 52, -1));

        lblprecio1.setText("jLabel13");
        jpanel1.add(lblprecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 52, -1));

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.jpg"))); // NOI18N
        btn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jpanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 28, -1));

        jPanel1.add(jpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 160));

        jpanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfoto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevas imagenes/blanco.png"))); // NOI18N
        lblfoto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanel2.add(lblfoto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lblpro2.setText("jLabel11");
        jpanel2.add(lblpro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 52, -1));

        lblprecio2.setText("jLabel14");
        jpanel2.add(lblprecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 52, -1));

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.jpg"))); // NOI18N
        btn2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jpanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 28, -1));

        jPanel1.add(jpanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 110, 160));

        jpanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfoto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevas imagenes/blanco.png"))); // NOI18N
        lblfoto4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanel4.add(lblfoto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lblpro4.setText("jLabel16");
        jpanel4.add(lblpro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 52, -1));

        lblprecio4.setText("jLabel19");
        jpanel4.add(lblprecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 52, -1));

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.jpg"))); // NOI18N
        btn4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jpanel4.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 28, -1));

        jPanel1.add(jpanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 160));

        jpanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfoto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevas imagenes/blanco.png"))); // NOI18N
        lblfoto5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanel5.add(lblfoto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lblpro5.setText("jLabel17");
        jpanel5.add(lblpro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 52, -1));

        lblprecio5.setText("jLabel20");
        jpanel5.add(lblprecio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 52, -1));

        bnt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.jpg"))); // NOI18N
        bnt5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnt5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt5ActionPerformed(evt);
            }
        });
        jpanel5.add(bnt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 28, -1));

        jPanel1.add(jpanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 110, 160));

        jpanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfoto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevas imagenes/blanco.png"))); // NOI18N
        lblfoto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanel3.add(lblfoto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.jpg"))); // NOI18N
        btn3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jpanel3.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 28, -1));

        lblprecio3.setText("jLabel15");
        jpanel3.add(lblprecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 52, -1));

        lblpro3.setText("jLabel12");
        jpanel3.add(lblpro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 52, -1));

        jPanel1.add(jpanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 110, 160));

        jpanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfoto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevas imagenes/blanco.png"))); // NOI18N
        lblfoto6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanel6.add(lblfoto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lblprecio6.setText("jLabel21");
        jpanel6.add(lblprecio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 52, -1));

        lblpro6.setText("jLabel18");
        jpanel6.add(lblpro6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 52, -1));

        bnt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.jpg"))); // NOI18N
        bnt6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnt6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt6ActionPerformed(evt);
            }
        });
        jpanel6.add(bnt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 28, -1));

        jPanel1.add(jpanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 110, 160));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 420, 380));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\LuisSolòrzano\\Desktop\\listas_de_compras\\src\\nuevas imagenes\\mar.jpg")); // NOI18N
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 330, 70));

        jLabel26.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel26.setText("Valor Total");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 76, 31));
        jPanel2.add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 115, 31));

        jButton3.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jButton3.setMnemonic('I');
        jButton3.setText("Imprimir");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 90, 30));

        jButton4.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jButton4.setMnemonic('C');
        jButton4.setText("Cancelar");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 80, 30));

        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablita);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, 370, 250));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 390, 440));

        jButton1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButton1.setMnemonic('R');
        jButton1.setText("Regresar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 30));

        jButton2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButton2.setMnemonic('A');
        jButton2.setText("Ayuda");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, 80, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//         Principal_productos l =new Principal_productos();
//     l.show();
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
//        jpanel1 = jpanel2;
//        jpanel2 = jpanel3;
//        jpanel3 = jpanel4;
//        jpanel4 = jpanel5;
//        jpanel5 = jpanel6;
        jpanel1.setVisible(false);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
//        jpanel1=jpanel2;
//        jpanel2=jpanel3;
//        jpanel3=jpanel4;
//        jpanel4=jpanel5;
//        jpanel5=jpanel6;
     jpanel3.setVisible(false);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
//        jpanel1=jpanel2;
//        jpanel2 = jpanel3;
//        jpanel3 = jpanel4;
//        jpanel4 = jpanel5;
//        jpanel5 = jpanel6;
        jpanel2.setVisible(false);
   
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
//        jpanel1=jpanel2;
//        jpanel2=jpanel3;
//        jpanel3=jpanel4;
//        jpanel4=jpanel5;
//        jpanel5=jpanel6;
        jpanel4.setVisible(false);
    }//GEN-LAST:event_btn4ActionPerformed

    private void bnt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt5ActionPerformed
//        jpanel1=jpanel2;
//        jpanel2=jpanel3;
//        jpanel3=jpanel4;
//        jpanel4=jpanel5;
//        jpanel5=jpanel6;
        jpanel5.setVisible(false);
    }//GEN-LAST:event_bnt5ActionPerformed

    private void bnt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt6ActionPerformed
        jpanel6.setVisible(false);
    }//GEN-LAST:event_bnt6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String cadena="";   
        for (int i = 0; i < tablita.getRowCount(); i++) {
                         cadena=tablita.getValueAt(i,0).toString()+";"+tablita.getValueAt(i,1).toString()+";"+tablita.getValueAt(i,2).toString()+";";
                         
                         lista.add(cadena);
			}
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        
      new testPackagePrint(lista,lblusuario.getText(),txttotal.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          Help help = new Help();
          help.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Nueva_lista_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nueva_lista_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nueva_lista_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nueva_lista_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nueva_lista_productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt5;
    private javax.swing.JButton bnt6;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel jpanel1;
    public javax.swing.JPanel jpanel2;
    public javax.swing.JPanel jpanel3;
    public javax.swing.JPanel jpanel4;
    public javax.swing.JPanel jpanel5;
    public javax.swing.JPanel jpanel6;
    public javax.swing.JLabel lblfoto;
    public javax.swing.JLabel lblfoto1;
    public javax.swing.JLabel lblfoto2;
    public javax.swing.JLabel lblfoto3;
    public javax.swing.JLabel lblfoto4;
    public javax.swing.JLabel lblfoto5;
    public javax.swing.JLabel lblfoto6;
    public javax.swing.JLabel lblprecio1;
    public javax.swing.JLabel lblprecio2;
    public javax.swing.JLabel lblprecio3;
    public javax.swing.JLabel lblprecio4;
    public javax.swing.JLabel lblprecio5;
    public javax.swing.JLabel lblprecio6;
    public javax.swing.JLabel lblpro1;
    public javax.swing.JLabel lblpro2;
    public javax.swing.JLabel lblpro3;
    public javax.swing.JLabel lblpro4;
    public javax.swing.JLabel lblpro5;
    public javax.swing.JLabel lblpro6;
    public javax.swing.JLabel lblusuario;
    public javax.swing.JTable tablita;
    public javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
