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
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 * <b> Classe MenuMissionGeneral </b>
 * <p> Il s'agit du menu central dans la gestion des mission. Il permet d'afficher les missions ainsi que leurs détails, de créer de nouvelles missions et de charger un fichier contenant les informations de toutes les mission.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * version 1.0
 */
public class MenuMissionGeneral extends javax.swing.JFrame {

    /**
     * Le numéro de la ligne selectionnée.
     */
    private static int num;
    
    /**
     * Le titre à afficher dans le tableau de missions.
     */
    protected static String[] titleHead = {"Type Mission","IdM","Descriptif","Date","Nb Employes"};
    
    /**
     * Le titre à sauvegarder au sein du fichier csv lors de la sauvegarde des missions.
     */
    protected static String[] titleH = {"TypeM","IdM","Descriptif","DateDebut","Nb Employes", "Nb Compétences","Competences","Nb Employe Competence", "Employe Competence","Date Fin"};
    
    /**
     * Le tableau contenant l'ensemble des informations relatives aux missions.
     */
    private static String[][] tabMAff;
    
    /**
     * Le DefaultTableModel utilisé pour l'affichage du tableau de missions.
     */
    protected static DefaultTableModel model;
    
    /**
     * Le fichier csv utilisé pour charger/sauvegarder les missions.
     */
    private static File selectedFile;
    
    /**
     * La JTable permettant l'affichage du tableau de missions.
     */
    protected static JTable table;
    
    /**
     * Constructeur du MenuMissionGeneral.
     * @see MenuMissionGeneral#initComponents() 
     * @see MenuMissionGeneral#jBtnDetailMission
     * @see MenuMissionGeneral#jBtnNouvelleMission
     * @see MenuMissionGeneral#jCbxTypeMission
     * @see MenuMissionGeneral#jLabel2
     * @see MenuPrincipal#listM
     * @see MenuMissionGeneral#afficherpage() 
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
     * Chargement de l'ensemble des éléments affichés à l'écran pour le MenuMissionGeneral.
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
        jCbxTypeMission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbxTypeMissionActionPerformed(evt);
            }
        });

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

    /**
     * Action du clic sur le 'fermer' dans le menu en haut à gauche de l'application pour fermer la fenêtre courante.
     * @param evt 
     *      Evènement représentant un clic sur le 'fermer' dans le menu en haut à gauche de l'application.
     */
    private void jMenuPrincpalItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPrincpalItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuPrincpalItem1ActionPerformed

    /**
     * Action du clic sur le bouton "Retour" fermant la fenêtre MenuMissionGeneral et rouvrant le MenuPrincipal.
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
     * Action du clic sur le bouton "Nouvelle Mission" ouvrant la fenêtre MenuNouvelleMission permettant de créer une nouvelle mission.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Nouvelle Mission".
     * @see MenuNouvelleMission
     */
    private void jBtnNouvelleMissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNouvelleMissionActionPerformed
        MenuNouvelleMission mnm = new MenuNouvelleMission();
        mnm.setLocationRelativeTo(this);
        mnm.setVisible(true);
    }//GEN-LAST:event_jBtnNouvelleMissionActionPerformed

    /**
     * Action du clic sur le bouton "Detail Mission" ouvrant la fenêtre MenuDetailMission affichant des informations relatives à la mission.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Detail Mission".
     * @see MenuDetailMission
     */
    private void jBtnDetailMissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDetailMissionActionPerformed
        MenuDetailMission mdm = new MenuDetailMission(num);
        mdm.setLocationRelativeTo(this);
        mdm.setVisible(true);
    }//GEN-LAST:event_jBtnDetailMissionActionPerformed

    /**
     * Action du clic sur le bouton "Charger mission" permettant de charger un fichier csv en vue de sa lecture a venir. Ce fichier contiendra l'ensemble des missions et de leurs informations.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Charger mission".
     * @see MenuMissionGeneral#selectedFile
     * @see MenuMissionGeneral#initialiserTableau(java.io.File) 
     * @see MenuMissionGeneral#jPanelTable
     * @see MenuMissionGeneral#jBtnChargerMission
     * @see MenuMissionGeneral#jBtnNouvelleMission
     * @see MenuMissionGeneral#jCbxTypeMission
     * @see MenuMissionGeneral#jLabel2
     */
    private void jBtnChargerMissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnChargerMissionActionPerformed
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

    /**
     * Action du clic sur le bouton "Générer fichier mission" permettant de créer un fichier d'enregistrement de missions à charger et contenant le bon formalisme.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Générer fichier mission".
     * @see MenuMissionGeneral#titleH
     */
    private void jBtnFichierMissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFichierMissionActionPerformed
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
     * CheckBox permettant d'afficher les missions en fonction de leur type.
     * @param evt 
     *      Changement dans l'état de la checkbox
     * @see MenuMissionGeneral#jCbxTypeMission
     * @see MenuMissionGeneral#model
     * @see MenuMissionGeneral#table
     */
    private void jCbxTypeMissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbxTypeMissionActionPerformed
        switch(jCbxTypeMission.getSelectedIndex()){
            case 0:
                 RowFilter<Object, Object> filter = new RowFilter<Object, Object>() {
                    public boolean include(Entry entry) {
                      return true;
                    }
                  };

                  TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
                  sorter.setRowFilter(filter);
                  table.setRowSorter(sorter);
                
                break;
            case 1:
                    RowFilter<Object, Object> filter1 = new RowFilter<Object, Object>() {
                        public boolean include(Entry entry) {
                          String type = (String) entry.getValue(0);
                          return type.equals("Mission En Cours");
                        }
                  };
                  TableRowSorter<TableModel> sorter1 = new TableRowSorter<TableModel>(model);
                  sorter1.setRowFilter(filter1);
                  table.setRowSorter(sorter1);
                  table.repaint();
                break;
            case 2:
                RowFilter<Object, Object> filter2 = new RowFilter<Object, Object>() {
                        public boolean include(Entry entry) {
                          String type = (String) entry.getValue(0);
                          return type.equals("Mission En Préparation");
                        }
                  };
                  TableRowSorter<TableModel> sorter2 = new TableRowSorter<TableModel>(model);
                  sorter2.setRowFilter(filter2);
                  table.setRowSorter(sorter2);
                  table.repaint();
                break;
            case 3:
                RowFilter<Object, Object> filter3 = new RowFilter<Object, Object>() {
                        public boolean include(Entry entry) {
                          String type = (String) entry.getValue(0);
                          return type.equals("Mission Planifiée");
                        }
                  };
                  TableRowSorter<TableModel> sorter3 = new TableRowSorter<TableModel>(model);
                  sorter3.setRowFilter(filter3);
                  table.setRowSorter(sorter3);
                  table.repaint();
                break;
            case 4:
                RowFilter<Object, Object> filter4 = new RowFilter<Object, Object>() {
                        public boolean include(Entry entry) {
                          String type = (String) entry.getValue(0);
                          return type.equals("Mission Terminée");
                        }
                  };
                  TableRowSorter<TableModel> sorter4 = new TableRowSorter<TableModel>(model);
                  sorter4.setRowFilter(filter4);
                  table.setRowSorter(sorter4);
                  table.repaint();
                  break;
        }
    }//GEN-LAST:event_jCbxTypeMissionActionPerformed

    /**
     * Partie main du MenuMissionGeneral.
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
            java.util.logging.Logger.getLogger(MenuMissionGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMissionGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMissionGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMissionGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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

    /**
     * Méthode permettant d'initialiser la table via le fichier csv en entrée.
     * @param fi 
     *      Fichier csv contenant l'ensemble des missions.
     * @see MenuPrincipal#listM
     * @see gestionnairedemission.CsvMissionDAO#addMission() 
     * @see MenuMissionGeneral#jPanelTable
     * @see MenuMissionGeneral#model
     * @see MenuMissionGeneral#table
     * @see MenuMissionGeneral#num
     * @see MenuMissionGeneral#jBtnDetailMission
     */
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
            if(!event.getValueIsAdjusting()) {
			ListSelectionModel  model = (ListSelectionModel)event.getSource();
			num=model.getMinSelectionIndex(); 
            }
            jBtnDetailMission.setVisible(true);
        }
    });
    }
   
    /**
     * Méthode permettant de rafraichir le tableau de missions.
     * @return Un DefaultTableModel utilisé pour rafraichir le tableau de missions.
     * @see MenuMissionGeneral#tabMAff
     * @see MenuPrincipal#listM
     * @see gestionnairedemission.Mission#getTypeM() 
     * @see gestionnairedemission.Mission#getIdM() 
     * @see gestionnairedemission.Mission#getDateDebut() 
     * @see gestionnairedemission.Mission#getDescM() 
     * @see gestionnairedemission.Mission#getNbEmployes() 
     * @see MenuMissionGeneral#titleHead
     */
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
    
    /**
     * Sauvegarde des missions au sein du fichier csv ayant été utilisé pour les charger.
     * @see MenuPrincipal#listM
     * @see MenuMissionGeneral#selectedFile
     * @see MenuMissionGeneral#titleH
     * @see gestionnairedemission.Mission#getTypeM() 
     * @see gestionnairedemission.Mission#getIdM() 
     * @see gestionnairedemission.Mission#getDescM()
     * @see gestionnairedemission.Mission#getDateDebut()  
     * @see gestionnairedemission.Mission#getNbEmployes()
     * @see gestionnairedemission.Mission#getCompMission() 
     * @see gestionnairedemission.CompetenceMission#getIDC() 
     * @see gestionnairedemission.CompetenceMission#getNb() 
     * @see gestionnairedemission.Mission#getEmployeMission() 
     * @see gestionnairedemission.Employe#getIdE() 
     * @see gestionnairedemission.Mission#getDateFin() 
     */
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
                nbComp=listM.get(i).getCompMission().length;
                if(nbComp !=0){
                   buffer.append(listM.get(i).getCompMission().length);
                   buffer.append(";");
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
                if(listM.get(i).getEmployeMission() !=null){
                    buffer.append(listM.get(i).getEmployeMission().length);
                    buffer.append(";");
                }
                
                if(nbPers !=0 && listM.get(i).getEmployeMission().length != 0){
                   for(int k = 0; k <nbPers; k++){
                     buffer.append(listM.get(i).getEmployeMission()[k].getIdE());
                     buffer.append(";");
                    } 
                }
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

    /**
     * Méthode permettant de calculer la longueur du tableau de CompetenceMission lié à une mission, et mis en entrée.
     * @param tab
     *      Le tableau de CompetenceMission dont on souhaite connaître la taille.
     * @return La taille du tableau de CompetenceMission.
     * @see gestionnairedemission.CompetenceMission
     */
    private static int compterCompetences(CompetenceMission[] tab){
        if (tab == null){
            return 0;
        }
        return tab.length;
    }
    
    /**
     * Méthode permettant de calculer la longueur du tableau d'Employe lié à une mission, et mis en entrée.
     * @param tab
     *      Le tableau d'Employe dont on souhaite connaître la taille.
     * @return La taille du tableau d'Employe.
     * @see gestionnairedemission.Employe
     */
    private static int compterPersonnes(Employe[] tab){
        if (tab == null){
            return 0;
        }
        return tab.length;  
    }
    
    /**
     * Méthode permettant d'afficher la page si elle a déjà été chargée initialement.
     * @see MenuMissionGeneral#jPanelTable
     * @see MenuMissionGeneral#model
     * @see MenuMissionGeneral#table
     * @see MenuMissionGeneral#jBtnNouvelleMission
     * @see MenuMissionGeneral#num
     * @see MenuMissionGeneral#jBtnDetailMission
     */
    private void afficherpage(){
        jPanelTable.setLayout(new BorderLayout());
        model = refreshTableModel();
        table = new JTable(model);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane tableContainer = new JScrollPane(table);    
        jPanelTable.add(tableContainer, BorderLayout.CENTER);
        jBtnNouvelleMission.setVisible(true);
        this.getContentPane().add(jPanelTable);
        this.pack();
        this.setVisible(true);
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            if(!event.getValueIsAdjusting()) {
			ListSelectionModel  model = (ListSelectionModel)event.getSource();
			num=model.getMinSelectionIndex(); 
            }
            jBtnDetailMission.setVisible(true);
        }
    });
    }
}
