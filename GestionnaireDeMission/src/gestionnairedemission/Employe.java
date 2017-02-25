/*
Classe définissant un employe au sein du projet
 */
package gestionnairedemission;

import java.util.Date;

/**
 * 
 * @author Swann LAZAR
 * @version 1.0
 */
public class Employe extends Personne {
    
    /**
     * ID d'un employé.
     * @see Employe#getIdE() 
     * @see Employe#setIdE(int) 
     */
    private int idE;
    
    /**
     * Liste des compétences de l'employé.
     * @see Competence
     * @see Employe#getCompetence() 
     * @see Employe#setCompetence(Competence) 
     * @see Employe#setCompetence(Competence[]) 
     */
    private Competence comp[];
    
    /**
     * Date d'entrée de l'employé dans l'entreprise.
     * @see Employe#getCompetence() 
     * @see Employe#setDateEntree(java.util.Date) 
     */
    private Date dateEntree;
    
    /**
     * Constructeur par défaut de la classe Employe.
     */
    public Employe(){    
    }
    
    /**
     * Constructeur de la classe employé.
     * @param id
     *      L'Identifiant de l'employé.
     * @param n
     *      Le nom de l'employé.
     * @param p
     *      Le prénom de l'employé.
     * @param dateE
     *      La date d'entrée de l'employé dans l'entreprise.
     * @param C
     *      L'ensemble des compétences possédées par l'employé.
     * @see Employe#idE
     * @see Employe#nom
     * @see Employe#prenom
     * @see Employe#dateEntree
     * @see Employe#comp
     * @see Competence
     */
    public Employe(int id, String n, String p, Date dateE, Competence [] C)
    {
        this.idE=id;
        this.nom=n;
        this.prenom=p;
        this.dateEntree=dateE;
        this.comp[]=C[];
    }
    
        /**
     * Constructeur de la classe employé.
     * @param id
     *      L'Identifiant de l'employé.
     * @param n
     *      Le nom de l'employé.
     * @param p
     *      Le prénom de l'employé.
     * @param dateE
     *      La date d'entrée de l'employé dans l'entreprise.
     * @see Employe#idE
     * @see Employe#nom
     * @see Employe#prenom
     * @see Employe#dateEntree
     */
    public Employe(int id, String n, String p, Date dateE)
    {
        this.idE=id;
        this.nom=n;
        this.prenom=p;
        this.dateEntree=dateE;
    }
    
        /**
     * Constructeur de la classe employé.
     * @param id
     *      L'Identifiant de l'employé.
     * @param n
     *      Le nom de l'employé.
     * @param p
     *      Le prénom de l'employé.
     * @see Employe#idE
     * @see Employe#nom
     * @see Employe#prenom
     * @see Employe#dateEntree
     */
    public Employe(int id, String n, String p)
    {
        this.idE=id;
        this.nom=n;
        this.prenom=p;
        this.dateEntree = new Date();
    }

    /**
     * Setteur pour l'identifiant d'employé.
     * @param id 
     *      L'identifiant de l'employé.
     * @see Employe#idE
     */
    protected void setIdE(int id)
    {
        this.idE=id;
    }
    
    /**
     * Setteur pour la date d'entrée dans l'entreprise de l'employé.
     * @param date 
     *      La date d'entrée dans l'entreprise.
     * @see Employe#dateEntree
     */
    protected void setDateEntree(Date date)
    {
        this.dateEntree=date;
    }

    /**
     * Setteur pour la liste des compétences de l'employé.
     * @param C 
     *      L'ensemble des compétences possédées par l'employé.
     * @see Employe#comp
     * @see Competence
     */
    protected void setCompetence(Competence [] C)
    {
        
    }
    
    /**
     * Getteur pour l'identifiant de l'employé.
     * @return L'identifiant de l'employé.
     * @see Employe#idE
     */
    public int getIdE()
    {
        return this.idE;
    }
    
    /**
     * Getteur pour la date d'entrée dans l'entreprise de l'employé.
     * @return La date d'entrée dans l'entreprise.
     * @see Employe#dateEntree
     */
    public Date getDate()
    {
        return this.dateEntree;
    }
    
    /**
     * Getteur pour l'ensemble des compétences possédées par l'employé.
     * @return Une liste de compétences inhérentes à l'employé.
     * @see Employe#comp
     * @see Competence
     */
    public Competence[] getCompetence()
    {
        return this.comp[];
    }
    //Import des employés à partir d'un fichier CSV
    
}
