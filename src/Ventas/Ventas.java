package Ventas;

import BaseDatos.Conexion;
import BaseDatos.SQLVentas;
import elmanjarcompleto.Mensajes;
import elmanjarcompleto.Tiempo;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ventas extends javax.swing.JDialog {
    
    private int conta = 0;

    public Ventas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        Detalles = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        ventas = new javax.swing.JLabel();
        labelSubtotal = new javax.swing.JLabel();
        labelVentas = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        labelDescuento = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textFolio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboMesero = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        dateDesde = new datechooser.beans.DateChooserCombo();
        jLabel5 = new javax.swing.JLabel();
        dateHasta = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        tabla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Mesa", "Mesero", "Subtotal", "Descuento", "Total", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRowHeight(35);
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboMeseroKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(170);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(5).setResizable(false);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(6).setResizable(false);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1069, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jButton3.setBackground(new java.awt.Color(255, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboMeseroKeyPressed(evt);
            }
        });

        Detalles.setBackground(new java.awt.Color(51, 204, 255));
        Detalles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Detalles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/detalles.png"))); // NOI18N
        Detalles.setText("Detalles");
        Detalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetallesActionPerformed(evt);
            }
        });
        Detalles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboMeseroKeyPressed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 102, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/documento.png"))); // NOI18N
        jButton5.setText("Reporte");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboMeseroKeyPressed(evt);
            }
        });

        ventas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ventas.setForeground(new java.awt.Color(255, 255, 255));
        ventas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ventas.setText("Corte de caja");

        labelSubtotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        labelSubtotal.setText("Subtotal:");

        labelVentas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelVentas.setForeground(new java.awt.Color(255, 255, 255));
        labelVentas.setText("Ventas:");

        labelTotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(255, 255, 255));
        labelTotal.setText("Total:");

        labelDescuento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelDescuento.setForeground(new java.awt.Color(255, 255, 255));
        labelDescuento.setText("Descuentos:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Detalles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelDescuento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Detalles, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Folio:");

        textFolio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textFolio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFolioFocusGained(evt);
            }
        });
        textFolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFoliocomboTipoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFolioKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mesero:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Desde:");

        comboMesero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        comboMesero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comboMeseroFocusGained(evt);
            }
        });
        comboMesero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboMeseroKeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboMeseroKeyPressed(evt);
            }
        });

        dateDesde.setWeekStyle(datechooser.view.WeekDaysStyle.FULL);
        try {
            dateDesde.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
        } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
            e1.printStackTrace();
        }
        dateDesde.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 14));
        dateDesde.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                dateDesdeOnSelectionChange(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hasta:");

        dateHasta.setWeekStyle(datechooser.view.WeekDaysStyle.FULL);
        try {
            dateHasta.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
        } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
            e1.printStackTrace();
        }
        dateHasta.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 14));
        dateHasta.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                dateHastaOnSelectionChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(textFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(comboMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)
                        .addGap(255, 255, 255))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dateDesde, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)))
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comboMesero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(textFolio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateDesde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateHasta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Cerrar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void DetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetallesActionPerformed
        DetallesDeVenta();
    }//GEN-LAST:event_DetallesActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void textFolioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFolioFocusGained
        textFolio.setText(null);
        comboMesero.setSelectedIndex(0);
        dateDesde.setCurrent(null);
        dateHasta.setCurrent(null);
    }//GEN-LAST:event_textFolioFocusGained

    private void textFoliocomboTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFoliocomboTipoKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textFoliocomboTipoKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Consulta();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboMeseroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboMeseroFocusGained
        textFolio.setText(null);
        comboMesero.setSelectedIndex(0);
        dateDesde.setCurrent(null);
        dateHasta.setCurrent(null);
    }//GEN-LAST:event_comboMeseroFocusGained

    private void textFolioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFolioKeyTyped
        Eventos(evt);
    }//GEN-LAST:event_textFolioKeyTyped

    private void comboMeseroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboMeseroKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_comboMeseroKeyPressed

    private void dateDesdeOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dateDesdeOnSelectionChange
        textFolio.setText(null);
        comboMesero.setSelectedIndex(0);
    }//GEN-LAST:event_dateDesdeOnSelectionChange

    private void dateHastaOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dateHastaOnSelectionChange
        textFolio.setText(null);
        comboMesero.setSelectedIndex(0);
    }//GEN-LAST:event_dateHastaOnSelectionChange



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Detalles;
    private javax.swing.JComboBox<String> comboMesero;
    private datechooser.beans.DateChooserCombo dateDesde;
    private datechooser.beans.DateChooserCombo dateHasta;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDescuento;
    private javax.swing.JLabel labelSubtotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelVentas;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textFolio;
    private javax.swing.JLabel ventas;
    // End of variables declaration//GEN-END:variables

    private void DetallesDeVenta() {
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            String f = tabla.getValueAt(fila, 0).toString();
            int folio = Integer.parseInt(f);
            DetalleVenta dv = new DetalleVenta();
            dv.setDatos(folio);
            dv.setLocationRelativeTo(null);
            dv.setVisible(true);
        }
        else{
            Mensajes m = new Mensajes();
            m.alerta(this, "Selecciona la venta", "Selecciona una venta que se muestre en la tabla.");
        }
    }

    public void Consulta() {
        SQLVentas sv = new SQLVentas();
        Tiempo t = new Tiempo();
        String folio = textFolio.getText();
        int mesero = comboMesero.getSelectedIndex();
        String desde = "";
        String hasta = "";
        if(dateDesde.getText().isEmpty()){
            desde = null;
        }
        else{
            desde = t.ChooserToString(dateDesde);
        }
        if(dateHasta.getText().isEmpty()){
            hasta = null;
        }
        else{
            hasta = t.ChooserToString(dateHasta);
        }
        
        String sql="";
        
        if(!folio.isEmpty() && mesero == 0 && desde == null && hasta == null){
            try{
                int f = Integer.parseInt(folio);
                sql = sv.VentaFolio(f);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Error Ve02 >> "+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(folio.isEmpty() && mesero > 0 && desde == null &&hasta == null){
            String m = comboMesero.getSelectedItem().toString();
            int p = m.indexOf(".");
            m = m.substring(0, p);
            sql = sv.VentasMesero(m);
        }
        
        else if(folio.isEmpty() && mesero== 0 && desde != null && hasta == null){
            sql = sv.VentasDesde(desde);
        }
        
        else if(folio.isEmpty() && mesero== 0 && desde == null && hasta != null){
            sql = sv.VentasHasta(hasta);
        }
        
        else if(folio.isEmpty() && mesero== 0 && desde != null && hasta != null){
            sql = sv.VentasPeriodo(desde,hasta);
        }
        
        else{
            sql = sv.TodoVentas();
        }

        LlenarTabla(sql);
    }
    
     private void LlenarTabla(String sql){
        Conexion con = new Conexion();
        ResultSet res;
        Object nf[] = {null,null,null,null,null,null,null};
        DefaultTableModel ntm = (DefaultTableModel) tabla.getModel();
        for(int b = (conta -1); b >= 0; b--){
            ntm.removeRow(b);
        }
        double subtotal = 0;
        double descuento = 0;
        double total = 0;
        conta = 0;
        try{
            con.Conectar();
            res = con.Consulta(sql);
            while(res.next()){
               ntm.addRow(nf);
               tabla.setValueAt(res.getString(1), conta, 0);    //id
               tabla.setValueAt(res.getString(2), conta, 1);    //mesa
               tabla.setValueAt(res.getString(3), conta, 2);    //mesero
               tabla.setValueAt("$ "+res.getString(5), conta, 3);   //Subtotal
               tabla.setValueAt("$ "+res.getString(6), conta, 4);   //Descuento
               tabla.setValueAt("$ "+res.getString(7), conta, 5);   //Total
               tabla.setValueAt(res.getString(8), conta, 6);   //Fecha
               
               subtotal += res.getDouble(5);
               descuento += res.getDouble(6);
               total += res.getDouble(7);
               labelSubtotal.setText("Subtotal = $ "+subtotal);
               labelDescuento.setText("Descuentos = $ "+descuento);
               labelTotal.setText("Total = $ "+total);
               
               conta++;
            }
            con.Cerrar();
            labelVentas.setText(conta + " ventas");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Error Ve03 >> "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);            
        }        
    }
    
    private void Cerrar(){
        this.dispose();
    }
    
    public void setDatos(){
        LlenarComboMesero();
        Consulta();
    }
    
    private void LlenarComboMesero(){
        SQLVentas sv = new SQLVentas();
        Conexion con = new Conexion();
        ResultSet res;
        try{
            String sql = sv.ComboMesero();
            con.Conectar();
            res = con.Consulta(sql);
            comboMesero.addItem("Selecciona...");
            while(res.next()){
                String item = res.getString(1)+". "+res.getString(2);
                comboMesero.addItem(item);
            }
            con.Cerrar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error Ve01 >> "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void Eventos(KeyEvent evt){
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Consulta();
        }
        if(evt.getKeyCode() == KeyEvent.VK_F2){
           
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            Cerrar();
        }
    }    
    
}
