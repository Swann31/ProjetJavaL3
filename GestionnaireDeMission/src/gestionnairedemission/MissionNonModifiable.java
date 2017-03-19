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
    
    @Override
    public int getNbEmployes() {
        return nbEmployes;
    }
    
    @Override
    public CompetenceMission[] getCompMission() {
        return compMission;
    }
    
    @Override
    public Employe[] getEmployeMission() {
        return employeMission;
    }
    
    @Override
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
