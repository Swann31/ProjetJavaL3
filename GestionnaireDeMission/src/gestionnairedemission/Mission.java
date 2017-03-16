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
    
protected String typeMission;
protected int idM;
protected Date dateDebut;
protected String descM;

    public String getTypeM() {
        return typeMission;
    }

    public void setTypeM(String typeMission) {
        this.typeMission = typeMission;
    }

    public int getIdM() {
        return idM;
    }

    public void setIdM(int idM) {
        this.idM = idM;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDescM() {
        return descM;
    }

    public void setDescM(String descM) {
        this.descM = descM;
    }
    
    public abstract int getNbEmployes();
    public abstract CompetenceMission[] getCompMission();
    public abstract Employe[] getEmployeMission();
    public abstract Date getDateFin();
      public abstract void setEmployeMission(Employe[] employeMission);
    
    public Mission(){  
    }

    public Mission (int id, String desc, Date dd)
    {
        this.idM=id;
        this.dateDebut=dd;
        this.descM=desc;
        this.typeMission="Mission";
    }
    
    public Mission (int id, String desc, Date dd, String type)
    {
        this.idM=id;
        this.dateDebut=dd;
        this.descM=desc;
        this.typeMission=type;
    }
}
