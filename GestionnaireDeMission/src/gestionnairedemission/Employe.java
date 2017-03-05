package gestionnairedemission;

import java.util.Date;

/**
 * <b> Classe Employé </b>
 * <p> Cette classe définit un employé de l'entreprise.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public class Employe extends Personne implements IEmploye {
    
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
     * @see Employe#getDate() 
     * @see Employe#setDateEntree(java.util.Date) 
     */
    private Date dateEntree;
    
    /**
     * Flag afin de savoir si l'employé est supprimé ou pas.
     * @see Employe#getSuppr() 
     * @see Employe#setSuppr(boolean) 
     */
    private boolean suppr;
    
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
        this.comp=C;
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
        this.comp=C;
    }
    
    /**
     * Getteur pour l'identifiant de l'employé.
     * @return L'identifiant de l'employé.
     * @see Employe#idE
     */
    @Override
    public int getIdE()
    {
        return this.idE;
    }
    
    /**
     * Getteur pour la date d'entrée dans l'entreprise de l'employé.
     * @return La date d'entrée dans l'entreprise.
     * @see Employe#dateEntree
     */
    @Override
    public Date getDate()
    {
        return this.dateEntree;
    }
    
    /**
     * Getteur pour le flag suppression de l'employé.
     * @return si l'employé est supprimé ou pas.
     * @see Employe#suppr
     */
    public boolean getSuppr()
    {
        return this.suppr;
    }
    
     /**
     * Setteur pour le flafg de l'employé.
     * @param bool 
     *      Si l'employé est présent dans la liste ou non.
     * @see Employe#suppr
     */
    public void setSuppr(boolean bool)
    {
        this.suppr=bool;
    }
    
    
    /**
     * Getteur pour l'ensemble des compétences possédées par l'employé.
     * @return Une liste de compétences inhérentes à l'employé.
     * @see Employe#comp
     * @see Competence
     */
    @Override
    public Competence [] getCompetence()
    {
        return this.comp;
    }
}
