package gestionnairedemission;

import java.util.Date;

/**
 * <b> Classe MissionEnCours </b>
 * <p> Phase de la mission ou les affectations d'employés ne sont plus possibles.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public class MissionEnCours extends MissionPlanifiee{
    
    /**
     * Constructeur par défaut d'une MissionEnCours.
     */
    public MissionEnCours(){
        super();
    }
    
    /**
     * Constructeur d'une MissionEnCours.
     * @param m
     *      MissionPlanifiee qui va débuter (et devenir en cours)
     * @see Employe
     * @see Mission
     * @see MissionEnPreparation
     * @see MissionPlanifiee
     * @see Mission#getIDM() 
     * @see Mission#getDateDebut() 
     * @see MissionEnPreparation#getCompM() 
     * @see MissionEnPreparation#getNBE() 
     * @see MissionPlanifiee#getEmpMission() 
     */
    public MissionEnCours(MissionPlanifiee m)
    {
        super(m.getIDM(), m.getDateDebut(), m.getCompM(), m.getNBE(), m.getEmpMission());
    }
    
    /**
     * Constructeur d'une MissionEnCours.
     * @param m
     *      MissionEnPreparation nécessaire à une MissionEnCours.
     * @param e 
     *      Tableau d'employés affectés à la MissionEnCours.
     * @see Employe
     * @see Mission
     * @see MissionEnPreparation
     * @see MissionPlanifiee
     * @see Mission#getIDM() 
     * @see Mission#getDateDebut() 
     * @see MissionEnPreparation#getCompM() 
     * @see MissionEnPreparation#getNBE() 
     * @see MissionPlanifiee#employeMission
     */
    public MissionEnCours(MissionEnPreparation m, Employe[] e)
    {
        super(m.getIDM(), m.getDateDebut(), m.getCompM(), m.getNBE(), e);
    }
    
    /**
     * Constructeur d'une MissionEnCours.
     * @param m
     *      Mission servant de base à la MissionEnPreparation
     * @param c
     *      Liste des CompetenceMission nécessaires pour la MissionPlanifiee.
     * @param nbE
     *      Nombre d'employés nécessaires pour la mission.
     * @param e 
     *      Tableau d'employés affectés à la MissionPlanifiee.
     * @see Employe
     * @see Mission
     * @see MissionEnPreparation
     * @see MissionPlanifiee
     * @see MissionEnPreparation#compMission
     * @see MissionEnPreparation#nbEmployes
     * @see MissionPlanifiee#employeMission
     */
    public MissionEnCours(Mission m, CompetenceMission[] c, int nbE, Employe[] e)
    {
        super(m, c, nbE, e);
    }  
    
    /**
     * Constructeur d'une MissionEnCours.
     * @param idm
     *      Identifiant de la Mission.
     * @param dd
     *      Date de début de Mission.
     * @param c
     *      Liste des CompetenceMission nécessaires pour la MissionPlanifiee.
     * @param nbE
     *      Nombre d'employés nécessaires pour la mission.
     * @param e 
     *      Tableau d'employés affectés à la MissionPlanifiee.
     * @see Employe
     * @see Mission
     * @see MissionEnPreparation
     * @see MissionPlanifiee
     * @see Mission#idM
     * @see Mission#dateDebut
     * @see MissionEnPreparation#compMission
     * @see MissionEnPreparation#nbEmployes
     * @see MissionPlanifiee#employeMission 
     */
    public MissionEnCours(int idm, Date dd, CompetenceMission[] c, int nbE, Employe[] e)
    {
        super(idm, dd, c, nbE, e);
    }
}
