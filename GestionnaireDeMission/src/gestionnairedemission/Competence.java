package gestionnairedemission;

/**
 * <b> Classe Compétence </b>
 * <p> Cette classe définit une compétence.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public class Competence implements ICompetence{
    
    /**
     * Identifiant de la compétence.
     * @see Competence#getIDC() 
     * @see Competence#setIDC(java.lang.String) 
     */
    private String idC;
    
    /**
     * Catégorie de la compétence.
     * @see Competence#getCat() 
     * @see Competence#setCat(java.lang.String) 
     */
    private String categorieComp;

    /**
     * Libellé de la compétence.
     * @see Competence#getLib() 
     * @see Competence#setLib(java.lang.String) 
     */
    private String libelleComp;

    /**
     * Flag indiquant la "suppression"/visibilité d'une compétence.
     * @see Competence#getSuppr() 
     * @see Competence#setSuppr(boolean) 
     */
    private boolean suppr;
    
    /**
     * Constructeur par défaut d'une compétence.
     */
    public Competence() {
    }
    
    /**
     * Constructeur d'une compétence.
     * @param id
     *      Identifiant de la compétence.
     * @param catC
     *      Catégorie de la compétence.
     * @param libC 
     *      Libellé de la compétence.
     * @see Competence#idC
     * @see Competence#categorieComp
     * @see Competence#libelleComp
     */
    public Competence (String id, String catC, String libC) {
        this.idC=id;
        this.categorieComp=catC;
        this.libelleComp=libC;
    }
    
    /**
     * Constructeur d'une compétence.
     * @param id
     *      Identifiant de la compétence.
     * @param catC
     *      Catégorie de la compétence.
     * @param libC 
     *      Libellé de la compétence.
     * @param bool 
     *      Etat de la "suppression" de la compétence.
     * @see Competence#idC
     * @see Competence#categorieComp
     * @see Competence#libelleComp
     * @see Competence#suppr
     */
    public Competence (String id, String catC, String libC, boolean bool) {
        this.idC=id;
        this.categorieComp=catC;
        this.libelleComp=libC;
        this.suppr=bool;
    }
    
    /**
     * Getteur pour l'identifiant de la compétence.
     * @return L'identifiant de la compétence.
     * @see Competence#idC
     */
    @Override
    public String getIDC()
    {
        return this.idC;
    }
    
    /**
     * Getter pour la catégorie de la compétence.
     * @return La catégorie de la compétence.
     * @see Competence#categorieComp
     */
    @Override
    public String getCat() 
    {
        return this.categorieComp;
    }
    
    /**
     * Getter pour le libellé de la compétence.
     * @return Le libellé de la compétence.
     * @see Competence#libelleComp
     */
    @Override
    public String getLib()
    {
        return this.libelleComp;
    }
    
    /**
     * Getter pour l'état de "suppression" de la compétence.
     * @return Le booléen déterminant l'état de "suppression" de la compétence.
     * @see Competence#suppr
     */
    public boolean getSuppr(){
        return this.suppr;
    }
    
    /**
     * Setter pour l'identifiant de la compétence.
     * @param id 
     *      L'identifiant de la compétence.
     * @see Competence#idC
     */
    public void setIDC (String id)
    {
        this.idC=id;
    }
    
    /**
     * Setter pour la catégorie de la compétence.
     * @param cat
     *      Catégorie de la compétence.
     * @see Competence#categorieComp
     */
    public void setCat (String cat)
    {
        this.categorieComp=cat;
    }
    
    /**
     * Setteur pour le libellé de la compétence.
     * @param lib 
     *      Libellé de la compétence.
     * @see Competence#libelleComp
     */
    public void setLib (String lib)
    {
        this.libelleComp=lib;
    }
    
    /**
     * Setteur pour l'état de "suppression" de la compétence.
     * @param bool 
     *      Flag de suppression de la compétence.
     * @see Competence#suppr
     */
    public void setSuppr(boolean bool)
    {
        this.suppr=bool;
    }
}
