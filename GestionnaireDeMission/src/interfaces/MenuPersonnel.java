package interfaces;

import gestionnairedemission.CsvEmployeDAO;
import static interfaces.MenuPrincipal.listE;
import java.awt.BorderLayout;
import java.io.BufferedWriter;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * <b> Classe Menu Principal </b>
 * <p> Il s'agit du menu gérant la gestion du personnel au sein de l'application. Elle sert d'interface d'échange auprès de l'utilisateur via l'utilisation d'un fichier CSV et autorise 
 * l'utilisateur à  créer et supprimer des employés.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * version 1.0
 */
public class MenuPersonnel extends javax.swing.JFrame {

    protected static JTable table;
    private File selectedFile; 
    protected static DefaultTableModel tablemodel;
    protected static String[] title = {"IDE","Prenom","Nom","Date Entrée"};

    public MenuPersonnel() {
        initComponents();
        jButtonSauvegarder.setVisible(false);
        jButton1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnRetour = new javax.swing.JButton();
        jPanelTable = new javax.swing.JPanel();
        jButtonCharger = new javax.swing.JButton();
        jButtonSauvegarder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonAjouterEmp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JMenuBar();
        jMenuPrincipal = new javax.swing.JMenu();
        jMenuPrincpalItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(766, 458));

        jBtnRetour.setText("Retour");
        jBtnRetour.setMaximumSize(new java.awt.Dimension(120, 36));
        jBtnRetour.setMinimumSize(new java.awt.Dimension(120, 36));
        jBtnRetour.setName("btnRetour"); // NOI18N
        jBtnRetour.setPreferredSize(new java.awt.Dimension(120, 36));
        jBtnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRetourActionPerformed(evt);
            }
        });

        jPanelTable.setPreferredSize(new java.awt.Dimension(608, 449));

        javax.swing.GroupLayout jPanelTableLayout = new javax.swing.GroupLayout(jPanelTable);
        jPanelTable.setLayout(jPanelTableLayout);
        jPanelTableLayout.setHorizontalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );
        jPanelTableLayout.setVerticalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButtonCharger.setText("CHARGER FICHIER");
        jButtonCharger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChargerActionPerformed(evt);
            }
        });

        jButtonSauvegarder.setText("SAUVEGARDER TABLEAU");
        jButtonSauvegarder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSauvegarderActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel1.setText("Gestion du Personnel");

        jButtonAjouterEmp.setText("+");
        jButtonAjouterEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterEmpActionPerformed(evt);
            }
        });

        jButton1.setText("Mettre a jour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenuPrincipal.setText("Application");

        jMenuPrincpalItem1.setText("Fermer");
        jMenuPrincpalItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPrincpalItem1ActionPerformed(evt);
            }
        });
        jMenuPrincipal.add(jMenuPrincpalItem1);

        menuPrincipal.add(jMenuPrincipal);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnRetour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCharger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSauvegarder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAjouterEmp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 333, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCharger, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSauvegarder, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAjouterEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                        .addComponent(jBtnRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuPrincpalItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPrincpalItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuPrincpalItem1ActionPerformed

    private void jBtnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRetourActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        mp.setLocationRelativeTo(this);
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnRetourActionPerformed

    private void jButtonChargerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChargerActionPerformed
       JFileChooser jc = new JFileChooser();
        int returnValue = jc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) 
        {
            selectedFile = jc.getSelectedFile();
            try {
                initialiserTableau(selectedFile);
            } catch (IOException ex) {
                Logger.getLogger(MenuCompetence.class.getName()).log(Level.SEVERE, null, ex);
            }
            jPanelTable.setVisible(true);
            jButtonSauvegarder.setVisible(true);
        }
    }//GEN-LAST:event_jButtonChargerActionPerformed

    private void jButtonSauvegarderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSauvegarderActionPerformed
        Writer writer = null;
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        int nRow = dtm.getRowCount();
        int nCol = dtm.getColumnCount();
        try {
            try {
                try {
                    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(selectedFile.getAbsolutePath()), "utf-8"));
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(MenuPersonnel.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MenuPersonnel.class.getName()).log(Level.SEVERE, null, ex);
            }

            //write the header information
            StringBuffer bufferHeader = new StringBuffer();
            for (int j = 0; j < nCol; j++) {
                bufferHeader.append(dtm.getColumnName(j));
                //if (j!=nCol) bufferHeader.append(", ");
            }
            try {
                writer.write(bufferHeader.toString() + "\r\n");
            } catch (IOException ex) {
                Logger.getLogger(MenuPersonnel.class.getName()).log(Level.SEVERE, null, ex);
            }

           //write row information
            for (int i = 0 ; i < nRow ; i++){
                 StringBuffer buffer = new StringBuffer();
                for (int j = 0 ; j < nCol ; j++){
                    buffer.append(dtm.getValueAt(i,j));
                    //if (j!=nCol) buffer.append(", ");
                }
                try {
                    writer.write(buffer.toString() + "\r\n");
                } catch (IOException ex) {
                    Logger.getLogger(MenuPersonnel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(MenuPersonnel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButtonSauvegarderActionPerformed

    private void jButtonAjouterEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterEmpActionPerformed
        MenuAjoutEmploye mae = new MenuAjoutEmploye();
        mae.setLocationRelativeTo(this);
        mae.setVisible(true);
        
    }//GEN-LAST:event_jButtonAjouterEmpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tablemodel = refreshTableModel();
        table.setModel(tablemodel);
        table.repaint();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPersonnel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnRetour;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAjouterEmp;
    private javax.swing.JButton jButtonCharger;
    private javax.swing.JButton jButtonSauvegarder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JMenuItem jMenuPrincpalItem1;
    private javax.swing.JPanel jPanelTable;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables

    private void initialiserTableau( File fi) throws FileNotFoundException, IOException {
        CsvEmployeDAO csvE = new CsvEmployeDAO(fi);
        MenuPrincipal.listE = csvE.addEmploye(); 
        tablemodel = refreshTableModel();
        table = new JTable(tablemodel);
        jPanelTable.setLayout(new BorderLayout());
        JScrollPane tableContainer = new JScrollPane(table);    
        jPanelTable.add(tableContainer, BorderLayout.CENTER);
        this.getContentPane().add(jPanelTable);
        this.pack();
        this.setVisible(true);
    }

    public static DefaultTableModel refreshTableModel(){
        String[][] tabEAff = new String[listE.size()][4]; 
        for (int i=0;i<listE.size();i++)
        {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            int ide;
            String pnom, nom;
            Date dt;
            ide=listE.get(i).getIdE();
            pnom=listE.get(i).getPrenom();
            nom=listE.get(i).getNom();
            dt=listE.get(i).getDate();
            String id= Integer.toString(ide);
            tabEAff[i][0]=id;
            tabEAff[i][1]=pnom;
            tabEAff[i][2]=nom;
            tabEAff[i][3]=df.format(dt);
        }
        return new DefaultTableModel(tabEAff, title);
    }
    /*
        public static String[] formaterExport() {
        String[] tab = new String[listE.size()+1];
        String titleExp = "Prenom;Nom;date entrée entreprise;identifiant";
        tab[0]=titleExp;
        for(int i=1;i<listE.size()+1;i++)
        {
            DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
            int ide;
            String pnom, nom;
            String date = df.format(listE.get(i-1).getDate());
            pnom = listE.get(i-1).getPrenom();
            nom = listE.get(i-1).getNom();
            ide = listE.get(i-1).getIdE();
            String id = Integer.toString(ide);
            String val = pnom +";"+nom+";"+date+";"+id;
            tab[i]=val;
        }
        return tab;
    }*/
}
