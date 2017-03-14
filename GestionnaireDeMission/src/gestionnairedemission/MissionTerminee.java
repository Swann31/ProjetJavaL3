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
public class MissionTerminee extends MissionNonModifiable {
    public MissionTerminee(){
        super();
    }
    public MissionTerminee(Mission m, int nbE, CompetenceMission[] comp, Employe[] empM, Date df)
    {
        super(m,nbE,comp,"Mission Terminée",empM,df);
    }
     
    public MissionTerminee(int id, String desc, Date dateD, int nbE, CompetenceMission[] comp, Employe[] empM, Date df)
    {
        super(id,desc,dateD,nbE,comp,"Mission Terminée",empM,df);
    }

    public MissionTerminee(MissionPlanifiee mp)
    {
        super(mp,"Mission Terminée");
    }
}
