package gestionnairedemission;

import java.io.File;
import java.util.List;

/** 
 * <b> Interace IcsvFile </b>
 * <p>Interface ICsvFile permettant de définir les méthodes de la classe CsvFile et d'anticiper des évolutions.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
*/
interface ICsvFile {
    
    /**
     * Getter pour le file du CsvFile
     * @return Le fichier lié à la classe CsvFile.
     */
    File getFile();
    
    /**
     * Getter pour les données contenues au sein du fichier CSV
     * @return L'ensemble des données contenues dans le fichier au sein d'un grand tableau.
     */
    List<String[]> getData();
}
