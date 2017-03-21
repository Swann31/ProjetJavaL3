package interfaces;

import gestionnairedemission.Employe;
import static interfaces.MenuDetailMission.compId;
import static interfaces.MenuDetailMission.nbEmp;
import static interfaces.MenuDetailMission.idMission;
import static interfaces.MenuDetailMission.dtmE;
import static interfaces.MenuDetailMission.tableE;
import static interfaces.MenuDetailMission.refreshModelE;
import static interfaces.MenuMissionGeneral.sauvegarderMissions;
import static interfaces.MenuPrincipal.listE;
import static interfaces.MenuPrincipal.listM;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 * <b> Classe MenuMissionAjoutEmp </b>
 * <p> Il s'agit du menu permettant d'ajouter des employés à une mission en fonction de leurs compétences.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * version 1.0
 */
public class MenuMissionAjoutEmp extends javax.swing.JFrame {

    /**
     * Liste contenant l'ensemble des jComboBox utilisées pour ajouter des employés en fonction de leurs compétences.
     */
    private static ArrayList<Component> listComp;

    /**
     * Constructeur du MenuMissionAjoutEmp.
     * @see MenuMissionAjoutEmp#initComponents() 
     * @see MenuMissionAjoutEmp#listComp
     * @see MenuDetailMission#compId
     * @see MenuDetailMission#nbEmp
     * @see MenuMissionAjoutEmp#afficherInfo(java.lang.String) 
     * @see MenuMissionAjoutEmp#afficherEmploye(int, java.lang.String) 
     */
    public MenuMissionAjoutEmp() {
        initComponents();
        listComp = new ArrayList<Component>();
        afficherInfo(compId);
        afficherEmploye(nbEmp, compId);
    }


    /**
     * Chargement de l'ensemble des éléments affichés à l'écran pour le MenuMissionAjoutEmp.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIDC = new javax.swing.JLabel();
        jLabelCatC = new javax.swing.JLabel();
        jLabelLibC = new javax.swing.JLabel();
        jTextFieldIDC = new javax.swing.JTextField();
        jTextFieldCat = new javax.swing.JTextField();
        jTextFieldLibC = new javax.swing.JTextField();
        jPanelAddEmp = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonRetour = new javax.swing.JButton();
        jButtonValider = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNBE = new javax.swing.JTextField();
        menuPrincipal = new javax.swing.JMenuBar();
        jMenuPrincipal = new javax.swing.JMenu();
        jMenuPrincpalItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(464, 355));

        jLabelIDC.setText("ID Competence");

        jLabelCatC.setText("Catégorie");

        jLabelLibC.setText("Libellé");

        jTextFieldIDC.setEnabled(false);

        jTextFieldCat.setEnabled(false);
        jTextFieldCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCatActionPerformed(evt);
            }
        });

        jTextFieldLibC.setEnabled(false);

        jLabel2.setText("Employés:");

        javax.swing.GroupLayout jPanelAddEmpLayout = new javax.swing.GroupLayout(jPanelAddEmp);
        jPanelAddEmp.setLayout(jPanelAddEmpLayout);
        jPanelAddEmpLayout.setHorizontalGroup(
            jPanelAddEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddEmpLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelAddEmpLayout.setVerticalGroup(
            jPanelAddEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddEmpLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 156, Short.MAX_VALUE))
        );

        jButtonRetour.setText("Retour");
        jButtonRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetourActionPerformed(evt);
            }
        });

        jButtonValider.setText("Valider");
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre d'employés");

        jTextFieldNBE.setEnabled(false);

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonValider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRetour))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAddEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIDC)
                            .addComponent(jLabelCatC)
                            .addComponent(jLabelLibC)
                            .addComponent(jLabel1))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldIDC)
                            .addComponent(jTextFieldCat)
                            .addComponent(jTextFieldLibC)
                            .addComponent(jTextFieldNBE, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                        .addGap(0, 208, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIDC)
                    .addComponent(jTextFieldIDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCatC)
                    .addComponent(jTextFieldCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLibC)
                    .addComponent(jTextFieldLibC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNBE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelAddEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonValider)
                    .addComponent(jButtonRetour)))
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

    private void jTextFieldCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCatActionPerformed
    }//GEN-LAST:event_jTextFieldCatActionPerformed

    /**
     * Méthode permettant d'afficher les employés pouvant être ajoutés à une mission en fonction de leurs compétences et de sauvegarder les ajouts et de mettre à jour visuellement ces changements.
     * @param evt 
     * @see MenuDetailMission#nbEmp
     * @see MenuPrincipal#listE
     * @see gestionnairedemission.Employe#getPrenom() 
     * @see gestionnairedemission.Employe#getNom() 
     * @see gestionnairedemission.Employe#getIdE() 
     * @see MenuMissionAjoutEmp#listComp
     * @see MenuPrincipal#listM
     * @see MenuDetailMission#idMission
     * @see gestionnairedemission.Mission#getEmployeMission() 
     * @see gestionnairedemission.Mission#setEmployeMission(gestionnairedemission.Employe[]) 
     * @see gestionnairedemission.Employe
     * @see MenuMissionGeneral#sauvegarderMissions() 
     * @see MenuDetailMission#dtmE
     * @see MenuDetailMission#tableE
     */
    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        Employe[] tabE = new Employe[nbEmp];
        for(int i = 0; i< nbEmp; i++){
            for(int j = 0; j<listE.size(); j++){
                String str = listE.get(j).getIdE() +" " + listE.get(j).getNom() + " " + listE.get(j).getPrenom();
                JComboBox jcb = (JComboBox)listComp.get(i);
                if(str.equals(jcb.getSelectedItem().toString())){
                    tabE[i] = listE.get(j);
                }
            }
        }
        for(int i = 0; i< listM.size();i++){
            if(listM.get(i).getIdM() == idMission){
                if(listM.get(i).getEmployeMission().length == 0 || listM.get(i).getEmployeMission() == null ){
                    listM.get(i).setEmployeMission(tabE);
                }else{
                    int t = tabE.length + listM.get(i).getEmployeMission().length;
                    Employe[] tabEmp = new Employe[t];
                    for(int j = 0; j< t-tabE.length ; j++){
                        tabEmp[j] = listM.get(i).getEmployeMission()[j];
                    }
                    for(int j = t-tabE.length ; j< t ; j++){
                        tabEmp[j] = tabE[j-listM.get(i).getEmployeMission().length];
                    }
                    listM.get(i).setEmployeMission(tabEmp);
                }
            }
        }
        sauvegarderMissions();
        dtmE = refreshModelE(idMission);
        tableE.setModel(dtmE);
        tableE.updateUI();
        tableE.repaint();
        this.dispose();  
    }//GEN-LAST:event_jButtonValiderActionPerformed

    /**
     * Action du clic sur le bouton "Retour" fermant la fenêtre courante.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Retour".
     */
    private void jButtonRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetourActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonRetourActionPerformed

    /**
     * Partie main du MenuMissionAjoutEmp.
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
            java.util.logging.Logger.getLogger(MenuMissionAjoutEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMissionAjoutEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMissionAjoutEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMissionAjoutEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMissionAjoutEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRetour;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCatC;
    private javax.swing.JLabel jLabelIDC;
    private javax.swing.JLabel jLabelLibC;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JMenuItem jMenuPrincpalItem1;
    private javax.swing.JPanel jPanelAddEmp;
    private javax.swing.JTextField jTextFieldCat;
    private javax.swing.JTextField jTextFieldIDC;
    private javax.swing.JTextField jTextFieldLibC;
    private javax.swing.JTextField jTextFieldNBE;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables

    /**
     * Méthode permettant de receuillir les informations d'une mission à partir de son identifiant et d'afficher ces informations dans les zones correspondantes.
     * @param idC 
     *      Identifiant de la mission.
     * @see MenuPrincipal#listM
     * @see gestionnairedemission.Mission#getCompMission() 
     * @see gestionnairedemission.CompetenceMission#getIDC() 
     * @see gestionnairedemission.CompetenceMission#getLib() 
     * @see gestionnairedemission.CompetenceMission#getCat() 
     * @see MenuDetailMission#nbEmp
     * @see MenuMissionAjoutEmp#jTextFieldIDC
     * @see MenuMissionAjoutEmp#jTextFieldCat
     * @see MenuMissionAjoutEmp#jTextFieldLibC
     * @see MenuMissionAjoutEmp#jTextFieldNBE
     */
    private void afficherInfo(String idC)
    {
        String idc, libC, catC, nbE;
        for(int i=0;i<listM.size();i++)
        {
            for(int j=0;j<listM.get(i).getCompMission().length;j++)
            {
                if(listM.get(i).getCompMission()[j].getIDC().equals(idC))
                {
                    idc=idC;
                    libC=listM.get(i).getCompMission()[j].getLib();
                    catC=listM.get(i).getCompMission()[j].getCat();
                    nbE=String.valueOf(nbEmp);
                    jTextFieldIDC.setText(idc);
                    jTextFieldCat.setText(catC);
                    jTextFieldLibC.setText(libC);
                    jTextFieldNBE.setText(nbE);
                }
            }
        }
    }
    
    /**
     * Création de l'affichage relatif aux combobox pour le choix des différents employés à ajouter ayant la compétence.
     * @param nbEmp
     *      Nombre d'employés devant avoir la compétence.
     * @param idComp 
     *      Identifiant de la compétence.
     * @see MenuMissionAjoutEmp#chargerEmploye(java.lang.String) 
     * @see MenuMissionAjoutEmp#listComp
     * @see MenuMissionAjoutEmp#jLabel2
     * @see MenuMissionAjoutEmp#jPanelAddEmp
     */
    private void afficherEmploye(int nbEmp, String idComp){
        
            String[] tabEmp = chargerEmploye(idComp);
            for(int i = 0; i<nbEmp ; i++){
                JComboBox listEmp = new JComboBox(tabEmp);
                listComp.add(listEmp);
                listEmp.setBounds(jLabel2.getX(), jLabel2.getY()+15 + (i*30), 400,30);
                jPanelAddEmp.add(listEmp);
            }
           this.revalidate();
           this.repaint();
           
    }
    
    /**
     * Méthode permettant d'obtenir l'ensemble des employés possédant la compétence recherchée au sein de la mission.
     * @param idComp
     *      Identifiant de la compétence.
     * @return Un tableau contenant les informations de l'ensemble des employés possédant la compétence.
     * @see MenuPrincipal#listE
     * @see gestionnairedemission.Employe#getCompetence() 
     * @see gestionnairedemission.Competence#getIDC() 
     * @see gestionnairedemission.Employe#getIdE() 
     * @see gestionnairedemission.Employe#getNom() 
     * @see gestionnairedemission.Employe#getPrenom() 
     */
    private String[] chargerEmploye(String idComp){
        int taille = tailleEmployeCorrespondant(idComp);
        int id = 0;
        String[] tabEmp = new String[taille];
        for(int i = 0; i<listE.size(); i++){
            if(listE.get(i).getCompetence()!=null){
                for(int j = 0; j<listE.get(i).getCompetence().length;j++){
                    if(listE.get(i).getCompetence()[j].getIDC().equals(idComp)){
                        tabEmp[id] = listE.get(i).getIdE() + " " + listE.get(i).getNom() + " " + listE.get(i).getPrenom();
                        id++;
                    }
                }
            }
        }
        return tabEmp;
    }

    /**
     * Méthode permettant d'obtenir le nombre d'employés possédant la compétence recherchée au sein de la mission.
     * @param idComp
     *      Identifiant de la compétence.
     * @return Le nombre d'employés possédant la compétence.
     * @see MenuPrincipal#listE
     * @see gestionnairedemission.Employe#getCompetence() 
     * @see gestionnairedemission.Competence#getIDC() 
     */
    private int tailleEmployeCorrespondant(String idComp){
        int taille = 0;
        for(int i = 0; i<listE.size(); i++){
            if(listE.get(i).getCompetence()!=null){
                if(listE.get(i).getCompetence().length>0){
                    for(int j = 0; j<listE.get(i).getCompetence().length;j++){
                        if(listE.get(i).getCompetence()[j].getIDC().equals(idComp)){
                            taille++;
                        }
                    }
                }
            }
        }
        return taille;
    }
}
