package gestionnairedemission;

import java.util.Date;

/**
 * <b> Classe MissionTerminee </b>
 * <p> Mission ayant atteind son terme. </p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public class MissionTerminee extends MissionEnCours {
    
    /**
     * Date de fin de la mission.
     * @see MissionTerminee#setDateFin(java.util.Date) 
     * @see MissionTerminee#getDateFin() 
     */
    private Date dateFin;
    
    /**
     * Constructeur par défaut d'une MissionTerminee.
     */
    public MissionTerminee(){
        super();
    }
    
    /**
     * Constructeur d'une MissionTerminee.
     * @param m
     *      MissionPlanifiee qui va débuter (et devenir en cours)
     * @param df
     *      Date de fin de la Mission.
     * @see Employe
     * @see Mission
     * @see MissionEnPreparation
     * @see MissionPlanifiee
     * @see MissionEnCours
     * @see Mission#getIDM() 
     * @see Mission#getDateDebut() 
     * @see MissionEnPreparation#getCompM() 
     * @see MissionEnPreparation#getNBE() 
     * @see MissionPlanifiee#getEmpMission() 
     * @see MissionTerminee#dateFin
     */
    public MissionTerminee(MissionEnCours m, Date df)
    {
        super(m.getIDM(), m.getDateDebut(), m.getCompM(), m.getNBE(), m.getEmpMission());
        this.dateFin=df;
    }
    /**
     * Constructeur d'une MissionTerminee.
     * @param m
     *      MissionPlanifiee qui va débuter (et devenir en cours)
     * @param df
     *      Date de fin de la Mission.
     * @see Employe
     * @see Mission
     * @see MissionEnPreparation
     * @see MissionPlanifiee
     * @see MissionEnCours
     * @see Mission#getIDM() 
     * @see Mission#getDateDebut() 
     * @see MissionEnPreparation#getCompM() 
     * @see MissionEnPreparation#getNBE() 
     * @see MissionPlanifiee#getEmpMission() 
     * @see MissionTerminee#dateFin
     */
    public MissionTerminee(MissionPlanifiee m, Date df)
    {
        super(m.getIDM(), m.getDateDebut(), m.getCompM(), m.getNBE(), m.getEmpMission());
        this.dateFin=df;
    }
    
    /**
     * Constructeur d'une MissionTerminee.
     * @param m
     *      MissionEnPreparation nécessaire à une MissionTerminee.
     * @param e 
     *      Tableau d'employés affectés à la MissionTerminee.
     * @param df
     *      Date de fin de la Mission.
     * @see Employe
     * @see Mission
     * @see MissionEnPreparation
     * @see MissionPlanifiee
     * @see MissionEnCours
     * @see Mission#getIDM() 
     * @see Mission#getDateDebut() 
     * @see MissionEnPreparation#getCompM() 
     * @see MissionEnPreparation#getNBE() 
     * @see MissionPlanifiee#employeMission
     * @see MissionTerminee#dateFin
     */
    public MissionTerminee(MissionEnPreparation m, Employe[] e, Date df)
    {
        super(m.getIDM(), m.getDateDebut(), m.getCompM(), m.getNBE(), e);
        this.dateFin=df;
    }
    
    /**
     * Constructeur d'une MissionTerminee.
     * @param m
     *      Mission servant de base à la MissionEnPreparation
     * @param c
     *      Liste des CompetenceMission nécessaires pour la MissionPlanifiee.
     * @param nbE
     *      Nombre d'employés nécessaires pour la mission.
     * @param e 
     *      Tableau d'employés affectés à la MissionPlanifiee.
     * @param df
     *      Date de fin de la Mission.
     * @see Employe
     * @see Mission
     * @see MissionEnPreparation
     * @see MissionPlanifiee
     * @see MissionEnCours
     * @see MissionEnPreparation#compMission
     * @see MissionEnPreparation#nbEmployes
     * @see MissionPlanifiee#employeMission
     * @see MissionTerminee#dateFin
     */
    public MissionTerminee(Mission m, CompetenceMission[] c, int nbE, Employe[] e, Date df)
    {
        super(m, c, nbE, e);
        this.dateFin=df;
    }  
    
    /**
     * Constructeur d'une MissionTerminee.
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
     * @param df
     *      Date de fin de la Mission.
     * @see Employe
     * @see Mission
     * @see MissionEnPreparation
     * @see MissionPlanifiee
     * @see MissionEnCours
     * @see Mission#idM
     * @see Mission#dateDebut
     * @see MissionEnPreparation#compMission
     * @see MissionEnPreparation#nbEmployes
     * @see MissionPlanifiee#employeMission 
     * @see MissionTerminee#dateFin
     */
    public MissionTerminee(int idm, Date dd, CompetenceMission[] c, int nbE, Employe[] e, Date df)
    {
        super(idm, dd, c, nbE, e);
        this.dateFin=df;
    }
    
    /**
     * Setteur de la date de fin de la MissionTerminee.
     * @param df 
     *      Date de fin de la MissionTerminee.
     * @see MissionTerminee#dateFin
     */
    public void setDateFin(Date df)
    {
        this.dateFin=df;
    }
    
    /**
     * Getteur de la date de fin de la MissionTerminee.
     * @return La date de fin de la Mission.
     * @see MissionTerminee#dateFin
     */
    public Date getDateFin()
    {
        return this.dateFin;
    }   
    
    /**
     * Calcul de la durée de la Mission.
     * @return La durée de la mission.
     * @see Mission
     * @see Mission#getDateDebut() 
     * @see MissionTerminee#getDateFin() 
     */
    public long dureeM()
    {
        long duree = this.getDateFin().getTime() - this.getDateDebut().getTime();
        return duree;
    }
}
