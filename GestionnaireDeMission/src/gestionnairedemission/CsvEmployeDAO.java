/*
classe EmployeDAO correspondant à l'interface liée au Data Acces Object, évitant d'accéder directement aux données brutes de l'objet concerné, ici Employe
*/
package gestionnairedemission;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CsvEmployeDAO implements EmployeDAO {

    private File f;
    private CsvFile csvF;
    // Constructeur
    private CsvEmployeDAO() {
        super();
    }
    public CsvEmployeDAO(File file) {
        this();
        this.f=file;
        this.csvF = new CsvFile(file); 
    }
    @Override
    public List<Employe> addEmploye() {
        final List<Employe> listE = new ArrayList<>();
        List<String[]> data;
        data = this.csvF.getData();
        final List<String[]> dataWT = data;
        dataWT.remove(0);
        for(String[] data1 : dataWT)
        {
            final Employe employe;
            employe = employeTab(data1);
            listE.add(employe);
        }   
        return listE;
    }
    private Employe employeTab(String[] tab)
    {
        Employe e = new Employe();
        e.setIdE(Integer.parseInt(tab[3]));
        e.setPrenom(tab[0]);
        e.setNom(tab[1]);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        try {
            e.setDateEntree(sdf.parse(tab[2]));
        } catch (ParseException ex) {
            Logger.getLogger(CsvEmployeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }
    
}
