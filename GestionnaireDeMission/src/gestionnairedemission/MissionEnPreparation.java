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
public class MissionEnPreparation extends MissionModifiable {
    
    public MissionEnPreparation(){
        super();
    }
    
    public MissionEnPreparation(int id, String desc, Date dateD,int nbE, CompetenceMission[] comp){
        super(id, desc, dateD, nbE, comp, "Mission En Preparation");
    }
    
    public MissionEnPreparation(MissionModifiable mm)
    {
        super(mm.getIdM(),mm.getDescM(), mm.getDateDebut(), mm.getNbEmployes(), mm.getCompMission(), "Mission En Preparation");
    }
    
     public Employe[] getEmployeMission(){
         return null;
     };
     
     public Date getDateFin(){
         return null;
     };

    @Override
    public void setEmployeMission(Employe[] employeMission) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
