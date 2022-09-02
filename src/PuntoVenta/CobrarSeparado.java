package PuntoVenta;

import BaseDatos.Conexion;
import BaseDatos.SQLVentas;
import elmanjarcompleto.Mensajes;
import elmanjarcompleto.Tiempo;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Sides;

public class CobrarSeparado extends javax.swing.JDialog {

    private String referencia;
    private double efectivo;
    private double tarjeta;
    private double pago;
    private double total;
    private double cambio;
    private int folio;
    private int subventa;
    private double subtotal;
    private double propina;
    private double descuento;

    public CobrarSeparado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        botonCobrar.setEnabled(true);
    }
    
    public CobrarSeparado(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        botonCobrar.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textFolio = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelDescuento = new javax.swing.JLabel();
        labelPropina = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        labelSubtotal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        botonCobrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        labelMesero = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textEfectivo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textTarjeta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textReferencia = new javax.swing.JTextField();
        labelPago = new javax.swing.JLabel();
        labelCambio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Folio:");

        textFolio.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textFolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textReferenciaKeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
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
                textReferenciaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        labelDescuento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelDescuento.setForeground(new java.awt.Color(255, 255, 255));
        labelDescuento.setText("Descuento:");

        labelPropina.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelPropina.setForeground(new java.awt.Color(255, 255, 255));
        labelPropina.setText("Propina:");

        labelTotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(255, 255, 255));
        labelTotal.setText("Total:");

        labelSubtotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        labelSubtotal.setText("Subtotal:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPropina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                    .addComponent(labelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(labelSubtotal)
                .addGap(18, 18, 18)
                .addComponent(labelPropina)
                .addGap(18, 18, 18)
                .addComponent(labelDescuento)
                .addGap(18, 18, 18)
                .addComponent(labelTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jButton3.setBackground(new java.awt.Color(204, 153, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jButton3.setText("Regresar");
        jButton3.setMaximumSize(new java.awt.Dimension(100, 56));
        jButton3.setMinimumSize(new java.awt.Dimension(100, 56));
        jButton3.setPreferredSize(new java.awt.Dimension(100, 56));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textReferenciaKeyPressed(evt);
            }
        });

        botonCobrar.setBackground(new java.awt.Color(204, 0, 0));
        botonCobrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recibe.png"))); // NOI18N
        botonCobrar.setText("Cobrar");
        botonCobrar.setMaximumSize(new java.awt.Dimension(100, 56));
        botonCobrar.setMinimumSize(new java.awt.Dimension(100, 56));
        botonCobrar.setPreferredSize(new java.awt.Dimension(100, 56));
        botonCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCobrarActionPerformed(evt);
            }
        });
        botonCobrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textReferenciaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCobrar, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(451, 451, 451)
                .addComponent(botonCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton3.getAccessibleContext().setAccessibleDescription("");

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setMaximumSize(new java.awt.Dimension(1366, 768));

        labelMesero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelMesero.setForeground(new java.awt.Color(255, 255, 255));
        labelMesero.setText("Mesero:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMesero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMesero)
                .addGap(33, 33, 33))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Efectivo:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("$");

        textEfectivo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textReferenciaKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tarjeta:");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("$");

        textTarjeta.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textReferenciaKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Referencia");

        textReferencia.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textReferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textReferenciaKeyPressed(evt);
            }
        });

        labelPago.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelPago.setForeground(new java.awt.Color(255, 255, 255));
        labelPago.setText("Pago:");

        labelCambio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelCambio.setForeground(new java.awt.Color(255, 255, 255));
        labelCambio.setText("Cambio:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 224, Short.MAX_VALUE))
                    .addComponent(labelPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(textReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(labelPago)
                .addGap(18, 18, 18)
                .addComponent(labelCambio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Buscar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Cerrar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botonCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCobrarActionPerformed
        Cobrar();
    }//GEN-LAST:event_botonCobrarActionPerformed

    private void textReferenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textReferenciaKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_textReferenciaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCobrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labelCambio;
    private javax.swing.JLabel labelDescuento;
    private javax.swing.JLabel labelMesero;
    private javax.swing.JLabel labelPago;
    private javax.swing.JLabel labelPropina;
    private javax.swing.JLabel labelSubtotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTextField textEfectivo;
    private javax.swing.JTextField textFolio;
    private javax.swing.JTextField textReferencia;
    private javax.swing.JTextField textTarjeta;
    // End of variables declaration//GEN-END:variables

    public void TamañoPantalla() {
        this.setSize(1920, 1030);
    }
    
    public void setDatos(int folio){
        this.folio = folio;
    }
    
    private String LimitarTexto(String texto){
        int x = texto.length();
        if(x >32){
            return texto.substring(0, 31);
        }else{
            return texto;
        }
    }
    
    private void TicketPago(){
        Tiempo t = new Tiempo();
        DocFlavor flavor = DocFlavor.SERVICE_FORMATTED.PAGEABLE;
        PrintRequestAttributeSet patts = new HashPrintRequestAttributeSet();
        patts.add(Sides.DUPLEX);
        
        PrintService[] ps = PrintServiceLookup.lookupPrintServices(flavor, patts);
        if(ps.length == 0){
            throw new IllegalStateException("1. No se encontro la impresora");
        }
        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
        PrintService myService = null;
        for(PrintService printService : printServices){
            if(printService.getName().equals("Caja")){
                myService = printService;
                break;
            }
        }
        if(myService == null){
            throw new IllegalStateException("2. Impresora no encontrada");
        }     
        ByteArrayOutputStream expected = new ByteArrayOutputStream();

        expected.writeBytes("     RESTAURANTE EL MANJAR      \n".getBytes());
        expected.writeBytes("         RECIBO DE PAGO         \n".getBytes());
        expected.writeBytes(("      " + t.HoraAcceso() + "       \n").getBytes());  //19 caracteres
        expected.writeBytes("--------------------------------\n\n".getBytes());
        expected.writeBytes((LimitarTexto(folio+"-"+subventa) + "\n").getBytes());
        expected.writeBytes("--------------------------------\n".getBytes());
        expected.writeBytes(("Efectivo: $ " + String.format("%.2f", efectivo) + "\n").getBytes());
        expected.writeBytes(("Tarjeta: $ " + String.format("%.2f", tarjeta) + "\n").getBytes());
        expected.writeBytes(("Referencia: " + referencia + "\n").getBytes());
        expected.writeBytes(("Cambio: $ " + String.format("%.2f", cambio) + "\n").getBytes());
        expected.writeBytes("--------------------------------\n".getBytes());
        expected.writeBytes(("  TOTAL: $ " + String.format("%.2f", total) + "\n").getBytes());
        expected.writeBytes(" \n".getBytes());
        expected.writeBytes(" \n".getBytes());
        expected.writeBytes(" \n".getBytes());
        expected.writeBytes(" \n".getBytes());

        DocPrintJob job = myService.createPrintJob();
        Doc doc = new SimpleDoc(expected.toByteArray(), DocFlavor.BYTE_ARRAY.AUTOSENSE, null);      
        try{
            job.print(doc, new HashPrintRequestAttributeSet());
        }catch(Exception e){
            System.out.println("Error>> "+e.getMessage());
        }
    }
    
    private void Buscar() {
        SQLVentas sv = new SQLVentas();
        Conexion con = new Conexion();
        Mensajes m = new Mensajes();
        boolean existe = false;
        try {
            String t = textFolio.getText();
            int a = t.indexOf("-");
            String s = t.substring((a+1));
            subventa = Integer.parseInt(s);
            System.out.println(folio+"//"+subventa);
            String sql = sv.ObtenerSubventaNoPagada(folio, subventa);
            con.Conectar();
            ResultSet res = con.Consulta(sql);
            if(res.next()){
                existe = true;
                subtotal = res.getDouble(4);
                propina = res.getDouble(7);
                descuento = res.getDouble(5);
                total = res.getDouble(6);
                botonCobrar.setEnabled(true);
            }
            else{
                m.alerta(this, "Folio incorrecto", "El folio ingresado no existe o no está bien escrito");
                botonCobrar.setEnabled(false);
            }
            con.Cerrar();
            if(existe){
                labelSubtotal.setText("Subtotal: $ "+String.format("%.2f", subtotal));
                labelPropina.setText("Propina: $ "+String.format("%.2f", propina));
                labelDescuento.setText("Descuento: $ "+String.format("%.2f", descuento));
                labelTotal.setText("Total: $ "+String.format("%.2f", total));
                sql = sv.MeseroVenta(folio);
                con.Conectar();
                res = con.Consulta(sql);
                if(res.next()){
                    labelMesero.setText("Mesero: "+res.getString(1)+" - "+res.getString(2));
                }
                con.Cerrar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error CS01 >> " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void Cobrar(){
        Conexion con = new Conexion();
        SQLVentas sv = new SQLVentas();
        Mensajes m = new Mensajes();
        Boolean error = false;
        String ef = textEfectivo.getText();
        String ta = textTarjeta.getText();
        referencia = textReferencia.getText();
        if(ef != null){
            efectivo = Double.parseDouble(ef);
        }
        else{
            efectivo = 0.0;
        }
        if(!referencia.isEmpty()){
            if(!ta.isEmpty()){
                tarjeta = Double.parseDouble(ta);
            }
            else{
                error = true;
            }
        }else{
            if(ta.isEmpty() || ta.equals("0.0") || ta.equals("0")){
                tarjeta = 0.0;
            }
            else if(!ta.isEmpty() ){
                System.out.println("lol");
                error = true;
            }

        }
        
        if(error){
            m.error(this,"Datos de tarjeta" , "Falta la cantidad o la referencia del pago con tarjeta");
        }
        else{
            pago = efectivo + tarjeta;
            labelPago.setText("Pago: "+String.format("%.2f", pago));
            if(pago < total){
                System.out.println("Falta");
                cambio = pago - total;
                labelCambio.setText("Cambio: "+String.format("%.2f", cambio));               
            }
           else if(pago > total){
                System.out.println("Se da cambio");
                cambio = pago - total;
                labelCambio.setText(""+String.format("%.2f", cambio));
                if (m.confirmar(this, "Cobrar", "¿Estas seguro de proceder con el pago?. Recuerda dar el cambio.")) {
                    String sql;
                    if (efectivo > 0) {
                        sql = sv.SubpagoEfectivo(folio, subventa, efectivo);
                        con.Conectar();
                        con.Modificar(sql);
                        con.Cerrar();
                    }
                    if (tarjeta > 0) {
                        sql = sv.SubpagoTarjeta(folio, subventa, tarjeta, referencia);
                        con.Conectar();
                        con.Modificar(sql);
                        con.Cerrar();
                    }
                    sql = sv.CambiarSubventaEstatus(folio,subventa, 1);
                    con.Conectar();
                    con.Modificar(sql);
                    con.Cerrar();
                    TicketPago();
                }
            }
            else{
                if (m.confirmar(this, "Cobrar", "¿Estas seguro de proceder con el pago?")) {
                    String sql;
                    cambio = 0.0;
                    labelCambio.setText("" + String.format("%.2f", cambio));
                    if (efectivo > 0) {
                        sql = sv.PagoEfectivo(folio, efectivo);
                        con.Conectar();
                        con.Modificar(sql);
                        con.Cerrar();
                    }
                    if (tarjeta > 0) {
                        sql = sv.PagoTarjeta(folio, tarjeta, referencia);
                        con.Conectar();
                        con.Modificar(sql);
                        con.Cerrar();
                    }
                    sql = sv.CambiarSubventaEstatus(folio,subventa, 1);
                    con.Conectar();
                    con.Modificar(sql);
                    con.Cerrar();
                    TicketPago();
                }
            }
        }        
    }   
    
    private void Cerrar(){
        this.dispose();
    }
    
    private void Eventos(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            Buscar();
        }
        else if (evt.getKeyCode() == KeyEvent.VK_F2) {
            Cobrar();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            Cerrar();
        }
    }
}
