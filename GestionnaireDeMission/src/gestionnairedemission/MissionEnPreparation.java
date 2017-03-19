package gestionnairedemission;

import java.util.Date;

/**
 * <b> Classe MissionEnPreparation </b>
 * <p> Cette classe définit une mission en préparation et devant être définie intégralement avant de débuter.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public class MissionEnPreparation extends MissionModifiable {
    
    /**
     * Constructeur par défaut d'une MissionEnPreparation.
     * @see MissionModifiable
     */
    public MissionEnPreparation(){
        super();
    }
    
    /**
     * Constructeur d'une MissionEnPreparation.
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
     * @see MissionModifiable
     * @see MissionModifiable#idM
     * @see MissionModifiable#descM
     * @see MissionModifiable#dateDebut
     * @see MissionModifiable#nbEmployes
     * @see MissionModifiable#compMission
     */
    public MissionEnPreparation(int id, String desc, Date dateD,int nbE, CompetenceMission[] comp){
        super(id, desc, dateD, nbE, comp, "Mission En Preparation");
    }
    
    /**
     * Constructeur d'une MissionEnPreparation.
     * @param mm
     *      MissionModifiable servant de base à la MissionEnPreparation.
     * @see MissionModifiable
     * @see MissionModifiable#getIdM() 
     * @see MissionModifiable#getDescM() 
     * @see MissionModifiable#getDateDebut() 
     * @see MissionModifiable#getNbEmployes() 
     * @see MissionModifiable#getCompMission()
     */
    public MissionEnPreparation(MissionModifiable mm)
    {
        super(mm.getIdM(),mm.getDescM(), mm.getDateDebut(), mm.getNbEmployes(), mm.getCompMission(), "Mission En Preparation");
    }
    
    /**
     * Surcharge de la méthode utilisée lors du polymorphisme.
     * @return Rien.
     * @see Employe
     */
    @Override
     public Employe[] getEmployeMission(){
         return null;
     };
     
     /**
      * Surcharge de la méthode utilisée lors du polymorphisme.
      * @return Rien.
      */
    @Override
     public Date getDateFin(){
         return null;
     };

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
