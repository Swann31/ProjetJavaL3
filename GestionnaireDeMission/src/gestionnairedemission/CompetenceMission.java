package gestionnairedemission;

/**
 * <b> Classe CompétenceMission </b>
 * <p> Définit au sein d'une mission, une compétence et le nombre de personnes devant la posséder.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public class CompetenceMission extends Competence {
    
    /**
     * Nombre de personnes devant posséder la compétence.
     * @see CompetenceMission#getNb() 
     * @see CompetenceMission#setNb(int) 
     */
    private int nbPersonnes;
    
    /**
     * Constructeur par défaut de la CompetenceMission.
     * @see Competence
     * @see CompetenceMission#nbPersonnes
     */
    public CompetenceMission ()
    {
        super();
        this.nbPersonnes=0;
    }
    
    /**
     * Constructeur d'une CompetenceMission.
     * @param i 
     *      Nombre de personnes devant posséder la compétence.
     * @see Competence
     * @see CompetenceMission#nbPersonnes
     */
    public CompetenceMission (int i)
    {
        super();
        this.nbPersonnes=i;
    }
    
    /**
     * Constructeur d'une CompetenceMission.
     * @param c
     *      Compétence créée par la même occasion.
     * @param i
     *      Nombre de personnes devant posséder la compétence.
     * @see Competence
     * @see CompetenceMission#nbPersonnes
     * @see Competence#getIDC() 
     * @see Competence#getCat() 
     * @see Competence#getLib() 
     */
    public CompetenceMission(Competence c, int i)
    {
        super(c.getIDC(), c.getCat(), c.getLib());
        this.nbPersonnes=i;
    }
    
    /**
     * Constructeur d'une CompetenceMission.
     * @param id
     *      Identifiant de la compétence.
     * @param cat
     *      Catégorie de la compétence.
     * @param lib
     *      Libellé de la compétence.
     * @param i 
     *      Nombre de personnes devant posséder la compétence.
     * @see Competence
     * @see CompetenceMission#nbPersonnes
     * @see Competence#idC
     * @see Competence#categorieComp
     * @see Competence#libelleComp
     */
    public CompetenceMission(String id, String cat, String lib, int i)
    {
        super(id, cat, lib);
        this.nbPersonnes=i;
    }
    
    /**
     * Getter pour le nombre de personnes possédant la compétence.
     * @return Le nombre de personne possédant la compétence.
     * @see CompetenceMission#nbPersonnes
     */
    public int getNb ()
    {
        return this.nbPersonnes;
    }
    
    /**
     * Setter pour le nombre de personnes possédant la compétence.
     * @param i
     *      Le nombre de personnes devant posséder la compétence.
     * @see CompetenceMission#nbPersonnes
     */
    public void setNb (int i)
    {
        this.nbPersonnes=i;
    }
}
