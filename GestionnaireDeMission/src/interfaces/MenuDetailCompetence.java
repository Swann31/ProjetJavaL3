package interfaces;

import gestionnairedemission.Competence;
import gestionnairedemission.Employe;
import static interfaces.MenuPrincipal.listE;
import java.awt.BorderLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * <b> Classe Menu Detail Competence </b>
 * <p> Il s'agit du menu affichant la liste des compétences possédées par une personne selectionnée.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * version 1.0
 */
public class MenuDetailCompetence extends javax.swing.JFrame {

    /**
     * Constructeur surchargé du Menu Compétence.
     * @param idEmp
     *          l'id de l'employé selectionné
     * @see MenuDetailCompetence#initComponents() 
     * @see MenuDetailCompetence#afficherInfo
     * @see MenuDetailCompetence#chargerCompetence
     */
    public MenuDetailCompetence(int idEmp) {
        initComponents();
        afficherInfo(idEmp);
        chargerCompetence(idEmp);
    }

     /**
     * Constructeur surchargé du Menu Compétence.
     */
    private MenuDetailCompetence() {
    }

   /**
     * Chargement de l'ensemble des éléments affichés à l'écran pour le menu compétence.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldDateD = new javax.swing.JTextField();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldPrenom = new javax.swing.JTextField();
        jTextFieldIDE = new javax.swing.JTextField();
        jLabelTitle = new javax.swing.JLabel();
        jLabelIDE = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelDateD = new javax.swing.JLabel();
        jPanelCompetences = new javax.swing.JPanel();
        jLabelCompetences = new javax.swing.JLabel();
        jBtnRetour = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JMenuBar();
        jMenuPrincipal = new javax.swing.JMenu();
        jMenuPrincpalItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 499));
        setSize(new java.awt.Dimension(880, 499));

        jTextFieldDateD.setEnabled(false);

        jTextFieldNom.setEnabled(false);

        jTextFieldPrenom.setEnabled(false);

        jTextFieldIDE.setEnabled(false);
        jTextFieldIDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDEActionPerformed(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabelTitle.setText("Détail des compétences");

        jLabelIDE.setText("ID Employé");

        jLabelPrenom.setText("Prénom");

        jLabelNom.setText("Nom");

        jLabelDateD.setText("Date d'entrée");

        javax.swing.GroupLayout jPanelCompetencesLayout = new javax.swing.GroupLayout(jPanelCompetences);
        jPanelCompetences.setLayout(jPanelCompetencesLayout);
        jPanelCompetencesLayout.setHorizontalGroup(
            jPanelCompetencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
        );
        jPanelCompetencesLayout.setVerticalGroup(
            jPanelCompetencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        jLabelCompetences.setText("Compétences");

        jBtnRetour.setText("Retour");
        jBtnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRetourActionPerformed(evt);
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
                    .addComponent(jLabelTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabelIDE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelCompetences)))
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldIDE, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPrenom)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNom)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDateD)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDateD, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelCompetences, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBtnRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIDE)
                    .addComponent(jTextFieldIDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrenom)
                    .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNom)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDateD)
                    .addComponent(jTextFieldDateD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelCompetences)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCompetences, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBtnRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Action du clic sur le bouton "Retour" fermant la fenêtre MenuDetailCompetence.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Retour".
     */
    private void jBtnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRetourActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtnRetourActionPerformed

    /**
     * Action du clic sur le 'fermer' dans le menu en haut à gauche de l'application pour fermer l'application.
     * @param evt 
     *      Evènement représentant un clic sur le 'fermer' dans le menu en haut à gauche de l'application.
     */
    private void jMenuPrincpalItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPrincpalItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuPrincpalItem1ActionPerformed

    private void jTextFieldIDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDEActionPerformed
    }//GEN-LAST:event_jTextFieldIDEActionPerformed

   /**
     * Partie main du MenuDetailCompetence.
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
            java.util.logging.Logger.getLogger(MenuDetailCompetence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDetailCompetence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDetailCompetence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDetailCompetence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDetailCompetence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnRetour;
    private javax.swing.JLabel jLabelCompetences;
    private javax.swing.JLabel jLabelDateD;
    private javax.swing.JLabel jLabelIDE;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JMenuItem jMenuPrincpalItem1;
    private javax.swing.JPanel jPanelCompetences;
    private javax.swing.JTextField jTextFieldDateD;
    private javax.swing.JTextField jTextFieldIDE;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables

    /**
     * Méthode permettant de charger et de gérer l'affichage de la table des compétences pour un employé
     * @see MenuPrincipal#listE
     * @see MenuDetailCompetence#tailleTab
     * @see MenuDetailCompetence#tabCompetence
     * @see MenuDetailCompetence#jPanelCompetences
     */
    private void chargerCompetence(int idEmp) {
        int taille = tailleTab(idEmp);
        String[][] tabComp = new String[taille][3];
        tabComp=tabCompetence(taille,idEmp);
        String[] titleC = {"Identifiant","Catégorie","Libelle"};
        DefaultTableModel dtm = new DefaultTableModel(tabComp,titleC);
        JTable table = new JTable(dtm);
        jPanelCompetences.setLayout(new BorderLayout());
        JScrollPane tableContainer = new JScrollPane(table);
        jPanelCompetences.add(tableContainer, BorderLayout.CENTER);
        this.getContentPane().add(jPanelCompetences);
        this.pack();
        this.setVisible(true);
     }
    
    /**
     * Méthode permettant de retourner la taille du tableau des compétences en fonction du nombre de compétence que possède l'employé
     * @return taille
     *          taille du tableau de compétence
     * @see MenuPrincipal#listE
     * @see gestionnairedemission.Employe#getIdE() 
     * @see gestionnairedemission.Employe#getCompetence() 
     */
    private int tailleTab(int idEmp){
        int taille = 0;
        for(int i=0;i<listE.size();i++)
        {
            if(listE.get(i).getIdE()==idEmp)
            {
                if(listE.get(i).getCompetence()!=null)
                {
                    taille=listE.get(i).getCompetence().length;
                }
                else
                {
                    taille=0;
                }
            }
        }
        return taille;
    }
    
    /**
     * Méthode permettant de retourner le tableau de compétences en fonction de l'employé
     * @return tabComp
     *          tableau de compétence permettant l'affichage dans la table
     * @see MenuPrincipal#listE
     * @see gestionnairedemission.Employe#getIdE() 
     * @see gestionnairedemission.Employe#getCompetence() 
     * @see gestionnairedemission.Competence#getIDC() 
     * @see gestionnairedemission.Competence#getCat() 
     * @see gestionnairedemission.Competence#getLib() 
     */
    private String[][] tabCompetence (int taille, int idEmp){
        Competence[] comp = new Competence[taille];
        String[][] tabComp = new String[taille][3];
        for(int i=0;i<listE.size();i++)
        {
            if(listE.get(i).getIdE()==idEmp)
            {
                if(listE.get(i).getCompetence()!=null)
                {
                    comp =listE.get(i).getCompetence();
                    for(int j=0;j<taille;j++)
                    {
                        tabComp[j][0]=comp[j].getIDC();
                        tabComp[j][1]=comp[j].getCat();
                        tabComp[j][2]=comp[j].getLib();
                    }
                }
            }
        }
        return tabComp;
    }
    
    /**
     * Méthode permettant de retourner un objet Employe en fonction de son id
     * @return e
     *          objet Employe retourné
     * @see MenuPrincipal#listE
     * @see gestionnairedemission.Employe
     * @see gestionnairedemission.Employe#getIdE() 
     */
    private Employe obtEmp(int idEmp)
    {
        Employe e = new Employe();
        for(int i=0;i<listE.size();i++)
        {
            if(listE.get(i).getIdE()==idEmp)
            {
                e=listE.get(i);
            }
        }
        return e;   
    }
    
    /**
     * Méthode permettant d'afficher toutes les informations de l'employé selectionné (sauf les compétences)
     * @param idEmp
     *          l'id de l'employé selectionné
     * @see gestionnairedemission.Employe
     * @see MenuDetailCompetence#obtEmp(int) 
     * @see gestionnairedemission.Employe#getDate() 
     * @see gestionnairedemission.Employe#getIdE() 
     * @see gestionnairedemission.Employe#getPrenom() 
     * @see gestionnairedemission.Employe#getNom() 
     * @see MenuDetailCompetence#jTextFieldIDE
     * @see MenuDetailCompetence#jTextFieldPrenom
     * @see MenuDetailCompetence#jTextFieldNom
     * @see MenuDetailCompetence#jTextFieldDateD
     */
    private void afficherInfo(int idEmp)
    {
        Employe e = new Employe();
        e=obtEmp(idEmp);
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = e.getDate();
        String ide = Integer.toString(e.getIdE());
        String pnom = e.getPrenom();
        String nom = e.getNom();
        String dd = df.format(dt);    
        jTextFieldIDE.setText(ide);
        jTextFieldPrenom.setText(pnom);
        jTextFieldNom.setText(nom);
        jTextFieldDateD.setText(dd);
    }
}
