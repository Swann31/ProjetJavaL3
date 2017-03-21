package interfaces;

import gestionnairedemission.Competence;
import gestionnairedemission.CsvEmployeCompetenceDAO;
import gestionnairedemission.CsvEmployeDAO;
import static interfaces.MenuPrincipal.listC;
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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/**
 * <b> Classe Menu Personnel </b>
 * <p> Il s'agit du menu gérant la gestion du personnel au sein de l'application. Elle sert d'interface d'échange auprès de l'utilisateur via l'utilisation d'un fichier CSV et autorise 
 * l'utilisateur à  créer et supprimer des employés.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * version 1.0
 */
public class MenuPersonnel extends javax.swing.JFrame {

    /**
     * Identifiant d'une ligne selectionné par l'utilisateur afin d'effectuer des actions sur l'employe selectionné.
     */
    private static int num;
    
    /**
     * JTable servant a afficher la liste des employés.
     */
    protected static JTable table;
    
    /**
     * Fichier selectionné lors du chargement d'un fichier pour l'import des employés.
     */
    private static File selectedFileE; 
    
    /**
     * Fichier selectionné lors du chargement d'un fichier pour l'import des compétences pour chaque employé.
     */
    private static File selectedFileEC;
    
    /**
     * DefaultTableModel définissant le "graphisme" de la JTable table.
     * @see MenuPersonnel#table
     */
    protected static DefaultTableModel tablemodel;
    
    /**
     * Titre pour la sauvegarde au sein du fichier.
     */
    protected static String[] title = {"Prenom","Nom","Date Entrée","IDE","Suppr"};
    
    /**
     * Titre pour l'affichage des employés.
     */
    protected static String[] titleHead = {"Prenom","Nom","Date Entrée","IDE"};
    
    /**
     * Identifiant de l'employé lors de la sélection d'une ligne.
     */
    protected static String valueId;
    
    /**
     * Tableau regroupant l'ensemble des informations sur les employés.
     */
    private static String[][] tabEAff;

    /**
     * Constructeur par défaut du Menu Personnel.
     * @see MenuPrincipal#listE
     * @see MenuPersonnel#afficherpage() 
     * @see MenuPersonnel#jButtonSauvegarder
     * @see MenuPersonnel#jButtonSupprimer
     * @see MenuPersonnel#jButtonAjouterEmp
     * @see MenuPersonnel#jButtonCharger
     * @see MenuPersonnel#jButtonImptCompEmp
     * @see MenuPersonnel#jButtonDetailsMission
     * @see MenuPersonnel#jButtonDetailsComp
     */
    public MenuPersonnel() {
        initComponents();
        jButtonSauvegarder.setVisible(false);
        jButtonSupprimer.setVisible(false);
        jButtonAjouterEmp.setVisible(false);
        jButtonCharger.setVisible(true);
        jButtonImptCompEmp.setVisible(false);
        jButtonDetailsMission.setVisible(false);
        jButtonDetailsComp.setVisible(false);
        if(listE!=null)
        {
            afficherpage();
        }
    }

    /**
     * Chargement de l'ensemble des éléments affichés à l'écran pour le menu personnel.
     */
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
        jButtonImptCompEmp = new javax.swing.JButton();
        jButtonDetailsMission = new javax.swing.JButton();
        jButtonDetailsComp = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JMenuBar();
        jMenuPrincipal = new javax.swing.JMenu();
        jMenuPrincpalItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(776, 649));

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

        jPanelTable.setPreferredSize(new java.awt.Dimension(564, 509));

        javax.swing.GroupLayout jPanelTableLayout = new javax.swing.GroupLayout(jPanelTable);
        jPanelTable.setLayout(jPanelTableLayout);
        jPanelTableLayout.setHorizontalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );
        jPanelTableLayout.setVerticalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
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

        jButtonImptCompEmp.setText("IMPORTER COMPETENCES");
        jButtonImptCompEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImptCompEmpActionPerformed(evt);
            }
        });

        jButtonDetailsMission.setText("Missions");
        jButtonDetailsMission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetailsMissionActionPerformed(evt);
            }
        });

        jButtonDetailsComp.setText("Compétences");
        jButtonDetailsComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetailsCompActionPerformed(evt);
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
                .addComponent(jPanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonSauvegarder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAjouterEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSupprimer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDetailsMission, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDetailsComp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addComponent(jButtonImptCompEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCharger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonImptCompEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonAjouterEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSupprimer)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonDetailsMission)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDetailsComp))
                    .addComponent(jPanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jBtnRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Action du clic sur le 'fermer' dans le menu en haut à gauche de l'application pour fermer la fenêtre courante.
     * @param evt 
     *      Evènement représentant un clic sur le 'fermer' dans le menu en haut à gauche de l'application.
     */
    private void jMenuPrincpalItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPrincpalItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuPrincpalItem1ActionPerformed

    /**
     * Action du clic sur le bouton "Retour" fermant la fenêtre MenuPersonnel et rouvrant le MenuPrincipal.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Retour".
     * @see MenuPrincipal
     */
    private void jBtnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRetourActionPerformed
        
        MenuPrincipal mp = new MenuPrincipal();
        mp.setLocationRelativeTo(this);
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnRetourActionPerformed

    /**
     * Action du clic sur le bouton "Charger fichier" permettant de charger un fichier csv en vue de sa lecture a venir. Ce fichier contiendra l'ensemble des employés et de leurs informations.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Charger fichier".
     * @see MenuPersonnel#selectedFileE
     * @see MenuPersonnel#initialiserTableau(java.io.File) 
     * @see MenuPersonnel#jPanelTable
     * @see MenuPersonnel#jButtonSauvegarder
     * @see MenuPersonnel#jButtonAjouterEmp
     * @see MenuPersonnel#jButtonCharger
     * @see MenuPersonnel#jButtonImptCompEmp
     */
    private void jButtonChargerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChargerActionPerformed
       JFileChooser jc = new JFileChooser();
        int returnValue = jc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) 
        {
            selectedFileE = jc.getSelectedFile();
            try {
                initialiserTableau(selectedFileE); 
                
            } catch (IOException ex) {
                Logger.getLogger(MenuCompetence.class.getName()).log(Level.SEVERE, null, ex);
            }
            jPanelTable.setVisible(true);
            jButtonSauvegarder.setVisible(true);
            jButtonAjouterEmp.setVisible(true);
            jButtonCharger.setVisible(false);
            jButtonImptCompEmp.setVisible(true);
        }
    }//GEN-LAST:event_jButtonChargerActionPerformed

    /**
     * Action du clic sur le bouton "Sauvegarder tableau" permettant de sauvegarder dans le fichier csv ayant été lu en chargement des employés.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Sauvegarder tableau". 
     * @see MenuPrincipal#listE
     * @see MenuPersonnel#selectedFileE
     * @see MenuPersonnel#title
     * @see gestionnairedemission.Employe#getPrenom() 
     * @see gestionnairedemission.Employe#getNom() 
     * @see gestionnairedemission.Employe#getDate() 
     * @see gestionnairedemission.Employe#getIdE() 
     * @see gestionnairedemission.Employe#getSuppr() 
     */
    private void jButtonSauvegarderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSauvegarderActionPerformed
        Writer writer = null;
        int nRow = listE.size();
        int nCol = 5;
        try {
            try {
                try {
                    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(selectedFileE.getAbsolutePath()), "utf-8"));
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(MenuPersonnel.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MenuPersonnel.class.getName()).log(Level.SEVERE, null, ex);
            }
            StringBuffer bufferHeader = new StringBuffer();
            for (int j = 0; j < nCol; j++) {
                bufferHeader.append(title[j]);
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
                buffer.append(listE.get(i).getPrenom());
                buffer.append(";");
                buffer.append(listE.get(i).getNom());
                buffer.append(";");
                buffer.append(df.format(listE.get(i).getDate()));
                buffer.append(";");
                buffer.append(listE.get(i).getIdE());
                buffer.append(";");
                buffer.append(listE.get(i).getSuppr());
                buffer.append(";");                       
                try {
                    writer.write(buffer.toString() + "\r\n");
                } catch (IOException ex) {
                    Logger.getLogger(MenuPersonnel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            writer.write(System.getProperty( "line.separator" ));
        } catch (IOException ex) {
            Logger.getLogger(MenuPersonnel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.toString());
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(MenuPersonnel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        JOptionPane.showMessageDialog(null, "Fichier sauvegardé");
    }//GEN-LAST:event_jButtonSauvegarderActionPerformed

    /**
     * Action liée au clic sur le bouton "+" ouvrant le MenuAjoutEmploye, permettant d'ajouter un nouvel employé.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "+".
     * @see MenuAjoutEmploye
     */
    private void jButtonAjouterEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterEmpActionPerformed
        MenuAjoutEmploye mae = new MenuAjoutEmploye();
        mae.setLocationRelativeTo(this);
        mae.setVisible(true);
        
    }//GEN-LAST:event_jButtonAjouterEmpActionPerformed

    /**
     * Action liée au clic sur le bouton "-" une fois une ligne du tableau d'employés selectionnée. Elle permet de changer l'état de la variable "suppr" d'un employé à "true" pour simuler la suppression d'un employé sans perdre les informations relatives à celui-ci.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "-".
     * @see MenuPrincipal#listE
     * @see gestionnairedemission.Employe#getIdE() 
     * @see gestionnairedemission.Employe#setSuppr(boolean) 
     * @see MenuPersonnel#tablemodel
     * @see MenuPersonnel#table
     */
    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
    for (int j = 0; j < listE.size(); j++) {
            int ide=listE.get(j).getIdE();
            int value = Integer.parseInt(valueId);
            if(ide == value ){
                listE.get(j).setSuppr(true);
            }
        }   
       tablemodel = refreshTableModel();
       table.setModel(tablemodel);
       table.repaint();
    }//GEN-LAST:event_jButtonSupprimerActionPerformed

    /**
     * Action du clic sur le bouton "Importer compétences" permettant de charger un fichier csv en vue de sa lecture a venir. Ce fichier contiendra l'ensemble des compétences des employés.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Importer compétences".
     * @see MenuPersonnel#selectedFileEC
     * @see MenuPersonnel#ajoutCompetenceEmploye(java.io.File) 
     */
    private void jButtonImptCompEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImptCompEmpActionPerformed
        JFileChooser jc = new JFileChooser();
        int returnValue = jc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) 
        {
            selectedFileEC = jc.getSelectedFile();
            try {
                ajoutCompetenceEmploye(selectedFileEC); 
                
            } catch (IOException ex) {
                Logger.getLogger(MenuCompetence.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonImptCompEmpActionPerformed

    /**
     * Action du clic sur le bouton "Compétences" permettant, pour un employé selectionné dans le tableau, d'afficher l'ensemble de ses compétences via le menu MenuDetailCompetence     * @param evt 
     *      Evènement représentant un clic sur le bouton "Compétences".
     * @see MenuDetailCompetence
     * @see MenuPersonnel#num
     */
    private void jButtonDetailsCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetailsCompActionPerformed
        MenuDetailCompetence mdc = new MenuDetailCompetence(num+1);
        mdc.setLocationRelativeTo(this);
        mdc.setVisible(true);
    }//GEN-LAST:event_jButtonDetailsCompActionPerformed

    /**
     * Action du clic sur le bouton "Missions" permettant, pour un employé selectionné dans le tableau, d'afficher l'historique de ses missions via le menu MenuDetailMissionEmp.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Missions".
     * @see MenuDetailMissionEmp
     * @see MenuPersonnel#num
     */
    private void jButtonDetailsMissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetailsMissionActionPerformed
        MenuDetailMissionEmp mdce = new MenuDetailMissionEmp(num+1);
        mdce.setLocationRelativeTo(this);;
        mdce.setVisible(true);
    }//GEN-LAST:event_jButtonDetailsMissionActionPerformed

    /**
     * Partie main du MenuPersonnel.
     * @param args the command line arguments
     */
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
    private javax.swing.JButton jButtonDetailsComp;
    private javax.swing.JButton jButtonDetailsMission;
    private javax.swing.JButton jButtonImptCompEmp;
    private javax.swing.JButton jButtonSauvegarder;
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JMenuItem jMenuPrincpalItem1;
    private javax.swing.JPanel jPanelTable;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables

    /**
     * 
     * @param fi
     * @throws FileNotFoundException
     * @throws IOException 
     */
    private void initialiserTableau( File fi) throws FileNotFoundException, IOException {
        CsvEmployeDAO csvE = new CsvEmployeDAO(fi);
        MenuPrincipal.listE = csvE.addEmploye(); 
        tablemodel = refreshTableModel();
        table = new JTable(tablemodel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jPanelTable.setLayout(new BorderLayout());
        JScrollPane tableContainer = new JScrollPane(table);
        jPanelTable.add(tableContainer, BorderLayout.CENTER);
        this.getContentPane().add(jPanelTable);
        this.pack();
        this.setVisible(true);
        jButtonAjouterEmp.setVisible(true);
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                if(!event.getValueIsAdjusting()) {
                    ListSelectionModel  model = (ListSelectionModel)event.getSource();
                    num=model.getMinSelectionIndex();
                    if(num != -1){
                        valueId = new String();
                        valueId = (String)table.getModel().getValueAt(num,3);
                        if(valueId == null){
                            jButtonSupprimer.setVisible(false);
                            jButtonDetailsComp.setVisible(false);
                            jButtonDetailsMission.setVisible(false);
                            JOptionPane.showMessageDialog(null,"Veuillez sélectionner une ligne non vide");
                        }else 
                        {
                            jButtonSupprimer.setVisible(true);
                            jButtonAjouterEmp.setVisible(true);
                            jButtonDetailsComp.setVisible(true);
                            jButtonDetailsMission.setVisible(true);
                        }
                    }
                }
            }
        });
    }
    
    public static DefaultTableModel refreshTableModel(){
        int j = 0;
        tabEAff = new String[listE.size()][5]; 
        for (int i=0;i<listE.size();i++)
        {
            if(listE.get(i).getSuppr() == false){
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                int ide;
                String pnom, nom, bool;
                Date dt;
                boolean b;
                b= listE.get(i).getSuppr();
                ide=listE.get(i).getIdE();
                pnom=listE.get(i).getPrenom();
                nom=listE.get(i).getNom();
                dt=listE.get(i).getDate();
                String id= Integer.toString(ide);
                bool = String.valueOf(b);
                tabEAff[i-j][0]=pnom;
                tabEAff[i-j][1]=nom;
                tabEAff[i-j][2]=df.format(dt);
                tabEAff[i-j][3]= id;
                tabEAff[i-j][4]=bool;
            }else j++;
        }
        return new DefaultTableModel(tabEAff, titleHead);
    }
    
    private void ajoutCompetenceEmploye(File fi) throws FileNotFoundException, IOException
    {
        CsvEmployeCompetenceDAO csvEC = new CsvEmployeCompetenceDAO(fi);
        ArrayList<String[]> listEC = new ArrayList<String[]>(listE.size());
        listEC=csvEC.addCompetence();
        for(int i=0;i<listEC.size();i++)
        {
            Competence comp[] = new Competence[listEC.get(i).length-1];
            for(int j=1;j<listEC.get(i).length;j++)
            {
                for(int k=0;k<listE.size();k++)
                {
                    String str = Integer.toString(listE.get(k).getIdE());
                    if(str.equals(listEC.get(i)[0]))
                    {
                        for(int l=0;l<listC.size();l++)
                        {
                           if(listC.get(l).getIDC().equals(listEC.get(i)[j]))
                           {
                               comp[j-1]=listC.get(l);
                           }
                        }
                        listE.get(k).setCompetence(comp);
                    }
                }
            }
        }
    }
    
    private void afficherpage(){
        tablemodel = refreshTableModel();
        table = new JTable(tablemodel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jPanelTable.setLayout(new BorderLayout());
        JScrollPane tableContainer = new JScrollPane(table);
        jPanelTable.add(tableContainer, BorderLayout.CENTER);
        jButtonAjouterEmp.setVisible(true);
        jButtonSauvegarder.setVisible(true);
        jButtonImptCompEmp.setVisible(true);
        this.getContentPane().add(jPanelTable);
        this.pack();
        this.setVisible(true);
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                if(!event.getValueIsAdjusting()) {
                    ListSelectionModel  model = (ListSelectionModel)event.getSource();
                    num=model.getMinSelectionIndex();
                    if(num != -1){
                        valueId = new String();
                        valueId = (String)table.getModel().getValueAt(num,3);
                        if(valueId == null){
                            jButtonSupprimer.setVisible(false);
                            jButtonDetailsComp.setVisible(false);
                            jButtonDetailsMission.setVisible(false);
                            JOptionPane.showMessageDialog(null,"Veuillez sélectionner une ligne non vide");
                        }else 
                        {
                            jButtonSupprimer.setVisible(true);
                            jButtonDetailsComp.setVisible(true);
                            jButtonDetailsMission.setVisible(true);
                        }

                    }
                }
            }
        });
    }
}
