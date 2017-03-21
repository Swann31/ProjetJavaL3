package interfaces;

import gestionnairedemission.CompetenceMission;
import gestionnairedemission.Employe;
import gestionnairedemission.Mission;
import gestionnairedemission.MissionEnPreparation;
import gestionnairedemission.MissionPlanifiee;
import static interfaces.MenuMissionGeneral.refreshTableModel;
import static interfaces.MenuPrincipal.listM;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import static interfaces.MenuMissionGeneral.model;
import static interfaces.MenuMissionGeneral.table;
import static interfaces.MenuPrincipal.listC;
import static interfaces.MenuPrincipal.listE;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 * <b> Classe MenuNouvelleMission </b>
 * <p> Il s'agit du menu permettant de créer une nouvelle mission.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * version 1.0
 */
public class MenuNouvelleMission extends javax.swing.JFrame {

    /**
     * Variable contenant le nombre de compétences.
     */
    private static int nbComp = 0;
    
    /**
     * Ensemble des component pour les compétences. Contient les Combobox de compétences.
     */
    private static ArrayList<Component> competences;
    
    /**
     * Calendrier lié à la date de début de mission.
     */
    private static JDatePickerImpl datePickerDebut;
    
    /**
     * Calendrier lié à la date de fin de mission.
     */
    private static JDatePickerImpl datePickerFin;
    
    /**
     * Date de fin de la mission.
     */
    private static Date df;
    
    /**
     * Constructeur d'un MenuNouvelleMission.
     * @see MenuNouvelleMission#initComponents()
     * @see MenuNouvelleMission#competences
     * @see MenuNouvelleMission#implementerDatePicker() 
     */
    public MenuNouvelleMission() {
        initComponents();
        competences = new ArrayList<Component>();
        implementerDatePicker();
    }

    /**
     * Chargement de l'ensemble des éléments affichés à l'écran pour le MenuNouvelleMission.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelSettings = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBoxDateFin = new javax.swing.JCheckBox();
        jBtnAnnuler = new javax.swing.JButton();
        jBtnEnregistrer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelCompRech = new javax.swing.JPanel();
        jLabelTitre = new javax.swing.JLabel();
        jButtonAddCompRech = new javax.swing.JButton();
        jButtonRemoveCompRech = new javax.swing.JButton();
        jLabelnbEmp = new javax.swing.JLabel();
        jPanelDescriptif = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescriptif = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        jMenuPrincipal = new javax.swing.JMenu();
        jMenuPrincpalItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 458));
        setPreferredSize(new java.awt.Dimension(800, 525));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel1.setText("Nouvelle Mission");

        jLabel4.setText("Date début :");

        jCheckBoxDateFin.setText("Date de fin");
        jCheckBoxDateFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDateFinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSettingsLayout = new javax.swing.GroupLayout(jPanelSettings);
        jPanelSettings.setLayout(jPanelSettingsLayout);
        jPanelSettingsLayout.setHorizontalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jCheckBoxDateFin))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jPanelSettingsLayout.setVerticalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxDateFin)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jBtnAnnuler.setText("Annuler");
        jBtnAnnuler.setMaximumSize(new java.awt.Dimension(120, 36));
        jBtnAnnuler.setMinimumSize(new java.awt.Dimension(120, 36));
        jBtnAnnuler.setPreferredSize(new java.awt.Dimension(120, 36));
        jBtnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAnnulerActionPerformed(evt);
            }
        });

        jBtnEnregistrer.setText("Enregistrer Mission");
        jBtnEnregistrer.setMaximumSize(new java.awt.Dimension(120, 36));
        jBtnEnregistrer.setMinimumSize(new java.awt.Dimension(120, 36));
        jBtnEnregistrer.setPreferredSize(new java.awt.Dimension(120, 36));
        jBtnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEnregistrerActionPerformed(evt);
            }
        });

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanelCompRech.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelTitre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTitre.setText("Compétences recherchées:");

        jButtonAddCompRech.setText("+");
        jButtonAddCompRech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCompRechActionPerformed(evt);
            }
        });

        jButtonRemoveCompRech.setText("-");
        jButtonRemoveCompRech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveCompRechActionPerformed(evt);
            }
        });

        jLabelnbEmp.setText("Nombre d'employés");

        javax.swing.GroupLayout jPanelCompRechLayout = new javax.swing.GroupLayout(jPanelCompRech);
        jPanelCompRech.setLayout(jPanelCompRechLayout);
        jPanelCompRechLayout.setHorizontalGroup(
            jPanelCompRechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCompRechLayout.createSequentialGroup()
                .addComponent(jLabelTitre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabelnbEmp)
                .addGap(30, 30, 30)
                .addComponent(jButtonAddCompRech)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRemoveCompRech)
                .addGap(21, 21, 21))
        );
        jPanelCompRechLayout.setVerticalGroup(
            jPanelCompRechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCompRechLayout.createSequentialGroup()
                .addGroup(jPanelCompRechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCompRechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAddCompRech)
                        .addComponent(jButtonRemoveCompRech))
                    .addGroup(jPanelCompRechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTitre)
                        .addComponent(jLabelnbEmp)))
                .addGap(0, 309, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanelCompRech);

        jTextAreaDescriptif.setColumns(20);
        jTextAreaDescriptif.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDescriptif);

        jLabel7.setText("Descriptif :");

        javax.swing.GroupLayout jPanelDescriptifLayout = new javax.swing.GroupLayout(jPanelDescriptif);
        jPanelDescriptif.setLayout(jPanelDescriptifLayout);
        jPanelDescriptifLayout.setHorizontalGroup(
            jPanelDescriptifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDescriptifLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDescriptifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addGroup(jPanelDescriptifLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelDescriptifLayout.setVerticalGroup(
            jPanelDescriptifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDescriptifLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelDescriptif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDescriptif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Action du clic sur le bouton "Annuler" fermant la fenêtre courante.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Annuler".
     */
    private void jMenuPrincpalItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPrincpalItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuPrincpalItem1ActionPerformed

    /**
     * Clic sur le bouton annuler fermant la fenêtre courrante et remettant les éléments static à nul.
     * @param evt 
     *      Clic sur le bouton "Annuler"
     * @see MenuNouvelleMission#nbComp
     * @see MenuNouvelleMission#competences
     */
    private void jBtnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAnnulerActionPerformed
        nbComp = 0;
        competences.removeAll(competences);
        this.dispose();
    }//GEN-LAST:event_jBtnAnnulerActionPerformed

    /**
     * Lors d'un clic sur le bouton "Enregistrer mission" enregistre la mission et ferme la fenêtre courrante tout en mettant à jour les interfaces de MenuMissionGénéral ou envoie un message d'erreur.
     * @param evt 
     *      Clic sur le bouton "Enregistrer mission"
     * @see MenuNouvelleMission#datePickerDebut
     * @see MenuNouvelleMission#jCheckBoxDateFin
     * @see MenuNouvelleMission#df
     * @see MenuNouvelleMission#datePickerFin
     * @see MenuPrincipal#listM
     * @see gestionnairedemission.Mission#getIdM() 
     * @see gestionnairedemission.CompetenceMission
     * @see MenuNouvelleMission#competences
     * @see MenuPrincipal#listC
     * @see gestionnairedemission.Competence#getIDC() 
     * @see gestionnairedemission.Competence#getCat()  
     * @see gestionnairedemission.Competence#getLib() 
     * @see MenuNouvelleMission#jTextAreaDescriptif
     * @see MenuNouvelleMission#nbComp
     * @see MenuMissionGeneral#model
     * @see MenuMissionGeneral#table
     */
    private void jBtnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEnregistrerActionPerformed
        Date d = (Date) datePickerDebut.getModel().getValue();
        if(jCheckBoxDateFin.isSelected()){
            df = (Date)datePickerFin.getModel().getValue();
            if(d.before(df)==true){
                int id;
                if(listM.isEmpty())
                {
                    id = 0;
                }
                else
                {
                    id=listM.get(listM.size()-1).getIdM()+1;
                }
                int nb =0;
                int value = 0;
                CompetenceMission[] tabCM = new CompetenceMission[competences.size()/2];
                for(int i = 0; i< competences.size(); i = i+2){
                    for(int j = 0; j<listC.size(); j++){
                        String str = listC.get(j).getIDC() +" " + listC.get(j).getCat() + " " + listC.get(j).getLib();
                        JSpinner jsp = (JSpinner)competences.get(i+1);
                        value = (int)jsp.getValue();

                        JComboBox jcb = (JComboBox)competences.get(i);
                        if(str.equals(jcb.getSelectedItem().toString())){
                            CompetenceMission cm = new CompetenceMission(listC.get(j),value);
                            tabCM[i/2]=cm;
                        }
                    }
                }
                nb+=value;
                if(df != null){
                Employe[] emp = {};
                Mission newMiss = new MissionPlanifiee(id,jTextAreaDescriptif.getText(),d,nb,tabCM,emp,df);
                listM.add(newMiss);
            }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Veuillez mettre une date de fin de mission postérieure à la date de début de mission.","Erreur de choix de dates",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        else
        {
            int id;
            if(listM.isEmpty())
            {
                id = 0;
            }
            else
            {
                id=listM.get(listM.size()-1).getIdM()+1;
            }
            int nb =0;
            int value = 0;
            CompetenceMission[] tabCM = new CompetenceMission[competences.size()/2];
            for(int i = 0; i< competences.size(); i = i+2){
                for(int j = 0; j<listC.size(); j++){
                    String str = listC.get(j).getIDC() +" " + listC.get(j).getCat() + " " + listC.get(j).getLib();
                    JSpinner jsp = (JSpinner)competences.get(i+1);
                    value = (int)jsp.getValue();
                    JComboBox jcb = (JComboBox)competences.get(i);
                    if(str.equals(jcb.getSelectedItem().toString())){
                        CompetenceMission cm = new CompetenceMission(listC.get(j),value);
                        tabCM[i/2]=cm;
                    }
                }
                nb+=value;
            }
            Mission newMiss = new MissionEnPreparation(id,jTextAreaDescriptif.getText(),d,nb,tabCM);
            listM.add(newMiss);
        }
        nbComp = 0;
        MenuMissionGeneral.sauvegarderMissions();
        model = refreshTableModel();
        table.setModel(model);
        table.repaint();  
        this.dispose(); 
    }//GEN-LAST:event_jBtnEnregistrerActionPerformed

    /**
     * Lors d'un clic sur le bouton "-", retire la derniere comboboc contenant l'ensemble des compétences existantes.
     * @param evt 
     *      Clic sur le bouton "-"?
     * @see MenuNouvelleMission#nbComp
     * @see MenuNouvelleMission#competences
     * @see MenuNouvelleMission#jPanelCompRech
     */
    private void jButtonRemoveCompRechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveCompRechActionPerformed
        if(nbComp >0){
            Component test = competences.get(competences.size() - 2);
            Component test1 = competences.get(competences.size() - 1);
            jPanelCompRech.remove(test);
            competences.remove(test);
            jPanelCompRech.remove(test1);
            competences.remove(test1);
            this.revalidate();
            this.repaint();
            nbComp -=2;
        }
    }//GEN-LAST:event_jButtonRemoveCompRechActionPerformed

    /**
     * Lors d'un clic sur le bouton "+", ajoute un nouveau combobox contenant l'ensemble des compétences existantes.
     * @param evt 
     *      Clic sur le bouton "+".
     * @see MenuNouvelleMission#nbComp
     * @see MenuPrincipal#listE
     * @see MenuNouvelleMission#tabCompetence() 
     * @see MenuNouvelleMission#jLabelTitre
     * @see MenuNouvelleMission#jPanelCompRech
     * @see MenuNouvelleMission#competences
     */
    private void jButtonAddCompRechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCompRechActionPerformed
         if(nbComp ==0){
            JSpinner spi = new JSpinner(new SpinnerNumberModel(0,0,listE.size(),1));
            JComboBox listComp = new JComboBox(tabCompetence());
            listComp.setBounds(jLabelTitre.getX(), jLabelTitre.getY()+15, 200,30);
            jPanelCompRech.add(listComp);
            spi.setBounds(jLabelTitre.getX() + 200,jLabelTitre.getY() +15, 50,30 );
            jPanelCompRech.add(spi);
            competences.add(listComp);
            competences.add(spi);
            this.revalidate();
            this.repaint();
            nbComp += 2;
        }else {
            JSpinner spi = new JSpinner(new SpinnerNumberModel(0,0,listE.size(),1));
            JComboBox listComp = new JComboBox(tabCompetence());
            listComp.setBounds(jLabelTitre.getX(), jLabelTitre.getY() + 15 + (17*nbComp), 200,30);
            jPanelCompRech.add(listComp);
            spi.setBounds(jLabelTitre.getX() + 200,jLabelTitre.getY()+15+ (17*nbComp), 50,30 );
            jPanelCompRech.add(spi);
            competences.add(listComp);
            competences.add(spi);
            this.revalidate();
            this.repaint();
            nbComp += 2;
        }
    }//GEN-LAST:event_jButtonAddCompRechActionPerformed

    /**
     * Cette méthode permet l'affichage du datepicker si l'utilisateur clic sur la checkbox de renseignement d'une date de fin de mission.
     * @param evt 
     *      Clic sur la checkboc relative à la sélection d'une date de fin.
     * @see MenuNouvelleMission#jCheckBoxDateFin
     * @see MenuNouvelleMission#datePickerFin
     * @see MenuNouvelleMission#jPanelSettings
     * @see MenuNouvelleMission#df
     */
    private void jCheckBoxDateFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDateFinActionPerformed
        if(jCheckBoxDateFin.isSelected()){
            UtilDateModel model = new UtilDateModel();
            model.setDate(20,04,2014);
            Properties p = new Properties();
            p.put("text.today", "Today");
            p.put("text.month", "Month");
            p.put("text.year", "Year");
            JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
            datePickerFin = new JDatePickerImpl(datePanel, new DateLabelFormatter());
            datePickerFin.setBounds(jCheckBoxDateFin.getX(),jCheckBoxDateFin.getY() + 25,120,30);
            jPanelSettings.add(datePickerFin);
            this.revalidate();
            this.repaint();
        }else{
            df = null;
            jPanelSettings.remove(datePickerFin);
            this.revalidate();
            this.repaint();
        }
    }//GEN-LAST:event_jCheckBoxDateFinActionPerformed

    /**
     * Partie main du MenuNouvelleMission.
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
            java.util.logging.Logger.getLogger(MenuNouvelleMission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuNouvelleMission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuNouvelleMission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuNouvelleMission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuNouvelleMission().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAnnuler;
    private javax.swing.JButton jBtnEnregistrer;
    private javax.swing.JButton jButtonAddCompRech;
    private javax.swing.JButton jButtonRemoveCompRech;
    private javax.swing.JCheckBox jCheckBoxDateFin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JLabel jLabelnbEmp;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JMenuItem jMenuPrincpalItem1;
    private javax.swing.JPanel jPanelCompRech;
    private javax.swing.JPanel jPanelDescriptif;
    private javax.swing.JPanel jPanelSettings;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDescriptif;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables

    /**
     * Méthode permettant d'intégrer le datepicker au sein d'un panel.
     * @see MenuNouvelleMission#datePickerDebut
     * @see MenuNouvelleMission#jLabel4
     * @see MenuNouvelleMission#jPanelSettings
     */
    private void implementerDatePicker() {
        UtilDateModel model = new UtilDateModel();
        model.setDate(20,04,2014);
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        datePickerDebut = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        datePickerDebut.setBounds(jLabel4.getX() + 110,jLabel4.getY() - 5,120,30);
        jPanelSettings.add(datePickerDebut);
    }
    
    /**
     * Cette méthode permet d'insérer au sein d'un tableau l'ensemble des informations relatives aux compétences.
     * @return Un tableau contenant l'ensemble des informations pour chaque compétences.
     * @see MenuPrincipal#listC
     * @see gestionnairedemission.Competence#getIDC()
     * @see gestionnairedemission.Competence#getCat() 
     * @see gestionnairedemission.Competence#getLib() 
     */
    private String[] tabCompetence(){
        int taille = listC.size();
        String[] tabComp = new String[taille];
        for(int i=0;i<listC.size();i++)
        {
            tabComp[i] =listC.get(i).getIDC() +" " + listC.get(i).getCat() + " " + listC.get(i).getLib() ;
        }
        return tabComp;
    }
}



