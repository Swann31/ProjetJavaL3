package gestionnairedemission;

import java.util.Date;

/**
 * <b> Classe Mission. </b>
 * <p> Cette classe définit une mission. Cette classe est abstraite.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public abstract class Mission {
    
    /**
     * Type de la mission.
     * @see Mission#getTypeM() 
     * @see Mission#setTypeM(java.lang.String) 
     */
    protected String typeMission;
    
    /**
     * Identifiant de la mission.
     * @see Mission#getIdM() 
     * @see Mission#setIdM(int) 
     */
    protected int idM;
    
    /**
     * Date de début de la mission.
     * @see Mission#getDateDebut() 
     * @see Mission#setDateDebut(java.util.Date) 
     */
    protected Date dateDebut;
    
    /**
     * Descriptif de la mission.
     * @see Mission#getDescM() 
     * @see Mission#setDescM(java.lang.String) 
     */
    protected String descM;

    /**
     * Getter pour le type de la mission.
     * @return Le type de la mission.
     * @see Mission#typeMission
     */
    public String getTypeM() {
        return typeMission;
    }

    /**
     * Setter pour le type de la mission.
     * @param typeMission 
     *      Type de la mission.
     * @see Mission#typeMission
     */
    public void setTypeM(String typeMission) {
        this.typeMission = typeMission;
    }

    /**
     * Getter pour l'identifiant de la mission.
     * @return L'identifiant de la mission.
     * @see Mission#idM
     */
    public int getIdM() {
        return idM;
    }

    /**
     * Setter pour l'identifiant de la mission.
     * @param idM 
     *      L'identifiant de la mission.
     * @see Mission#idM
     */
    public void setIdM(int idM) {
        this.idM = idM;
    }

    /**
     * Getter pour la date de début de la mission.
     * @return La date de début de la mission.
     * @see Mission#dateDebut
     */
    public Date getDateDebut() {
        return dateDebut;
    }

    /**
     * Setter pour la date de début de la mission.
     * @param dateDebut
     *      La date de début de la mission.
     * @see Mission#dateDebut
     */
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * Getter pour le descriptif de la mission.
     * @return Le descriptif de la mission.
     * @see Mission#descM
     */
    public String getDescM() {
        return descM;
    }

    /**
     * Setter pour le descriptif de la mission.
     * @param descM 
     *      Le descriptif de la mission.
     * @see Mission#descM
     */
    public void setDescM(String descM) {
        this.descM = descM;
    }
    
    /**
     * Surcharge de la méthode utilisée lors du polymorphisme.
     * @return Le nombre d'employés devant travailler sur la mission.
     */
    public abstract int getNbEmployes();
    
    /**
     * Surcharge de la méthode utilisée lors du polymorphisme.
     * @return Un tableau de CompetenceMission associées à la mission.
     * @see CompetenceMission
     */
    public abstract CompetenceMission[] getCompMission();
    
    /**
     * Surcharge de la méthode utilisée lors du polymorphisme.
     * @return Un tableau d'Employe travaillant sur la mission.
     * @see Employe
     */
    public abstract Employe[] getEmployeMission();
    
    /**
     * Surcharge de la méthode utilisée lors du polymorphisme.
     * @return La date de fin de la mission.
     */
    public abstract Date getDateFin();
    
    /**
     * Surcharge de la méthode utilisée lors du polymorphisme.
     * @param employeMission Un tableau d'Employe à associer à la mission.
     * @see Employe
     */
    public abstract void setEmployeMission(Employe[] employeMission);
    
    /**
     * Constructeur par défaut d"une Mission.
     */
    public Mission(){  
    }

    /**
     * Constructeur d'une Mission.
     * @param id
     *      Identifiant de la mission.
     * @param desc
     *      Descriptif de la mission.
     * @param dd
     *      Date de début de la mission.
     * @see Mission#idM
     * @see Mission#dateDebut
     * @see Mission#descM
     */
    public Mission (int id, String desc, Date dd)
    {
        this.idM=id;
        this.dateDebut=dd;
        this.descM=desc;
        this.typeMission="Mission";
    }
    
    /**
     * Constructeur d'une Mission.
     * @param id
     *      Identifiant de la mission.
     * @param desc
     *      Descriptif de la mission.
     * @param dd
     *      Date de début de la mission.
     * @param type 
     *      Type de la mission.
     * @see Mission#idM
     * @see Mission#dateDebut
     * @see Mission#descM
     * @see Mission#typeMission
     */
    public Mission (int id, String desc, Date dd, String type)
    {
        this.idM=id;
        this.dateDebut=dd;
        this.descM=desc;
        this.typeMission=type;
    }
}
