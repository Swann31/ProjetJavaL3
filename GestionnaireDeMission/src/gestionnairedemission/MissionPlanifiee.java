/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionnairedemission;

import java.util.Date;

/**
 *
 * @author Swann
 */
public class MissionPlanifiee extends MissionModifiable{
    
    protected Employe[] employeMission;
    protected Date dateFin;

    public Employe[] getEmployeMission() {
        return employeMission;
    }

    public void setEmployeMission(Employe[] employeMission) {
        this.employeMission = employeMission;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
    
    public MissionPlanifiee(){
        super();
    }
    
    public MissionPlanifiee(int id, String desc, Date dateD,int nbE, CompetenceMission[] comp, Employe[] emp, Date dateF){
        super(id, desc, dateD, nbE, comp, "Mission Planifiée");
        this.employeMission=emp;
        this.dateFin=dateF;
    }
    
    public MissionPlanifiee(MissionModifiable mm, Employe[] emp, Date dateF)
    {
        super(mm.getIdM(),mm.getDescM(), mm.getDateDebut(), mm.getNbEmployes(), mm.getCompMission(), "Mission En Preparation");
        this.employeMission=emp;
        this.dateFin=dateF;
    }
}
