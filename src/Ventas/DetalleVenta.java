package Ventas;

import BaseDatos.Conexion;
import BaseDatos.SQLVentas;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DetalleVenta extends javax.swing.JDialog {

    private int folio;
    private String mesero, cajero;

    public DetalleVenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    DetalleVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textFolio = new javax.swing.JLabel();
        textMesa = new javax.swing.JLabel();
        textIngreso = new javax.swing.JLabel();
        textCierre = new javax.swing.JLabel();
        textEstatus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        Detalles = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        textCMesero = new javax.swing.JLabel();
        textNMesero = new javax.swing.JLabel();
        textCCajero = new javax.swing.JLabel();
        textNCajero = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        textSubtotal = new javax.swing.JLabel();
        textDescuento = new javax.swing.JLabel();
        textTotal = new javax.swing.JLabel();
        textEfectivo = new javax.swing.JLabel();
        textTarjeta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        textFolio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textFolio.setForeground(new java.awt.Color(255, 255, 255));
        textFolio.setText("Folio:");

        textMesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textMesa.setForeground(new java.awt.Color(255, 255, 255));
        textMesa.setText("Mesa:");

        textIngreso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textIngreso.setForeground(new java.awt.Color(255, 255, 255));
        textIngreso.setText("Ingreso:");

        textCierre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textCierre.setForeground(new java.awt.Color(255, 255, 255));
        textCierre.setText("Cierre:");

        textEstatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textEstatus.setForeground(new java.awt.Color(255, 255, 255));
        textEstatus.setText("Estatus:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFolio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(textIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(textCierre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(textEstatus, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFolio)
                .addGap(18, 18, 18)
                .addComponent(textMesa)
                .addGap(18, 18, 18)
                .addComponent(textIngreso)
                .addGap(18, 18, 18)
                .addComponent(textCierre)
                .addGap(18, 18, 18)
                .addComponent(textEstatus)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        tabla.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Platillo", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRowHeight(30);
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(586);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(400);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
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
                jButton3comboMeseroKeyPressed(evt);
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
                DetallescomboMeseroKeyPressed(evt);
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
                jButton5comboMeseroKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Detalles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        textCMesero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textCMesero.setForeground(new java.awt.Color(255, 255, 255));
        textCMesero.setText("Clave del mesero:");

        textNMesero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textNMesero.setForeground(new java.awt.Color(255, 255, 255));
        textNMesero.setText("Nombre del mesero:");

        textCCajero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textCCajero.setForeground(new java.awt.Color(255, 255, 255));
        textCCajero.setText("Clave del cajero:");

        textNCajero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textNCajero.setForeground(new java.awt.Color(255, 255, 255));
        textNCajero.setText("Nombre del cajero:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCMesero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textNMesero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                    .addComponent(textCCajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textNCajero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(textCMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textNMesero)
                .addGap(18, 18, 18)
                .addComponent(textCCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textNCajero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        textSubtotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        textSubtotal.setText("Subtotal:");

        textDescuento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textDescuento.setForeground(new java.awt.Color(255, 255, 255));
        textDescuento.setText("Descuento:");

        textTotal.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textTotal.setForeground(new java.awt.Color(255, 255, 255));
        textTotal.setText("Total:");

        textEfectivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        textEfectivo.setText("Efectivo:");

        textTarjeta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        textTarjeta.setText("Tarjeta:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSubtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textDescuento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addComponent(textTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addComponent(textEfectivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textSubtotal)
                .addGap(18, 18, 18)
                .addComponent(textDescuento)
                .addGap(18, 18, 18)
                .addComponent(textTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Cerrar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3comboMeseroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3comboMeseroKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_jButton3comboMeseroKeyPressed

    private void DetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetallesActionPerformed

    }//GEN-LAST:event_DetallesActionPerformed

    private void DetallescomboMeseroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DetallescomboMeseroKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_DetallescomboMeseroKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5comboMeseroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5comboMeseroKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_jButton5comboMeseroKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Detalles;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel textCCajero;
    private javax.swing.JLabel textCMesero;
    private javax.swing.JLabel textCierre;
    private javax.swing.JLabel textDescuento;
    private javax.swing.JLabel textEfectivo;
    private javax.swing.JLabel textEstatus;
    private javax.swing.JLabel textFolio;
    private javax.swing.JLabel textIngreso;
    private javax.swing.JLabel textMesa;
    private javax.swing.JLabel textNCajero;
    private javax.swing.JLabel textNMesero;
    private javax.swing.JLabel textSubtotal;
    private javax.swing.JLabel textTarjeta;
    private javax.swing.JLabel textTotal;
    // End of variables declaration//GEN-END:variables

    public void setDatos(int folio){
        this.folio = folio;
        getDatosVenta();
        getDatosEmpleados();
    }
    
    private void getDatosEmpleados() {
        SQLVentas sv = new SQLVentas();
        Conexion con = new Conexion();
        ResultSet res = null;
        String sql = "";
        try {
            sql = sv.NombreEmpleado(mesero);
            con.Conectar();
            res = con.Consulta(sql);
            if (res.next()) {
                textNMesero.setText(res.getString(1));
            }
            con.Conectar();
            sql = sv.NombreEmpleado(cajero);
            con.Conectar();
            res = con.Consulta(sql);
            if (res.next()) {
                textNCajero.setText(res.getString(1));
            }
            con.Conectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error DV02 >> " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void getDatosVenta(){
       SQLVentas sv = new SQLVentas();
       Conexion con = new Conexion();
       ResultSet res = null;
       String sql="";
       try{
           sql = sv.VentaFolio(folio);
           con.Conectar();
           res = con.Consulta(sql);
           while(res.next()){
               textFolio.setText("Folio: "+res.getString(1));
               textMesa.setText("Mesa: "+res.getString(2));
               textIngreso.setText("Ingreso: "+res.getString(8));
               textCierre.setText("Cierre: "+res.getString(9));
               int es = res.getInt(10);
               mesero = res.getString(3);
               textCMesero.setText("Clave del mesero: "+mesero);
               cajero = res.getString(4);
               textCCajero.setText("Clave del cajero: "+cajero);
               textSubtotal.setText("Subtotal: $ "+res.getString(5));
               textDescuento.setText("Descuento: $ "+res.getString(6));
               textTotal.setText("Total: $ "+res.getString(7)); 
               if(es == 1){
                   textEstatus.setText("Estatus: Mesa activa");
               }
               else if(es == 2){
                   textEstatus.setText("Estatus: En proceso de pago");
               }
               else if(es == 3){
                   textEstatus.setText("Estatus: Orden cerrada");
               }
               else{
                   textEstatus.setText("Estatus: Error");
               }
           }
           con.Cerrar();
       }catch(Exception e){
           JOptionPane.showMessageDialog(this, "Error DV01 >> "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       }
    }
    
    private void Cerrar(){
        this.dispose();
    }
    
    private void Eventos(KeyEvent evt){
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
        }
        if(evt.getKeyCode() == KeyEvent.VK_F2){
           
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            Cerrar();
        }
    }  
    
}
