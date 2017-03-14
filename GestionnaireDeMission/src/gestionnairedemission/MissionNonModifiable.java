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
public abstract class MissionNonModifiable extends Mission {
    protected int nbEmployes;
    protected CompetenceMission [] compMission;
    protected Employe[] employeMission;
    protected Date dateFin;
    
    public int getNbEmployes() {
        return nbEmployes;
    }
    
    public CompetenceMission[] getCompMission() {
        return compMission;
    }
    
    public Employe[] getEmployeMission() {
        return employeMission;
    }
    
    public Date getDateFin(){
        return dateFin;
    }
    
    public MissionNonModifiable()
    {
        super();
    }
    
    public MissionNonModifiable(Mission m, int nbE, CompetenceMission[] comp, Employe[] empM, Date df)
    {
        super(m.getIdM(),m.getDescM(),m.getDateDebut(),"MissionNonModifiable");
        this.nbEmployes=nbE;
        this.compMission=comp;
        this.employeMission=empM;
        this.dateFin=df;
    }
    
    public MissionNonModifiable(Mission m, int nbE, CompetenceMission[] comp, String typeM, Employe[] empM, Date df)
    {
        super(m.getIdM(),m.getDescM(),m.getDateDebut(),typeM);
        this.nbEmployes=nbE;
        this.compMission=comp;
        this.employeMission=empM;
        this.dateFin=df;
    }
    
    public MissionNonModifiable (int id, String desc, Date dateD, int nbE, CompetenceMission[] comp, String typeM, Employe[] empM, Date df)
    {
        super(id,desc,dateD,typeM);
        this.nbEmployes=nbE;
        this.compMission=comp; 
        this.employeMission=empM;
        this.dateFin=df;
    }
    
    public MissionNonModifiable(MissionPlanifiee mp, String typeM){
        super(mp.getIdM(), mp.getDescM(), mp.getDateDebut(), typeM);
        this.nbEmployes=mp.getNbEmployes();
        this.compMission=mp.getCompMission(); 
        this.employeMission=mp.getEmployeMission();
        this.dateFin=mp.getDateFin();
    }
    
}
