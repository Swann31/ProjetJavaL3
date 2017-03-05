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
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/**
 * <b> Classe Menu Principal </b>
 * <p> Il s'agit du menu gérant la gestion du personnel au sein de l'application. Elle sert d'interface d'échange auprès de l'utilisateur via l'utilisation d'un fichier CSV et autorise 
 * l'utilisateur à  créer et supprimer des employés.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * version 1.0
 */
public class MenuPersonnel extends javax.swing.JFrame {

    private static int num;
    protected static JTable table;
    private File selectedFile; 
    protected static DefaultTableModel tablemodel;
    protected static String[] title = {"Prenom","Nom","Date Entrée","IDE"};
    protected static String valueId;
    private static String[][] tabEAff;

    public MenuPersonnel() {
        initComponents();
        jButtonSauvegarder.setVisible(false);
        jButtonSupprimer.setVisible(false);
        jButtonAjouterEmp.setVisible(false);
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
        jButtonSupprimer = new javax.swing.JButton();
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

        jButtonSupprimer.setText("-");
        jButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBtnRetour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCharger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSauvegarder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAjouterEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                        .addGap(61, 61, 61)
                        .addComponent(jButtonAjouterEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSupprimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
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
               //PROBLEME ICI
                initialiserTableau(selectedFile); 
                
            } catch (IOException ex) {
                Logger.getLogger(MenuCompetence.class.getName()).log(Level.SEVERE, null, ex);
            }
            jPanelTable.setVisible(true);
            jButtonSauvegarder.setVisible(true);
            jButtonAjouterEmp.setVisible(true);
        }
    }//GEN-LAST:event_jButtonChargerActionPerformed

    private void jButtonSauvegarderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSauvegarderActionPerformed
        Writer writer = null;
        //DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        tablemodel = rebuildFile();
        int nRow = listE.size();
        int nCol = 4;
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
                bufferHeader.append(title[j]);
                if (j!=nCol) bufferHeader.append(";");
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
                    buffer.append(tabEAff[i][j]);
                    if (j!=nCol) buffer.append(";");
                }
                try {
                    writer.write(buffer.toString() + "\r\n");
                } catch (IOException ex) {
                    Logger.getLogger(MenuPersonnel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            writer.write(System.getProperty( "line.separator" ));
        } catch (IOException ex) {
            Logger.getLogger(MenuPersonnel.class.getName()).log(Level.SEVERE, null, ex);
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

    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
        // TODO add your handling code here:
        for (int j = 0; j < listE.size(); j++) {
            int ide=listE.get(j).getIdE();
            int value = Integer.parseInt(valueId);
            if(ide == value ){
                listE.get(j).setSuppr(true);
            }
        }   
       tablemodel = refreshTableModel();
       for (int i = 0; i < tablemodel.getRowCount() ; i++)
        {
            if (table.getModel().getValueAt(i,3) == null)
                tablemodel.removeRow(i);
        }
       table.setModel(tablemodel);
       table.repaint();
    }//GEN-LAST:event_jButtonSupprimerActionPerformed

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
    private javax.swing.JButton jButtonAjouterEmp;
    private javax.swing.JButton jButtonCharger;
    private javax.swing.JButton jButtonSauvegarder;
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JMenuItem jMenuPrincpalItem1;
    private javax.swing.JPanel jPanelTable;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables

    private void initialiserTableau( File fi) throws FileNotFoundException, IOException {
        CsvEmployeDAO csvE = new CsvEmployeDAO(fi);
        MenuPrincipal.listE = csvE.addEmploye(); 
        tablemodel = rebuildFile();
        table = new JTable(tablemodel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jPanelTable.setLayout(new BorderLayout());
        JScrollPane tableContainer = new JScrollPane(table);    
        jPanelTable.add(tableContainer, BorderLayout.CENTER);
        this.getContentPane().add(jPanelTable);
        this.pack();
        this.setVisible(true);
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            // do some actions here, for example
            // print first column value from selected row
            //System.out.println(table.getValueAt(table.getSelectedRow(), 0).toString());
            if(!event.getValueIsAdjusting()) {
			ListSelectionModel  model = (ListSelectionModel)event.getSource();
			num=model.getMinSelectionIndex();
                        if(num != -1){
                            valueId = new String();
                            valueId = (String)table.getModel().getValueAt(num,3);
                        }
            }
            jButtonSupprimer.setVisible(true);
        }
    });
    }

    //Avec la vérification des flag afin d'avoir un affichage correspondant
    public static DefaultTableModel refreshTableModel(){
        int j = 0;
        tabEAff = new String[listE.size()][4]; 
        for (int i=0;i<listE.size();i++)
        {
            if(listE.get(i).getSuppr() == false){
                
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                int ide;
                String pnom, nom;
                Date dt;
                ide=listE.get(i).getIdE();
                pnom=listE.get(i).getPrenom();
                nom=listE.get(i).getNom();
                dt=listE.get(i).getDate();
                String id= Integer.toString(ide);
                tabEAff[i-j][0]=pnom;
                tabEAff[i-j][1]=nom;
                tabEAff[i-j][2]=df.format(dt);
                tabEAff[i-j][3]= id;
                
            } else j++;
        }

        return new DefaultTableModel(tabEAff, title);
    }
    
    
    //Sans la vérification des flag afin d'avoir un fichier csv complet
    public static DefaultTableModel rebuildFile(){
        
        tabEAff = new String[listE.size()][4]; 
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
            tabEAff[i][0]=pnom;
            tabEAff[i][1]=nom;
            tabEAff[i][2]=df.format(dt);
            tabEAff[i][3]= id;
           
        }
        return new DefaultTableModel(tabEAff, title);
  
    }
}
