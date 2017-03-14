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
public class MissionEnCours extends MissionNonModifiable {
    
    public MissionEnCours(){
        super();
    }
    public MissionEnCours(Mission m, int nbE, CompetenceMission[] comp, Employe[] empM, Date df)
    {
        super(m,nbE,comp,"Mission En Cours",empM,df);
    }
     
    public MissionEnCours(int id, String desc, Date dateD, int nbE, CompetenceMission[] comp, Employe[] empM, Date df)
    {
        super(id,desc,dateD,nbE,comp,"Mission En Cours",empM,df);
    }

    public MissionEnCours(MissionPlanifiee mp)
    {
        super(mp,"Mission En Cours");
    }
}