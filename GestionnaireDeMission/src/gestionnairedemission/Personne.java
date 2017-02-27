package gestionnairedemission;

/**
 * <b> Classe abstraite Personne </b>
 * <p> Classe abstraite permettant de définir une personne et créée en vue d'une évolutivité de l'application. Elle représente les principaux attributs et méthodes d'une personne.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public abstract class Personne {
    
    /**
     * Nom de la personne.
     * @see Personne#getNom() 
     * @see Personne#setNom(java.lang.String) 
     */
    protected String nom;
    
    /**
     * Prénom de la personne.
     * @see Personne#getPrenom()
     * @see Personne#setPrenom(java.lang.String) 
     */
    protected String prenom;
    
    /**
     * Déclaration du setteur pour le nom de la Personne.
     * @param n 
     *      Nom de la personne qui sera renseigné.
     * @see Personne#nom
     */
    protected void setNom(String n)
    {
        this.nom=n;
    }
    
    /**
     * Déclaration du setteur pour le prénom de la Personne.
     * @param s
     *      Prénom de la personne qui sera renseigné.
     * @see Personne#prenom
     */
    protected void setPrenom(String s)
    {
        this.prenom=s;
    }
    
    /**
     * Déclaration du getteur pour le nom de la personne.
     * @return Le nom de la personne concernée.
     * @see Personne#nom
     */
    public String getNom()
    {
        return this.nom;
    }
    
    /**
     * Déclaration du getteur pour le prénom de la personne.
     * @return Le prénom de la personne concernée.
     * @see Personne#prenom
     */
    public String getPrenom()
    {
        return this.prenom;
    }      
}
