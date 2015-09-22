
package Controladores;

import java.awt.event.ActionListener;
import Modelos.FichaBModelo;
import Vistas.FichaSocioBiografica;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



public class fichaControlador implements ActionListener{
    FichaSocioBiografica vtnFichaB;
    FichaBModelo modelo =new FichaBModelo();
    
    
    public enum Accionficha{
        _GUARDAR,
        _SELECCIOND,
        _2SELECCIOND,
        _FECHA  
    }
    public fichaControlador (FichaSocioBiografica vistas){
       this.vtnFichaB = vistas;   
       llenarcbDpto(this.modelo.LlenarComboDptos());
       asignarFecha();
  
    }

     public void iniciar(){
        
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vtnFichaB);
            vtnFichaB.setVisible(true);
            
            
        }
        catch (UnsupportedLookAndFeelException ex){}
         catch (ClassNotFoundException ex){}
         catch (InstantiationException ex){}
         catch (IllegalAccessException ex){}
        
        this.vtnFichaB.jGUARDAR.setActionCommand("_GUARDAR");
        this.vtnFichaB.jGUARDAR.addActionListener(this);
        
        this.vtnFichaB.jCombDPT.setActionCommand("_SELECCIOND");
        this.vtnFichaB.jCombDPT.addActionListener(this);
        
        this.vtnFichaB.jCombDPT1.setActionCommand("_2SELECCIOND");
        this.vtnFichaB.jCombDPT1.addActionListener(this);
    
     }
      
     
     @Override
     public void actionPerformed(ActionEvent e){
         
        switch(Accionficha.valueOf(e.getActionCommand())){
            case _SELECCIOND:{ 
                llenarcbMpios();
		break;       
            }
            
             case _2SELECCIOND:{ 
                llenarcbMpios2();
		break;       
            }
    
            case _GUARDAR:{
                if(this.modelo.guardarficha(
                         
            this.vtnFichaB.jFech_nacimiento1.getDateFormatString(),
                        this.vtnFichaB.jnombresolic.getText(),
                        this.vtnFichaB.jsegundonombresolic.getText(),
                        this.vtnFichaB.japellidosolic.getText(),
                        this.vtnFichaB.jsegundoapellidosolic.getText(),
                        this.vtnFichaB.jcedula.getText(),
                        this.vtnFichaB.jComTipo_Documento.getSelectedItem().toString(),
                        this.vtnFichaB.jdireccion.getText(),
                        this.vtnFichaB.jCombDPT.getSelectedItem().toString(),
                        this.vtnFichaB.jComboBoxCiudad.getSelectedItem().toString(),
                        this.vtnFichaB.jTelefono.getText(),
                        this.vtnFichaB.jFech_nacimiento1.getDateFormatString(), 
                        this.vtnFichaB.jgrado_escolaridad1.getSelectedItem().toString(), 
                        this.vtnFichaB.jocupacion.getText(),
                        this.vtnFichaB.jestrato.getSelectedItem().toString(),
                        this.vtnFichaB.jsueldo.getText(), 
                        this.vtnFichaB.jCelular.getText(),
                        this.vtnFichaB.jCheckBox1_desplazado.getActionCommand(),
                        this.vtnFichaB.jCheckBox2_vulnerable.getActionCommand(),
                        this.vtnFichaB.jmotivo_consulta.getText(),
                        this.vtnFichaB.jcodigo_e.getText())
                        ){
                    
                }
                
              
            }
            
     
        }

    }
    
     private void llenarcbMpios(){
         String dpto = this.vtnFichaB.jCombDPT.getSelectedItem().toString();
         vtnFichaB.jComboBoxCiudad.removeAllItems();
         int longitud = this.modelo.LlenarComboMpios(this.modelo.codigoDpto(dpto)).length;
         for (int i = 0; i < longitud; i++){
             vtnFichaB.jComboBoxCiudad.addItem(this.modelo.LlenarComboMpios(this.modelo.codigoDpto(dpto))[i]);
             
         }}
         private void llenarcbMpios2(){
         String dpto1 = this.vtnFichaB.jCombDPT1.getSelectedItem().toString();
         vtnFichaB.jComboBoxCiudad1.removeAllItems();
         int longitud = this.modelo.LlenarComboMpios(this.modelo.codigoDpto(dpto1)).length;
         for (int i = 0; i < longitud; i++){
             vtnFichaB.jComboBoxCiudad1.addItem(this.modelo.LlenarComboMpios(this.modelo.codigoDpto(dpto1))[i]);
             
         }}
         
     
     
     private void llenarcbDpto(String[] dptos){
        int longitud = dptos.length;
        
        if (longitud <= 0){
            vtnFichaB.jCombDPT.addItem("No hay departamentos");
             vtnFichaB.jCombDPT1.addItem("No hay departamentos");
        }else{
        for (int i = 0; i < longitud; i++){
             vtnFichaB.jCombDPT.addItem(dptos[i]);  
              vtnFichaB.jCombDPT1.addItem(dptos[i]);
         }
        }
    }
     public void fecha(){ 
         
             Date date = new Date(this.vtnFichaB.jFech_solicitud.getDateFormatString());
             Date date2 = new Date(this.vtnFichaB.jFech_nacimiento1.getDateFormatString());
             Boolean before = date.before(date2);
             JOptionPane.showMessageDialog(vtnFichaB, "bien");
             before =date2.before(date);
             JOptionPane.showMessageDialog(vtnFichaB, "Fecha incorrecta");
            }
     private void asignarFecha(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        Date fecha = new Date();
        this.vtnFichaB.jFech_solicitud.setDate(fecha);
        vtnFichaB.jFech_solicitud.getDateEditor().setEnabled(false);
    }
}
