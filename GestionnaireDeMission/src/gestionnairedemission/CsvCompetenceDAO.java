package gestionnairedemission;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * <b>CsvCompetenceDAO est une classe de Data Acces Object dédiée à la classe Competence.</b>
 * <p>Il s'agit d'un objet ayant pour but de ne pas accéder directement aux données en dur, mais de travailler sur des objets du domaine.</p>
 * <p>Il s'agit donc de la partie de code accédant aux données pour les lire depuis un fichier dans ce projet.</p>
 *  @author Swann LAZAR, Maxence DESLANDES
 *  @version 1.0
*/
public class CsvCompetenceDAO implements CompetenceDAO{
    
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
     * Constructeur par défaut du CsvCompetenceDAO.
     * @see CompetenceDAO
     */
    public CsvCompetenceDAO() {
        super();
    }
    
    /**
     * Constructeur du CsvCompetenceDAO
     * @param file 
     *      Le fichier contenant les compétences à ajouter.
     * @see CsvCompetenceDAO#f
     * @see CsvCompetenceDAO#csvF
     */
    public CsvCompetenceDAO(File file) {
        this();
        this.f=file;
        this.csvF = new CsvFile(file); 
    }
    
    /**
     * Créé une liste contenant l'ensemble des compétences a ajouter de la sorte.
     * Il s'agit d'un parcours de la liste fournie via l'objet CsvFile et une conversion en données de celui-ci en une liste.
     * @return La liste des compétences ajoutés en omettant le titre au sein du fichier CSV.
     * @see Competence
     * @see CsvCompetenceDAO#csvF
     * @see CsvCompetenceDAO#competenceTab(java.lang.String[]) 
     */
    @Override
    public ArrayList<Competence> addCompetence() {
        final ArrayList<Competence> listC = new ArrayList<>();
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
            final Competence competence;
            competence = competenceTab(data1);
            listC.add(competence);
        }   
        return listC;
    }
    
    /**
     * Conversion des données reçues au sein du fichier en Competences au sens de la classe Java.
     * @param tab
     *      Tableau correspondant aux différents éléments composant une ligne du fichier CSV.
     * @return La compétence nouvellement créé avec l'ensemble de ses caractéristiques extraites.
     * @see Competence
     * @see Competence#idC 
     * @see Competence#categorieComp 
     * @see Competence#libelleComp
     * @see Competence#suppr
     */
    private Competence competenceTab(String[] tab)
    {
        Competence c = new Competence(tab[0],tab[1],tab[2],Boolean.valueOf(tab[3]));
        return c;
    } 
}