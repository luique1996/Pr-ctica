/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.*; 
import java.awt.event.*; 
import java.awt.image.*; 
import java.util.*; 
import java.awt.print.*; 
import javax.swing.*; 
import javax.swing.JTable.PrintMode; 
import javax.swing.border.*; 
import javax.swing.event.*; 

/**
 *
 * @author Luis Solórzano
 */
public class PrintPreview extends JFrame 
{ 
  protected int anchoPage=600; 
  protected int altoPage=700; 
  protected Printable m_target; 
  protected JComboBox m_cbScale; 
  Adm_sql sql;
  protected PreviewContainer m_preview; 
//  protected final String cod="",fechatem="";
  public PrintPreview(Printable target) { 
    this(target, "Vista Previa de Impresion - Smarth Bussines System"); 
  } 
  public PrintPreview(Printable target, String title) { 
    super(title); 
    setSize(700, 400); 
    m_target = target; 
//    this.cod=cod;
//    this.fechatem=fechatem;
    JToolBar toolBar = new JToolBar(); 
    JButton botonPrint = new JButton("Imprimir"); 
    ActionListener lst = new ActionListener() { 
      public void actionPerformed(ActionEvent e) { 
        try 
        { 
//          sql=new Adm_sql();
          // Use default printer, no dialog 
          PrinterJob prnJob = PrinterJob.getPrinterJob(); 
          prnJob.setPrintable(m_target); 
          setCursor( Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR)); 
          prnJob.print(); 
//          sql.modificarfechas(cod,fechatem);
          setCursor( Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR)); 
          dispose(); 
        } 
        catch (PrinterException ex) 
        { 
          ex.printStackTrace(); 
          System.err.println("Error al Imprimir: "+ex.toString()); 
        } 
      } 
    }; 
    botonPrint.addActionListener(lst); 
    botonPrint.setAlignmentY(0.5f); 
    botonPrint.setMargin(new Insets(4,6,4,6)); 
    toolBar.add(botonPrint); 
    botonPrint = new JButton("Cerrar Vista Previa"); 
    lst = new ActionListener() { 
      public void actionPerformed(ActionEvent e) { 
        dispose(); 
      } 
    }; 
    botonPrint.addActionListener(lst); 
    botonPrint.setAlignmentY(0.5f); 
    botonPrint.setMargin(new Insets(2,6,2,6)); 
    toolBar.add(botonPrint); 
    String[] scales = { "10 %", "25 %", "50 %", "100 %" }; 
    m_cbScale = new JComboBox(scales); 
    lst = new ActionListener() { 
      public void actionPerformed(ActionEvent e) { 
        Thread runner = new Thread() { 
          public void run() { 
            String str = m_cbScale.getSelectedItem(). 
              toString(); 
            if (str.endsWith("%")) 
              str = str.substring(0, str.length()-1); 
            str = str.trim(); 
              int scale = 0; 
            try { scale = Integer.parseInt(str); } 
            catch (NumberFormatException ex) { return; } 
            int w = (int)(anchoPage*scale/100); 
            int h = (int)(altoPage*scale/100); 
            Component[] comps = m_preview.getComponents(); 
            for (int k=0; k<comps.length; k++) { 
              if (!(comps[k] instanceof PagePreview)) 
                continue; 
              PagePreview pp = (PagePreview)comps[k]; 
                pp.setScaledSize(w, h); 
            } 
            m_preview.doLayout(); 
            m_preview.getParent().getParent().validate(); 
          } 
        }; 
        runner.start(); 
      } 
    }; 
    m_cbScale.addActionListener(lst); 
    m_cbScale.setMaximumSize(m_cbScale.getPreferredSize()); 
    m_cbScale.setEditable(true); 
    toolBar.addSeparator(); 
    toolBar.add(m_cbScale); 
    getContentPane().add(toolBar, BorderLayout.NORTH); 
    m_preview = new PreviewContainer(); 
    PrinterJob prnJob = PrinterJob.getPrinterJob(); 
    PageFormat pageFormat = prnJob.defaultPage(); 
    if (pageFormat.getHeight()==0 || pageFormat.getWidth()==0) { 
      System.err.println("Unable to determine default page size"); 
        return; 
    } 
    anchoPage = 600; 
    altoPage = 700; 
    int scale = 50; 
    int w = (int)(anchoPage*scale/100); 
    int h = (int)(altoPage*scale/100); 
    int pageIndex = 0; 
    try { 
      while (true) { 
        BufferedImage img = new BufferedImage(anchoPage, 
          altoPage, BufferedImage.TYPE_INT_RGB); 
        Graphics g = img.getGraphics(); 
        g.setColor(Color.white); 
        g.fillRect(0, 0, anchoPage, altoPage); 
        if (target.print(g, pageFormat, pageIndex) != 
         Printable.PAGE_EXISTS) 
          break; 
        PagePreview pp = new PagePreview(w, h, img); 
        m_preview.add(pp); 
        pageIndex++; 
      } 
    } 
    catch (PrinterException e) { 
      e.printStackTrace(); 
      System.err.println("Printing error: "+e.toString()); 
    } 
    JScrollPane ps = new JScrollPane(m_preview); 
    getContentPane().add(ps, BorderLayout.CENTER); 
    setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
    setVisible(true); 
  } 
  class PreviewContainer extends JPanel 
  { 
    protected int H_GAP = 16; 
    protected int V_GAP = 10; 
    public Dimension getPreferredSize() { 
      int n = getComponentCount(); 
      if (n == 0) 
        return new Dimension(H_GAP, V_GAP); 
      Component comp = getComponent(0); 
      Dimension dc = comp.getPreferredSize(); 
      int w = dc.width; 
      int h = dc.height; 
      Dimension dp = getParent().getSize(); 
      int nCol = Math.max((dp.width-H_GAP)/(w+H_GAP), 1); 
      int nRow = n/nCol; 
      if (nRow*nCol < n) 
        nRow++; 
      int ww = nCol*(w+H_GAP) + H_GAP; 
      int hh = nRow*(h+V_GAP) + V_GAP; 
      Insets ins = getInsets(); 
      return new Dimension(ww+ins.left+ins.right, 
        hh+ins.top+ins.bottom); 
    } 
    public Dimension getMaximumSize() { 
      return getPreferredSize(); 
    } 
    public Dimension getMinimumSize() { 
      return getPreferredSize(); 
    } 
    public void doLayout() { 
      Insets ins = getInsets(); 
      int x = ins.left + H_GAP; 
      int y = ins.top + V_GAP; 
      int n = getComponentCount(); 
      if (n == 0) 
        return; 
      Component comp = getComponent(0); 
      Dimension dc = comp.getPreferredSize(); 
      int w = dc.width; 
      int h = dc.height; 
      Dimension dp = getParent().getSize(); 
      int nCol = Math.max((dp.width-H_GAP)/(w+H_GAP), 1); 
      int nRow = n/nCol; 
      if (nRow*nCol < n) 
        nRow++; 
      int index = 0; 
      for (int k = 0; k<nRow; k++) { 
        for (int m = 0; m<nCol; m++) { 
          if (index >= n) 
            return; 
          comp = getComponent(index++); 
          comp.setBounds(x, y, w, h); 
          x += w+H_GAP; 
        } 
        y += h+V_GAP; 
        x = ins.left + H_GAP; 
      } 
    } 
  } 
  class PagePreview extends JPanel 
  { 
    protected int m_w; 
    protected int m_h; 
    protected Image m_source; 
    protected Image m_img; 
    public PagePreview(int w, int h, Image source) { 
      m_w = w; 
      m_h = h; 
      m_source= source; 
      m_img = m_source.getScaledInstance(m_w, m_h, 
        Image.SCALE_SMOOTH); 
      m_img.flush(); 
      setBackground(Color.white); 
      setBorder(new MatteBorder(1, 1, 2, 2, Color.black)); 
    } 
    public void setScaledSize(int w, int h) { 
      m_w = w; 
      m_h = h; 
      m_img = m_source.getScaledInstance(m_w, m_h, 
        Image.SCALE_SMOOTH); 
      repaint(); 
    } 
    public Dimension getPreferredSize() { 
      Insets ins = getInsets(); 
      return new Dimension(m_w+ins.left+ins.right, 
        m_h+ins.top+ins.bottom); 
    } 
    public Dimension getMaximumSize() { 
      return getPreferredSize(); 
    } 
    public Dimension getMinimumSize() { 
      return getPreferredSize(); 
    } 
    public void paint(Graphics g) { 
      g.setColor(getBackground()); 
      g.fillRect(0, 0, getWidth(), getHeight()); 
      g.drawImage(m_img, 0, 0, this); 
      paintBorder(g); 
    } 
  } 
}  

