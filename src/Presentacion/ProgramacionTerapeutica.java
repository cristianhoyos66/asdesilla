/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import AccesoDatos.OpProgramacionTerapeutica;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Esta clase permite pintar la ventana Programación Terapéutica, con sus respectivos componentes, para el manejo de dicha información
 * @author Cristian A. Hoyos Jaramillo
 * @author Daniela Estrada Monsalve
 * @author Yeisson A. Ochoa Villa
 */
public class ProgramacionTerapeutica extends javax.swing.JFrame {
    Map<Integer, String> p;
    TreeMap<Integer, String> fe;
    
    public ProgramacionTerapeutica() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/therapeutic programming icon.png")).getImage());
        FechaProgTerapeutica.setDate(new Date());
        try {
            fe = OpProgramacionTerapeutica.obtenerFormaEnsenanza();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramacionTerapeutica.class.getName()).log(Level.SEVERE, null, ex);
        }
        Iterator r = fe.keySet().iterator();
        while(r.hasNext()){
            jcFormaEnsenanza.addItem(fe.get(r.next()));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelObligatorios = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        FechaProgTerapeutica = new com.toedter.calendar.JDateChooser();
        labelNHistoriaClinica = new javax.swing.JLabel();
        txtNHC = new java.awt.TextField();
        labelDoc = new javax.swing.JLabel();
        txtDocPac = new java.awt.TextField();
        btnBusquedaPac = new javax.swing.JButton();
        jcPaciente = new javax.swing.JComboBox();
        labelTipoMonta = new javax.swing.JLabel();
        jcFormaEnsenanza = new javax.swing.JComboBox();
        labelAntecedentes = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAntecedentes = new javax.swing.JTextArea();
        labelObjGeneral = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtObjGeneral = new javax.swing.JTextArea();
        labelObjEsp = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtObjEspecificos = new javax.swing.JTextArea();
        labelEstrategias = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtEstrategias = new javax.swing.JTextArea();
        labelMaterialesDidac = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtMaterialesDidacticos = new javax.swing.JTextArea();
        labelComentarios = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtComentarios = new javax.swing.JTextArea();
        btnCrearProgTerapeutica = new javax.swing.JButton();
        btnBuscarProgTerapeutica = new javax.swing.JButton();
        btnLimpiarProgTerapeutica = new javax.swing.JButton();
        btnSalirProgTerapeutica = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Programación Terapéutica");
        setMinimumSize(new java.awt.Dimension(1335, 640));
        setResizable(false);
        getContentPane().setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelTitulo.setText("PROGRAMACIÓN TERAPÉUTICA");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(570, 20, 180, 15);

        labelObligatorios.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelObligatorios.setText("Los campos con * son obligatorios");
        getContentPane().add(labelObligatorios);
        labelObligatorios.setBounds(560, 50, 210, 15);

        labelFecha.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelFecha.setText("*Fecha diligenciamiento:");
        getContentPane().add(labelFecha);
        labelFecha.setBounds(20, 100, 140, 15);

        FechaProgTerapeutica.setDateFormatString("dd-MM-yyyy");
        FechaProgTerapeutica.setEnabled(false);
        FechaProgTerapeutica.setName("FechaN"); // NOI18N
        getContentPane().add(FechaProgTerapeutica);
        FechaProgTerapeutica.setBounds(200, 100, 181, 22);

        labelNHistoriaClinica.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelNHistoriaClinica.setText("*Número Historia Clínica:");
        getContentPane().add(labelNHistoriaClinica);
        labelNHistoriaClinica.setBounds(740, 100, 140, 15);

        txtNHC.setEnabled(false);
        getContentPane().add(txtNHC);
        txtNHC.setBounds(910, 100, 130, 19);

        labelDoc.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelDoc.setText("*Documento Paciente:");
        getContentPane().add(labelDoc);
        labelDoc.setBounds(20, 140, 141, 15);

        txtDocPac.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtDocPac);
        txtDocPac.setBounds(200, 140, 140, 19);

        btnBusquedaPac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        btnBusquedaPac.setToolTipText("La búsqueda se  puede generar a partir de los primeros números del documento");
        btnBusquedaPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaPacActionPerformed(evt);
            }
        });
        getContentPane().add(btnBusquedaPac);
        btnBusquedaPac.setBounds(350, 130, 50, 30);

        jcPaciente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));
        jcPaciente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcPacienteItemStateChanged(evt);
            }
        });
        getContentPane().add(jcPaciente);
        jcPaciente.setBounds(420, 140, 220, 27);

        labelTipoMonta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelTipoMonta.setText("*Tipo de monta:");
        getContentPane().add(labelTipoMonta);
        labelTipoMonta.setBounds(740, 140, 130, 15);

        jcFormaEnsenanza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));
        getContentPane().add(jcFormaEnsenanza);
        jcFormaEnsenanza.setBounds(910, 140, 210, 27);

        labelAntecedentes.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelAntecedentes.setText("*Antecedentes:");
        getContentPane().add(labelAntecedentes);
        labelAntecedentes.setBounds(20, 180, 90, 15);

        txtAntecedentes.setColumns(20);
        txtAntecedentes.setRows(5);
        jScrollPane3.setViewportView(txtAntecedentes);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(200, 180, 440, 90);

        labelObjGeneral.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelObjGeneral.setText("*Objetivo general:");
        getContentPane().add(labelObjGeneral);
        labelObjGeneral.setBounds(740, 180, 100, 15);

        txtObjGeneral.setColumns(20);
        txtObjGeneral.setRows(5);
        jScrollPane9.setViewportView(txtObjGeneral);

        getContentPane().add(jScrollPane9);
        jScrollPane9.setBounds(910, 180, 400, 90);

        labelObjEsp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelObjEsp.setText("*Objetivos específicos:");
        getContentPane().add(labelObjEsp);
        labelObjEsp.setBounds(20, 290, 130, 40);

        txtObjEspecificos.setColumns(20);
        txtObjEspecificos.setRows(5);
        jScrollPane10.setViewportView(txtObjEspecificos);

        getContentPane().add(jScrollPane10);
        jScrollPane10.setBounds(200, 290, 440, 90);

        labelEstrategias.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelEstrategias.setText("*Estrategias:");
        getContentPane().add(labelEstrategias);
        labelEstrategias.setBounds(740, 300, 70, 15);

        txtEstrategias.setColumns(20);
        txtEstrategias.setRows(5);
        jScrollPane11.setViewportView(txtEstrategias);

        getContentPane().add(jScrollPane11);
        jScrollPane11.setBounds(910, 290, 400, 90);

        labelMaterialesDidac.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelMaterialesDidac.setText("Materiales didácticos:");
        getContentPane().add(labelMaterialesDidac);
        labelMaterialesDidac.setBounds(20, 410, 130, 20);

        txtMaterialesDidacticos.setColumns(20);
        txtMaterialesDidacticos.setRows(5);
        jScrollPane12.setViewportView(txtMaterialesDidacticos);

        getContentPane().add(jScrollPane12);
        jScrollPane12.setBounds(200, 410, 440, 90);

        labelComentarios.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelComentarios.setText("Comentarios:");
        getContentPane().add(labelComentarios);
        labelComentarios.setBounds(740, 410, 120, 15);

        txtComentarios.setColumns(20);
        txtComentarios.setRows(5);
        jScrollPane4.setViewportView(txtComentarios);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(910, 410, 400, 90);

        btnCrearProgTerapeutica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        btnCrearProgTerapeutica.setText("Crear");
        btnCrearProgTerapeutica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProgTerapeuticaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearProgTerapeutica);
        btnCrearProgTerapeutica.setBounds(130, 560, 130, 34);

        btnBuscarProgTerapeutica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        btnBuscarProgTerapeutica.setText("Buscar");
        btnBuscarProgTerapeutica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProgTerapeuticaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarProgTerapeutica);
        btnBuscarProgTerapeutica.setBounds(370, 560, 125, 34);

        btnLimpiarProgTerapeutica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actions-edit-clear-icon.png"))); // NOI18N
        btnLimpiarProgTerapeutica.setText("Limpiar");
        btnLimpiarProgTerapeutica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarProgTerapeuticaActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiarProgTerapeutica);
        btnLimpiarProgTerapeutica.setBounds(820, 560, 137, 34);

        btnSalirProgTerapeutica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Log-Out-icon.png"))); // NOI18N
        btnSalirProgTerapeutica.setText("Salir");
        btnSalirProgTerapeutica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProgTerapeuticaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalirProgTerapeutica);
        btnSalirProgTerapeutica.setBounds(1080, 560, 137, 34);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/print.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setEnabled(false);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir);
        btnImprimir.setBounds(600, 560, 130, 34);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1340, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Búsqueda de los pacientes coincidentes según un carácter ingresado
     * @param evt 
     */
    private void btnBusquedaPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaPacActionPerformed
        if(txtDocPac.getText() == null || txtDocPac.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresar por lo menos un carácter del número de identificación del paciente", "Gestión Asdesilla", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                jcPaciente.removeAllItems();
                p = OpProgramacionTerapeutica.obtenerPacientes(txtDocPac.getText());
                Iterator it = p.keySet().iterator();
                if (p.size()>0) {
                    //JOptionPane.showMessageDialog(null, "Se han encontrado coincidencias");
                }else{
                    //JOptionPane.showMessageDialog(null, "No se han encontrado coincidencias");
                }
                jcPaciente.addItem("Seleccione");
                while(it.hasNext()){
                    jcPaciente.addItem(p.get(it.next()));
                }
                //txtDocPac.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Evaluaciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnBusquedaPacActionPerformed

    /**
     * Carga el código de la historia clínica asociada, según el paciente seleccionado
     * @param evt 
     */
    private void jcPacienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcPacienteItemStateChanged
        if(jcPaciente.getItemCount() > 0){
            if (!jcPaciente.getSelectedItem().equals("Seleccione")) {
                try {
                    p = OpProgramacionTerapeutica.obtenerPacientes();
                    for (Map.Entry<Integer, String> historiaClinica : p.entrySet()){
                        if (jcPaciente.getSelectedItem().toString().equals(historiaClinica.getValue())) {
                            txtNHC.setText(String.valueOf(historiaClinica.getKey()));
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Evaluaciones.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                txtNHC.setText("");
            }
        }
    }//GEN-LAST:event_jcPacienteItemStateChanged
    /**
     * Llama al método guardar
     * @param evt 
     */
    private void btnCrearProgTerapeuticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProgTerapeuticaActionPerformed
        guardarPrgTerapeutica();
    }//GEN-LAST:event_btnCrearProgTerapeuticaActionPerformed

    /**
     * Llama a la interfaz para la visualización de los registros
     * @param evt 
     */
    private void btnBuscarProgTerapeuticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProgTerapeuticaActionPerformed
        new ProgramacionTerapeuticaRegistros().setVisible(true);
    }//GEN-LAST:event_btnBuscarProgTerapeuticaActionPerformed

    /**
     * Limpia todos los campos del formulario, asignandoles el valor por defecto
     * @param evt 
     */
    private void btnLimpiarProgTerapeuticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarProgTerapeuticaActionPerformed
        FechaProgTerapeutica.setDate(new Date());
        jcPaciente.setEnabled(true);
        jcPaciente.removeAllItems();
        jcPaciente.addItem("Seleccione");
        txtNHC.setText("");
        txtDocPac.setEnabled(true);
        txtDocPac.setText("");
        jcFormaEnsenanza.setEnabled(true);
        jcFormaEnsenanza.setSelectedIndex(0);
        txtAntecedentes.setEnabled(true);
        txtAntecedentes.setText("");
        txtObjGeneral.setEnabled(true);
        txtObjGeneral.setText("");
        txtObjEspecificos.setEnabled(true);
        txtObjEspecificos.setText("");
        txtEstrategias.setEnabled(true);
        txtEstrategias.setText("");
        txtMaterialesDidacticos.setEnabled(true);
        txtMaterialesDidacticos.setText("");
        txtComentarios.setEnabled(true);
        txtComentarios.setText("");
        btnBusquedaPac.setEnabled(true);
        btnCrearProgTerapeutica.setEnabled(true);
        btnImprimir.setEnabled(false);
    }//GEN-LAST:event_btnLimpiarProgTerapeuticaActionPerformed

    /**
     * Regresar al menú principal
     * @param evt 
     */
    private void btnSalirProgTerapeuticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProgTerapeuticaActionPerformed
        new Menu().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnSalirProgTerapeuticaActionPerformed

    /**
     * Método que permite generar un informe de la programación terapéutica de un paciente
     * @param evt 
     */
    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        JFileChooser elegirCarpeta = new JFileChooser();
        elegirCarpeta.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int o = elegirCarpeta.showOpenDialog(this);
        if(o == JFileChooser.APPROVE_OPTION){
            try {
                String diaFecha = String.valueOf(FechaProgTerapeutica.getCalendar().get(Calendar.DAY_OF_MONTH));
                String mesFecha = String.valueOf(FechaProgTerapeutica.getCalendar().get(Calendar.MONTH) + 1);
                String annoFecha = String.valueOf(FechaProgTerapeutica.getCalendar().get(Calendar.YEAR));
                String fecha = diaFecha + "/" + mesFecha + "/" + annoFecha;
                String fechaReporte = diaFecha + "-" + mesFecha + "-" + annoFecha;
                String path = elegirCarpeta.getSelectedFile().getAbsolutePath();
                File informe = new File(path+"\\Programación Terapéutica "+jcPaciente.getSelectedItem()+" ("+fechaReporte+").pdf");
                if (informe.exists()) {
                    informe.delete();
                }
                int hc = Integer.parseInt(txtNHC.getText());
                Map parametro = new HashMap();
                parametro.put("idHistoriaClinica", hc);
                parametro.put("fecha", fecha);
                InputStream is = getClass().getResourceAsStream("/reportes/ReporteProgramacionTerapeutica.jasper");
                OpProgramacionTerapeutica.imprimir(is, parametro, informe.toString());
                Desktop.getDesktop().open(informe);
            } catch (IOException ex) {
                Logger.getLogger(ProgramacionTerapeutica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProgramacionTerapeutica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramacionTerapeutica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramacionTerapeutica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramacionTerapeutica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramacionTerapeutica().setVisible(true);
            }
        });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.toedter.calendar.JDateChooser FechaProgTerapeutica;
    private javax.swing.JButton btnBuscarProgTerapeutica;
    public static javax.swing.JButton btnBusquedaPac;
    public static javax.swing.JButton btnCrearProgTerapeutica;
    public static javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiarProgTerapeutica;
    private javax.swing.JButton btnSalirProgTerapeutica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane9;
    public static javax.swing.JComboBox jcFormaEnsenanza;
    public static javax.swing.JComboBox jcPaciente;
    private javax.swing.JLabel labelAntecedentes;
    private javax.swing.JLabel labelComentarios;
    private javax.swing.JLabel labelDoc;
    private javax.swing.JLabel labelEstrategias;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelMaterialesDidac;
    private javax.swing.JLabel labelNHistoriaClinica;
    private javax.swing.JLabel labelObjEsp;
    private javax.swing.JLabel labelObjGeneral;
    private javax.swing.JLabel labelObligatorios;
    private javax.swing.JLabel labelTipoMonta;
    private javax.swing.JLabel labelTitulo;
    public static javax.swing.JTextArea txtAntecedentes;
    public static javax.swing.JTextArea txtComentarios;
    public static java.awt.TextField txtDocPac;
    public static javax.swing.JTextArea txtEstrategias;
    public static javax.swing.JTextArea txtMaterialesDidacticos;
    public static java.awt.TextField txtNHC;
    public static javax.swing.JTextArea txtObjEspecificos;
    public static javax.swing.JTextArea txtObjGeneral;
    // End of variables declaration//GEN-END:variables
/**
     * Método que permite guardar la información de la programación terapéutica de un paciente
     * de acuerdo a los datos ingresados.
     */
    public void guardarPrgTerapeutica(){
        String diaFecha, mesFecha, annoFecha, fecha, hc, formaEnsenanza = "Seleccione", antecedentes, objGeneral, objEspecificos, estrategias, materialDidactico, comentarios;
        diaFecha = String.valueOf(FechaProgTerapeutica.getCalendar().get(Calendar.DAY_OF_MONTH));
        mesFecha = String.valueOf(FechaProgTerapeutica.getCalendar().get(Calendar.MONTH) + 1);
        annoFecha = String.valueOf(FechaProgTerapeutica.getCalendar().get(Calendar.YEAR));
        fecha = diaFecha + "/" + mesFecha + "/" + annoFecha;
        
        hc = txtNHC.getText();
        for (Map.Entry<Integer, String> formasEnsenanza : fe.entrySet()){
            int fe = formasEnsenanza.getKey();
            if (jcFormaEnsenanza.getSelectedItem().toString().equals(formasEnsenanza.getValue())) {
                formaEnsenanza = String.valueOf(fe);
            }
        }
        
        antecedentes = txtAntecedentes.getText();
        objGeneral = txtObjGeneral.getText();
        objEspecificos = txtObjEspecificos.getText();
        estrategias = txtEstrategias.getText();
        materialDidactico = txtMaterialesDidacticos.getText();
        comentarios = txtComentarios.getText();
      
        if((fecha == null || fecha.trim().isEmpty()) || (hc == null || hc.trim().isEmpty()) || (formaEnsenanza.equals("Seleccione")) || (antecedentes == null || antecedentes.trim().isEmpty()) || (objGeneral == null || objGeneral.trim().isEmpty()) || (objEspecificos == null || objEspecificos.trim().isEmpty()) || (estrategias == null || estrategias.trim().isEmpty()) || (materialDidactico == null || materialDidactico.trim().isEmpty())){
            JOptionPane.showMessageDialog(null, "Se deben diligenciar todos los campos obligatorios", "Gestión Asdesilla", JOptionPane.ERROR_MESSAGE);
        }else{
            int a = OpProgramacionTerapeutica.Guardar(fecha, mesFecha, annoFecha, hc, formaEnsenanza, antecedentes, objGeneral, objEspecificos, estrategias, materialDidactico, comentarios);
            if (a == 0) {
                FechaProgTerapeutica.setDate(new Date());
                jcPaciente.setEnabled(true);
                jcPaciente.removeAllItems();
                jcPaciente.addItem("Seleccione");
                txtDocPac.setText("");
                txtNHC.setText("");
                jcFormaEnsenanza.setSelectedIndex(0);
                txtAntecedentes.setText("");
                txtObjGeneral.setText("");
                txtObjEspecificos.setText("");
                txtEstrategias.setText("");
                txtMaterialesDidacticos.setText("");
                txtComentarios.setText("");
            }
        }
    }
}
