package gestionnairedemission;

/**
 * <b> Classe Compétence </b>
 * <p> Cette classe définit une compétence.</p>
 * @author Swann LAZAR
 * @version 1.0
 */
public class Competence implements ICompetence{
    
    /**
     * Identifiant de la compétence.
     * @see Competence#getIDC
     * @see Competence#setIDC
     */
    private String idC;
    
    /**
     * Catégorie de la compétence
     * @see Competence#getCat
     * @see Competence#setCat
     */
    private String categorieComp;
    
    /**
     * Libellé de la compétence.
     * @see Competence#getLib
     * @see Competence#setLib
     */
    private String libelleComp;
    
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
     * Getteur pour la catégorie de la compétence.
     * @return La catégorie de la compétence.
     * @see Competence#categorieComp
     */
    @Override
    public String getCat() 
    {
        return this.categorieComp;
    }
    
    /**
     * Getteur pour le libellé de la compétence.
     * @return Le libellé de la compétence.
     * @see Competence#libelleComp
     */
    @Override
    public String getLib()
    {
        return this.libelleComp;
    }
    
    /**
     * Setteur pour l'identifiant de la compétence.
     * @param id 
     *      L'identifiant de la compétence.
     * @see Competence#idC
     */
    public void setIDC (String id)
    {
        this.idC=id;
    }
    
    /**
     * Setteur pour la catégorie de la compétence.
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
}
