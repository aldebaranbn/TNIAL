/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Someone
 */
public class MDI extends javax.swing.JFrame {

    /**
     * Creates new form MDI
     */
    public MDI() {
        initComponents();
        setVisible(true);
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InsertPanelHere = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        mFile = new javax.swing.JMenu();
        TunDinas = new javax.swing.JMenuItem();
        TunPersonel = new javax.swing.JMenuItem();
        PidanaUmum = new javax.swing.JMenuItem();
        PidanaMiliter = new javax.swing.JMenuItem();
        PerdataPersonel = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        mReport = new javax.swing.JMenu();
        TUNDINAS = new javax.swing.JMenu();
        PerTriwulan = new javax.swing.JMenuItem();
        PerTanggal = new javax.swing.JMenuItem();
        PerKasus = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout InsertPanelHereLayout = new javax.swing.GroupLayout(InsertPanelHere);
        InsertPanelHere.setLayout(InsertPanelHereLayout);
        InsertPanelHereLayout.setHorizontalGroup(
            InsertPanelHereLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        InsertPanelHereLayout.setVerticalGroup(
            InsertPanelHereLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        mFile.setText("File");

        TunDinas.setText("Perkara TUN Dinas");
        TunDinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TunDinasActionPerformed(evt);
            }
        });
        mFile.add(TunDinas);

        TunPersonel.setText("Perkara TUN Personel");
        TunPersonel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TunPersonelActionPerformed(evt);
            }
        });
        mFile.add(TunPersonel);

        PidanaUmum.setText("Perkara Pidana Umum");
        PidanaUmum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PidanaUmumActionPerformed(evt);
            }
        });
        mFile.add(PidanaUmum);

        PidanaMiliter.setText("Perkara Pidana Militer");
        PidanaMiliter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PidanaMiliterActionPerformed(evt);
            }
        });
        mFile.add(PidanaMiliter);

        PerdataPersonel.setText("Perkara Perdata Personel");
        PerdataPersonel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerdataPersonelActionPerformed(evt);
            }
        });
        mFile.add(PerdataPersonel);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        mFile.add(Exit);

        jMenuBar.add(mFile);

        mReport.setText("Report");

        TUNDINAS.setText("TUNDINAS");

        PerTriwulan.setText("Per Triwulan");
        TUNDINAS.add(PerTriwulan);

        PerTanggal.setText("Per Tanggal");
        TUNDINAS.add(PerTanggal);

        PerKasus.setText("Per Kasus");
        TUNDINAS.add(PerKasus);

        mReport.add(TUNDINAS);

        jMenuBar.add(mReport);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InsertPanelHere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InsertPanelHere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TunDinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TunDinasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TunDinasActionPerformed

    private void TunPersonelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TunPersonelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TunPersonelActionPerformed

    private void PidanaUmumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PidanaUmumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PidanaUmumActionPerformed

    private void PidanaMiliterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PidanaMiliterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PidanaMiliterActionPerformed

    private void PerdataPersonelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerdataPersonelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PerdataPersonelActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.JPanel InsertPanelHere;
    private javax.swing.JMenuItem PerKasus;
    private javax.swing.JMenuItem PerTanggal;
    private javax.swing.JMenuItem PerTriwulan;
    private javax.swing.JMenuItem PerdataPersonel;
    private javax.swing.JMenuItem PidanaMiliter;
    private javax.swing.JMenuItem PidanaUmum;
    private javax.swing.JMenu TUNDINAS;
    private javax.swing.JMenuItem TunDinas;
    private javax.swing.JMenuItem TunPersonel;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu mFile;
    private javax.swing.JMenu mReport;
    // End of variables declaration//GEN-END:variables
}
