package gestionnairedemission;

import java.util.Date;

/**
 * <b> Classe MissionPlanifiee </b>
 * <p> Cette classe définit une mission planifiée et devant débuter très prochainement.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public class MissionPlanifiee extends MissionModifiable{
    
    /**
     * Tableau d'employés ayant été intégrés à la mission.
     * @see MissionPlanifiee#setEmployeMission(gestionnairedemission.Employe[]) 
     * @see MissionPlanifiee#getEmployeMission() 
     * @see Employe
     */
    protected Employe[] employeMission;
    
    /**
     * Date de fin de la mission.
     * @see MissionPlanifiee#setDateFin(java.util.Date) 
     * @see MissionPlanifiee#getDateFin() 
     */
    protected Date dateFin;

    /**
     * Getter pour le tableau d'employés travaillant sur la mission.
     * @return Le tableau d'employés associés à la mission.
     * @see MissionPlanifiee#employeMission
     * @see Employe
     */
    @Override
    public Employe[] getEmployeMission() {
        return employeMission;
    }

    /**
     * Setter pour associer des employés à une mission.
     * @param employeMission 
     *      Le tableau d'employés devant travailler sur la mission.
     * @see MissionPlanifiee#employeMission
     * @see Employe
     */
    @Override
    public void setEmployeMission(Employe[] employeMission) {
        this.employeMission = employeMission;
    }

    /**
     * Getter pour la date de fin de la mission.
     * @return La date de fin de la mission.
     * @see MissionPlanifiee#dateFin
     */
    @Override
    public Date getDateFin() {
        return dateFin;
    }

    /**
     * Setter pour la date de fin de la mission.
     * @param dateFin 
     *      La date de fin de mission.
     * @see MissionPlanifiee#dateFin
     */
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
    
    /**
     * Constructeur par défaut d'une MissionPlanifiee.
     * @see MissionModifiable
     */
    public MissionPlanifiee(){
        super();
    }
    
    /**
     * Constructeur d'une MissionPlanifiee.
     * @param id
     *      Identifiant de la mission.
     * @param desc
     *      Descriptif de la mission.
     * @param dateD
     *      Date de début de la mission.
     * @param nbE
     *      Nombre d'employés travaillant sur la mission.
     * @param comp
     *      Tableau de CompetenceMission à ajouter à la mission.
     * @param emp
     *      Tableau d'employés ajoutés sur la mission.
     * @param dateF 
     *      Date de fin de la mission.
     * @see MissionModifiable
     * @see MissionModifiable#idM
     * @see MissionModifiable#descM
     * @see MissionModifiable#dateDebut
     * @see MissionModifiable#nbEmployes
     * @see MissionModifiable#compMission
     * @see MissionPlanifiee#employeMission
     * @see MissionPlanifiee#dateFin
     */
    public MissionPlanifiee(int id, String desc, Date dateD,int nbE, CompetenceMission[] comp, Employe[] emp, Date dateF){
        super(id, desc, dateD, nbE, comp, "Mission Planifiée");
        this.employeMission=emp;
        this.dateFin=dateF;
    }
    
    /**
     * Constructeur d'une MissionPlanifiee.
     * @param mm
     *      MissionModifiable servant de base à la MissionPlanifiee.
     * @param emp
     *      Tableau d'employés ajoutés sur la mission.
     * @param dateF 
     *      Date de fin de la mission.
     * @see MissionModifiable
     * @see MissionModifiable#getIdM() 
     * @see MissionModifiable#getDescM() 
     * @see MissionModifiable#getDateDebut() 
     * @see MissionModifiable#getNbEmployes() 
     * @see MissionModifiable#getCompMission() 
     * @see MissionPlanifiee#employeMission
     * @see MissionPlanifiee#dateFin
     */
    public MissionPlanifiee(MissionModifiable mm, Employe[] emp, Date dateF)
    {
        super(mm.getIdM(),mm.getDescM(), mm.getDateDebut(), mm.getNbEmployes(), mm.getCompMission(), "Mission En Preparation");
        this.employeMission=emp;
        this.dateFin=dateF;
    }
}
