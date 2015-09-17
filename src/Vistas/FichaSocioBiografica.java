/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class FichaSocioBiografica extends javax.swing.JFrame {
    
    public FichaSocioBiografica() {
        
      initComponents();
        setSize(937, 697);
      setLocationRelativeTo(this);        
    }
    
    private void asignarfecha(){
        try { SimpleDateFormat formato =new SimpleDateFormat("dd/mm/yyyy");
         Date Fecha;
         Fecha =formato.parse("01/01/1980");
         
         
         this.jFech_nacimiento1.setDate(Fecha);
         jFech_nacimiento1.getDateEditor().setEnabled(false);
         this.jFech_solicitud.setDate(Fecha);
         jFech_solicitud.getDateEditor().setEnabled(false);
        }catch(ParseException ex){
            JOptionPane.showMessageDialog(rootPane, "fecha errada"+ex.getMessage());
        }
    }
    
    public void limpiarCampos(){
        jnombresolic.setText("");
        japellidosolic.setText("");
        jcedula.setText("");
        jdireccion.setText("");
        jEstado.setText("");
        jTelefono.setText("");
        jCelular.setText("");
        jcodigo_e.setText("");       
        jFech_solicitud.requestFocus();
    }
      

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jnombresolic = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        japellidosolic = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jsegundonombresolic = new javax.swing.JTextField();
        jsegundoapellidosolic = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcedula = new javax.swing.JTextField();
        jComTipo_Documento = new javax.swing.JComboBox();
        jComboBoxCiudad1 = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jCombDPT1 = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        jdireccion = new javax.swing.JTextField();
        jComboBoxCiudad = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCombDPT = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jTelefono = new javax.swing.JTextField();
        jCelular = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jsexo = new javax.swing.JTextField();
        jFech_nacimiento1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox2_vulnerable = new javax.swing.JCheckBox();
        jestrato = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jmotivo_consulta = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jsueldo = new javax.swing.JTextField();
        jSueldo = new javax.swing.JLabel();
        jEstado = new javax.swing.JLabel();
        jCheckBox1_desplazado = new javax.swing.JCheckBox();
        jocupacion = new javax.swing.JTextField();
        jgrado_escolaridad1 = new javax.swing.JComboBox();
        jcodigo_e = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboentrevistador = new javax.swing.JComboBox();
        jhuella1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jhuella2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFech_solicitud = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jGUARDAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ficha SocioBiográfica");
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(935, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel3.setLayout(null);

        jLabel19.setText("Primer Apellido  *");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(10, 40, 82, 14);

        jnombresolic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnombresolicActionPerformed(evt);
            }
        });
        jnombresolic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jnombresolicKeyTyped(evt);
            }
        });
        jPanel3.add(jnombresolic);
        jnombresolic.setBounds(150, 10, 250, 20);

        jLabel2.setText("Primer Nombre  *");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 10, 82, 14);

        japellidosolic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                japellidosolicKeyTyped(evt);
            }
        });
        jPanel3.add(japellidosolic);
        japellidosolic.setBounds(150, 40, 250, 20);

        jLabel20.setText("Segundo Nombre");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(410, 10, 82, 14);

        jLabel22.setText("Segundo Apellido");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(410, 40, 82, 14);

        jsegundonombresolic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsegundonombresolicActionPerformed(evt);
            }
        });
        jsegundonombresolic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jsegundonombresolicKeyTyped(evt);
            }
        });
        jPanel3.add(jsegundonombresolic);
        jsegundonombresolic.setBounds(520, 10, 250, 20);

        jsegundoapellidosolic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsegundoapellidosolicActionPerformed(evt);
            }
        });
        jsegundoapellidosolic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jsegundoapellidosolicKeyTyped(evt);
            }
        });
        jPanel3.add(jsegundoapellidosolic);
        jsegundoapellidosolic.setBounds(520, 40, 250, 20);

        jLabel15.setText("Expedida:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(380, 70, 48, 20);

        jLabel3.setText("Documento   *");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 70, 69, 14);

        jcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jcedulaKeyTyped(evt);
            }
        });
        jPanel3.add(jcedula);
        jcedula.setBounds(150, 70, 70, 20);

        jComTipo_Documento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cedula de Ciudadania", "Targeta de identidad", "Registro civil" }));
        jPanel3.add(jComTipo_Documento);
        jComTipo_Documento.setBounds(230, 70, 129, 20);

        jComboBoxCiudad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCiudad1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxCiudad1);
        jComboBoxCiudad1.setBounds(680, 70, 129, 20);

        jLabel26.setText("Ciudad");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(640, 70, 33, 20);

        jCombDPT1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCombDPT1ItemStateChanged(evt);
            }
        });
        jCombDPT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombDPT1ActionPerformed(evt);
            }
        });
        jPanel3.add(jCombDPT1);
        jCombDPT1.setBounds(520, 70, 108, 20);

        jLabel27.setText("Departamento");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(440, 70, 69, 20);

        jdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jdireccionKeyTyped(evt);
            }
        });
        jPanel3.add(jdireccion);
        jdireccion.setBounds(150, 130, 280, 20);

        jComboBoxCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCiudadActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxCiudad);
        jComboBoxCiudad.setBounds(680, 130, 129, 20);

        jLabel21.setText("Ciudad");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(640, 130, 33, 20);

        jLabel4.setText("Dirección*");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 130, 49, 14);

        jCombDPT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCombDPTItemStateChanged(evt);
            }
        });
        jCombDPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombDPTActionPerformed(evt);
            }
        });
        jPanel3.add(jCombDPT);
        jCombDPT.setBounds(520, 130, 108, 20);

        jLabel23.setText("Departamento");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(440, 130, 69, 20);

        jTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTelefonoActionPerformed(evt);
            }
        });
        jTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTelefonoKeyTyped(evt);
            }
        });
        jPanel3.add(jTelefono);
        jTelefono.setBounds(150, 190, 70, 20);

        jCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCelularKeyTyped(evt);
            }
        });
        jPanel3.add(jCelular);
        jCelular.setBounds(290, 190, 90, 20);

        jLabel5.setText("Teléfono");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 190, 42, 14);

        jLabel16.setText("Celular  *");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(240, 190, 45, 20);

        jLabel17.setText("Sexo");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(10, 160, 24, 14);

        jsexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsexoActionPerformed(evt);
            }
        });
        jPanel3.add(jsexo);
        jsexo.setBounds(150, 160, 110, 20);
        jPanel3.add(jFech_nacimiento1);
        jFech_nacimiento1.setBounds(150, 100, 130, 20);

        jLabel6.setText("Fecha de Nacimiento  *");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 100, 120, 14);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 70, 860, 220);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Datos Basicos");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 50, 90, 20);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel2.setLayout(null);

        jCheckBox2_vulnerable.setText("Vulnerable");
        jPanel2.add(jCheckBox2_vulnerable);
        jCheckBox2_vulnerable.setBounds(240, 120, 75, 23);

        jestrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));
        jestrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jestratoActionPerformed(evt);
            }
        });
        jPanel2.add(jestrato);
        jestrato.setBounds(150, 10, 40, 20);

        jLabel7.setText("Grado de escolaridad");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 40, 101, 14);

        jmotivo_consulta.setColumns(20);
        jmotivo_consulta.setRows(5);
        jScrollPane1.setViewportView(jmotivo_consulta);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(150, 150, 576, 58);

        jLabel8.setText("Ocupacion");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 70, 50, 14);

        jLabel9.setText("Motivo de la consulta");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 170, 101, 14);

        jLabel12.setText("Estrato  *");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 10, 47, 20);

        jsueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsueldoActionPerformed(evt);
            }
        });
        jsueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jsueldoKeyTyped(evt);
            }
        });
        jPanel2.add(jsueldo);
        jsueldo.setBounds(150, 100, 181, 20);

        jSueldo.setText("Sueldo");
        jPanel2.add(jSueldo);
        jSueldo.setBounds(10, 100, 32, 14);

        jEstado.setText("Estado  *");
        jPanel2.add(jEstado);
        jEstado.setBounds(10, 130, 45, 14);

        jCheckBox1_desplazado.setText("Desplazado");
        jCheckBox1_desplazado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1_desplazadoActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1_desplazado);
        jCheckBox1_desplazado.setBounds(150, 120, 81, 23);

        jocupacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jocupacionKeyTyped(evt);
            }
        });
        jPanel2.add(jocupacion);
        jocupacion.setBounds(150, 70, 181, 20);

        jgrado_escolaridad1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguna", "Preescolar", "Primaria", "Básica Secundaria", "Alta Secundaria", "Educacion Superior" }));
        jPanel2.add(jgrado_escolaridad1);
        jgrado_escolaridad1.setBounds(150, 40, 130, 20);
        jPanel2.add(jcodigo_e);
        jcodigo_e.setBounds(150, 250, 138, 20);

        jLabel10.setText("Nombre del entrevistador *");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 220, 131, 14);

        jPanel2.add(jComboentrevistador);
        jComboentrevistador.setBounds(150, 220, 200, 20);
        jPanel2.add(jhuella1);
        jhuella1.setBounds(460, 220, 70, 50);

        jLabel24.setText("Huella");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(490, 270, 29, 14);

        jLabel25.setText("Foto");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(610, 270, 22, 14);
        jPanel2.add(jhuella2);
        jhuella2.setBounds(580, 220, 70, 50);

        jLabel11.setText("Codigo  *");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 250, 45, 14);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 310, 860, 290);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel4.setLayout(null);

        jLabel1.setText("Fecha de la solicitud  *");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(10, 10, 108, 20);

        jFech_solicitud.setEnabled(false);
        jPanel4.add(jFech_solicitud);
        jFech_solicitud.setBounds(130, 10, 122, 20);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 10, 860, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Otros datos");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(30, 290, 140, 20);

        jGUARDAR.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jGUARDAR.setText("GUARDAR");
        jGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGUARDARActionPerformed(evt);
            }
        });
        jPanel1.add(jGUARDAR);
        jGUARDAR.setBounds(410, 610, 100, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 900, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTelefonoActionPerformed

    private void jTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTelefonoKeyTyped
        // TODO add your handling code here:

        int numerodecaracteres=7;
        if(jTelefono.getText().length()>=numerodecaracteres)
        evt.consume();

        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTelefonoKeyTyped

    private void jnombresolicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jnombresolicKeyTyped

        int numerodecaracteres=30;
        if(jnombresolic.getText().length()>=numerodecaracteres)
        evt.consume();
        
         char car = evt.getKeyChar();    
         if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)java.awt.event.KeyEvent.VK_SPACE))
{
   evt.consume();
}

        
        
            // TODO add your handling code here:
    }//GEN-LAST:event_jnombresolicKeyTyped

    private void jComboBoxCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCiudadActionPerformed

    private void jestratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jestratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jestratoActionPerformed

    private void jCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCelularKeyTyped
        // TODO add your handling code here:
        int numerodecaracteres=10;
        if(jCelular.getText().length()>=numerodecaracteres)
        evt.consume();

        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jCelularKeyTyped

    private void japellidosolicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_japellidosolicKeyTyped
        int numerodecaracteres=30;
        if(japellidosolic.getText().length()>=numerodecaracteres)
        evt.consume();
       
         char car = evt.getKeyChar();    
         if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)java.awt.event.KeyEvent.VK_SPACE))
{
   evt.consume();
}


       
    }//GEN-LAST:event_japellidosolicKeyTyped

    private void jcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcedulaKeyTyped
        // TODO add your handling code here:

        int numerodecaracteres=12;
        if(jcedula.getText().length()>=numerodecaracteres)
        evt.consume();
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jcedulaKeyTyped

    private void jsueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsueldoActionPerformed

    private void jCheckBox1_desplazadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1_desplazadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1_desplazadoActionPerformed

    private void jnombresolicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnombresolicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnombresolicActionPerformed

    private void jGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGUARDARActionPerformed
         if(jnombresolic.getText().isEmpty() || japellidosolic.getText().isEmpty() || 
            jcedula.getText().isEmpty() || jdireccion.getText().isEmpty()
            || jTelefono.getText().isEmpty()||  jmotivo_consulta.getText().isEmpty()
                 ||  jcodigo_e.getText().isEmpty()
                 ){
                JOptionPane.showMessageDialog(null, "los campos marcados por * son obligatorios");
                jnombresolic.requestFocus();
            }                    
    }//GEN-LAST:event_jGUARDARActionPerformed

    private void jsegundonombresolicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsegundonombresolicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsegundonombresolicActionPerformed

    private void jsegundonombresolicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jsegundonombresolicKeyTyped
        int numerodecaracteres=30;
        if(jsegundonombresolic.getText().length()>=numerodecaracteres){
            evt.consume();
        }
        
        char car = evt.getKeyChar();    
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)java.awt.event.KeyEvent.VK_SPACE))
        {
           evt.consume();
        }
    }//GEN-LAST:event_jsegundonombresolicKeyTyped

    private void jsegundoapellidosolicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsegundoapellidosolicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsegundoapellidosolicActionPerformed

    private void jsegundoapellidosolicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jsegundoapellidosolicKeyTyped
    int numerodecaracteres=30;
        if(jsegundoapellidosolic.getText().length()>=numerodecaracteres){
            evt.consume();
        }
       
        char car = evt.getKeyChar();    
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)java.awt.event.KeyEvent.VK_SPACE))
        {
           evt.consume();
        }

    }//GEN-LAST:event_jsegundoapellidosolicKeyTyped

    private void jsueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jsueldoKeyTyped
    int numerodecaracteres=10;
        if(jcedula.getText().length()>=numerodecaracteres)
        evt.consume();

        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_jsueldoKeyTyped

    private void jdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdireccionKeyTyped
    int numerodecaracteres=60;
        if(jdireccion.getText().length()>=numerodecaracteres)
        evt.consume();
      
        char car = evt.getKeyChar();    
        if((car<'a' || car>'z') && (car<'A' || car>'Z')&& (car<'0' || car>'9') && (car!=(char)java.awt.event.KeyEvent.VK_SPACE))          
        {
           evt.consume();
        }
    }//GEN-LAST:event_jdireccionKeyTyped

    private void jocupacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jocupacionKeyTyped
    int numerodecaracteres=30;
        if(jnombresolic.getText().length()>=numerodecaracteres)
        evt.consume();
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A') | c>'Z') evt.consume();         // TODO add your handling code here:
    }//GEN-LAST:event_jocupacionKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void jCombDPTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCombDPTItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombDPTItemStateChanged

    private void jCombDPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombDPTActionPerformed
                 // TODO add your handling code here:
    }//GEN-LAST:event_jCombDPTActionPerformed

    private void jComboBoxCiudad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCiudad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCiudad1ActionPerformed

    private void jCombDPT1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCombDPT1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombDPT1ItemStateChanged

    private void jCombDPT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombDPT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombDPT1ActionPerformed

    private void jsexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsexoActionPerformed

  
    
    
    public static void main(String args[]) {
       

    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FichaSocioBiografica().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField jCelular;
    public javax.swing.JCheckBox jCheckBox1_desplazado;
    public javax.swing.JCheckBox jCheckBox2_vulnerable;
    public javax.swing.JComboBox jComTipo_Documento;
    public javax.swing.JComboBox jCombDPT;
    public javax.swing.JComboBox jCombDPT1;
    public javax.swing.JComboBox jComboBoxCiudad;
    public javax.swing.JComboBox jComboBoxCiudad1;
    public javax.swing.JComboBox jComboentrevistador;
    private javax.swing.JLabel jEstado;
    public com.toedter.calendar.JDateChooser jFech_nacimiento1;
    public com.toedter.calendar.JDateChooser jFech_solicitud;
    public javax.swing.JButton jGUARDAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jSueldo;
    public javax.swing.JTextField jTelefono;
    public javax.swing.JTextField japellidosolic;
    public javax.swing.JTextField jcedula;
    public javax.swing.JTextField jcodigo_e;
    public javax.swing.JTextField jdireccion;
    public javax.swing.JComboBox jestrato;
    public javax.swing.JComboBox jgrado_escolaridad1;
    public javax.swing.JTextField jhuella1;
    public javax.swing.JTextField jhuella2;
    public javax.swing.JTextArea jmotivo_consulta;
    public javax.swing.JTextField jnombresolic;
    public javax.swing.JTextField jocupacion;
    public javax.swing.JTextField jsegundoapellidosolic;
    public javax.swing.JTextField jsegundonombresolic;
    private javax.swing.JTextField jsexo;
    public javax.swing.JTextField jsueldo;
    // End of variables declaration//GEN-END:variables
}
