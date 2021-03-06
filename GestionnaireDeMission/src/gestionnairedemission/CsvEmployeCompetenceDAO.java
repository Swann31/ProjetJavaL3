package gestionnairedemission;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *<b> Classe CsvEmployeCompetenceDAO est une classe de Data Acces Object dédiée à la classe Employe et ayant pour but d'attribuer les compétences.</b>
 * <p>Il s'agit d'un objet ayant pour but de ne pas accéder directement aux données en dur, mais de travailler sur des objets du domaine.</p>
 * <p>Il s'agit donc de la partie de code accédant aux données pour les lire depuis un fichier dans ce projet.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public class CsvEmployeCompetenceDAO implements EmployeCompetenceDAO {
    
    /**
     * Le fichier en lecture, contenant des compétences.
    */
    private File f;
    
    /**
     * L'objet CSV en charge de lire le fichier reçu.
     * @see CsvFile
     */
    private CsvFile csvF;
    
    /**
     * Constructeur par défaut du CsvEmployeCompetenceDAO.
     * @see EmployeCompetenceDAO
     */
    public CsvEmployeCompetenceDAO() {
        super();
    }
    
    /**
     * Constructeur du CsvEmployeCompetenceDAO
     * @param file 
     *      Le fichier contenant les compétences à ajouter.
     * @see CsvEmployeCompetenceDAO#f
     * @see CsvEmployeCompetenceDAO#csvF
     */
    public CsvEmployeCompetenceDAO(File file) {
        this();
        this.f=file;
        this.csvF = new CsvFile(file); 
    }
    
    /**
     * Conversion des données reçues au sein du fichier en une liste comprenant l'ensemble des données à traiter.
     * @return La liste des IdEmployés liée à la liste des IDCompetences.
     * @see CsvEmployeCompetenceDAO#csvF
     */
    @Override
    public ArrayList<String[]> addCompetence() {
        List<String[]> data;
        data = this.csvF.getData();
        ArrayList<String[]> listD= new ArrayList<String[]>(data.size());
        for(String[] data1 : data)
        {
            for(int i=0;i<data1.length;i++)
            {
                String[][] tab = new String[1][data1.length];
                listD.add(data1);
            }
        }
        return listD;
    }
}
