/*@Autor: Mirlino Mariñez 
   Fecha: 24-02-2018
    Ver.: 1.1.1
*/ 
package vista;

import controlador.Actualizador;
import java.awt.Color;
import java.awt.Cursor;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.*;
import logueo.Login;

public class PanelOrdenes extends javax.swing.JFrame {

    public PanelOrdenes() {
        initComponents();
        lblInfo.setVisible(false);
        lblUpdate.setVisible(false);
        this.setTitle("Pizzeria - Pizza Express");
        setIconImage(new ImageIcon(getClass().getResource("../images/icon_Pizza_48px.png")).getImage());
        btnCalcular.setEnabled(false);
        btnLimpiar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gTipoPizza = new javax.swing.ButtonGroup();
        etiLogo = new javax.swing.JLabel();
        pMasa = new javax.swing.JPanel();
        rGrande = new javax.swing.JRadioButton();
        rMediana = new javax.swing.JRadioButton();
        rPequena = new javax.swing.JRadioButton();
        pBasico = new javax.swing.JPanel();
        cboBasico = new javax.swing.JComboBox<>();
        pExtra = new javax.swing.JPanel();
        cboExtra = new javax.swing.JComboBox<>();
        pDetalleOrden = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        etiPrecioMasa = new javax.swing.JLabel();
        etiIngredienteBa = new javax.swing.JLabel();
        etiIngredienteEx = new javax.swing.JLabel();
        pTotalFinal = new javax.swing.JPanel();
        txtTotalFinal = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblInfoVer = new javax.swing.JLabel();
        lblImagenInfo = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        lblImagenSearchUpdate = new javax.swing.JLabel();
        lblUpdate = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuLogOn = new javax.swing.JMenuItem();
        mnuLogOff = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        etiLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        pMasa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Masa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        gTipoPizza.add(rGrande);
        rGrande.setText("Pizza Grande");
        rGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rGrandeActionPerformed(evt);
            }
        });

        gTipoPizza.add(rMediana);
        rMediana.setText("Pizza Mediana");
        rMediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rMedianaActionPerformed(evt);
            }
        });

        gTipoPizza.add(rPequena);
        rPequena.setText("Pizza Pequeña");
        rPequena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPequenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pMasaLayout = new javax.swing.GroupLayout(pMasa);
        pMasa.setLayout(pMasaLayout);
        pMasaLayout.setHorizontalGroup(
            pMasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMasaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pMasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rPequena)
                    .addComponent(rMediana)
                    .addComponent(rGrande))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        pMasaLayout.setVerticalGroup(
            pMasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMasaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rGrande)
                .addGap(18, 18, 18)
                .addComponent(rMediana)
                .addGap(18, 18, 18)
                .addComponent(rPequena)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pBasico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrediente Básico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        cboBasico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELEGIR INGREDIENTE...", "Jamón", "Extra queso" }));
        cboBasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBasicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBasicoLayout = new javax.swing.GroupLayout(pBasico);
        pBasico.setLayout(pBasicoLayout);
        pBasicoLayout.setHorizontalGroup(
            pBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBasicoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(cboBasico, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pBasicoLayout.setVerticalGroup(
            pBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBasicoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(cboBasico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pExtra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrediente Extra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        cboExtra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción...", "SIN INGREDIENTE EXTRA", "Champiñones", "Aceitunas", "Bacon", "Pollo" }));
        cboExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboExtraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pExtraLayout = new javax.swing.GroupLayout(pExtra);
        pExtra.setLayout(pExtraLayout);
        pExtraLayout.setHorizontalGroup(
            pExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExtraLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(cboExtra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(115, 115, 115))
        );
        pExtraLayout.setVerticalGroup(
            pExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExtraLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(cboExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pDetalleOrden.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Costo detallado de la orden", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Masa:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Ingrediente Extra:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Ingrediente Básico:");

        etiPrecioMasa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiPrecioMasa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        etiIngredienteBa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiIngredienteBa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        etiIngredienteEx.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiIngredienteEx.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pDetalleOrdenLayout = new javax.swing.GroupLayout(pDetalleOrden);
        pDetalleOrden.setLayout(pDetalleOrdenLayout);
        pDetalleOrdenLayout.setHorizontalGroup(
            pDetalleOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDetalleOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDetalleOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pDetalleOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiPrecioMasa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(etiIngredienteBa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiIngredienteEx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        pDetalleOrdenLayout.setVerticalGroup(
            pDetalleOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDetalleOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDetalleOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDetalleOrdenLayout.createSequentialGroup()
                        .addGroup(pDetalleOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pDetalleOrdenLayout.createSequentialGroup()
                                .addComponent(etiPrecioMasa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                            .addComponent(etiIngredienteBa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(etiIngredienteEx, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDetalleOrdenLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pTotalFinal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total Final", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        txtTotalFinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotalFinal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalFinal.setEnabled(false);

        javax.swing.GroupLayout pTotalFinalLayout = new javax.swing.GroupLayout(pTotalFinal);
        pTotalFinal.setLayout(pTotalFinalLayout);
        pTotalFinalLayout.setHorizontalGroup(
            pTotalFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTotalFinalLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(txtTotalFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        pTotalFinalLayout.setVerticalGroup(
            pTotalFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTotalFinalLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(txtTotalFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblInfoVer.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        lblInfoVer.setText("Ver.1.1.1");

        lblImagenInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Help_24px.png"))); // NOI18N
        lblImagenInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagenInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblImagenInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblImagenInfoMouseExited(evt);
            }
        });

        lblInfo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(0, 102, 255));
        lblInfo.setText("Pulsa el icono para más información");
        lblInfo.setOpaque(true);

        lblImagenSearchUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Search_Property_24px.png"))); // NOI18N
        lblImagenSearchUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagenSearchUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblImagenSearchUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblImagenSearchUpdateMouseExited(evt);
            }
        });

        lblUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUpdate.setForeground(new java.awt.Color(102, 153, 255));
        lblUpdate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUpdate.setText("Click para ver nuevas Actualizaciones del programa.");
        lblUpdate.setOpaque(true);

        jMenu1.setText("Archivo");

        mnuLogOn.setText("Log On");
        mnuLogOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLogOnActionPerformed(evt);
            }
        });
        jMenu1.add(mnuLogOn);

        mnuLogOff.setText("Log Off");
        mnuLogOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLogOffActionPerformed(evt);
            }
        });
        jMenu1.add(mnuLogOff);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pDetalleOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(pTotalFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInfoVer, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(613, 613, 613)
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiLogo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pBasico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImagenInfo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImagenSearchUpdate)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagenSearchUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblUpdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagenInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblInfo)
                        .addGap(10, 10, 10)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pBasico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pDetalleOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pTotalFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addComponent(lblInfoVer)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        calculate();

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void rGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rGrandeActionPerformed
        //precio pizza Grande
        int g = 1000;
        etiPrecioMasa.setText(Integer.toString(g));

    }//GEN-LAST:event_rGrandeActionPerformed


    private void rMedianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rMedianaActionPerformed
        //precio pizza mediana
        int m = 700;
        etiPrecioMasa.setText(Integer.toString(m));

    }//GEN-LAST:event_rMedianaActionPerformed


    private void rPequenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPequenaActionPerformed
        //precio pizza pequeña
        int p = 500;
        etiPrecioMasa.setText(Integer.toString(p));

    }//GEN-LAST:event_rPequenaActionPerformed

    private void cboBasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBasicoActionPerformed
        eleccionPizzaBasica();

    }//GEN-LAST:event_cboBasicoActionPerformed

    private void cboExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboExtraActionPerformed
        eleccionPizzaExtra();

    }//GEN-LAST:event_cboExtraActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        clearData();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void lblImagenInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenInfoMouseClicked
        frmInfo f = new frmInfo(this, true);

        f.setVisible(true);


    }//GEN-LAST:event_lblImagenInfoMouseClicked

    private void lblImagenInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenInfoMouseEntered
        lblInfo.setVisible(true);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblImagenInfoMouseEntered

    private void lblImagenInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenInfoMouseExited
        lblInfo.setVisible(false);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

    }//GEN-LAST:event_lblImagenInfoMouseExited

    private void mnuLogOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLogOnActionPerformed
        Login l = new Login(this, true);
        l.setVisible(true);
    }//GEN-LAST:event_mnuLogOnActionPerformed

    private void mnuLogOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLogOffActionPerformed

        mnuLogOff.setEnabled(false);
        btnCalcular.setEnabled(false);
        btnLimpiar.setEnabled(false);
        mnuLogOn.setEnabled(true);
        JOptionPane.showMessageDialog(null, "Se ha deslogueado satisfactoriamente del Sistema.");

    }//GEN-LAST:event_mnuLogOffActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Login l = new Login(this, true);
        l.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void lblImagenSearchUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenSearchUpdateMouseEntered
        lblUpdate.setVisible(true);
        setCursor(new Cursor(Cursor.HAND_CURSOR));


    }//GEN-LAST:event_lblImagenSearchUpdateMouseEntered

    private void lblImagenSearchUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenSearchUpdateMouseExited
        if (lblUpdate.equals("Versión " + Actualizador.obtenerVersion() + " disponible!")) {
            lblUpdate.setVisible(true);
        }else{
        lblUpdate.setVisible(false);
        }
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

    }//GEN-LAST:event_lblImagenSearchUpdateMouseExited

    private void lblImagenSearchUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenSearchUpdateMouseClicked
        lblUpdate.setForeground(new Color(0, 153, 0));
        lblUpdate.setText("Buscando Nueva Versión...");

        lblImagenSearchUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Available_Updates_24px.png")));

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //Dejamos 5 segundos para que haga una simulacion de que esta buscando mientras realiza la conexion
                    Thread.sleep(5000);

                    if (Actualizador.verificarConexion()) {
                        if (Actualizador.obtenerVersion().equals("1.1.1")) {

                            lblImagenSearchUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Ok_24px.png")));
                            
                            lblUpdate.setForeground(new Color(0, 153, 0));
                            lblUpdate.setText("La aplicación esta actualizada!");

                        } else {
                            
                            frmInfoUpdate info = new frmInfoUpdate();
                            
                            lblImagenSearchUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Downloading_Updates_24px.png")));
                            lblUpdate.setVisible(true);
                            lblUpdate.setForeground(new Color(255, 153, 0));
                            lblUpdate.setText("Versión " + Actualizador.obtenerVersion() + " disponible!");
                            //btnDescargar.setVisible(true);
                            
                            Thread.sleep(5000);
                            
                            Actualizador.abrirEnlace("https://github.com/mirlino/My_java_repository");
                            
                            Thread.sleep(10000);
                            
                            info.setVisible(true);
                            
                        }
                    } else {

                        lblImagenSearchUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Cancel_24px.png")));

                        
                        lblUpdate.setForeground(Color.RED);
                        lblUpdate.setText("No fue posible una conexión, verifica tu conexión a internet.");
                    }

                } catch (InterruptedException ex) {
                    Logger.getLogger(PanelOrdenes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();


    }//GEN-LAST:event_lblImagenSearchUpdateMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnCalcular;
    public static javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cboBasico;
    private javax.swing.JComboBox<String> cboExtra;
    private javax.swing.JLabel etiIngredienteBa;
    private javax.swing.JLabel etiIngredienteEx;
    private javax.swing.JLabel etiLogo;
    private javax.swing.JLabel etiPrecioMasa;
    private javax.swing.ButtonGroup gTipoPizza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblImagenInfo;
    private javax.swing.JLabel lblImagenSearchUpdate;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblInfoVer;
    private javax.swing.JLabel lblUpdate;
    public static javax.swing.JMenuItem mnuLogOff;
    public static javax.swing.JMenuItem mnuLogOn;
    private javax.swing.JPanel pBasico;
    private javax.swing.JPanel pDetalleOrden;
    private javax.swing.JPanel pExtra;
    private javax.swing.JPanel pMasa;
    private javax.swing.JPanel pTotalFinal;
    private javax.swing.JRadioButton rGrande;
    private javax.swing.JRadioButton rMediana;
    private javax.swing.JRadioButton rPequena;
    private javax.swing.JTextField txtTotalFinal;
    // End of variables declaration//GEN-END:variables

    //DEBAJO ESTAN LAS DECLARACIONES METODOS///
    private void eleccionPizzaExtra() {

        //eleccion de pizza extra
        int n = 0;
        int champinones = 100;
        int aceituna = 100;
        int bacon = 150;
        int pollo = 150;

        int i = cboExtra.getSelectedIndex();

        switch (i) {
            case 2:
                etiIngredienteEx.setText(Integer.toString(champinones));
                break;
            case 3:
                etiIngredienteEx.setText(Integer.toString(aceituna));
                break;
            case 4:
                etiIngredienteEx.setText(Integer.toString(bacon));
                break;
            case 5:
                etiIngredienteEx.setText(Integer.toString(pollo));
                break;
            case 1:
                etiIngredienteEx.setText(Integer.toString(n));
                break;
            default:
                break;

        }//fin del switch

    }//fin del metodo pizzaExtra

    private void clearData() {

        //para limpiar los campos para nueva orden
        etiIngredienteBa.setText("");
        etiIngredienteEx.setText("");
        etiPrecioMasa.setText("");
        txtTotalFinal.setText("");
        cboBasico.setSelectedIndex(0);
        cboExtra.setSelectedIndex(0);
        gTipoPizza.clearSelection();
        JOptionPane.showMessageDialog(this, "Todos los campos han sido reiniciados satisfactoriamente.", "Información", JOptionPane.INFORMATION_MESSAGE);

    }// fin clearData

    private void eleccionPizzaBasica() {

        //eleccion ingrediente basico
        String n = "";
        int jamon = 50;
        int queso_extra = 70;

        int i = cboBasico.getSelectedIndex();

        switch (i) {
            case 1:
                etiIngredienteBa.setText(Integer.toString(jamon));
                break;
            case 2:
                etiIngredienteBa.setText(Integer.toString(queso_extra));
                break;
            case 0:
                etiIngredienteBa.setText(n);
                break;

            default:
                break;
        }//fin del switch basico

    }//fin del metodo PizzaBasico

    private void calculate() {

        //calcular producto
        try {
            double masa;
            double basico;
            double extra;
            double total;

            masa = Double.parseDouble(etiPrecioMasa.getText());
            basico = Double.parseDouble(etiIngredienteBa.getText());
            extra = Double.parseDouble(etiIngredienteEx.getText());

            total = masa + basico + extra;

            txtTotalFinal.setText("" + total);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Falta Elegir uno o más campos. Por favor complete las opciones.", "Información", JOptionPane.ERROR_MESSAGE);

        }//fin trycatch 

    }//fin del metodo calcular

}//fin del jframe
