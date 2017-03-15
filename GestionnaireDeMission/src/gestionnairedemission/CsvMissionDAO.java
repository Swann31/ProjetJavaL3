/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author Maxence
 */
public class CsvMissionDAO {
    
    private File f;
    private CsvFile csvF;
    
    public CsvMissionDAO(File file) {
        this.f=file;
        this.csvF = new CsvFile(file); 
    }
    
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
    
    private Mission missionTab(String[] tab)
    {
        /*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
           Mission m = new MissionEnPreparation(Integer.parseInt(tab[0]), tab[1],sdf.parse(tab[2]),Integer.parseInt(tab[3]),null);
            return m;
        } catch (ParseException ex) {
            Logger.getLogger(CsvMissionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;*/
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if(tab[0].equals("Mission En Cours")){
            CompetenceMission[] tabC = new CompetenceMission[Integer.parseInt(tab[5])];
            int t = Integer.parseInt(tab[6+2*(Integer.parseInt(tab[5]))]);
            int dateFin = tab.length -1;
            Employe[] emp = new Employe[t];
            for(int i=0; i<Integer.parseInt(tab[5]); i=i+2){
                for(int j = 0 ; j<listC.size();j++){
                    if(listC.get(j).getIDC().equals(tab[5+i])){
                        tabC[i] = new CompetenceMission(listC.get(j), Integer.parseInt(tab[6+i]));
                    }
                }
            }
            
            for(int i=0;i<Integer.parseInt(tab[6]);i++){
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
            
              
        }else if(tab[0].equals("Mission En Preparation")){
            
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
            
            
        }else if(tab[0].equals("Mission Planifiée")){
            
            CompetenceMission[] tabC = new CompetenceMission[Integer.parseInt(tab[5])];
            int t = Integer.parseInt(tab[6+2*(Integer.parseInt(tab[5]))]);
            int dateFin = tab.length -1;
            Employe[] emp = new Employe[t];
            for(int i=0; i<Integer.parseInt(tab[5]); i=i+2){
                for(int j = 0 ; j<listC.size();j++){
                    if(listC.get(j).getIDC().equals(tab[5+i])){
                        tabC[i] = new CompetenceMission(listC.get(j), Integer.parseInt(tab[6+i]));
                    }
                }
            }
            
            for(int i=0;i<Integer.parseInt(tab[6]);i++){
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
                Mission m = new MissionPlanifiee(Integer.parseInt(tab[1]), tab[2],dd,Integer.parseInt(tab[4]),tabC,emp,df);
                return m;
            } catch (ParseException ex) {
                Logger.getLogger(CsvMissionDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if(tab[0].equals("Mission Terminée")){
            
            CompetenceMission[] tabC = new CompetenceMission[Integer.parseInt(tab[5])];
            int t = Integer.parseInt(tab[6+2*(Integer.parseInt(tab[5]))]);
            int dateFin = tab.length -1;
            Employe[] emp = new Employe[t];
            for(int i=0; i<Integer.parseInt(tab[5]); i=i+2){
                for(int j = 0 ; j<listC.size();j++){
                    if(listC.get(j).getIDC().equals(tab[5+i])){
                        tabC[i] = new CompetenceMission(listC.get(j), Integer.parseInt(tab[6+i]));
                    }
                }
            }
            
            for(int i=0;i<Integer.parseInt(tab[6]);i++){
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
