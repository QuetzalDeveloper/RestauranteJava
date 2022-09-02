package PuntoVenta;

import BaseDatos.Conexion;
import BaseDatos.SQLVentas;
import elmanjarcompleto.Mensajes;
import elmanjarcompleto.Tiempo;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Sides;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.print.attribute.standard.MediaPrintableArea;
import javax.print.attribute.standard.OrientationRequested;

public class PVMesa extends javax.swing.JDialog {

    private int folio, estatus, conta = 0;
    private boolean estado;
    private String cajero, referencia;
    private String mesero;
    private Double subtotal = 0.0, propina=0.0, descuento = 0.0, total = 0.0;
    private Double pago,efectivo,tarjeta, cambio;

    public PVMesa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public PVMesa(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCobrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textTarjeta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textEfectivo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textReferencia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        labelPago = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelCambio = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelMesa = new javax.swing.JLabel();
        labelMesero = new javax.swing.JLabel();
        labelFolio = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textDescuento = new javax.swing.JTextField();
        botonDescuento = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textPropina = new javax.swing.JTextField();
        botonPropina = new javax.swing.JButton();
        labelSubtotal = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        labelEgreso = new javax.swing.JLabel();
        labelIngreso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        botonCobrar.setBackground(new java.awt.Color(153, 0, 0));
        botonCobrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonCobrar.setForeground(new java.awt.Color(255, 255, 255));
        botonCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recibe.png"))); // NOI18N
        botonCobrar.setText("Cobrar");
        botonCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCobrarActionPerformed(evt);
            }
        });
        botonCobrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonCobrarKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Efectivo:");

        textTarjeta.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textTarjeta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textTarjeta.setText("0.0");
        textTarjeta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textTarjetaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textTarjetaFocusLost(evt);
            }
        });
        textTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonCobrarKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tarjeta:");

        textEfectivo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textEfectivo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textEfectivo.setText("0.0");
        textEfectivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textEfectivoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textEfectivoFocusLost(evt);
            }
        });
        textEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonCobrarKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Referencia:");

        textReferencia.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textReferencia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textReferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonCobrarKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total:");

        labelPago.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelPago.setForeground(new java.awt.Color(51, 153, 0));
        labelPago.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPago.setText("0.0");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cambio:");

        labelCambio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelCambio.setForeground(new java.awt.Color(204, 102, 0));
        labelCambio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCambio.setText("0.0");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("$");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCobrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(textReferencia)
                    .addComponent(textTarjeta)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(textEfectivo)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPago)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCambio)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(botonCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        labelMesa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelMesa.setForeground(new java.awt.Color(255, 255, 255));
        labelMesa.setText("Mesa: ");

        labelMesero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelMesero.setForeground(new java.awt.Color(255, 255, 255));
        labelMesero.setText("Mesero:");

        labelFolio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelFolio.setForeground(new java.awt.Color(255, 255, 255));
        labelFolio.setText("Folio:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFolio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMesero, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFolio)
                .addGap(18, 18, 18)
                .addComponent(labelMesa)
                .addGap(18, 18, 18)
                .addComponent(labelMesero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Subtotal:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descuento:");

        textDescuento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textDescuento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textDescuentoFocusGained(evt);
            }
        });
        textDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonCobrarKeyPressed(evt);
            }
        });

        botonDescuento.setBackground(new java.awt.Color(0, 153, 153));
        botonDescuento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonDescuento.setText("Aplicar");
        botonDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDescuentoActionPerformed(evt);
            }
        });
        botonDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonCobrarKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Total:");

        labelTotal.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(153, 0, 0));
        labelTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTotal.setText("$ 999999.99");
        labelTotal.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Propina:");

        textPropina.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textPropina.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textPropinaFocusGained(evt);
            }
        });
        textPropina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonCobrarKeyPressed(evt);
            }
        });

        botonPropina.setBackground(new java.awt.Color(0, 153, 153));
        botonPropina.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonPropina.setText("Aplicar");
        botonPropina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPropinaActionPerformed(evt);
            }
        });
        botonPropina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonCobrarKeyPressed(evt);
            }
        });

        labelSubtotal.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        labelSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        labelSubtotal.setText("$ 0.0");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("$");

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("$");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(textDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(textPropina, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonPropina, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(227, 227, 227))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelSubtotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPropina, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonPropina, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        tabla.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Platillo", "Peticiones", "Precio"
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
        tabla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tablaFocusGained(evt);
            }
        });
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonCobrarKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(400);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(500);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recibe.png"))); // NOI18N
        jButton3.setText("Ticket");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonCobrarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonCobrarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        labelEgreso.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelEgreso.setForeground(new java.awt.Color(255, 255, 255));
        labelEgreso.setText("Egreso:");

        labelIngreso.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelIngreso.setForeground(new java.awt.Color(255, 255, 255));
        labelIngreso.setText("Ingreso:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEgreso, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelEgreso)
                .addGap(19, 19, 19))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(labelIngreso)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cerrar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonPropinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPropinaActionPerformed
        AgregarPropina();
    }//GEN-LAST:event_botonPropinaActionPerformed

    private void botonDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDescuentoActionPerformed
        AgregarDescuento();
    }//GEN-LAST:event_botonDescuentoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            ProcesarVenta();
            ImagenEscalada(); 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PVMesa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botonCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCobrarActionPerformed
        Cobrar(true);
    }//GEN-LAST:event_botonCobrarActionPerformed

    private void textEfectivoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textEfectivoFocusLost
        if(textEfectivo.getText().isEmpty()){
            textEfectivo.setText("0.0");
        }
        Cobrar(false);
    }//GEN-LAST:event_textEfectivoFocusLost

    private void textTarjetaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textTarjetaFocusLost
        if(textTarjeta.getText().isEmpty()){
            textTarjeta.setText("0.0");
        }
        Cobrar(false);
    }//GEN-LAST:event_textTarjetaFocusLost

    private void textEfectivoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textEfectivoFocusGained
        textEfectivo.setText(null);
        Cobrar(false);
    }//GEN-LAST:event_textEfectivoFocusGained

    private void textTarjetaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textTarjetaFocusGained
        textTarjeta.setText(null);
        Cobrar(false);
    }//GEN-LAST:event_textTarjetaFocusGained

    private void textPropinaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textPropinaFocusGained
        textPropina.setText(null);
        Cobrar(false);
    }//GEN-LAST:event_textPropinaFocusGained

    private void textDescuentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textDescuentoFocusGained
        textDescuento.setText(null);
        Cobrar(false);
    }//GEN-LAST:event_textDescuentoFocusGained

    private void botonCobrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonCobrarKeyPressed
        Eventos(evt);
    }//GEN-LAST:event_botonCobrarKeyPressed

    private void tablaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tablaFocusGained
       Cobrar(false);
    }//GEN-LAST:event_tablaFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCobrar;
    private javax.swing.JButton botonDescuento;
    private javax.swing.JButton botonPropina;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCambio;
    private javax.swing.JLabel labelEgreso;
    private javax.swing.JLabel labelFolio;
    private javax.swing.JLabel labelIngreso;
    private javax.swing.JLabel labelMesa;
    private javax.swing.JLabel labelMesero;
    private javax.swing.JLabel labelPago;
    private javax.swing.JLabel labelSubtotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textDescuento;
    private javax.swing.JTextField textEfectivo;
    private javax.swing.JTextField textPropina;
    private javax.swing.JTextField textReferencia;
    private javax.swing.JTextField textTarjeta;
    // End of variables declaration//GEN-END:variables

    public void TamañoPantalla() {
        this.setSize(1000, 500);
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
        expected.writeBytes((LimitarTexto(labelFolio.getText()) + "\n").getBytes());
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
        expected.writeBytes(" \n".getBytes());

        DocPrintJob job = myService.createPrintJob();
        Doc doc = new SimpleDoc(expected.toByteArray(), DocFlavor.BYTE_ARRAY.AUTOSENSE, null);      
        try{
            job.print(doc, new HashPrintRequestAttributeSet());
        }catch(Exception e){
            System.out.println("Error>> "+e.getMessage());
        }
    }
    
    private void Cobrar(boolean ticket){
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
            labelPago.setText(""+String.format("%.2f", pago));
            if(pago < total){
                System.out.println("Falta");
                cambio = pago - total;
                labelCambio.setText(""+String.format("%.2f", cambio));               
            }
           else if(pago > total){
                System.out.println("Se da cambio");
                cambio = pago - total;
                labelCambio.setText("" + String.format("%.2f", cambio));
                if (ticket) {
                    if (m.confirmar(this, "Cobrar", "¿Estas seguro de proceder con el pago?. Recuerda dar el cambio.")) {
                        String sql;
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
                        sql = sv.CambiarVentaEstatus(folio, 5);
                        con.Conectar();
                        con.Modificar(sql);
                        con.Cerrar();
                        TicketPago();
                    }
                }
            } else {
                if (ticket) {
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
                        sql = sv.CambiarVentaEstatus(folio, 5);
                        con.Conectar();
                        con.Modificar(sql);
                        con.Cerrar();
                        TicketPago();
                    }
                }
            }
        }

        
    }
    
    private void ProcesarVenta(){
       Conexion con = new Conexion();
       SQLVentas sv = new SQLVentas();
       String sql = sv.CompletarVenta(folio,cajero,subtotal,total,3);
       con.Conectar();
       con.Modificar(sql);
       con.Cerrar();
    }
    
    private void AgregarDescuento(){
        Conexion con = new Conexion();
        SQLVentas sv = new SQLVentas();
        String p = textDescuento.getText();
        total += descuento;
        descuento = Double.parseDouble(p);
        total -= descuento;
        String sql = sv.CambiarDescuento(folio,descuento);
        con.Conectar();
        con.Modificar(sql);
        con.Cerrar();
        labelTotal.setText("$ "+String.format("%.2f", total));
    }
    
    private void AgregarPropina(){
        Conexion con = new Conexion();
        SQLVentas sv = new SQLVentas();
        String p = textPropina.getText();
        total -= propina;
        propina = Double.parseDouble(p);
        total+= propina;
        String sql = sv.CambiarPropina(folio,propina);
        con.Conectar();
        con.Modificar(sql);
        con.Cerrar();
        labelTotal.setText("$ "+String.format("%.2f", total));
    }
    
    private void LlenarTabla(){
        DefaultTableModel dtm = (DefaultTableModel) tabla.getModel();
        SQLVentas sv = new SQLVentas();
        Conexion con = new Conexion();
        Object[] nf = {null,null,null,null};
        try{
            String sql = sv.PlatillosVenta(folio);
            con.Conectar();
            ResultSet res = con.Consulta(sql);
            while(res.next()){
                dtm.addRow(nf);
                tabla.setValueAt(res.getString(3), conta, 0);
                tabla.setValueAt(res.getString(7), conta, 1);
                tabla.setValueAt(res.getString(5), conta, 2);
                subtotal += res.getDouble(4);
                tabla.setValueAt("$ "+String.format("%.2f", res.getDouble(4)), conta, 3);
                conta++;
            }
            con.Cerrar();
            labelSubtotal.setText("$ "+String.format("%.2f", subtotal));
            total += subtotal;
            labelTotal.setText("$ "+String.format("%.2f", total));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error PVM 02 >> "+e.getMessage(), cajero, HEIGHT);
        }
    }
    
    private void LlenarCabecera(){
        Conexion con= new Conexion();
        SQLVentas sv = new SQLVentas();
        ResultSet res = null;
        String p = "", d="";
        Tiempo t = new Tiempo();
        try{
            labelFolio.setText("Folio: "+folio);
            String sql = sv.VentaFolio(folio);
            con.Conectar();
            res = con.Consulta(sql);
            if(res.next()){
                labelMesa.setText("Mesa: " + res.getInt(2));
                mesero = res.getString(3);
                labelIngreso.setText("Ingreso: " + t.TimestampTexto(res.getString(8)));
                if (estado) {
                    labelEgreso.setText("Egreso: " + t.TimestampTexto(res.getString(9)));
                }
                estatus = res.getInt(10);
                p = res.getString(11);
                if (p != null) {
                    propina = Double.parseDouble(p);
                } else {
                    propina = 0.0;
                }
                d = res.getString(6);
                if (d != null) {
                    descuento = Double.parseDouble(d);
                } else {
                    descuento = 0.0;
                }
            }
            con.Cerrar();
            textPropina.setText(String.format("%.2f", propina));
            textDescuento.setText(String.format("%.2f", descuento));
            total = propina - descuento;
            sql = sv.NombreEmpleado(mesero);
            con.Conectar();
            res = con.Consulta(sql);
            if (res.next()) {
                labelMesero.setText("Mesero: " + mesero + " > " + res.getString(1));
            }
            con.Cerrar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error PVM 01 >> "+e.getMessage(), cajero, HEIGHT);
        }
    }
    
    private void Cerrar(){
        this.dispose();
    }
    
    public void setDatos(int folio, boolean b, String cajero) {
        this.folio = folio;
        this.estado = b;
        this.cajero = cajero;
        if(!estado){
            botonCobrar.setEnabled(false);
            botonPropina.setEnabled(false);
            botonDescuento.setEnabled(false);
        }
        LlenarCabecera();
        LlenarTabla();
    }
    
    private void ImagenEscalada() throws FileNotFoundException{
        Tiempo t = new Tiempo();
        DocFlavor flavor = DocFlavor.SERVICE_FORMATTED.PAGEABLE;
        PrintRequestAttributeSet patts = new HashPrintRequestAttributeSet();
        
        FileInputStream fileInputStream = new FileInputStream("C:/xampp/htdocs/elmanjar/imagenes/logoticket.jpg");
        if (fileInputStream != null) {
            try {
                //atributos de la impresora
                PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
                pras.add(OrientationRequested.PORTRAIT);
                pras.add(new MediaPrintableArea(0, 0, 48, 29, MediaPrintableArea.MM));
                //Impresora configurada del sistema
                PrintService[] ps = PrintServiceLookup.lookupPrintServices(flavor, patts);
                if (ps.length == 0) {
                    throw new IllegalStateException("1. No se encontro la impresora");
                }
                PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
                PrintService myService = null;
                for (PrintService printService : printServices) {
                    System.out.println(printService.getName());
                    if (printService.getName().equals("Caja")) {
                        myService = printService;
                        break;
                    }
                }
                if (myService == null) {
                    throw new IllegalStateException("2. Impresora no encontrada");
                }

                DocPrintJob docPrintJob = myService.createPrintJob();
                Doc doc = new SimpleDoc(fileInputStream, DocFlavor.INPUT_STREAM.JPEG, null);
                docPrintJob.print(doc, pras);
                fileInputStream.close();
                //Contenido del Ticket
                ByteArrayOutputStream expected = new ByteArrayOutputStream();
                expected.writeBytes(" Av.Libertad #90. Cabecera mun. \n".getBytes());   //32 caracteres
                expected.writeBytes("Chicoloapan de Juarez. CP.56370 \n".getBytes());
                expected.writeBytes("       Estado de Mexico.        \n\n".getBytes());
                expected.writeBytes((t.HoraAcceso()+"\n").getBytes());
                expected.writeBytes((LimitarTexto(labelFolio.getText())+"\n").getBytes());
                expected.writeBytes((LimitarTexto(labelMesa.getText())+"\n").getBytes());
                expected.writeBytes((LimitarTexto(labelMesero.getText())+"\n").getBytes());
                expected.writeBytes("--------------------------------\n".getBytes());
                for(int i = 0; i<conta; i++){
                    expected.writeBytes((LimitarTexto(tabla.getValueAt(i, 1).toString())+"\n").getBytes());    //Platillo
                    expected.writeBytes(("              "+LimitarTexto(tabla.getValueAt(i, 3).toString())+"\n").getBytes());    //Precio
                }
                expected.writeBytes("--------------------------------\n".getBytes());
                expected.writeBytes(("        Subtotal: "+labelSubtotal.getText()+"\n").getBytes());
                expected.writeBytes(("        Propina: $ "+propina+"\n").getBytes());
                expected.writeBytes(("        Descuento: $ "+descuento+"\n").getBytes());
                expected.writeBytes("--------------------------------\n".getBytes());
                expected.writeBytes(("TOTAL: "+labelTotal.getText()+"\n").getBytes());
                expected.writeBytes("--------------------------------\n".getBytes());
                expected.writeBytes("  Gracias por tu preferencia.   \n".getBytes());
                expected.writeBytes("         Vuelve pronto.         \n".getBytes());
                expected.writeBytes(" \n".getBytes());
                expected.writeBytes(" \n".getBytes());
                expected.writeBytes(" \n".getBytes());
                expected.writeBytes(" \n".getBytes());
                expected.writeBytes(" \n".getBytes());
                
                DocPrintJob job = myService.createPrintJob();
                doc = new SimpleDoc(expected.toByteArray(), DocFlavor.BYTE_ARRAY.AUTOSENSE, null);
                job.print(doc, new HashPrintRequestAttributeSet());

            } catch (PrintException ex) {
                System.out.println(ex);
            } catch (IOException ex) {
                System.out.println(ex);
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
        }
        }
    }
    
    private String LimitarTexto(String texto){
        int x = texto.length();
        if(x >32){
            return texto.substring(0, 31);
        }else{
            return texto;
        }
    }
    
    private void Eventos(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            try {
                ProcesarVenta();
                ImagenEscalada();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PVMesa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (evt.getKeyCode() == KeyEvent.VK_F2) {
            Cobrar(true);
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            Cerrar();
        }
    }
}
