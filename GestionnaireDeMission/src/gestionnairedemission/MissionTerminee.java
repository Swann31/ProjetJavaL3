package gestionnairedemission;

import java.util.Date;

/**
 * <b> Classe MissionTerminee </b>
 * <p> Cette classe définit une mission ayant été terminée.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public class MissionTerminee extends MissionNonModifiable {
    
    /**
     * Constructeur par défaut d'une MissionTerminee.
     * @see MissionNonModifiable
     */
    public MissionTerminee(){
        super();
    }
    
    /**
     * Constructeur d'une MissionTerminee.
     * @param m
     *      Mission servant de base pour la création d'une MissionTerminee.
     * @param nbE
     *      Nombre d'employés travaillant sur la mission.
     * @param comp
     *      Tableau de CompetenceMission à ajouter à la mission.
     * @param empM
     *      Tableau d'employés ajoutés sur la mission.
     * @param df 
     *      Date de fin de la mission.
     * @see Mission
     * @see MissionNonModifiable#nbEmployes
     * @see MissionNonModifiable#compMission
     * @see MissionNonModifiable#employeMission
     * @see MissionNonModifiable#dateFin
     */
    public MissionTerminee(Mission m, int nbE, CompetenceMission[] comp, Employe[] empM, Date df)
    {
        super(m,nbE,comp,"Mission Terminée",empM,df);
    }
    
    /**
     * Constructeur d'une MissionTerminee.
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
     * @param empM
     *      Tableau d'employés ajoutés sur la mission.
     * @param df 
     *      Date de fin de la mission.
     * @see MissionNonModifiable
     * @see MissionNonModifiable#idM
     * @see MissionNonModifiable#descM
     * @see MissionNonModifiable#dateDebut
     * @see MissionNonModifiable#nbEmployes
     * @see MissionNonModifiable#compMission
     * @see MissionNonModifiable#employeMission
     * @see MissionNonModifiable#dateFin
     */
    public MissionTerminee(int id, String desc, Date dateD, int nbE, CompetenceMission[] comp, Employe[] empM, Date df)
    {
        super(id,desc,dateD,nbE,comp,"Mission Terminée",empM,df);
    }

    /** 
     * Constructeur d'une MissionTerminee.
     * @param mp
     *      MissionPlanifiee étant passée en état de MissionTerminée.
     * @see MissionPlanifiee
     */
    public MissionTerminee(MissionPlanifiee mp)
    {
        super(mp,"Mission Terminée");
    }

    /**
     * Surcharge de la méthode utilisée lors du polymorphisme.
     * @param employeMission 
     *      Liste d'EmployeMission à définir pour la mission.
     * @see Employe
     */
    @Override
    public void setEmployeMission(Employe[] employeMission) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
