package gestionnairedemission;

import java.util.Date;

/**
 * <b> Classe MissionNonModifiable. </b>
 * <p> Cette classe définit une mission qui ne peut pas être modifiée. Cette classe est abstraite.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public abstract class MissionNonModifiable extends Mission {
    
    /**
     * Nombre d'employés intégrés à la mission.
     * @see MissionNonModifiable#getNbEmployes() 
     */
    protected int nbEmployes;
    
    /**
     * Tableau de CompetenceMission devant être utilisées lors de la mission.
     * @see MissionNonModifiable#getCompMission() 
     * @see CompetenceMission
     */
    protected CompetenceMission [] compMission;
    
    /**
     * Tableau d'employés intégrés à la mission.
     * @see MissionNonModifiable#getEmployeMission() 
     * @see Employe
     */
    protected Employe[] employeMission;
    
    /**
     * Date de fin de la mission.
     * @see MissionNonModifiable#getDateFin() 
     */
    protected Date dateFin;
    
    /**
     * Getter pour le nombre d'employés travaillant sur la mission.
     * @return Le nombre d'employés associés à la mission.
     * @see MissionNonModifiable#nbEmployes
     */
    @Override
    public int getNbEmployes() {
        return nbEmployes;
    }
    
    /**
     * Getter pour les CompetenceMission associées à la mission.
     * @return Un tableau de CompetenceMission liées à la mission.
     * @see MissionNonModifiable#compMission
     * @see CompetenceMission
     */
    @Override
    public CompetenceMission[] getCompMission() {
        return compMission;
    }
    
    /**
     * Getter pour les Employe associés à la mission.
     * @return Un tableau d'Employe liés à la mission.
     * @see MissionNonModifiable#employeMission
     * @see Employe
     */
    @Override
    public Employe[] getEmployeMission() {
        return employeMission;
    }
    
    /**
     * Getter pour la DateFin de la mission.
     * @return La date de fin de la mission.
     * @see MissionNonModifiable#dateFin
     */
    @Override
    public Date getDateFin(){
        return dateFin;
    }
    
    /**
     * Constructeur par défaut pour la MissionNonModifiable.
     */
    public MissionNonModifiable()
    {
        super();
    }
    
    /**
     * Constructeur d'une MissionNonModifiable.
     * @param m
     *      Mission servant de base à une MissionNonModifiable.
     * @param nbE
     *      Nombre d'employés travaillant sur la mission.
     * @param comp
     *      Tableau de CompetenceMission à ajouter à la mission.
     * @param empM
     *      Tableau d'employés ajoutés sur la mission.
     * @param df 
     *      Date de fin de la mission.
     * @see Mission
     * @see Mission#getIdM() 
     * @see Mission#getDescM() 
     * @see Mission#getDateDebut() 
     * @see MissionNonModifiable#nbEmployes
     * @see MissionNonModifiable#compMission
     * @see MissionNonModifiable#employeMission
     * @see MissionNonModifiable#dateFin
     * @see CompetenceMission
     * @see Employe
     */
    public MissionNonModifiable(Mission m, int nbE, CompetenceMission[] comp, Employe[] empM, Date df)
    {
        super(m.getIdM(),m.getDescM(),m.getDateDebut(),"MissionNonModifiable");
        this.nbEmployes=nbE;
        this.compMission=comp;
        this.employeMission=empM;
        this.dateFin=df;
    }
    
    /**
     * Constructeur d'une MissionNonModifiable.
     * @param m
     *      Mission servant de base à une MissionNonModifiable.
     * @param nbE
     *      Nombre d'employés travaillant sur la mission.
     * @param comp
     *      Tableau de CompetenceMission à ajouter à la mission.
     * @param typeM
     *      Type de la mission.
     * @param empM
     *      Tableau d'employés ajoutés sur la mission.
     * @param df 
     *      Date de fin de la mission.
     * @see Mission
     * @see Mission#getIdM() 
     * @see Mission#getDescM() 
     * @see Mission#getDateDebut() 
     * @see MissionNonModifiable#nbEmployes
     * @see MissionNonModifiable#compMission
     * @see Mission#typeMission
     * @see MissionNonModifiable#employeMission
     * @see MissionNonModifiable#dateFin
     * @see CompetenceMission
     * @see Employe
     */
    public MissionNonModifiable(Mission m, int nbE, CompetenceMission[] comp, String typeM, Employe[] empM, Date df)
    {
        super(m.getIdM(),m.getDescM(),m.getDateDebut(),typeM);
        this.nbEmployes=nbE;
        this.compMission=comp;
        this.employeMission=empM;
        this.dateFin=df;
    }

    /**
     * Constructeur d'une MissionNonModifiable.
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
     * @param empM
     *      Tableau d'employés ajoutés sur la mission.
     * @param df 
     *      Date de fin de la mission.
     * @see Mission
     * @see Mission#idM 
     * @see Mission#descM 
     * @see Mission#dateDebut
     * @see MissionNonModifiable#nbEmployes
     * @see MissionNonModifiable#compMission
     * @see Mission#typeMission
     * @see MissionNonModifiable#employeMission
     * @see MissionNonModifiable#dateFin
     * @see CompetenceMission
     * @see Employe
     */
    public MissionNonModifiable (int id, String desc, Date dateD, int nbE, CompetenceMission[] comp, String typeM, Employe[] empM, Date df)
    {
        super(id,desc,dateD,typeM);
        this.nbEmployes=nbE;
        this.compMission=comp; 
        this.employeMission=empM;
        this.dateFin=df;
    }
    
    /**
     * Constructeur d'une MissionNonModifiable.
     * @param mp
     *      MissionPlanifiee servant de base à une MissionNonModifiable.
     * @param typeM
     *      Type de la mission.
     * @see MissionPlanifiee
     * @see MissionPlanifiee#getIdM() 
     * @see MissionPlanifiee#getDescM() 
     * @see MissionPlanifiee#getDateDebut() 
     * @see MissionPlanifiee#typeMission
     * @see MissionNonModifiable#nbEmployes
     * @see MissionPlanifiee#nbEmployes
     * @see MissionNonModifiable#compMission
     * @see MissionPlanifiee#getCompMission() 
     * @see MissionNonModifiable#employeMission
     * @see MissionPlanifiee#getEmployeMission() 
     * @see MissionNonModifiable#dateFin
     * @see MissionPlanifiee#getDateFin() 
     */
    public MissionNonModifiable(MissionPlanifiee mp, String typeM){
        super(mp.getIdM(), mp.getDescM(), mp.getDateDebut(), typeM);
        this.nbEmployes=mp.getNbEmployes();
        this.compMission=mp.getCompMission(); 
        this.employeMission=mp.getEmployeMission();
        this.dateFin=mp.getDateFin();
    }   
}
