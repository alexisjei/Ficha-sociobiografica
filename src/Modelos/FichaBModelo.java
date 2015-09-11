package Modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sala221
 */
public class FichaBModelo extends Conexion{
     
     @SuppressWarnings("empty-statement")
     public boolean guardarficha(String fecha_s, String pNombre, String sNombre,
                    String pApellido, String sApellido, String Cedula, String tipo_documento,String direccion,String Ciudad,
                    String Departamento, String Telefono, String feccha_naci, String Grado_Escolaridad, String ocupacion, 
                    String Estrato, String Sueldo, String Celular, String Estado,String Estado1, String Motivo_cconsul,
                    String entrevistaor){
         String codigo ="select CodiMpio from ciudades where NombDpto = '"
                +Ciudad+"';";
         String sql0 ="insert into terceros "
                    +"values('"+Cedula+"','"+codigo+"','"+tipo_documento+"','"+pNombre+"'"
                 + ",'"+sNombre+"','"+pApellido+"','"+sApellido+"','"+feccha_naci+"'"
                 + ",'','"+direccion+" "+Departamento+"','"+Telefono+"','"+Celular+"','',"
                 + "'','"+Motivo_cconsul+"');";
         
         String sql1="insert into clientes "
                    +"values('"+Cedula+"','"+Estrato+"','"+Estado+" "+Estado1+"','"+Grado_Escolaridad+"'"
                 + ",'"+ocupacion+"','','','"+ocupacion+"','"+Sueldo+"','','');";
         
         String sql2="insert into clientes "
                    +"values('"+Cedula+"','"+Estrato+"','"+Estado1+"','"+Grado_Escolaridad+"'"
                 + ",'"+ocupacion+"','','','"+ocupacion+"','"+Sueldo+"','','');";
         
         String  sql3="insert into clientes "
                    +"values('"+Cedula+"','"+Estrato+"','"+Estado+"','"+Grado_Escolaridad+"'"
                 + ",'"+ocupacion+"','','','"+ocupacion+"','"+Sueldo+"','','');";
         String sql4="insert into clientes "
                    +"values('"+Cedula+"','"+Estrato+"','','"+Grado_Escolaridad+"'"
                 + ",'"+ocupacion+"','','','"+ocupacion+"','"+Sueldo+"','','');";
         
         if(Estado.length() !=0){
             if(Estado1.length() !=0){
                 variosInsert(sql0, sql4);
             }else{
                 variosInsert(sql0, sql2);
             }
         }else{
             if(Estado1.length() !=0){
                 variosInsert(sql0, sql3);
             }else{
                 variosInsert(sql0, sql1);
             }
         }
         
        return false;
         
     }
    
    
     public String codigoDpto(String nombdpto){
        String codigodpto = "";
        
        String sql = "select CodiDpto from departamentos where NombDpto = '"
                +nombdpto+"';" ;
        try{            
            PreparedStatement sentencia = this.getConexion().prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();         
            while(resultado.next()){
                codigodpto = resultado.getString("CodiDpto");
            }
            resultado.close();
         }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }                
        return codigodpto;
    }
    
     public String[] LlenarComboMpios(String codidpto){
        int i = 0;
        String sql = "select NombMpio from ciudades "
                   + "where codiDpto = '"+codidpto+"' "
                   + "order by CodiMpio;";

        try{
            PreparedStatement sentencia = this.getConexion().prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();           
            while(resultado.next()){
                i++;
                
            }
            resultado.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        String[] mpios = new String[i];

        try{
            PreparedStatement sentencia = this.getConexion().prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();
            i = 0;
            while(resultado.next()){
                mpios[i] = resultado.getString("NombMpio");
                i++;
                
            }
            resultado.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return mpios;
    }
   
  public String[] LlenarComboDptos(){
        String[] dptos = new String[34];
        
        String sql = "select NombDpto from departamentos order by NombDpto;" ;                
        dptos[0] = "Seleccione un departamento";
        
         try{
            PreparedStatement sentencia = this.getConexion().prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();
            int i = 1;
            while(resultado.next()){
                dptos[i] = resultado.getString("NombDpto");
                i++;
            }
            resultado.close();
         }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return dptos;
    }



 
  private void variosInsert(String sent1, String sent2){
      PreparedStatement Sentencia;
         try {
             Sentencia = this.getConexion().prepareStatement(sent1);                
             PreparedStatement Sentencia1 = this.getConexion().prepareStatement(sent2);
             Sentencia.execute();
             Sentencia1.execute();
             Sentencia.close();
             Sentencia1.close();
         } catch (SQLException ex) {
             Logger.getLogger(FichaBModelo.class.getName()).log(Level.SEVERE, null, ex);
         }
  }
  
}

