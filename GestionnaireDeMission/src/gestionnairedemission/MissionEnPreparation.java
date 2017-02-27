package gestionnairedemission;

import java.util.Date;

/**
 * <b> Classe Mission en Préparation</b>
 * <p> Cette classe définit une mission en cours de préparation.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public class MissionEnPreparation extends Mission{
    
    /**
     * Ensemble des compétenceMission inhérentes à la Mission : liste des compétences et du nombre de personnes requises pour la mission.
     * @see CompetenceMission
     * @see MissionEnPreparation#setCompM(gestionnairedemission.CompetenceMission[])
     * @see MissionEnPreparation#getCompM() 
     */
    private CompetenceMission[] compMission;
    
    /**
     * Nombre de personnes nécessaires à l'accomplissement de la mission.
     * @see MissionEnPreparation#setNbE(int) 
     * @see MissionEnPreparation#getNBE() 
     * @see MissionEnPreparation#addCompM(gestionnairedemission.CompetenceMission) 
     */
    private int nbEmployes;
    
    /**
     * Constructeur par défaut d'une MissionEnPreparation.
     * @see Mission
     */
    public MissionEnPreparation(){
        super();
    }
    
    /**
     * Constructeur d'une MissionEnPreparation.
     * @param m
     *      Mission à créer qui va être en préparation.
     * @param c
     *      Liste de CompetenceMission pour la MissionEnPreparation.
     * @param nb 
     *      Nombre de personnes requises pour la MissionEnPreparation.
     * @see Mission
     * @see CompetenceMission
     * @see Mission#getIDM() 
     * @see Mission#getDateDebut() 
     * @see MissionEnPreparation#compMission
     * @see MissionEnPreparation#nbEmployes
     */
    public MissionEnPreparation(Mission m, CompetenceMission[] c, int nb)
    {
        super(m.getIDM(), m.getDateDebut());
        this.compMission=c;
        this.nbEmployes=nb;
    }
            
    /**
     * Constructeur d'une MissionEnPreparation.
     * @param idm
     *      Identifiant de la mission.
     * @param dd
     *      Date de début de la mission.
     * @param c
     *      Liste de CompetenceMission pour la MissionEnPreparation.
     * @param nb 
     *      Nombre de personnes requises pour la MissionEnPreparation.
     * @see Mission
     * @see CompetenceMission
     * @see Mission#idM
     * @see Mission#dateDebut 
     * @see MissionEnPreparation#compMission
     * @see MissionEnPreparation#nbEmployes
     */
    public MissionEnPreparation(int idm, Date dd, CompetenceMission[] c, int nb)
    {
        super(idm, dd);
        this.compMission=c;
        this.nbEmployes=nb;
    }
    
    /**
     * Setteur pour les CompetenceMission.
     * @param c 
     *      Liste de CompetenceMission pour la MissionEnPreparation.
     * @see CompetenceMission
     * @see MissionEnPreparation#compMission
     */
    public void setCompM(CompetenceMission[] c)
    {
        this.compMission=c;
    }
    
    /**
     * Setteur pour le nombre d'employés necessaires dans la MissionEnPreparation.
     * @param nb 
     *    Nombre d'employés necessaires dans la MissionEnPreparation.  
     * @see MissionEnPreparation#nbEmployes
     */
    public void setNbE(int nb)
    {
        this.nbEmployes=nb;
    }
    
    /**
     * Getteur pour les CompetenceMission de la MissionEnPreparation.
     * @return Une liste de CompetenceMission inhérente à la MissionEnPreparation.
     * @see CompetenceMission
     * @see MissionEnPreparation#compMission
     */
    public CompetenceMission[] getCompM()
    {
        return this.compMission;
    }
    
    /**
     * Getteur pour le nombre d'employés de la MissionEnPreparation.
     * @return Le nombre d'employés sur la MissionEnPreparation.
     * @see MissionEnPreparation#nbEmployes
     */
    public int getNBE()
    {
        return this.nbEmployes;
    }
    
    /**
     * Ajout d'une CompetenceMission en fin de tableau de CompetenceMission de la MissionEnPreparation.
     * @param c 
     *      CompetenceMission qui sera ajoutée au tableau de CompetenceMission de la MissionEnPreparation.
     * @see CompetenceMission
     * @see MissionEnPreparation#compMission
     */
    public void addCompM(CompetenceMission c)
    {
        this.compMission[this.compMission.length]=c;
    }
}
