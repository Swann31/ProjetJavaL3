package interfaces;

import gestionnairedemission.Competence;
import gestionnairedemission.Employe;
import gestionnairedemission.Mission;
import java.util.ArrayList;

/**
 * <b> Classe MenuPrincipal </b>
 * <p> Classe représentant le menu principal et central de l'application. Il permet d'accéder à l'ensemble des sous-catégories de menus.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Liste d'employés étant utilisé partout dans l'application. Représente l'ensemble des employés liés à l'entreprise.
     * @see gestionnairedemission.Employe
     */
    public static ArrayList<Employe> listE;
    
    /**
     * Liste de compétences ayant été définies au sein de l'entreprise.
     * @see gestionnairedemission.Competence
     */
    public static ArrayList<Competence> listC;
    
    /**
     * Liste des missions créées au sein de l'entreprise.
     * @see gestionnairedemission.Mission
     */
    public static ArrayList<Mission> listM;

    /**
     * Constructeur par défaut du menu principal. 
     * @see MenuPrincipal#initComponents() 
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * Chargement de l'ensemble des éléments affichés à l'écran pour le menu principal.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelBtnGestions = new javax.swing.JPanel();
        jBtnGestionEmp = new javax.swing.JButton();
        jBtnGestionComp = new javax.swing.JButton();
        jBtnGestionMiss = new javax.swing.JButton();
        jBtnQuitter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        jMenuPrincipal = new javax.swing.JMenu();
        jMenuPrincpalItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 29)); // NOI18N
        jLabel1.setText("Gestion des compétences du personnel");

        jBtnGestionEmp.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jBtnGestionEmp.setText("Gestion du Personnel");
        jBtnGestionEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGestionEmpActionPerformed(evt);
            }
        });

        jBtnGestionComp.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jBtnGestionComp.setText("Gestion des Compétences");
        jBtnGestionComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGestionCompActionPerformed(evt);
            }
        });

        jBtnGestionMiss.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jBtnGestionMiss.setText("Gestion des Missions");
        jBtnGestionMiss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGestionMissActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnGestionsLayout = new javax.swing.GroupLayout(jPanelBtnGestions);
        jPanelBtnGestions.setLayout(jPanelBtnGestionsLayout);
        jPanelBtnGestionsLayout.setHorizontalGroup(
            jPanelBtnGestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBtnGestionsLayout.createSequentialGroup()
                .addComponent(jBtnGestionEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnGestionComp, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnGestionMiss, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelBtnGestionsLayout.setVerticalGroup(
            jPanelBtnGestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBtnGestionMiss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBtnGestionComp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBtnGestionEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );

        jBtnQuitter.setText("Quitter");
        jBtnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnQuitterActionPerformed(evt);
            }
        });

        jLabel2.setText("Veuillez charger les fichiers dans l'ordre suivant :");

        jLabel3.setText("1 : liste_compétences.csv");

        jLabel4.setText("2 : liste_personnel.csv");

        jLabel5.setText("3 : compétences_personnel.csv (Bouton importer compétence)");

        jLabel6.setText("4 : new_liste_mission.csv");

        jMenuPrincipal.setText("Application");

        jMenuPrincpalItem1.setText("Fermer");
        jMenuPrincpalItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPrincpalItem1ActionPerformed(evt);
            }
        });
        jMenuPrincipal.add(jMenuPrincpalItem1);

        menuPrincipal.add(jMenuPrincipal);
        jMenuPrincipal.getAccessibleContext().setAccessibleParent(jMenuPrincipal);

        setJMenuBar(menuPrincipal);
        menuPrincipal.getAccessibleContext().setAccessibleName("menuPrincipal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBtnGestions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBtnGestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
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
        this.dispose();
    }//GEN-LAST:event_jMenuPrincpalItem1ActionPerformed

    /**
     * Action liée au clic sur le bouton "Gestion du personnel" ouvrant le MenuPersonnel.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Gestion du personnel".
     * @see MenuPersonnel
     */
    private void jBtnGestionEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGestionEmpActionPerformed
        MenuPersonnel mp = new MenuPersonnel();
        mp.setLocationRelativeTo(this);
        mp.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jBtnGestionEmpActionPerformed

    /**
     * Action liée au clic sur le bouton "Gestion des Compétences" ouvrant le MenuCompetence.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Gestion des Compétences".
     * @see MenuCompetence
     */
    private void jBtnGestionCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGestionCompActionPerformed
        MenuCompetence mc = new MenuCompetence();
        mc.setLocationRelativeTo(this);
        mc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnGestionCompActionPerformed

    /**
     * Action liée au clic sur le bouton "Gestion des Missions" ouvrant le MenuMissionGeneral.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Gestion des Missions".
     * @see MenuMissionGeneral
     */
    private void jBtnGestionMissActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGestionMissActionPerformed
        MenuMissionGeneral mmg = new MenuMissionGeneral();
        mmg.setLocationRelativeTo(this);
        mmg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnGestionMissActionPerformed

    /**
     * Action liée au clic sur le bouton "Quitter" fermant le MenuPrincipal.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Quitter".
     */
    private void jBtnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnQuitterActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtnQuitterActionPerformed

    /**
     * Partie main du MenuPrincipal.
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGestionComp;
    private javax.swing.JButton jBtnGestionEmp;
    private javax.swing.JButton jBtnGestionMiss;
    private javax.swing.JButton jBtnQuitter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JMenuItem jMenuPrincpalItem1;
    private javax.swing.JPanel jPanelBtnGestions;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables
}
