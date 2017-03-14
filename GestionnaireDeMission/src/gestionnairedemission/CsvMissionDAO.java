/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionnairedemission;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
           Mission m = new Mission(Integer.parseInt(tab[0]), sdf.parse(tab[1]), tab[2]);
            return m;
        } catch (ParseException ex) {
            Logger.getLogger(CsvMissionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
