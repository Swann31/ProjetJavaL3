/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionnairedemission;

import java.util.Date; //Import nécessaire pour la gestion de la classe Date

public class Employe extends Personne {
    private int idE; //ID de l'employé
    private Competence comp[]; //Liste des compétences de l'employé
    private Date dateEntree; //Date d'entrée de l'employé dans l'entreprise
    
    //Constructeurs
    public Employe(int id, Date dateE, Competence [] C)
    {
        this.idE=id;
        this.dateEntree=dateE;
        this.comp[]=C[];
    }
    public Employe(int id, Date dateE)
    {
        this.idE=id;
        this.dateEntree=dateE;
    }
    public Employe(int id)
    {
        this.idE=id;
        this.dateEntree = new Date();
    }
    //Déclaration des setters
    protected void setIdE(int id)
    {
        this.idE=id;
    }
    protected void setDateEntree(Date date)
    {
        this.dateEntree=date;
    }
    protected void setCompetence(Competence C)
    {
        
    }
    protected void setCompetence(Competence [] C)
    {
        
    }
    
    //Déclaration des getters
    public int getIdE()
    {
        return this.idE;
    }
    public Date getDate()
    {
        return this.dateEntree;
    }
    public Competence getCompetence()
    {
        
    }
    //Import des employés à partir d'un fichier CSV
    
}
