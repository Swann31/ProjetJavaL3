package gestionnairedemission;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <b>CsvEmployeDAO est une classe de Data Acces Object dédiée à la classe Employe.</b>
 * <p>Il s'agit d'un objet ayant pour but de ne pas accéder directement aux données en dur, mais de travailler sur des objets du domaine.</p>
 * <p>Il s'agit donc de la partie de code accédant aux données pour les lire depuis un fichier dans ce projet.</p>
 *  @author Swann LAZAR
 *  @version 1.0
*/
public class CsvEmployeDAO implements EmployeDAO {

    /**
     * Le fichier en lecture, contenant des employés.
    */
    private File f;
    
    /**
     * L'objet CSV en charge de lire le fichier reçu.
     * @see CsvFile
     */
    private CsvFile csvF;
    
    /**
     * Constructeur par défaut du CsvEmployeDAO ayant une portée limitée (private).
     */
    private CsvEmployeDAO() {
        super();
    }
    
    /**
     * Constructeur du CsvExmployeDAO.
     * @param file 
     *      Le fichier contenant les employés à ajouter.
     * @see CsvFile
     * @see CsvEmployeDAO#f
     * @see CsvEmployeDAO#csvF
     */
    public CsvEmployeDAO(File file) {
        this();
        this.f=file;
        this.csvF = new CsvFile(file); 
    }
    
    /**
     * Créé une liste contenant l'ensemble des employés a ajouter de la sorte.
     * Il s'agit d'un parcours de la liste fournie via l'objet CsvFile et une conversion en données de celui-ci.
     * @return La liste des employés ajoutés en omettant le titre au sein du fichier CSV.
     * @see Employe
     * @see CsvEmployeDAO#csvF
     * @see CsvEmployeDAO#employeTab(java.lang.String[]) 
     */
    @Override
    public ArrayList<Employe> addEmploye() {
        final ArrayList<Employe> listE = new ArrayList<>();
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

            final Employe employe;
            employe = employeTab(data1);
            listE.add(employe);
        }   
        return listE;
    }
    
    /**
     * Conversion des données reçues au sein du fichier en Employés au sens de la classe Java.
     * @param tab
     *      Tableau correspondant aux différents éléments composant une ligne du fichier CSV.
     * @return L'employé nouvellement créé avec l'ensemble de ses caractéristiques extraites.
     * @see Employe
     * @see Employe#setIdE(int) 
     * @see Employe#setPrenom(java.lang.String) 
     * @see Employe#setNom(java.lang.String) 
     * @see Employe#setDateEntree(java.util.Date) 
     * @throws ex Si le format n'est pas valide.
     */
    private Employe employeTab(String[] tab)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        try {
           Employe e = new Employe(Integer.parseInt(tab[3]), tab[1], tab[0], sdf.parse(tab[2]));
            return e;
        } catch (ParseException ex) {
            Logger.getLogger(CsvEmployeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        /*
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
*/
    }  
}
