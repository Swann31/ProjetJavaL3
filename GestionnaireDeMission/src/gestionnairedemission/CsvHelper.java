package gestionnairedemission;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <b> Classe CsvHelper</b>
 * <p> Classe permettant de rechercher et de récupérer une ressource sur un disque. Ici, le but est justement de récupérer les différents fichiers CSV.</p>
 * @author Swann LAZAR
 * @version 1.0
*/
public class CsvHelper {
   
    /**
     * Méthode permettant de récupérer le chemin d'accès du fichier.
     * @param file
     *          Nom du fichier à extraire.
     * @return Le chemin d'accès au fichier.
     */
    public static String getRessourcePath(String file)
    {
        final File f = new File("");
        final String dossier = f.getAbsolutePath() + File.separator + file;
        return dossier;
    }
    
    /**
     * Méthode permettant de récupérer le fichier CSV.
     * @param file
     *          Nom du fichier à lire.
     * @return Le fichier CSV nommé par l'utilisateur.
     */
   public static File getData (String file)
   {
       final String fileName = getRessourcePath(file);
       File f = new File (fileName);
       return f;
   }
   
   //Lecture ligne par ligne du fichier CSV
   /**
    * Méthode lisant ligne par ligne le fichier CSV.
    * @param f
    *       Le fichier à lire séquentiellement.
    * @return Les différentes lignes du fichier sous forme de liste.
    */
   public static List<String> readFile (File f)
   {
        try {
            List<String> list = new ArrayList<>();
            try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)) {
                for(String line = br.readLine(); line != null; line = br.readLine())
                {
                    list.add(line);
                }
            }
            return list;
        } catch (IOException ex) {
            Logger.getLogger(CsvHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (null);
   }
}
