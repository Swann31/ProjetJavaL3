package gestionnairedemission;

import java.util.Date;

/**
 * <b> Classe MissionPlanifiee </b>
 * <p> Mission ayant vu les employés affectés à celle-ci.</p>
 * @author Swann LAZAR
 * @version 1.0
 */
public class MissionPlanifiee extends MissionEnPreparation {
    
    /**
     * Liste d'employés ayant été affectés à la MissionPlanifiee.
     * @see Employe
     * @see MissionPlanifiee#setEmpMission(gestionnairedemission.Employe[]) 
     * @see MissionPlanifiee#getEmpMission() 
     * @see MissionPlanifiee#addEmpMission(gestionnairedemission.Employe) 
     */
    private Employe[] employeMission;
    
    /**
     * Constructeur par défaut de la MissionPlanifiee.
     */
    public MissionPlanifiee() {
        super();
    }
    
    /**
     * Constructeur d'une MissionPlanifiee.
     * @param m
     *      MissionEnPreparation nécessaire à la MissionPlanifiee.
     * @param e 
     *      Tableau d'employés affectés à la MissionPlanifiee.
     * @see MissionEnPreparation
     * @see Employe
     * @see MissionEnPreparation#getIDM() 
     * @see MissionEnPreparation#getDateDebut() 
     * @see MissionEnPreparation#getCompM() 
     * @see MissionEnPreparation#getNBE() 
     * @see MissionPlanifiee#employeMission
     */
    public MissionPlanifiee(MissionEnPreparation m, Employe[] e)
    {
        super(m.getIDM(), m.getDateDebut(), m.getCompM(), m.getNBE());
        this.employeMission=e;
    }
    
    /**
     * Constructeur d'une MissionPlanifiee.
     * @param m
     *      Mission servant de base à la MissionPlanifiee.
     * @param c
     *      Liste des CompetenceMission nécessaires pour la MissionPlanifiee.
     * @param nbE
     *      Nombre d'employés nécessaires pour la mission.
     * @param e 
     *      Tableau d'employés affectés à la MissionPlanifiee.
     * @see Mission
     * @see Employe
     * @see MissionEnPreparation#nbEmployes
     * @see MissionEnPreparation#compMission
     * @see MissionPlanifiee#employeMission
     */
    public MissionPlanifiee(Mission m, CompetenceMission[] c, int nbE, Employe[] e)
    {
        super(m, c, nbE);
        this.employeMission=e;
    }
    
    /**
     * Constructeur d'une MissionPlanifiee.
     * @param idm
     *      Identifiant de la Mission.
     * @param dd
     *      Date de début d'une Mission.
     * @param c
     *      Liste des CompetenceMission nécessaires pour la MissionPlanifiee.
     * @param nbE
     *      Nombre d'employés nécessaires pour la Mission.
     * @param e 
     *      Tableau d'employés affectés à la MissionPlanifiee.
     * @see Employe
     * @see Mission
     * @see MissionEnPreparation#nbEmployes
     * @see MissionEnPreparation#compMission
     * @see MissionPlanifiee#employeMission
     * @see Mission#idM
     * @see Mission#dateDebut
     */
    public MissionPlanifiee(int idm, Date dd, CompetenceMission[] c, int nbE, Employe[] e)
    {
        super(idm, dd, c, nbE);
        this.employeMission=e;
    }
    
    /**
     * Setteur pour les Employés affectés à la MissionPlanifiee.
     * @param e
     *      Tableau d'employe devant être affectés à la MissionPlanifiee.
     * @see Employe
     * @see MissionPlanifiee#employeMission
     */
    public void setEmpMission(Employe[] e)
    {
        this.employeMission=e;
    }
    
    /**
     * Getteur pour les Employés affectés à la MissionPlanifiee.
     * @return Un tableau d'employé affectés à la MissionPlanifiee.
     * @see Employe
     * @see MissionPlanifiee#employeMission
     */
    public Employe[] getEmpMission()
    {
        return this.employeMission;
    }
    
    /**
     * Ajout d'un employe en fin de tableau d'employeMission pour la MissionPlanifiee.
     * @param e 
     *      Employe à ajouter à la MissionPlanifiee.
     * @see Employe
     * @see MissionPlanifiee#employeMission
     */
    private void addEmpMission(Employe e)
    {
        this.employeMission[this.employeMission.length]=e;
    }
}
