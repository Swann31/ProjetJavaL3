/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionnairedemission;

import java.util.Date;

/**
 *
 * @author Maxence
 */
public abstract class Mission {
    
    /**
     * Identifiant de la mission.
     * @see Mission#setIDM(int) 
     * @see Mission#getIDM() 
     */
    private int idM;
    
    /**
     * Date de début de la mission.
     * @see Mission#setDateDebut(java.util.Date) 
     * @see Mission#getDateDebut() 
     */
    private Date dateDebut;
    
    private String descriptif;
    
    /**
     * Constructeur par défaut de la classe Mission.
     */
    private int idMission = 1;
    
    public Mission(){
    }
    
    public Mission(int id, String desc, Date date)
    {
        this.idM=id;
        this.dateDebut=dd;
    }
    
     public Mission(int id, Date dd, String lib)
    {
        this.idM=id;
        this.dateDebut=dd;
        this.descriptif = lib;
    }
    
    public Mission(int id, String desc, Date date, String type)
    {
        this.idM=id;
        this.descM=desc;
        this.dateDebut=date;
        this.typeMission=type;
    }
    
    public String getDescriptif(){
        return this.descriptif;
    }
    
    public void setDescriptif(String lib){
        this.descriptif = lib;
    }
}
