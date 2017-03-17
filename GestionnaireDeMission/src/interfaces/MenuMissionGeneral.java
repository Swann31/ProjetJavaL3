/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import gestionnairedemission.CompetenceMission;
import gestionnairedemission.CsvMissionDAO;
import gestionnairedemission.Employe;
import static interfaces.MenuPrincipal.listM;
import java.awt.BorderLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maxence
 */
public class MenuMissionGeneral extends javax.swing.JFrame {

    private static int num;
    protected static String[] titleHead = {"Type Mission","IdM","Descriptif","Date","Nb Employes"};
    protected static String[] titleH = {"TypeM","IdM","Descriptif","DateDebut","Nb Employes", "Nb Compétences","Competences","Nb Employe Competence", "Employe Competence","Date Fin"};
    private static String[][] tabMAff;
    protected static DefaultTableModel model;
    private static File selectedFile;
    protected static JTable table;
    /**
     * Creates new form MenuMissionGeneral
     */
    public MenuMissionGeneral() {
        initComponents();
        jBtnDetailMission.setVisible(false);
        jBtnNouvelleMission.setVisible(false);
        jCbxTypeMission.setVisible(false);
        jLabel2.setVisible(false);
        if(listM!=null)
        {
            afficherpage();
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

        jLabel1 = new javax.swing.JLabel();
        jBtnRetour = new javax.swing.JButton();
        jPanelTable = new javax.swing.JPanel();
        jBtnNouvelleMission = new javax.swing.JButton();
        jCbxTypeMission = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jBtnDetailMission = new javax.swing.JButton();
        jBtnChargerMission = new javax.swing.JButton();
        jBtnFichierMission = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JMenuBar();
        jMenuPrincipal = new javax.swing.JMenu();
        jMenuPrincpalItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(766, 550));
        setPreferredSize(new java.awt.Dimension(766, 550));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel1.setText("Gestion des Missions");

        jBtnRetour.setText("Retour");
        jBtnRetour.setMaximumSize(new java.awt.Dimension(120, 36));
        jBtnRetour.setMinimumSize(new java.awt.Dimension(120, 36));
        jBtnRetour.setPreferredSize(new java.awt.Dimension(120, 36));
        jBtnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRetourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTableLayout = new javax.swing.GroupLayout(jPanelTable);
        jPanelTable.setLayout(jPanelTableLayout);
        jPanelTableLayout.setHorizontalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );
        jPanelTableLayout.setVerticalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jBtnNouvelleMission.setText("Nouvelle Mission");
        jBtnNouvelleMission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNouvelleMissionActionPerformed(evt);
            }
        });

        jCbxTypeMission.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toutes", "En Cours", "En Préparation", "Planifiées", "Terminées" }));

        jLabel2.setText("Afficher type de mission :");

        jBtnDetailMission.setText("Detail Mission");
        jBtnDetailMission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDetailMissionActionPerformed(evt);
            }
        });

        jBtnChargerMission.setText("Charger Mission");
        jBtnChargerMission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnChargerMissionActionPerformed(evt);
            }
        });

        jBtnFichierMission.setText("Generer fichier mission");
        jBtnFichierMission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFichierMissionActionPerformed(evt);
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
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBtnFichierMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnNouvelleMission, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                        .addComponent(jBtnRetour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnDetailMission, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                        .addComponent(jBtnChargerMission, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jCbxTypeMission, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnFichierMission))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnNouvelleMission, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnDetailMission, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnChargerMission, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCbxTypeMission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                        .addComponent(jBtnRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuPrincpalItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPrincpalItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuPrincpalItem1ActionPerformed

    private void jBtnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRetourActionPerformed
        // TODO add your handling code here:
        MenuPrincipal mp = new MenuPrincipal();
        mp.setLocationRelativeTo(this);
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnRetourActionPerformed

    private void jBtnNouvelleMissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNouvelleMissionActionPerformed
        // TODO add your handling code here:
        MenuNouvelleMission mnm = new MenuNouvelleMission();
        mnm.setLocationRelativeTo(this);
        mnm.setVisible(true);
    }//GEN-LAST:event_jBtnNouvelleMissionActionPerformed

    private void jBtnDetailMissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDetailMissionActionPerformed
        // TODO add your handling code here:
        MenuDetailMission mdm = new MenuDetailMission(num);
        mdm.setLocationRelativeTo(this);
        mdm.setVisible(true);
    }//GEN-LAST:event_jBtnDetailMissionActionPerformed

    private void jBtnChargerMissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnChargerMissionActionPerformed
        // TODO add your handling code here:
        JFileChooser jc = new JFileChooser();
        int returnValue = jc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION)
        {
            selectedFile = jc.getSelectedFile();
            initialiserTableau(selectedFile);
            jPanelTable.setVisible(true);
            jBtnChargerMission.setVisible(false);
            jBtnNouvelleMission.setVisible(true);
            jCbxTypeMission.setVisible(true);
            jLabel2.setVisible(true);

        }
    }//GEN-LAST:event_jBtnChargerMissionActionPerformed

    private void jBtnFichierMissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFichierMissionActionPerformed
        // TODO add your handling code here:
        Writer writer = null;
        int nRow = 1;
        int nCol = 10;
        try {
            try {
                try {
                    String path = System.getProperty("user.home") + File.separator + "Documents";
                    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(path,"new_liste_mission.csv")), "utf-8"));
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(MenuPersonnel.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MenuPersonnel.class.getName()).log(Level.SEVERE, null, ex);
            }

            //write the header information
            StringBuffer bufferHeader = new StringBuffer();
            for (int j = 0; j < nCol; j++) {
                bufferHeader.append(titleH[j]);
                if (j!=nCol){
                    bufferHeader.append(";");
                }
            }
            try {
                writer.write(bufferHeader.toString() + "\r\n");
            } catch (IOException ex) {
                Logger.getLogger(MenuPersonnel.class.getName()).log(Level.SEVERE, null, ex);
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
                showMessageDialog(null,"Fichier new_liste_mission créé dans 'Mes Documents'");
    }//GEN-LAST:event_jBtnFichierMissionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(MenuMissionGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMissionGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMissionGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMissionGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMissionGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnChargerMission;
    private javax.swing.JButton jBtnDetailMission;
    private javax.swing.JButton jBtnFichierMission;
    private javax.swing.JButton jBtnNouvelleMission;
    private javax.swing.JButton jBtnRetour;
    private javax.swing.JComboBox<String> jCbxTypeMission;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JMenuItem jMenuPrincpalItem1;
    private javax.swing.JPanel jPanelTable;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables

    private void initialiserTableau(File fi) {
        CsvMissionDAO csvM = new CsvMissionDAO(fi);
        MenuPrincipal.listM = csvM.addMission(); 
        
        jPanelTable.setLayout(new BorderLayout());
        model = refreshTableModel();
        table = new JTable(model);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane tableContainer = new JScrollPane(table);    
        jPanelTable.add(tableContainer, BorderLayout.CENTER);
        this.getContentPane().add(jPanelTable);
        this.pack();
        this.setVisible(true);
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            //System.out.println(table.getValueAt(table.getSelectedRow(), 0).toString());
            if(!event.getValueIsAdjusting()) {
			ListSelectionModel  model = (ListSelectionModel)event.getSource();
			num=model.getMinSelectionIndex(); 
            }
            jBtnDetailMission.setVisible(true);
        }
    });
    }
   
    public static DefaultTableModel refreshTableModel(){
        int j = 0;
        tabMAff = new String[listM.size()][5]; 
        for (int i=0;i<listM.size();i++)
        {
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                int idm, nbE;
                Date dt;
                String libelle,type;
                type = listM.get(i).getTypeM();
                idm=listM.get(i).getIdM();
                dt=listM.get(i).getDateDebut();
                libelle= listM.get(i).getDescM();
                nbE = listM.get(i).getNbEmployes();
                String id= Integer.toString(idm);
                String nb = Integer.toString(nbE);
                tabMAff[i][0]=type;
                tabMAff[i][1]=id;
                tabMAff[i][2]=libelle;
                tabMAff[i][3]=df.format(dt);
                tabMAff[i][4]=nb;
                
        }
        return new DefaultTableModel(tabMAff, titleHead);
    }
    
    public static void sauvegarderMissions(){
        Writer writer = null;
        int nRow = listM.size();
        int nCol = 10;
        int nbComp = 0;
        int nbPers = 0;
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
                bufferHeader.append(titleH[j]);
                if (j!=nCol){
                    bufferHeader.append(";");
                }
            }
            try {
                writer.write(bufferHeader.toString() + "\r\n");
            } catch (IOException ex) {
                Logger.getLogger(MenuPersonnel.class.getName()).log(Level.SEVERE, null, ex);
            }
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            for (int i = 0 ; i < nRow ; i++){
                StringBuffer buffer = new StringBuffer();
                //for (int j = 0 ; j < nCol ; j++){
                buffer.append(listM.get(i).getTypeM());
                buffer.append(";");
                buffer.append(listM.get(i).getIdM());
                buffer.append(";");
                buffer.append(listM.get(i).getDescM());
                buffer.append(";");
                buffer.append(df.format(listM.get(i).getDateDebut()));
                buffer.append(";");
                buffer.append(listM.get(i).getNbEmployes());
                buffer.append(";");
                nbComp = compterCompetences(listM.get(i).getCompMission());
                buffer.append(nbComp + ";");
                if(nbComp !=0){
                   for(int k = 0; k <nbComp; k++){
                     buffer.append(listM.get(i).getCompMission()[k].getIDC());
                     buffer.append(";");
                     buffer.append(listM.get(i).getCompMission()[k].getNb());
                     buffer.append(";");
                    } 
                }else {
                    buffer.append("0");
                    buffer.append(";");
                }
                nbPers = compterPersonnes(listM.get(i).getEmployeMission());
                buffer.append(nbPers);
                buffer.append(";");
                if(nbPers !=0 && listM.get(i).getEmployeMission().length != 0){
                   for(int k = 0; k <nbPers; k++){
                     buffer.append(listM.get(i).getEmployeMission()[k].getIdE());
                     buffer.append(";");
                    } 
                }/*else {
                    buffer.append(nbPers);
                    buffer.append(";");
                }*/
                if( listM.get(i).getDateFin() !=null){
                    buffer.append(df.format(listM.get(i).getDateFin()));
                    buffer.append(";");
                }else{
                    buffer.append(";");
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
    }

    private static int compterCompetences(CompetenceMission[] tab){
        if (tab == null){
            return 0;
        }
        return tab.length;
    }
    
    private static int compterPersonnes(Employe[] tab){
        if (tab == null){
            return 0;
        }
        return tab.length;  
    }
    
    private void afficherpage(){
        jPanelTable.setLayout(new BorderLayout());
        model = refreshTableModel();
        table = new JTable(model);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane tableContainer = new JScrollPane(table);    
        jPanelTable.add(tableContainer, BorderLayout.CENTER);
        this.getContentPane().add(jPanelTable);
        this.pack();
        this.setVisible(true);
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            //System.out.println(table.getValueAt(table.getSelectedRow(), 0).toString());
            if(!event.getValueIsAdjusting()) {
			ListSelectionModel  model = (ListSelectionModel)event.getSource();
			num=model.getMinSelectionIndex(); 
            }
            jBtnDetailMission.setVisible(true);
        }
    });
    }
}
