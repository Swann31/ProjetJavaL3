package gestionnairedemission;

import static interfaces.MenuPrincipal.listC;
import static interfaces.MenuPrincipal.listE;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <b>CsvMissionDAO est une classe de Data Acces Object dédiée à la classe Mission.</b>
 * <p>Il s'agit d'un objet ayant pour but de ne pas accéder directement aux données en dur, mais de travailler sur des objets du domaine.</p>
 * <p>Il s'agit donc de la partie de code accédant aux données pour les lire depuis un fichier dans ce projet.</p>
 *  @author Swann LAZAR, Maxence DESLANDES
 *  @version 1.0
*/
public class CsvMissionDAO {
    
    /**
     * Le fichier en lecture, contenant des missions.
    */
    private File f;
    
    /**
     * L'objet CSV en charge de lire le fichier reçu.
     * @see CsvFile
     */
    private CsvFile csvF;
    
    /**
     * Constructeur par défaut du CsvMissionDAO.
     */
    public CsvMissionDAO(){
    }
    
    /**
     * Constructeur du CsvMissionDAO.
     * @param file 
     *      Le fichier contenant les employés à ajouter.
     * @see CsvFile
     * @see CsvMissionDAO#f
     * @see CsvMissionDAO#csvF
     */
    public CsvMissionDAO(File file) {
        this.f=file;
        this.csvF = new CsvFile(file); 
    }
        
    /**
     * Créé une liste contenant l'ensemble des missions à ajouter de la sorte.
     * Il s'agit d'un parcours de la liste fournie via l'objet CsvFile et une conversion en données de celui-ci.
     * @return  La liste des missions ajoutées en omettant le titre au sein du fichier CSV.
     * @see Mission
     * @see CsvMissionDAO#csvF
     * @see CsvMissionDAO#missionTab(java.lang.String[])  
     */
    public ArrayList<Mission> addMission() {
        final ArrayList<Mission> listM = new ArrayList<>();
        ArrayList<String[]> data;
        data = this.csvF.getData();
        final List<String[]> dataWT = data;
        dataWT.remove(0);
        if (dataWT.size()>data.size()-1)
        {
            dataWT.subList(data.size()-1,dataWT.size()).clear();
        }
        for(String[] data1 : dataWT)
        {

            final Mission mission;
            mission = missionTab(data1);
            listM.add(mission);  
        }   
        return listM;
    }
    
    /**
     * Créer les différentes missions et associations (employés et compétences) en fonction de chaque lignes reçues.
     * @param tab
     *      Un tableau contenant l'ensemble des informations pour une mission.
     * @return La mission créée.
     * @see Mission
     * @see MissionEnCours
     * @see MissionPlanifiee
     * @see MissionEnPreparation
     * @see MissionTerminee
     * @see CompetenceMission
     * @see Employe
     * @see interfaces.MenuPrincipal#listC
     * @see interfaces.MenuPrincipal#listE
     */
    private Mission missionTab(String[] tab)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if(tab[0].equals("Mission En Cours"))
        {
            CompetenceMission[] tabC = new CompetenceMission[Integer.parseInt(tab[5])];
            int t=6+2*Integer.parseInt(tab[5]);
            int dateFin = tab.length -1;
            Employe[] emp = new Employe[t];
            for(int i=0; i<Integer.parseInt(tab[5]); i=i+2){
                for(int j = 0 ; j<listC.size();j++){
                    if(listC.get(j).getIDC().equals(tab[5+i])){
                        tabC[i] = new CompetenceMission(listC.get(j), Integer.parseInt(tab[6+i]));
                    }
                }
            }
            for(int i=1;i<Integer.parseInt(tab[t])+1;i++){
                for(int j=0; j<listE.size(); j++){
                    if(listE.get(j).getIdE() == Integer.parseInt(tab[t+i])){
                        emp[i]= listE.get(j);
                    }
                }
            }
            Date dd,df;
            try {
                dd = sdf.parse(tab[3]);
                df = sdf.parse(tab[dateFin]);
                Mission m = new MissionEnCours(Integer.parseInt(tab[1]), tab[2],dd,Integer.parseInt(tab[4]),tabC,emp,df);
                return m;
            } catch (ParseException ex) {
                Logger.getLogger(CsvMissionDAO.class.getName()).log(Level.SEVERE, null, ex);
            }      
        }
        else if(tab[0].equals("Mission En Preparation"))
        {
            
            CompetenceMission[] tabC = new CompetenceMission[Integer.parseInt(tab[5])];
            for(int i=0; i<Integer.parseInt(tab[5]); i=i+2){
                for(int j = 0 ; j<listC.size();j++){
                    if(listC.get(j).getIDC().equals(tab[5+i])){
                        tabC[i] = new CompetenceMission(listC.get(j), Integer.parseInt(tab[6+i]));
                    }
                }
            }
            Date dd;
            try {
                dd = sdf.parse(tab[3]);
                Mission m = new MissionEnPreparation(Integer.parseInt(tab[1]), tab[2],dd,Integer.parseInt(tab[4]),tabC);
                return m;
            } catch (ParseException ex) {
                Logger.getLogger(CsvMissionDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(tab[0].equals("Mission Planifiée"))
        {    
            CompetenceMission[] tabC = new CompetenceMission[Integer.parseInt(tab[5])];
            int t=6+2*Integer.parseInt(tab[5]);
            int dateFin = tab.length -1;
            Employe[] emp = new Employe[Integer.parseInt(tab[t])];
            int id=0;
            for(int i=1; i<2*Integer.parseInt(tab[5])+1; i+=2){
                for(int j = 0 ; j<listC.size();j++){
                    if(listC.get(j).getIDC().equals(tab[5+i])){
                        tabC[id] = new CompetenceMission(listC.get(j), Integer.parseInt(tab[6+i]));
                        id++;
                    }
                }
            }
            for(int i=1;i<Integer.parseInt(tab[t])+1;i++){
                for(int j=0; j<listE.size(); j++){
                    if(listE.get(j).getIdE() == Integer.parseInt(tab[t+i])){
                        emp[i-1]= listE.get(j);
                    }
                }
            }
            Date dd,df;
            try {
                dd = sdf.parse(tab[3]);
                df = sdf.parse(tab[dateFin]);
                Mission m = new MissionPlanifiee(Integer.parseInt(tab[1]), tab[2],dd,Integer.parseInt(tab[4]),tabC,emp,df);
                return m;
            } catch (ParseException ex) {
                Logger.getLogger(CsvMissionDAO.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        else if(tab[0].equals("Mission Terminée"))
        {
            CompetenceMission[] tabC = new CompetenceMission[Integer.parseInt(tab[5])];
            int t=6+2*Integer.parseInt(tab[5]);
            int dateFin = tab.length -1;
            Employe[] emp = new Employe[t];
            for(int i=0; i<Integer.parseInt(tab[5]); i=i+2){
                for(int j = 0 ; j<listC.size();j++){
                    if(listC.get(j).getIDC().equals(tab[5+i])){
                        tabC[i] = new CompetenceMission(listC.get(j), Integer.parseInt(tab[6+i]));
                    }
                }
            }
            for(int i=1;i<Integer.parseInt(tab[t])+1;i++){
                for(int j=0; j<listE.size(); j++){
                    if(listE.get(j).getIdE() == Integer.parseInt(tab[t+i])){
                        emp[i]= listE.get(j);
                    }
                }
            }
            Date dd,df;
            try {
                dd = sdf.parse(tab[3]);
                df = sdf.parse(tab[dateFin]);
                Mission m = new MissionTerminee(Integer.parseInt(tab[1]), tab[2],dd,Integer.parseInt(tab[4]),tabC,emp,df);
                return m;
            } catch (ParseException ex) {
                Logger.getLogger(CsvMissionDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
             return null;    
    }
}
