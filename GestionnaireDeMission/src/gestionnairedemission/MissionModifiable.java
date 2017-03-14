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
public abstract class MissionModifiable extends Mission {
    protected int nbEmployes;
    protected CompetenceMission [] compMission;

    public int getNbEmployes() {
        return nbEmployes;
    }

    public void setNbEmployes(int nbE) {
        this.nbEmployes = nbE;
    }

    public CompetenceMission[] getCompMission() {
        return compMission;
    }

    public void setCompMission(CompetenceMission[] compM) {
        this.compMission = compM;
    }
    
    public MissionModifiable (){
        super();
    }
    
    public MissionModifiable(Mission m, int nbE, CompetenceMission[] comp)
    {
        super(m.getIdM(),m.getDescM(),m.getDateDebut(),"MissionModifiable");
        this.nbEmployes=nbE;
        this.compMission=comp;
    }
    
    public MissionModifiable(Mission m, int nbE, CompetenceMission[] comp, String typeM)
    {
        super(m.getIdM(),m.getDescM(),m.getDateDebut(),typeM);
        this.nbEmployes=nbE;
        this.compMission=comp;
    }
    
    public MissionModifiable (int id, String desc, Date dateD, int nbE, CompetenceMission[] comp, String typeM)
    {
        super(id,desc,dateD,typeM);
        this.nbEmployes=nbE;
        this.compMission=comp; 
    }
    
}
