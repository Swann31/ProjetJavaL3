package gestionnairedemission;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * <b> Classe CsvFile servant de lecteur CSV.</b>
 * <p> Cette classe est le "lecteur" du fichier CSV, il permet de définir les différents éléments composant le fichier au format CSV et d'en extraire les données.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
*/
final class CsvFile implements ICsvFile{
    
    /**
     * Définition du séparateur des différents éléments au sein d'une ligne du fichier CSV.
     */
    public final static char SEPARATOR = ';';
    
    /**
     * Le fichier qui sera adapté au format CSV comme défini dans la classe Java.
     * @see CsvFile#getFile()
     */
    private File f;
    
    /**
     * Tableau d'éléments de type String contenant tous les éléments présents au sein d'une ligne du fichier. Chaque élément du tableau correspond aux différentes parties délimitées par le SEPARATOR.
    */
    private List<String> lines;
    
    /**
     * Tableau comprenant les données uniques (chaque cellule correspond à une entrée) du fichier CSV.
     * @see CsvFile#getData()
     */
    private ArrayList<String[]> data; 
    
    /**
     * Constructeur par défaut d'un fichier CSV.
     */
    public CsvFile(){
    }
    
    /**
     * Constructeur du CsvFile
     * @param file 
     *      Le fichier au format CSV qui va être convertis selon les définitions de la classe pour sa lecture.
     * @see CsvFile#f
     * @see CsvFile#init() 
     */
    public CsvFile(File file){
       this.f = file;
       init();
    }
    
    /**
     * Lecture à proprement parler du fichier sans aucune distinction dans les données reçues.
     * @see CsvHelper
     * @see CsvFile#f
     * @see CsvFile#lines
     * @see CsvFile#data
     * @see CsvFile#SEPARATOR
     */
    public void init() {
       lines = CsvHelper.readFile(f);
       data = new ArrayList<>(lines.size());
       String s = new Character(SEPARATOR).toString();
       lines.stream().map((line) -> line.split(s)).forEachOrdered((data1) -> {
           data.add(data1);
       });
    }
    
    /**
     * Getter pour le file du CsvFile.
     * @return Le fichier lié à la classe CsvFile.
     * @see CsvFile#f
     */
    @Override
    public File getFile() {
        return this.f;
    }
    
    /**
     * Getter pour les données contenues au sein du fichier CSV
     * @return L'ensemble des données contenues dans le fichier au sein d'un grand tableau.
     * @see CsvFile#data
     */
    @Override
    public ArrayList<String[]> getData() {
        return this.data;
    }
}
