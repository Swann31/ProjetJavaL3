package interfaces;

import gestionnairedemission.Employe;
import static interfaces.MenuPersonnel.refreshTableModel;
import static interfaces.MenuPersonnel.table;
import static interfaces.MenuPersonnel.tablemodel;
import static interfaces.MenuPrincipal.listE;
import java.util.Date;
import java.util.Properties;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 * <b> Classe MenuAjoutEmploye </b>
 * <p> Classe représentant le menu d'ajout employé. Il permet d'ajouter un employé et ses informations dans la base de donnée</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public class MenuAjoutEmploye extends javax.swing.JFrame {
    
     /**
     * Déclaration du JDatePicker, qui fait partie de la librairie du même nom.
     */
    private static JDatePickerImpl datePicker;
    
    /**
     * Constructeur par défaut du menu d'ajout employe. 
     * @see MenuAjoutEmploye#initComponents() 
     * @see MenuAjoutEmploye#implementerDatePicker() 
     */
    public MenuAjoutEmploye() {
        initComponents();
        implementerDatePicker();
    }

    /**
     * Chargement de l'ensemble des éléments affichés à l'écran pour le menu ajout employé.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldPrenom = new javax.swing.JTextField();
        jButtonOk = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JMenuBar();
        jMenuPrincipal = new javax.swing.JMenu();
        jMenuPrincpalItem1 = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nom :");

        jLabel2.setText("Prenom :");

        jLabelDate.setText("Date d'entrée :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Saisissez les informations du nouvel employé :");

        jTextFieldNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomActionPerformed(evt);
            }
        });

        jTextFieldPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrenomActionPerformed(evt);
            }
        });

        jButtonOk.setText("Valider");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelDate))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonAnnuler)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonOk))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOk)
                    .addComponent(jButtonAnnuler)))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
     * Action liée au clic sur le bouton "Annuler" fermant le menu d'ajout d'employé.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Annuler".
     */
    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    /**
     * Action liée au clic sur le bouton "Valider" fermant le menu d'ajout d'employe et enregistrant les données rentrées.
     * @param evt 
     *      Evènement représentant un clic sur le bouton "Valider".
     * @see MenuPrincipal#listE
     * @see gestionnairedemission.Employe#getIdE() 
     * @see MenuAjoutEmploye#datePicker
     * @see MenuAjoutEmploye#jTextFieldNom
     * @see MenuAjoutEmploye#jTextFieldPrenom
     * @see MenuPersonnel#tablemodel
     * @see MenuPersonnel#table
     */
    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        // TODO add your handling code here:
        int id;
        if(listE==null)
        {
            id = 0;
        }
        else
        {
            id=listE.get(listE.size()-1).getIdE()+1;
        }
        Date d = (Date) datePicker.getModel().getValue();
        //DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Employe nouvelEmp = new Employe(id, jTextFieldNom.getText(), jTextFieldPrenom.getText(), d);
        System.out.println(nouvelEmp);
        listE.add(nouvelEmp);
        tablemodel = refreshTableModel();
        table.setModel(tablemodel);
        table.repaint();   
        this.dispose();
    }//GEN-LAST:event_jButtonOkActionPerformed

    private void jTextFieldNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomActionPerformed
    }//GEN-LAST:event_jTextFieldNomActionPerformed

    private void jTextFieldPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrenomActionPerformed
    }//GEN-LAST:event_jTextFieldPrenomActionPerformed

    /**
     * Partie main du MenuAjoutEmploye
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
            java.util.logging.Logger.getLogger(MenuAjoutEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAjoutEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAjoutEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAjoutEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAjoutEmploye().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JMenuItem jMenuPrincpalItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables

    /**
     * Méthode permettant d'afficher et de parametrer l'element jDatePicker
     * @see MenuAjoutEmploye#datePicker
     * @see MenuAjoutEmploye#jLabelDate
     */
private void implementerDatePicker() {
       
        UtilDateModel model = new UtilDateModel();
        model.setDate(20,04,2014);
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        datePicker.setBounds(jLabelDate.getX() + 110,jLabelDate.getY() - 5,120,30);
        this.add(datePicker);
    }
}
    
