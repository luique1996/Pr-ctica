/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.BorderLayout; 
import java.awt.Color; 
import java.awt.Container; 
import java.awt.Font; 
import java.awt.FontMetrics; 
import java.awt.Graphics; 
import java.awt.Graphics2D; 
import java.awt.print.PageFormat; 
import java.awt.print.Paper; 
import java.awt.print.Printable; 
import java.awt.print.PrinterException; 
import java.awt.print.PrinterJob; 
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.print.PrintService; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JScrollPane; 
import javax.swing.JTable; 
import javax.swing.table.TableColumn; 
import javax.swing.table.TableColumnModel; 
import javax.swing.table.TableModel; 

/**
 *
 * @author Luis Solórzano
 */
public class testPackagePrint implements Printable { 
    
    
        JTable dataTable; 
        protected ArrayList<String> lista;
        protected int m_maxNumPage = 1,mes=0,nummeses=0,emision; 
        protected JLabel strTitle;
        protected String hola="",nombre="",cantida ,total,valor,usuario;
//        protected double total=0,tarifa,app,alcant,divi;
        public testPackagePrint(ArrayList<String>lista,String usuario,String total) 
        { 
            
            this.lista=lista;
            this.usuario=usuario;
            this.total=total;
            strTitle=new JLabel();
            
             Font fuente= new Font("Serief",Font.BOLD,14);
            strTitle.setFont(fuente);
            strTitle.setText("hols");
            new PrintPreview(testPackagePrint.this, " Vista previa");    
             
             
        } 
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException { 
    if (pageIndex >= m_maxNumPage) 
    { 
      return NO_SUCH_PAGE; 
    } 
    Date fechaDeHoy = new Date(); 
         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
           String fecha ="";
           fecha = formato.format(fechaDeHoy); 
             PrinterJob printJob = PrinterJob.getPrinterJob(); 
          // Se asigna el tamaÃ±o del papel a A4. 
             Graphics2D g = (Graphics2D) graphics; 
             pageFormat = printJob.defaultPage(); 
             Paper paper = pageFormat.getPaper(); 
             g.translate((int)pageFormat.getImageableX(), (int)pageFormat.getImageableY()); 
             paper.setSize(306, 396); 
             paper.setImageableArea(1.0, 1.0, 300, 390); 
//     
             pageFormat.setPaper(paper); 
             pageFormat.setOrientation(PageFormat.PORTRAIT); 
//     
//     
//      
//     
//     
           int wPage = 0; 
           int hPage = 0; 
//     
        if (pageFormat.getOrientation() == pageFormat.PORTRAIT) 
        { 
          wPage = (int)pageFormat.getImageableWidth()-5; 
          hPage = (int)pageFormat.getImageableHeight()-5; 
        } 
        else 
        { 
          wPage = (int)pageFormat.getImageableWidth(); 
          wPage += wPage/2; 
          hPage = (int)pageFormat.getImageableHeight(); 
          g.setClip(0,0,wPage,hPage); 
        } 
//     
//         
//          
            Font fontTitle = new Font("Arial", Font.ITALIC, 8); 
                g.setFont(fontTitle); 
//             
//             
    int y = 0; 
//    g.setFont(strTitle.getFont()); 
    g.setColor(Color.black); 
    Font fn = g.getFont(); 
    FontMetrics fm = g.getFontMetrics(); 
    y += fm.getAscent(); 



    g.drawString("                                  SHOPPING LIST\"", 8, y+10);//Titulo 
    g.drawString("Telefonos: 0982738766/052754-564", 8, y+30);
    g.drawString("RUC: 7387623672687", 8, y+40);
    g.drawString("Email: luique1996@gmail.com", 260, y+30); 
    g.drawString("----------------------------------------------------------------------------------------------------------------------------------------------", 8, y+50);
    g.drawString("Usuario: : "+usuario, 8, y+70);
    g.drawString("fecha : "+fecha, 260, y+70);
    g.drawString("direccion : QUEVEDO", 8, y+90);
//    g.drawString("Telf: 0387-4390362", 8, y+50); 
    g.drawString("---------------------------------------------------------------------------------------------------------------------------------------------", 8, y+110); 
    g.drawString("Descripcion: ", 8, y+130);
    g.drawString("Cant: ", 100, y+130);
    g.drawString("P. Unitario: ", 200, y+130);
    
    if(lista.size()==1){
        String[] c=lista.get(0).split(";");
        System.out.println("estoy en el if");
        g.drawString(""+c[0], 8, y+150);
         g.drawString(""+c[1], 100, y+150);
        g.drawString(""+c[2], 200, y+150);
        g.drawString("--------------------------------------------------------------------------------------------------------------------------------------------", 8, y+160); 
        g.drawString("   TOTAL: :                         $ "+total, 246, y+180);
    }
//    if(lista.size()==2){
//        String[] c=lista.get(0).split(";");
//        g.drawString(""+c[0], 8, y+150);
//         g.drawString(""+c[1], 100, y+150);
//        g.drawString(""+c[2], 200, y+150);
//        
//        c=lista.get(1).split(";");
//        g.drawString(""+c[0], 8, y+160);
//         g.drawString(""+c[1], 100, y+160);
//        g.drawString(""+c[2], 200, y+160);
//        g.drawString("--------------------------------------------------------------------------------------------------------------------------------------------", 8, y+180); 
//        g.drawString("   TOTAL: :                         $ "+total, 246, y+190);
//    }
//    if(lista.size()==3){
//        String[] c=lista.get(0).split(";");
//        g.drawString(""+c[0], 8, y+150);
//         g.drawString(""+c[1], 100, y+150);
//        g.drawString(""+c[2], 200, y+150);
//        
//        c=lista.get(1).split(";");
//        g.drawString(""+c[0], 8, y+160);
//         g.drawString(""+c[1], 100, y+160);
//        g.drawString(""+c[2], 200, y+160);
//        
//         c=lista.get(2).split(";");
//        g.drawString(""+c[0], 8, y+170);
//         g.drawString(""+c[1], 100, y+170);
//        g.drawString(""+c[2], 200, y+170);
//        g.drawString("--------------------------------------------------------------------------------------------------------------------------------------------", 8, y+180); 
//        g.drawString("   TOTAL: :                         $ "+total, 246, y+190);
//    }
//    if(lista.size()==4){
//        String[] c=lista.get(0).split(";");
//        g.drawString(""+c[0], 8, y+150);
//         g.drawString(""+c[1], 100, y+150);
//        g.drawString(""+c[2], 200, y+150);
//        
//        c=lista.get(1).split(";");
//        g.drawString(""+c[0], 8, y+160);
//         g.drawString(""+c[1], 100, y+160);
//        g.drawString(""+c[2], 200, y+160);
//        
//         c=lista.get(2).split(";");
//        g.drawString(""+c[0], 8, y+170);
//         g.drawString(""+c[1], 100, y+170);
//        g.drawString(""+c[2], 200, y+170);
//        
//        c=lista.get(3).split(";");
//        g.drawString(""+c[0], 8, y+180);
//         g.drawString(""+c[1], 100, y+180);
//        g.drawString(""+c[2], 200, y+180);
//        g.drawString("--------------------------------------------------------------------------------------------------------------------------------------------", 8, y+190); 
//        g.drawString("   TOTAL: :                         $ "+total, 246, y+200);
//    }
//    
//     if(lista.size()==5){
//        String[] c=lista.get(0).split(";");
//        g.drawString(""+c[0], 8, y+150);
//         g.drawString(""+c[1], 100, y+150);
//        g.drawString(""+c[2], 200, y+150);
//        
//        c=lista.get(1).split(";");
//        g.drawString(""+c[0], 8, y+160);
//         g.drawString(""+c[1], 100, y+160);
//        g.drawString(""+c[2], 200, y+160);
//        
//         c=lista.get(2).split(";");
//        g.drawString(""+c[0], 8, y+170);
//         g.drawString(""+c[1], 100, y+170);
//        g.drawString(""+c[2], 200, y+170);
//        
//        c=lista.get(3).split(";");
//        g.drawString(""+c[0], 8, y+180);
//         g.drawString(""+c[1], 100, y+180);
//        g.drawString(""+c[2], 200, y+180);
//        
//        c=lista.get(4).split(";");
//        g.drawString(""+c[0], 8, y+190);
//         g.drawString(""+c[1], 100, y+190);
//        g.drawString(""+c[2], 200, y+190);
//        
//        g.drawString("--------------------------------------------------------------------------------------------------------------------------------------------", 8, y+200); 
//        g.drawString("   TOTAL: :                         $ "+total, 246, y+210);
//    }
//     if(lista.size()==6){
//        String[] c=lista.get(0).split(";");
//        g.drawString(""+c[0], 8, y+150);
//         g.drawString(""+c[1], 100, y+150);
//        g.drawString(""+c[2], 200, y+150);
//        
//        c=lista.get(1).split(";");
//        g.drawString(""+c[0], 8, y+160);
//         g.drawString(""+c[1], 100, y+160);
//        g.drawString(""+c[2], 200, y+160);
//        
//         c=lista.get(2).split(";");
//        g.drawString(""+c[0], 8, y+170);
//         g.drawString(""+c[1], 100, y+170);
//        g.drawString(""+c[2], 200, y+170);
//        
//        c=lista.get(3).split(";");
//        g.drawString(""+c[0], 8, y+180);
//         g.drawString(""+c[1], 100, y+180);
//        g.drawString(""+c[2], 200, y+180);
//        
//        c=lista.get(4).split(";");
//        g.drawString(""+c[0], 8, y+190);
//         g.drawString(""+c[1], 100, y+190);
//        g.drawString(""+c[2], 200, y+190);
//        
//        c=lista.get(5).split(";");
//        g.drawString(""+c[0], 8, y+200);
//         g.drawString(""+c[1], 100, y+200);
//        g.drawString(""+c[2], 200, y+200);
//        g.drawString("--------------------------------------------------------------------------------------------------------------------------------------------", 8, y+210); 
//        g.drawString("   TOTAL: :                         $ "+total, 246, y+220);
//    }
//       
//    g.drawString("TARIFA: ", 345, y+130);
//    g.drawString(""+tarifa, 345, y+150);
//    g.drawString("--------------------------------------------------------------------------------------------------------------------------------------------", 8, y+150); 
////    g.drawString("   Emision de factura:         $ "+emision+".00", 246, y+190);
//    g.drawString("   TOTAL: :                         $ "+total, 246, y+180);
    
    //--------------------------------------------------------------------------------------------------
    
    
    
    return PAGE_EXISTS; 
  } 
}  


