package gestionnairedemission;

import java.util.Date;

/**
 * <b> Classe MissionModifiable. </b>
 * <p> Cette classe définit une mission qui peut être modifiée. Cette classe est abstraite.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public abstract class MissionModifiable extends Mission {
    
    /**
     * Nombre d'employés intégrés à la mission.
     * @see MissionModifiable#getNbEmployes() 
     * @see MissionModifiable#setNbEmployes(int) 
     */
    protected int nbEmployes;
    
    /**
     * Tableau de CompetenceMission devant être utilisées lors de la mission.
     * @see MissionModifiable#getCompMission() 
     * @see MissionModifiable#setCompMission(gestionnairedemission.CompetenceMission[]) 
     * @see CompetenceMission
     */
    protected CompetenceMission [] compMission;

    /**
     * Getter pour le nombre d'employés travaillant sur la mission.
     * @return Le nombre d'employés associés à la mission.
     * @see MissionModifiable#nbEmployes
     */
    @Override
    public int getNbEmployes() {
        return nbEmployes;
    }

    /**
     * Setter pour le nombre d'employés devant travailler sur la mission.
     * @param nbE 
     *      Le nombre d'employés devant devant travailler sur la mission.
     * @see MissionModifiable#nbEmployes
     */
    public void setNbEmployes(int nbE) {
        this.nbEmployes = nbE;
    }

    /**
     * Getter pour les CompetenceMission associées à la mission.
     * @return Un tableau de CompetenceMission liées à la mission.
     * @see MissionModifiable#compMission
     * @see CompetenceMission
     */
    @Override
    public CompetenceMission[] getCompMission() {
        return compMission;
    }

    /**
     * Setter pour les CompetenceMission à associer à la mission.
     * @param compM 
     *      Tableau de CompetenceMission à intégrer à la mission.
     * @see MissionModifiable#compMission
     * @see CompetenceMission
     */
    public void setCompMission(CompetenceMission[] compM) {
        this.compMission = compM;
    }
    
    /**
     * Surcharge de la méthode utilisée lors du polymorphisme.
     * @return Un tableau d'Employe travaillant sur la mission.
     * @see Employe
     */
    @Override
     public abstract Employe[] getEmployeMission();
     
     /**
      * Surcharge de la méthode utilisée lors du polymorphisme.
      * @return La date de fin de la mission.
      */
    @Override
      public abstract Date getDateFin();
      
     /**
      * Surcharge de la méthode utilisée lors du polymorphisme.
      * @param employeMission 
      *        Un tableau d'Employe qui travailleront sur la mission.
      * @see Employe
      */
    @Override
      public abstract void setEmployeMission(Employe[] employeMission);
    
    /**
     * Constructeur par défaut d'une MissionModifiable.
     */
    public MissionModifiable (){
        super();
    }
    
    /**
     * Constructeur d'une MissionModifiable.
     * @param m
     *      Mission servant de base à une MissionNonModifiable.
     * @param nbE
     *      Nombre d'employés travaillant sur la mission.
     * @param comp
     *      Tableau de CompetenceMission à ajouter à la mission.
     * @see Mission
     * @see CompetenceMission
     * @see Mission#getIdM() 
     * @see Mission#getDescM() 
     * @see Mission#getDateDebut() 
     * @see MissionModifiable#nbEmployes
     * @see MissionModifiable#compMission
     */
    public MissionModifiable(Mission m, int nbE, CompetenceMission[] comp)
    {
        super(m.getIdM(),m.getDescM(),m.getDateDebut(),"MissionModifiable");
        this.nbEmployes=nbE;
        this.compMission=comp;
    }

    /**
     * Constructeur d'une MissionModifiable.
     * @param m
     *      Mission servant de base à une MissionNonModifiable.
     * @param nbE
     *      Nombre d'employés travaillant sur la mission.
     * @param comp
     *      Tableau de CompetenceMission à ajouter à la mission.
     * @param typeM 
     *       Type de la mission.
     * @see Mission
     * @see CompetenceMission
     * @see Mission#getIdM() 
     * @see Mission#getDescM() 
     * @see Mission#getDateDebut() 
     * @see Mission#typeMission
     * @see MissionModifiable#nbEmployes
     * @see MissionModifiable#compMission
     */
    public MissionModifiable(Mission m, int nbE, CompetenceMission[] comp, String typeM)
    {
        super(m.getIdM(),m.getDescM(),m.getDateDebut(),typeM);
        this.nbEmployes=nbE;
        this.compMission=comp;
    }
    
    /**
     * Constructeur d'une MissionModifiable.
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
     * @param typeM
     *      Type de la mission.
     * @see CompetenceMission
     * @see Mission
     * @see Mission#idM
     * @see Mission#descM
     * @see Mission#dateDebut
     * @see Mission#typeMission
     * @see MissionModifiable#nbEmployes
     * @see MissionModifiable#compMission
     */
    public MissionModifiable (int id, String desc, Date dateD, int nbE, CompetenceMission[] comp, String typeM)
    {
        super(id,desc,dateD,typeM);
        this.nbEmployes=nbE;
        this.compMission=comp; 
    }
}
