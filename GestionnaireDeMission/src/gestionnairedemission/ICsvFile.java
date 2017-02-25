package gestionnairedemission;

import java.io.File;
import java.util.List;

/** 
 * Interface ICsvFile permettant de définir les méthodes de la classe CsvFile et d'anticiper des évolutions.
*/
interface ICsvFile {
    
    /**
     * Getteur pour le file du CsvFile
     * @return Le fichier lié à la classe CsvFile.
     */
    File getFile();
    
    /**
     * Getteur pour les données contenues au sein du fichier CSV
     * @return L'ensemble des données contenues dans le fichier au sein d'un grand tableau.
     */
    List<String[]> getData();
}
