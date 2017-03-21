package interfaces;
import gestionnairedemission.CsvCompetenceDAO;
import static interfaces.MenuPrincipal.listC;
import java.awt.BorderLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 * <b> Classe Menu Competence </b>
 * <p> Il s'agit du menu gérant la gestion des compétences au sein de l'application. Elle sert d'interface d'échange auprès de l'utilisateur via l'utilisation d'un fichier CSV et autorise 
 * l'utilisateur à  créer et supprimer des compétences.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * version 1.0
 */
public class MenuCompetence extends javax.swing.JFrame {

    /**
     * Identifiant d'une ligne selectionné par l'utilisateur afin d'effectuer des actions sur la compétence selectionnée.
     */
    private static int num;
    
    /**
     * Fichier selectionné lors du chargement d'un fichier pour l'import des compétences.
     */
    private static File selectedFileC;
    
    /**
     * Identifiant de la compétence lors de la sélection d'une ligne.
     */
    protected static String valueID;
    
    /**
     * JTable servant a afficher la liste des compétences.
     */
    protected static JTable table;
    
    /**
     * DefaultTableModel définissant le "graphisme" de la JTable table.
     * @see MenuCompetence#table
     */
    protected static DefaultTableModel tablemodel;
    
    /**
     * Titre pour la sauvegarde au sein du fichier.
     */
    protected static String[] title = {"Identifiant","Catégorie","Libelle","suppr"};
    
    /**
     * Titre pour l'affichage des compétences dans la table.
     * @see MenuCompetence#table
     */
    protected static String[] title2 = {"Identifiant","Catégorie","Libelle"};
    
    /**
     * Tableau regroupant l'ensemble des informations sur les compétences.
     */
    private static String[][] tabCAff;
    
     /**
     * Constructeur par défaut du Menu Compétence.
     * @see MenuPrincipal#listC
     * @see MenuCompetence#initComponents() 
     * @see MenuCompetence#afficherpage() 
     * @see MenuCompetence#jButtonSauvegarder
     * @see MenuCompetence#jButtonSupprimer
     * @see MenuCompetence#jButtonAjouterComp
     * @see MenuCompetence#jButtonCharger
     */
    public MenuCompetence() {
        initComponents();
        jButtonSauvegarder.setVisible(false);
        jButtonSupprimer.setVisible(false);
        jButtonAjouterComp.setVisible(false);
        if(listC!=null)
        {
            afficherpage();
            jButtonSauvegarder.setVisible(true);
            jButtonCharger.setVisible(false);
            jButtonAjouterComp.setVisible(true);
        } 
    }

    /**
     * Chargement de l'ensemble des éléments affichés à l'écran pour le menu compétence.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBtnRetour = new javax.swing.JButton();
        jButtonSauvegarder = new javax.swing.JButton();
        jButtonCharger = new javax.swing.JButton();
        jPanelTable = new javax.swing.JPanel();
        jButtonAjouterComp = new javax.swing.JButton();
        jButtonSupprimer = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JMenuBar();
        jMenuPrincipal = new javax.swing.JMenu();
        jMenuPrincpalItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(766, 550));
        setPreferredSize(new java.awt.Dimension(766, 550));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel1.setText("Gestion des Compétences");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jBtnRetour.setText("Retour");
        jBtnRetour.setMaximumSize(new java.awt.Dimension(120, 36));
        jBtnRetour.setMinimumSize(new java.awt.Dimension(120, 36));
        jBtnRetour.setPreferredSize(new java.awt.Dimension(120, 36));
        jBtnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRetourActionPerformed(evt);
            }
        });

        jButtonSauvegarder.setText("SAUVEGARDER TABLEAU");
        jButtonSauvegarder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSauvegarderActionPerformed(evt);
            }
        });

        jButtonCharger.setText("CHARGER FICHIER");
        jButtonCharger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChargerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTableLayout = new javax.swing.GroupLayout(jPanelTable);
        jPanelTable.setLayout(jPanelTableLayout);
        jPanelTableLayout.setHorizontalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelTableLayout.setVerticalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButtonAjouterComp.setText("+");
        jButtonAjouterComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterCompActionPerformed(evt);
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
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 116, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAjouterComp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSupprimer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCharger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSauvegarder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCharger, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSauvegarder, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jButtonAjouterComp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSupprimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addComponent(jBtnRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Action du clic sur le 'fermer' dans le menu en haut à gauche de l'application pour fermer l'application.
     * @param evt 
     *      Evènement représentant un clic sur le 'fermer' dans le menu en haut à gauche de l'application.
     */
    private void jMenuPrincpalItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPrincpalItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuPrincpalItem1ActionPerformed

    /**
     * Action du clic sur le bouton "Retour" fermant la fenêtre MenuCompetence et réouvrant le MenuPrincipal.
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
     * Action du clic sur le bouton "Charger fichier" permettant de charger un fichier csv en vue de sa lecture a venir.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Charger fichier".
     * @see MenuCompetence#selectedFileC
     * @see MenuCompetence#initialiserTableau(java.io.File) 
     * @see MenuCompetence#jPanelTable
     * @see MenuCompetence#jButtonSauvegarder
     * @see MenuCompetence#jButtonAjouterComp
     * @see MenuCompetence#jButtonCharger
     */
    private void jButtonChargerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChargerActionPerformed
        JFileChooser jc = new JFileChooser();
        int returnValue = jc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) 
        {
            selectedFileC = jc.getSelectedFile();
            try {
                initialiserTableau(selectedFileC);
            } catch (IOException ex) {
                Logger.getLogger(MenuCompetence.class.getName()).log(Level.SEVERE, null, ex);
            }
            jPanelTable.setVisible(true);
            jButtonCharger.setVisible(false);
            jButtonSauvegarder.setVisible(true);
            jButtonAjouterComp.setVisible(true);
        }
        
    }//GEN-LAST:event_jButtonChargerActionPerformed
  
    /**
     * Action du clic sur le bouton "Sauvegarder fichier" permettant de sauvegarder le fichier csv possendant (ou non) les nouvelles données.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Sauvegarder fichier".
     * @see MenuPrincipal#listC
     * @see MenuCompetence#selectedFileC
     * @see MenuCompetence#title
     * @see gestionnairedemission.Competence#getIDC() 
     * @see gestionnairedemission.Competence#getCat() 
     * @see gestionnairedemission.Competence#getLib() 
     * @see gestionnairedemission.Competence#getSuppr() 
     */
    private void jButtonSauvegarderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSauvegarderActionPerformed
        // TODO add your handling code here:
        Writer writer = null;
        int nRow = listC.size();
        int nCol = 4;
        try {
            try {
                try {
                    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(selectedFileC.getAbsolutePath()), "utf-8"));
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
            for (int i = 0 ; i < nRow ; i++){
            StringBuffer buffer = new StringBuffer();
            buffer.append(listC.get(i).getIDC());
            buffer.append(";");
            buffer.append(listC.get(i).getCat());
            buffer.append(";");
            buffer.append(listC.get(i).getLib());
            buffer.append(";");
            buffer.append(listC.get(i).getSuppr());
            buffer.append(";");
            try {
                writer.write(buffer.toString() + "\r\n");
                if(i == nRow -1){
                    writer.write("\r\n");
                }
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
        JOptionPane.showMessageDialog(null, "Fichier sauvegardé");

    }//GEN-LAST:event_jButtonSauvegarderActionPerformed

    /**
     * Action du clic sur le bouton "+" permettant d'ouvrir le Menu Ajout Compétence.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "+".
     * @see MenuAjoutCompetence
     */
    private void jButtonAjouterCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterCompActionPerformed
        MenuAjoutCompetence mac = new MenuAjoutCompetence();
        mac.setLocationRelativeTo(this);
        mac.setVisible(true);
    }//GEN-LAST:event_jButtonAjouterCompActionPerformed

    
    /**
     * Action du clic sur le bouton "-" permettant de supprimer la compétence sélectionnée dans la table.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Sauvegarder fichier".
     * @see MenuPrincipal#listC
     * @see gestionnairedemission.Competence#getIDC() 
     * @see MenuCompetence#valueID
     * @see gestionnairedemission.Competence#setSuppr(boolean) 
     * @see MenuCompetence#tablemodel
     * @see MenuCompetence#refreshTableModel()
     * @see MenuCompetence#table
     */
    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
       for (int j = 0; j < listC.size(); j++) {
            String idc=listC.get(j).getIDC();
            if(idc == valueID ){
                listC.get(j).setSuppr(true);
            }
        }   
       tablemodel = refreshTableModel();
       table.setModel(tablemodel);
       table.repaint();
    }//GEN-LAST:event_jButtonSupprimerActionPerformed

   
    
    /**
     * Partie main du MenuCompetence.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuCompetence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCompetence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCompetence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCompetence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCompetence().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnRetour;
    private javax.swing.JButton jButtonAjouterComp;
    private javax.swing.JButton jButtonCharger;
    private javax.swing.JButton jButtonSauvegarder;
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JMenuItem jMenuPrincpalItem1;
    private javax.swing.JPanel jPanelTable;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables

    /**
     * Méthode permettant d'initialiser la table via le fichier csv correspondant chargé précédemment
     * @see gestionnairedemission.CsvCompetenceDAO
     * @see MenuPrincipal#listC
     * @see MenuCompetence#tablemodel
     * @see MenuCompetence#rebuildFile() 
     * @see MenuCompetence#table
     * @see MenuCompetence#jPanelTable
     * @see MenuCompetence#num
     * @see MenuCompetence#valueID
     * @see MenuCompetence#jButtonSupprimer
     */
    private void initialiserTableau( File fi) throws FileNotFoundException, IOException {
        CsvCompetenceDAO csvC = new CsvCompetenceDAO(fi);
        MenuPrincipal.listC = csvC.addCompetence();
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
        @Override
        public void valueChanged(ListSelectionEvent event) {
            if(!event.getValueIsAdjusting()) {
			ListSelectionModel  model = (ListSelectionModel)event.getSource();
			num=model.getMinSelectionIndex();
                        if(num != -1){
                            valueID = new String();
                            valueID = (String)table.getModel().getValueAt(num,0);
                        }
                            if(valueID == null){
                                jButtonSupprimer.setVisible(false);
                                JOptionPane.showMessageDialog(null,"Veuillez sélectionner une ligne non vide");
                            }else jButtonSupprimer.setVisible(true);
                        }
        }
        });
    }
    
    /**
     * Méthode permettant de retourner la définition de la table et de mettre ainsi à jour l'affichage
     * @return DefaultTableModel
     *          la définition de la table ainsi que son contenu
     * @see MenuCompetence#tabCAff
     * @see MenuPrincipal#listC
     * @see gestionnairedemission.Competence#getSuppr() 
     * @see gestionnairedemission.Competence#getIDC() 
     * @see gestionnairedemission.Competence#getCat() 
     * @see gestionnairedemission.Competence#getLib() 
     * @see MenuCompetence#title2
     */
        public static DefaultTableModel refreshTableModel(){
        int j = 0;
        tabCAff = new String[listC.size()][3]; 
        for (int i=0;i<listC.size();i++)
        {
            if(listC.get(i).getSuppr() == false){
                
                String idc, libelle, cat;
                idc=listC.get(i).getIDC();
                cat=listC.get(i).getCat();
                libelle=listC.get(i).getLib();
                tabCAff[i-j][0]=idc;
                tabCAff[i-j][1]=cat;
                tabCAff[i-j][2]=libelle;
            } else j++;
        }

        return new DefaultTableModel(tabCAff, title2);
    }
        
     /**
     * Méthode permettant de retourner la définition de la table et de mettre ainsi à jour l'affichage
     * @return DefaultTableModel
     *          la définition de la table ainsi que son contenu
     * @see MenuCompetence#tabCAff
     * @see MenuPrincipal#listC
     * @see gestionnairedemission.Competence#getIDC() 
     * @see gestionnairedemission.Competence#getCat() 
     * @see gestionnairedemission.Competence#getLib() 
     * @see MenuCompetence#title2
     */
        public static DefaultTableModel rebuildFile(){
        tabCAff  = new String[listC.size()][3];
        for (int i=0;i<listC.size();i++)
        {
                String idc, libelle, cat;
                idc=listC.get(i).getIDC();
                cat=listC.get(i).getCat();
                libelle=listC.get(i).getLib();
                tabCAff[i][0]=idc;
                tabCAff[i][1]=cat;
                tabCAff[i][2]=libelle;
        }

        return new DefaultTableModel(tabCAff, title2);
    }
        
      /**
     * Méthode permettant de faire l'affichage de l'interface si le fichier a déja été chargé une fois
     * @see MenuCompetence#tablemodel
     * @see MenuCompetence#rebuildFile() 
     * @see MenuCompetence#table
     * @see MenuCompetence#jPanelTable
     * @see MenuCompetence#jButtonAjouterComp
     * @see MenuCompetence#num
     * @see MenuCompetence#valueID
     * @see MenuCompetence#jButtonSupprimer
     */
        private void afficherpage(){
        tablemodel = rebuildFile();
        table = new JTable(tablemodel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jPanelTable.setLayout(new BorderLayout());
        JScrollPane tableContainer = new JScrollPane(table);    
        jPanelTable.add(tableContainer, BorderLayout.CENTER);
        jButtonAjouterComp.setVisible(true);
        this.getContentPane().add(jPanelTable);
        this.pack();
        this.setVisible(true);
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        @Override
        public void valueChanged(ListSelectionEvent event) {
            if(!event.getValueIsAdjusting()) {
			ListSelectionModel  model = (ListSelectionModel)event.getSource();
			num=model.getMinSelectionIndex();
                        if(num != -1){
                            valueID = new String();
                            valueID = (String)table.getModel().getValueAt(num,0);
                        }
                            if(valueID == null){
                                jButtonSupprimer.setVisible(false);
                                JOptionPane.showMessageDialog(null,"Veuillez sélectionner une ligne non vide");
                                
                            }else {
                                jButtonSupprimer.setVisible(true);
                            }
                        }
        }
        });
        }
}
