package interfaces;

import gestionnairedemission.CompetenceMission;
import gestionnairedemission.Mission;
import static interfaces.MenuMissionGeneral.sauvegarderMissions;
import static interfaces.MenuMissionGeneral.table;
import static interfaces.MenuPrincipal.listE;
import static interfaces.MenuPrincipal.listM;
import java.awt.BorderLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 * <b> Classe Menu Detail Mission </b>
 * <p> Il s'agit du menu affichant une vue détaillée pour une mission donnée.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * version 1.0
 */
public class MenuDetailMission extends javax.swing.JFrame {

    /**
     * Le nombre de colonnes du tableau relatif aux compétences.
     */
    private static int valueTab=4;
    
    /**
     * Le nombre de colonnes du tableau relatif aux employés.
     */
    private static int valueTabE=3;
    
    /**
     * Valeur de la colonne correspondant à l'id de la compétence selectionnée dans la table
     */
    protected static String compId;
    
    /**
     * Valeur de la colonne correspondant au nombre d'employé de la compétence selectionnée dans la table
     */
    protected static int nbEmp;
    
    /**
     * Valeur du textbox contenant l'id de la mission dont on affiche les details
     */
    protected static int idMission;
    
     /**
     * Définition de la table d'affichage des employés travaillant sur la mission
     */
    protected static DefaultTableModel dtmE;
    
    /**
     * table permettant l'affichage des employés travaillant sur la mission
     */
    protected static JTable tableE;
    
    /**
     * Valeur de l'id de la mission dont on affiche les détails
     */
    protected static int idMiss;
    
     /**
     * Constructeur du MenuDetailMission.
     * @param idM
     *          id de la mission dont on affiche le detail
     * @see MenuDetailMission#initComponents() 
     * @see MenuDetailMission#jButtonAddEmp
     * @see MenuDetailMission#afficherInfo(int) 
     * @see MenuDetailMission#chargerCompetence(int) 
     * @see MenuDetailMission#idMiss 
     * @see MenuPrincipal#listM 
     * @see gestionnairedemission.Mission#getEmployeMission() 
     * @see MenuDetailMission#chargerEmploye(int) 
     * @see MenuDetailMission#chargerEmployeVide() 
     * @see MenuDetailMission#jRadioButtonEnCours
     * @see MenuDetailMission#jRadioButtonTerminee
     * @see MenuDetailMission#jButtonValiderChangement
     * @see gestionnairedemission.Mission#getTypeM() 
     * @see gestionnairedemission.Mission#getDateFin() 
     */
    public MenuDetailMission(int idM) {
        initComponents();
        jButtonAddEmp.setVisible(false);
        afficherInfo(idM);
        chargerCompetence(idM);
        idMiss = idM;
        if(listM.isEmpty()==false && listM.get(obtID(idM)).getEmployeMission()!=null)
        {
            if(listM.get(obtID(idM)).getEmployeMission().length!=0){
                chargerEmploye(idM);
            }else chargerEmployeVide();
        }
        jRadioButtonEnCours.setVisible(false);
        jRadioButtonTerminee.setVisible(false);
        jButtonValiderChangement.setVisible(false);
        if(listM.get(obtID(idM)).getTypeM().equals("Mission Planifiée") && listM.get(obtID(idM)).getDateFin()!= null && listM.get(obtID(idM)).getEmployeMission() != null && listM.get(obtID(idM)).getEmployeMission().length==listM.get(obtID(idM)).getNbEmployes()){
            ButtonGroup bg = new ButtonGroup();
            bg.add(jRadioButtonEnCours);
            bg.add(jRadioButtonTerminee);
            jRadioButtonEnCours.setVisible(true);
            jRadioButtonTerminee.setVisible(true);
            jButtonValiderChangement.setVisible(true);
        }
        
    }

    /**
     * Constructeur par défaut d'un MenuDetailMission
     */
    public MenuDetailMission() {
    }

    /**
     * Chargement de l'ensemble des éléments affichés à l'écran pour le MenuDetailMission.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBtnRetour = new javax.swing.JButton();
        jPanelCompetenceMission = new javax.swing.JPanel();
        jPanelListEmp = new javax.swing.JPanel();
        jButtonAddEmp = new javax.swing.JButton();
        jPanelInfo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescriptif = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jPanelSettings = new javax.swing.JPanel();
        jTextFieldIDM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelDateF = new javax.swing.JLabel();
        jTextFieldDateDebut = new javax.swing.JTextField();
        jTextFieldTypeMission = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDateFin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNbPers = new javax.swing.JTextField();
        jRadioButtonEnCours = new javax.swing.JRadioButton();
        jRadioButtonTerminee = new javax.swing.JRadioButton();
        jButtonValiderChangement = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JMenuBar();
        jMenuPrincipal = new javax.swing.JMenu();
        jMenuPrincpalItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1350, 700));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel1.setText("Detail de la Mission");

        jBtnRetour.setText("Retour");
        jBtnRetour.setMaximumSize(new java.awt.Dimension(120, 36));
        jBtnRetour.setMinimumSize(new java.awt.Dimension(120, 36));
        jBtnRetour.setPreferredSize(new java.awt.Dimension(120, 36));
        jBtnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRetourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCompetenceMissionLayout = new javax.swing.GroupLayout(jPanelCompetenceMission);
        jPanelCompetenceMission.setLayout(jPanelCompetenceMissionLayout);
        jPanelCompetenceMissionLayout.setHorizontalGroup(
            jPanelCompetenceMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelCompetenceMissionLayout.setVerticalGroup(
            jPanelCompetenceMissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelListEmpLayout = new javax.swing.GroupLayout(jPanelListEmp);
        jPanelListEmp.setLayout(jPanelListEmpLayout);
        jPanelListEmpLayout.setHorizontalGroup(
            jPanelListEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );
        jPanelListEmpLayout.setVerticalGroup(
            jPanelListEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButtonAddEmp.setText("Ajouter Employé");
        jButtonAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddEmpActionPerformed(evt);
            }
        });

        jTextAreaDescriptif.setColumns(20);
        jTextAreaDescriptif.setRows(5);
        jTextAreaDescriptif.setEnabled(false);
        jScrollPane2.setViewportView(jTextAreaDescriptif);

        jLabel8.setText("Descriptif :");

        jTextFieldIDM.setEnabled(false);

        jLabel2.setText("Id Mission :");

        jLabel4.setText("Date début :");

        jLabelDateF.setText("Date de Fin");

        jTextFieldDateDebut.setEnabled(false);

        jTextFieldTypeMission.setEnabled(false);

        jLabel7.setText("Type de la Mission:");

        jTextFieldDateFin.setEnabled(false);
        jTextFieldDateFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateFinActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre de Pers. :");

        jTextFieldNbPers.setEnabled(false);

        javax.swing.GroupLayout jPanelSettingsLayout = new javax.swing.GroupLayout(jPanelSettings);
        jPanelSettings.setLayout(jPanelSettingsLayout);
        jPanelSettingsLayout.setHorizontalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSettingsLayout.createSequentialGroup()
                        .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                                .addComponent(jLabelDateF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDateFin))
                            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNbPers, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)))
                        .addGap(0, 168, Short.MAX_VALUE))
                    .addGroup(jPanelSettingsLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIDM, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTypeMission)))
                .addContainerGap())
        );
        jPanelSettingsLayout.setVerticalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldIDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTypeMission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldDateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNbPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDateF)
                    .addComponent(jTextFieldDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(48, Short.MAX_VALUE))))
        );

        jRadioButtonEnCours.setText("Mission en Cours");

        jRadioButtonTerminee.setText("Mission Terminée");
        jRadioButtonTerminee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTermineeActionPerformed(evt);
            }
        });

        jButtonValiderChangement.setText("Valider changement");
        jButtonValiderChangement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderChangementActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCompetenceMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonEnCours)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonTerminee)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonValiderChangement))
                            .addComponent(jPanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelListEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelListEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnRetour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelCompetenceMission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonEnCours)
                            .addComponent(jRadioButtonTerminee)
                            .addComponent(jButtonValiderChangement))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Action du clic sur le bouton "Retour" fermant la fenêtre courrante.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Retour".
     */
    private void jMenuPrincpalItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPrincpalItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuPrincpalItem1ActionPerformed

    private void jBtnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRetourActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtnRetourActionPerformed

     /**
     * Action du clic sur le bouton "Ajouter employé" permettant d'ajouter un employé via le menu MenuMissionAjoutEmp.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Ajouter employé".
     * @see MenuMissionAjoutEmp
     */
    private void jButtonAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddEmpActionPerformed
        MenuMissionAjoutEmp mmae = new MenuMissionAjoutEmp();
        mmae.setLocationRelativeTo(this);
        mmae.setVisible(true);
    }//GEN-LAST:event_jButtonAddEmpActionPerformed

    private void jTextFieldDateFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateFinActionPerformed
    }//GEN-LAST:event_jTextFieldDateFinActionPerformed

    private void jRadioButtonTermineeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTermineeActionPerformed
    }//GEN-LAST:event_jRadioButtonTermineeActionPerformed

    /**
     * Action du clic sur le "Valider changement" permettant de changer le type de mission vers "en cours" ou "terminée".
     * @param evt
     *      Evènement représentant un clic sur le bouton "Valider changement"
     * @see MenuDetailMission#jRadioButtonEnCours
     * @see MenuPrincipal#listM
     * @see MenuDetailMission#idMiss
     * @see MenuMissionGeneral#table
     * @see MenuDetailMission#jRadioButtonTerminee
     */
    private void jButtonValiderChangementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderChangementActionPerformed
        if(jRadioButtonEnCours.isSelected()){
            listM.get(obtID(idMiss)).setTypeM("Mission En Cours");
            sauvegarderMissions();
            table.repaint();
            this.dispose();
        }else if(jRadioButtonTerminee.isSelected()){
            listM.get(obtID(idMiss)).setTypeM("Mission Terminée");
            sauvegarderMissions();
            table.repaint();
            this.dispose();
        }
    }//GEN-LAST:event_jButtonValiderChangementActionPerformed

    /**
     * Partie main du MenuDetailMission.
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
            java.util.logging.Logger.getLogger(MenuDetailMission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDetailMission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDetailMission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDetailMission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDetailMission(/*0*/).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnRetour;
    private javax.swing.JButton jButtonAddEmp;
    private javax.swing.JButton jButtonValiderChangement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDateF;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JMenuItem jMenuPrincpalItem1;
    private javax.swing.JPanel jPanelCompetenceMission;
    private javax.swing.JPanel jPanelInfo;
    protected static javax.swing.JPanel jPanelListEmp;
    private javax.swing.JPanel jPanelSettings;
    private javax.swing.JRadioButton jRadioButtonEnCours;
    private javax.swing.JRadioButton jRadioButtonTerminee;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDescriptif;
    private javax.swing.JTextField jTextFieldDateDebut;
    private javax.swing.JTextField jTextFieldDateFin;
    private javax.swing.JTextField jTextFieldIDM;
    private javax.swing.JTextField jTextFieldNbPers;
    private javax.swing.JTextField jTextFieldTypeMission;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables

    /**
     * Méthode affichant le numéro de la ligne.
     * @param idM 
     *      Identifiant de la mission.
     */
    private void getInfoMission(int idM) {
        showMessageDialog(null,idM);
    }
    
    /**
     * Méthode permettant d'afficher toutes les informations globales relatives à la mission.
     * @param idM 
     *      Identifiant de la mission.
     * @see gestionnairedemission.Mission
     * @see gestionnairedemission.Mission#getIdM() 
     * @see gestionnairedemission.Mission#getTypeM() 
     * @see gestionnairedemission.Mission#getDateDebut() 
     * @see gestionnairedemission.Mission#getDateFin() 
     * @see MenuDetailMission#jTextFieldDateFin
     * @see gestionnairedemission.Mission#getNbEmployes() 
     * @see gestionnairedemission.Mission#getDescM() 
     * @see MenuDetailMission#jTextFieldIDM
     * @see MenuDetailMission#jTextFieldTypeMission
     * @see MenuDetailMission#jTextFieldNbPers
     * @see MenuDetailMission#jTextFieldDateDebut
     * @see MenuDetailMission#jTextAreaDescriptif
     */
    private void afficherInfo(int idM)
    {
        Mission M=obtM(idM);
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String idm = Integer.toString(M.getIdM());
        String typeM = M.getTypeM();
        String dd = sdf.format(M.getDateDebut());
        if(M.getDateFin() != null){
            String df = sdf.format(M.getDateFin());
            jTextFieldDateFin.setText(df);
        }
        String nbp = String.valueOf(M.getNbEmployes());
        String desc = M.getDescM();
        jTextFieldIDM.setText(idm);
        jTextFieldTypeMission.setText(typeM);
        jTextFieldNbPers.setText(nbp);
        jTextFieldDateDebut.setText(dd);
        jTextAreaDescriptif.setText(desc);
    }
    
    /**
     * Cette méthode permet de retourner une mission en fonction de son identifiant.
     * @param idM
     *      Identifiant de la mission
     * @return Une mission ayant l'identifiant passé en paramètre.
     * @see MenuPrincipal#listM
     * @see gestionnairedemission.Mission#getIdM() 
     * @see gestionnairedemission.Mission
     */
    private Mission obtM(int idM){
        int id=0;
            for(int i=0;i<listM.size();i++)
            {
                if(listM.get(i).getIdM()==idM)
                {
                    id=i;
                }
            }
        Mission m = listM.get(id);
        return m;
    }
    
    /**
     * Méthode permettant de charger un tableau vide si aucun employés n'a été ajouté à la mission.
     * @see MenuDetailMission#tableE
     * @see MenuDetailMission#jPanelListEmp
     */
    public void chargerEmployeVide(){
        String[] titleE = {"Identifiant","Prénom","Nom"};
        String[][] tu = new String[0][0];
        DefaultTableModel dtm = new DefaultTableModel(tu,titleE);
        tableE=new JTable(dtm);
        jPanelListEmp.setLayout(new BorderLayout());
        JScrollPane tableContainer = new JScrollPane(tableE);
        jPanelListEmp.add(tableContainer, BorderLayout.CENTER);
        this.getContentPane().add(jPanelListEmp);
        this.pack();
        this.setVisible(true);
    }
    
    /**
     * Méthode permettant de charger et de gérer l'affichage de la table des compétences et des employés pour une mission.
     * @param idM 
     *      Identifiant de la mission.
     * @see MenuDetailMission#valueTab
     * @see MenuDetailMission#tabCompetence(int, int)
     * @see MenuDetailMission#idMission
     * @see MenuDetailMission#jTextFieldIDM
     * @see MenuDetailMission#compId
     * @see MenuPrincipal#listM
     * @see gestionnairedemission.Mission#getCompMission() 
     * @see gestionnairedemission.Mission#getEmployeMission() 
     * @see MenuDetailMission#jButtonAddEmp
     * @see MenuDetailMission#nbEmp
     * @see MenuDetailMission#jPanelCompetenceMission
     */
    public void chargerCompetence(int idM)
    {
        int taille = tailleTab(idM);
        String[][] tabComp = new String[taille][valueTab];
        tabComp=tabCompetence(taille,idM);
        String[] titleC = {"Identifiant","Catégorie","Libelle","Nombre Personnes"};
        DefaultTableModel dtm = new DefaultTableModel(tabComp,titleC);
        JTable table = new JTable(dtm);
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            if(!event.getValueIsAdjusting()) {
                ListSelectionModel  model = (ListSelectionModel)event.getSource();
                int num=model.getMinSelectionIndex();
                if(num != -1){
                    idMission = Integer.parseInt(jTextFieldIDM.getText());
                    compId = new String();
                    compId = (String)table.getModel().getValueAt(num,0);
                    int nbEmploye=0;
                            for(int j=0;j<listM.get(idMission).getCompMission().length;j++)
                            {
                                nbEmploye+=listM.get(idMission).getCompMission()[j].getNb();
                                    if(listM.get(idMission).getEmployeMission().length<nbEmploye)
                                    {
                                        jButtonAddEmp.setVisible(true);
                                    }
                            }
                    nbEmp = Integer.parseInt((String)table.getModel().getValueAt(num,3));
                    if(compId.equals(null)){
                        JOptionPane.showMessageDialog(null,"Veuillez sélectionner une ligne non vide");
                    }else {}
                }
            }
        }
        });
        jPanelCompetenceMission.setLayout(new BorderLayout());
        JScrollPane tableContainer = new JScrollPane(table);
        jPanelCompetenceMission.add(tableContainer, BorderLayout.CENTER);
        this.getContentPane().add(jPanelCompetenceMission);
        this.pack();
        this.setVisible(true);
    }
    
    /**
     * Cette méthode permet d'obtenir le nombre total de compétences affectés à une mission donnée.
     * @param idM
     *      L'identifiant de la mission.
     * @return La somme du nombre de compétences ayant été attribués à la mission.
     * @see MenuPrincipal#listM
     * @see gestionnairedemission.Mission#getIdM()
     * @see gestionnairedemission.Mission#getCompMission() 
     */
    private int tailleTab(int idM)
    {
        int taille=0;
        for(int i=0;i<listM.size();i++)
        {
            if(listM.get(i).getIdM()==idM)
            {
                taille=listM.get(i).getCompMission().length;
            }
        }
        return taille;
    }
    
    /**
     * Cette méthode permet de mettre l'ensemble des informations relatives aux compétences présentes dans la mission au sein d'un tableau bidimentionnel.
     * @param taille
     *      Nombre de lignes 'compétences) présentes dans la mission.
     * @param idM
     *      Identifiant de la mission.
     * @return Un tableau contenant l'ensemble des informations relatives aux compétences liées à la mission.
     * @see gestionnairedemission.CompetenceMission
     * @see MenuDetailMission#valueTab
     * @see MenuPrincipal#listM
     * @see gestionnairedemission.Mission#getIdM()
     * @see gestionnairedemission.Mission#getCompMission() 
     * @see gestionnairedemission.CompetenceMission#getNb() 
     * @see gestionnairedemission.Competence#getIDC() 
     * @see gestionnairedemission.Competence#getCat() 
     * @see gestionnairedemission.Competence#getLib() 
     */
    private String[][] tabCompetence(int taille, int idM)
    {
        CompetenceMission[] comp = new CompetenceMission[taille];
        String[][] tabComp = new String[taille][valueTab];
        int id=0;
        for(int i=0;i<listM.size();i++)
        {
            if(listM.get(i).getIdM()==idM)
            {
                id=i;
            }
        }
        comp=listM.get(id).getCompMission();
        for(int i=0;i<comp.length;i++)
        {
            String str = String.valueOf(comp[i].getNb());
            tabComp[i][0]=comp[i].getIDC();
            tabComp[i][1]=comp[i].getCat();
            tabComp[i][2]=comp[i].getLib();
            tabComp[i][3]=str;
        }
        return tabComp;
    }
    
    /**
     * Méthode permettant de charger et de gérer l'affichage de la table d'employés pour une mission.
     * @param idM 
     *      Identifiant de la mission
     * @see MenuPrincipal#listM
     * @see MenuDetailMission#obtM(int) 
     * @see gestionnairedemission.Mission#getEmployeMission() 
     * @see MenuDetailMission#valueTabE
     * @see MenuDetailMission#tabEmploye(int, int) 
     * @see MenuDetailMission#dtmE
     * @see MenuDetailMission#tableE
     * @see MenuDetailMission#jPanelListEmp
     */
    public void chargerEmploye(int idM){
        int tailleE = listM.get(obtID(idM)).getEmployeMission().length;
        String[][] tabEmp = new String[tailleE][valueTabE];
        tabEmp=tabEmploye(tailleE,idM);
        String[] titleE = {"Identifiant","Prénom","Nom"};
        dtmE=new DefaultTableModel(tabEmp,titleE);
        tableE=new JTable(dtmE);
        jPanelListEmp.setLayout(new BorderLayout());
        JScrollPane tableContainer = new JScrollPane(tableE);
        jPanelListEmp.add(tableContainer, BorderLayout.CENTER);
        this.getContentPane().add(jPanelListEmp);
        this.pack();
        this.setVisible(true);
    }
    
    /**
     * Cette méthode permet d'obtenir le nombre total d'employés affectés à une mission donnée.
     * @param idM
     *      Identifiant de la mission.
     * @return La somme du nombre d'employés ayant été attribués à chaque compétences au sein de la mission.
     * @see MenuPrincipal#listM
     * @see gestionnairedemission.Mission#getIdM()
     * @see gestionnairedemission.Mission#getCompMission() 
     * @see gestionnairedemission.CompetenceMission#getNb() 
     */
    private static int tailleTabE(int idM)
    {
        int tailleE=0;
        for(int i=0;i<listM.size();i++)
        {
            if(listM.get(i).getIdM()==idM)
            {
                if(listM.get(i).getCompMission()!=null && listM.get(i).getCompMission().length>0)
                {   
                    for(int j=0;j<listM.get(i).getCompMission().length;j++)
                    {
                        tailleE+=listM.get(i).getCompMission()[j].getNb();
                    }
                }
            }
        }
        return tailleE;
    }
    
    /**
     * Cette méthode permet de mettre l'ensemble des informations relatives aux employés présents dans la mission au sein d'un tableau bidimentionnel.
     * @param taille
     *      Nombre de lignes (employés) présents dans la mission.
     * @param idM
     *      Identifiant de la mission.
     * @return Un tableau bidimentionnel contenant l'ensemble des informations relatives aux employés présents dans la mission.
     * @see MenuDetailMission#valueTabE
     * @see MenuPrincipal#listM
     * @see gestionnairedemission.Mission#getIdM() 
     * @see gestionnairedemission.Mission#getEmployeMission() 
     * @see MenuPrincipal#listE
     * @see gestionnairedemission.Employe#getIdE() 
     * @see gestionnairedemission.Employe#getPrenom() 
     * @see gestionnairedemission.Employe#getNom() 
     */
    private static String[][] tabEmploye (int taille, int idM)
    {
        String[][] tabE = new String[taille][valueTabE];
        for(int i=0;i<listM.size();i++)
        {
            if(listM.get(i).getIdM()==idM)
            {
                for(int j=0;j<listM.get(i).getEmployeMission().length;j++)
                {
                    for(int k=0;k<listE.size();k++)
                    {
                        if(listM.get(i).getEmployeMission()[j].getIdE()==listE.get(k).getIdE())
                        {
                            tabE[j][0]=String.valueOf(listE.get(k).getIdE());
                            tabE[j][1]=listE.get(k).getPrenom();
                            tabE[j][2]=listE.get(k).getNom();
                        }
                    }
                }
            }
        }
        return tabE;
    }
    
    /**
     * Cette méthode permet de mettre à jour l'affichage du tableau d'employés intégrés à la mission.
     * @param idM
     *      Identifiant de la mission.
     * @return Le DefaultTableModel mettant à jour l'affichage du tableau d'employés.
     * @see MenuPrincipal#listM
     * @see MenuDetailMission#obtM(int) 
     * @see gestionnairedemission.Mission#getEmployeMission() 
     * @see MenuDetailMission#valueTabE
     * @see MenuDetailMission#tabEmploye(int, int) 
     */
    public static DefaultTableModel refreshModelE(int idM){
        int tailleEmp = listM.get(obtID(idM)).getEmployeMission().length;
        String[][] tabEAff = new String[tailleEmp][valueTabE];
        String[] titleER = {"Identifiant","Prénom","Nom"};
        tabEAff=tabEmploye(tailleEmp,idM);
        return new DefaultTableModel(tabEAff,titleER);
    }
    
    /**
     * Cette fonction permet de connaître la position de la mission dans la liste de mission en fonction de son identifiant.
     * @param idM
     *      L'identifiant de la mission.
     * @return La position de la mission dans la liste de mission en fonction de son identifiant.
     * @see MenuPrincipal#listM
     * @see gestionnairedemission.Mission#getIdM() 
     */
    public static int obtID(int idM)
    {
        int res=0;
        for(int i=0;i<listM.size();i++)
        {
            if(listM.get(i).getIdM()==idM)
            {
                res=i;
            }
        }
        return res;
    }
}
