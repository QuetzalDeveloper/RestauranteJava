package PuntoVenta;

import BaseDatos.Conexion;
import BaseDatos.SQLVentas;
import elmanjarcompleto.Mensajes;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PVCarta extends javax.swing.JDialog {

    private String user;

    public PVCarta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        tabla.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mesa", "Folio", "Mesero", "Ingreso", "Cierre", "Estatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setMaximumSize(new java.awt.Dimension(1040, 540));
        tabla.setRowHeight(27);
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(250);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(250);
            tabla.getColumnModel().getColumn(5).setResizable(false);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaKeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaKeyPressed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 153, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/puntoventa.png"))); // NOI18N
        jButton3.setText("Caja - 1 Cuenta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaKeyPressed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 204));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/precio.png"))); // NOI18N
        jButton4.setText("Cobrar separadas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaKeyPressed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 0, 204));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/personas.png"))); // NOI18N
        jButton5.setText("Cuentas separadas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Cerrar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LlenarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AbrirCaja();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CajaSeparada();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AbrirSeparada();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_tablaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    public void TamañoPantalla() {
       this.setSize(1000, 500);
    }
    
    private void CajaSeparada() {
        Conexion con = new Conexion();
        SQLVentas sv = new SQLVentas();
        Mensajes m = new Mensajes();
        boolean estado = false;
        int fila = tabla.getSelectedRow();
        if (fila < 0) {
            m.error(this, "Selecciona la mesa", "Selecciona la cuenta o mesa de la tabla");
        } else {
            String estatus = tabla.getValueAt(fila, 5).toString();
            String f = tabla.getValueAt(fila, 1).toString();
            int folio = Integer.parseInt(f);
            if (estatus.equals("Separado")) {
                CobrarSeparado cs = new CobrarSeparado(this, true);
                cs.TamañoPantalla();
                cs.setDatos(folio);
                cs.setLocationRelativeTo(null);
                cs.setVisible(true);

                try {
                    String sql = sv.SubPagosNoPagados(folio);
                    con.Conectar();
                    ResultSet res = con.Consulta(sql);
                    if (res.next()) {
                        System.out.println("Hay subpagos sin cobrar");
                    } else {
                        estado = true;
                    }
                    if (estado) {
                        con.Cerrar();
                        sql = sv.CambiarVentaEstatus(folio, 5);
                        con.Conectar();
                        con.Modificar(sql);
                        con.Cerrar();
                        LlenarTabla();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error PVC02 > " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    
    private void AbrirSeparada(){
        Mensajes m = new Mensajes();
        int fila = tabla.getSelectedRow();
        if(fila < 0){
            m.error(this, "Selecciona la mesa", "Selecciona la cuenta o mesa de la tabla");
        }
        else{
            String estatus = tabla.getValueAt(fila, 5).toString();
            String f = tabla.getValueAt(fila, 1).toString();
            int folio = Integer.parseInt(f);
            if (estatus.equals("Abierto")) {
                PVCuSep c = new PVCuSep(this, true);
                c.TamañoPantalla();
                c.setDatos(folio, false, user);
                c.setLocationRelativeTo(null);
                c.setVisible(true);
            }
            else if(estatus.equals("Cobrar")){
                PVCuSep c = new PVCuSep(this, true);
                c.TamañoPantalla();
                c.setDatos(folio, true, user);
                c.setLocationRelativeTo(null);
                c.setVisible(true);
            }
            else if(estatus.equals("Separado")){
                m.alerta(this, "Realizado", "Esta venta ya ha sido separada.");
            }
        }
    }
    
    private void AbrirCaja(){
        int fila = tabla.getSelectedRow();
        if(fila < 0){
            Mensajes m = new Mensajes();
            m.error(this, "Selecciona la mesa", "Selecciona la cuenta o mesa de la tabla");
        }
        else{
            String estatus = tabla.getValueAt(fila, 5).toString();
            String f = tabla.getValueAt(fila, 1).toString();
            int folio = Integer.parseInt(f);
            if (estatus.equals("Abierto")) {
                PVMesa c = new PVMesa(this, true);
                //c.TamañoPantalla();
                c.setDatos(folio, false, user);
                c.setLocationRelativeTo(null);
                c.setVisible(true);
            }
            else if(estatus.equals("Cobrar")){
                PVMesa c = new PVMesa(this, true);
                //c.TamañoPantalla();
                c.setDatos(folio, false, user);
                c.setLocationRelativeTo(null);
                c.setVisible(true);
            }
            else if(estatus.equals("Ticket")){
                PVMesa c = new PVMesa(this, true);
                //c.TamañoPantalla();
                c.setDatos(folio, true, user);
                c.setLocationRelativeTo(null);
                c.setVisible(true);
            }
        }
        LlenarTabla();
    }

    public void setDatos(String user){
        this.user = user;
        LlenarTabla();
    }
    
    private void LlenarTabla(){
        DefaultTableModel dtm = (DefaultTableModel) tabla.getModel();
        SQLVentas sv = new SQLVentas();
        Conexion con = new Conexion();
        ResultSet res = null;
        Object[] nf = {null,null,null,null,null,null};
        try{
            for(int i =0 ; i<20; i++){
                tabla.setValueAt(""+(i+1), i, 0);
                tabla.setValueAt("#", i, 1);
                tabla.setValueAt("#", i, 2);
                tabla.setValueAt("#", i, 3);
                tabla.setValueAt("#", i, 4);
                tabla.setValueAt("Libre", i, 5);
            }           
            String sql = sv.MesasActivasCerradas();
            con.Conectar();
            res = con.Consulta(sql);
            while(res.next()){
                int mesa = res.getInt(2);   
                tabla.setValueAt(res.getString(1), mesa-1, 1);  //Folio
                tabla.setValueAt(res.getString(3), mesa-1, 2);  //Mesero
                tabla.setValueAt(res.getString(8), mesa-1, 3);  //Ingreso
                tabla.setValueAt(res.getString(9), mesa-1, 4);  //Ingreso
                int estatus = res.getInt(10);   //Estatus
                if(estatus == 1){
                    tabla.setValueAt("Abierto", mesa-1, 5); 
                }
                else if(estatus == 2){
                    tabla.setValueAt("Cobrar", mesa-1, 5);
                }
                else if(estatus == 3){
                    tabla.setValueAt("Ticket", mesa-1, 5);
                }
                else if(estatus == 4){
                    tabla.setValueAt("Separado", mesa-1, 5);
                }
            }
            con.Cerrar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error PVC01 >> "+e.getMessage());
        }
    }
    
    private void Cerrar(){
        this.dispose();
    }
 
    private void Eventos(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            AbrirCaja();
        } else if (evt.getKeyCode() == KeyEvent.VK_F2) {
            AbrirSeparada();
        } else if (evt.getKeyCode() == KeyEvent.VK_F3) {
            CajaSeparada();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            LlenarTabla();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            Cerrar();
        }
    }
}
