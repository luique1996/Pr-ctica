package Formularios;


import help.Help;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.sql.JDBCType.DATE;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Registrar extends javax.swing.JFrame {
    
       public Image geticonimage()
    {
     Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("nuevas imagenes/pp.jpg"));
    return retValue;
    }


    Adm_sql sql;
    String[] vector;
    String sexo;
    File fichero;
//    Archivo ar;
    int longitud;
    //String nombre="C:\\Users\\LuisSolorzano\\Documents\\NetBeansProjects\\listas_de_compras\\Usuarios.txt";
    String nombre="Usuario.txt";
    private FileInputStream fis;
    public Registrar() 
    {
        initComponents();
        //cambiarIdioma("Espanol");
        this.setLocationRelativeTo(null);
        setResizable(false);
        setTitle("iMarket - Registrar usuario");
        vector=new String[6];
        txtfecha.setValue(new Date());
       
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
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        rdbmujer = new javax.swing.JRadioButton();
        rdbhombre = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bntregistrar = new javax.swing.JButton();
        txtcontraseña = new javax.swing.JPasswordField();
        txtcontraseña2 = new javax.swing.JPasswordField();
        hola = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblfoto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        cmbIdiomas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(geticonimage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nombres:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtnombre.setToolTipText("Ingrese un nombre");
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Apellidos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Sexo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        txtapellido.setToolTipText("Ingrese un apellido");
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, -1));

        txtusuario.setToolTipText("Ingrese un usuario válido");
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 280, -1));

        rdbmujer.setText("Mujer");
        rdbmujer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rdbmujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbmujerActionPerformed(evt);
            }
        });
        jPanel1.add(rdbmujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        rdbhombre.setText("Hombre");
        rdbhombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rdbhombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbhombreActionPerformed(evt);
            }
        });
        jPanel1.add(rdbhombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
        jPanel1.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 130, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Contraseña:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Confirmar contraseña:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 20));

        bntregistrar.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        bntregistrar.setMnemonic('S');
        bntregistrar.setText("Siguiente");
        bntregistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntregistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(bntregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 80, -1));

        txtcontraseña.setToolTipText("La contraseña debe de coincidir");
        txtcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 355, 280, -1));

        txtcontraseña2.setToolTipText("Ingrese una contraseña");
        jPanel1.add(txtcontraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 280, -1));
        txtcontraseña2.getAccessibleContext().setAccessibleName("");

        jPanel1.add(hola, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 393, -1, -1));

        jButton1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jButton1.setMnemonic('N');
        jButton1.setText("Cancelar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 80, -1));

        jButton2.setMnemonic('C');
        jButton2.setText("Cargar Foto");
        jButton2.setToolTipText("La foto es opcional");
        jButton2.setAutoscrolls(true);
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 110, 20));

        lblfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevas imagenes/aaaaa.png"))); // NOI18N
        lblfoto.setText("           Foto");
        lblfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 80, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 310, 440));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 23, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setText("Registro");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 110, 30));

        jButton3.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jButton3.setMnemonic('A');
        jButton3.setText("Ayuda");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 70, -1));

        cmbIdiomas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Ingles" }));
        cmbIdiomas.setToolTipText("Seleccione el idioma ");
        cmbIdiomas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbIdiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdiomasActionPerformed(evt);
            }
        });
        jPanel3.add(cmbIdiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 100, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntregistrarActionPerformed
         sql=new Adm_sql();
         boolean b;  
        String pre=pregunta();
        try {
             b=verificar();
            if (b) {
                JOptionPane.showMessageDialog(null, "Nombre de usuario ya existe");
                
            } else {
                if (txtcontraseña.getText().equals(txtcontraseña2.getText())) {
                if (!"".equals(txtapellido.getText())&&!"".equals(txtcontraseña.getText())&&!"".equals(txtusuario.getText())&&!"".equals(sexo)&&!"".equals(txtnombre.getText())) {
                   String name = JOptionPane.showInputDialog(this, pre);
                    if (null==name) {
                        JOptionPane.showMessageDialog(null, "Deben de ingresar una respuesta para mayor seguridad");
                    }
                    else{
                        
                        sql.RegistrarCliente(txtnombre.getText(), txtapellido.getText(), txtusuario.getText(), sexo, "06/05/20" , txtcontraseña.getText(), this.fis,this.longitud,pre,name);
                        Iniciar_sesion s=new Iniciar_sesion();
                        s.show();
                        this.setVisible(false);
                    }
                 
            } else {
                JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");
            }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
            }
            
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_bntregistrarActionPerformed
    
    public String pregunta(){
        String pregunta="";
        Random r=new Random();
        String[]vector=new String[4];
        vector[0]="Nombre de tu primer mascota?";
        vector[1]="Nombre de tu primer amigo de la infancia?";
        vector[2]="color favorito?";
        vector[3]="Equipo favorito?";
        for (int i = 0; i < vector.length; i++) {
            pregunta=vector[r.nextInt(3)];
        }
        return pregunta;
    }
    
    
    public boolean verificar(){
        sql=new Adm_sql();
        boolean b=false;
        ArrayList<String> nombreArrayList=sql.leerusuarios12();
          for (int i = 0; i < nombreArrayList.size(); i++) {
              if (nombreArrayList.get(i) == null ? txtusuario.getText() == null : nombreArrayList.get(i).equals(txtusuario.getText())) {
                  b= true;
              }
              
         }
          return b;
    }
     public void cambiarIdioma(String nombreIdioma){
        
           Idioma idioma = new Idioma(nombreIdioma);
        
//        btnCambio.setText(idioma.getProperty("cambio"));
       jLabel1.setText(idioma.getProperty("titulo"));
        jLabel2.setText(idioma.getProperty("nombre"));
        jLabel3.setText(idioma.getProperty("apellidos"));
        jLabel4.setText(idioma.getProperty("usuario"));
        jLabel5.setText(idioma.getProperty("sexo"));
        jButton2.setText(idioma.getProperty("foto"));
        rdbhombre.setText(idioma.getProperty("hombre"));
        rdbmujer.setText(idioma.getProperty("mujer"));
        jLabel6.setText(idioma.getProperty("nacimiento"));
        jLabel7.setText(idioma.getProperty("contraseña"));
        jLabel8.setText(idioma.getProperty("confirmar"));
        bntregistrar.setText(idioma.getProperty("registrar"));
        jButton1.setText(idioma.getProperty("cancelar"));
        jButton3.setText(idioma.getProperty("ayuda"));
        cmbIdiomas.removeAllItems();
        
        String idiomas[]={
                          idioma.getProperty("espanol"),
                          idioma.getProperty("ingles"),
                          };
        
        for(int i=0;i<idiomas.length;i++){
            cmbIdiomas.addItem(idiomas[i]);
        }
//        
    }
    
    
    
    private void rdbhombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbhombreActionPerformed
       rdbmujer.setSelected(false);
        sexo="hombre";
    }//GEN-LAST:event_rdbhombreActionPerformed

    private void rdbmujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbmujerActionPerformed
        rdbhombre.setSelected(false);
        sexo="mujer";
    }//GEN-LAST:event_rdbmujerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Iniciar_sesion hola=new Iniciar_sesion();
        hola.show();
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraseñaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int resultado;
        
        Cargarfoto foto=new Cargarfoto();
        FileNameExtensionFilter filtro = 
              new FileNameExtensionFilter("JPG y PNG","jpg","png");
        foto.jfchcargarfoto.setFileFilter(filtro);
        resultado= foto.jfchcargarfoto.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == resultado){
            
           
            try{
                  fis = new FileInputStream(foto.jfchcargarfoto.getSelectedFile());
                  longitud= (int)foto.jfchcargarfoto.getSelectedFile().length();
                  
                  Image icono=ImageIO.read(foto.jfchcargarfoto.getSelectedFile()).getScaledInstance(lblfoto.getWidth(), lblfoto.getHeight(), Image.SCALE_DEFAULT);
                  lblfoto.setIcon(new ImageIcon(icono));
                  lblfoto.updateUI();
                  
//                 ImageIcon icon = new ImageIcon(fichero.toString());
//                 Icon icono = new ImageIcon(icon.getImage().
//                  getScaledInstance(lblfoto.getWidth(),lblfoto.getHeight(), 
//                  Image.SCALE_DEFAULT));
//                 lblfoto.setText(null);
//
//                 lblfoto.setIcon( icono );

            }catch(Exception ex){
               JOptionPane.showMessageDialog(null, 
                "Error abriendo la imagen "+ ex);
           }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        sololetras(evt);
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        sololetras(evt);
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
        
    }//GEN-LAST:event_txtusuarioKeyTyped

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            Help help = new Help();
            help.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cmbIdiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdiomasActionPerformed
        // TODO add your handling code here:
        
        switch(cmbIdiomas.getSelectedIndex()){

            case 0:
                cambiarIdioma("Español");
                break;
            case 1:
                cambiarIdioma("Ingles");
                break;
        }
        
//        if ( cmbIdiomas.getSelectedIndex()==0) {
////            emision = 2;
//             cambiarIdioma("Español");
//        }
//        if ( cmbIdiomas.getSelectedIndex()==1) {
////            emision = 0;
//               cambiarIdioma("Ingles");
//        }
      
              
    }//GEN-LAST:event_cmbIdiomasActionPerformed
    
    private void sololetras(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
    
         if((c<'a' || c>'z') && (c<'A' || c>'Z')&& (c!=(char)KeyEvent.VK_SPACE))
          {
             evt.consume();
           } 
    }
    
    private void guardar(){
        //ar=new Archivo();
       // String[] vector=new String[7];
        
        //EscribeTxt(nombre,);
        if (!"".equals(txtnombre.getText())&&!"".equals(txtapellido.getText())&&!"".equals(txtusuario.getText())) {
             if (txtcontraseña.getText() == null ? txtcontraseña2.getText() == null : txtcontraseña.getText().equals(txtcontraseña2.getText())) {
            vector[0]=txtnombre.getText();
            vector[1]=txtapellido.getText();
            vector[2]=txtusuario.getText();
            vector[4]=txtfecha.getText();
            vector[5]=txtcontraseña.getText();
            String datos=vector[0]+";"+vector[1]+";"+vector[2]+";"+vector[3]+";"+vector[4]+";"+vector[5]+";";
            EscribeTxt(nombre,datos);
            Iniciar_sesion i=new Iniciar_sesion(true);
            i.setVisible(true);
            this.setVisible(false);
           
        } else {
           hola.setText("Contraseña incorrecta");
        }
        } else {
            hola.setText("Todos los campos deben estar llenos");
        }
       
        
        ////try {
           // ar.guardar(nombre,vector);
          // guardar1(nombre,vector);
        //} catch (IOException ex) {
         //   Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        //}
        
    }
    
     public static void EscribeTxt(String ruta_archivo, String numeros)
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(ruta_archivo,true);
            pw = new PrintWriter(fichero);
            
                pw.println(numeros);
            
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {           
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    
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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntregistrar;
    private javax.swing.JComboBox<String> cmbIdiomas;
    private javax.swing.JLabel hola;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JRadioButton rdbhombre;
    private javax.swing.JRadioButton rdbmujer;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JPasswordField txtcontraseña2;
    private javax.swing.JFormattedTextField txtfecha;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

    private void getProperties(String espanolproperties) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
