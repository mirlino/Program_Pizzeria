/*@Autor: Mirlino Mariñez 
   Fecha: 25-12-2017
    Ver.: 1.1.0
*/ 
package controlador;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import vista.PanelOrdenes;

public class ExecuteProgram {
    
public static void main(String[] args) {

    //TRYCATCH LOOKANDFEEL VISTA WINDOWS
    try{
  
  JFrame.setDefaultLookAndFeelDecorated(true);
  JDialog.setDefaultLookAndFeelDecorated(true);
  //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
  //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
  //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
}
catch (Exception e)
 {
  e.printStackTrace();
 }
    
    //PANEL PRINCIPAL
    PanelOrdenes p = new PanelOrdenes();
    
    p.setVisible(true);
    p.setLocationRelativeTo(null);
    
}    
    
}
