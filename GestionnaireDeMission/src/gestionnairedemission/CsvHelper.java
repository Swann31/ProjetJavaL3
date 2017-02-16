package gestionnairedemission;

//Classe permettant de récupérer les fichiers CSV

import java.io.File;

public class CsvHelper {
    // Récupération du chemin d'accès
    public static String getRessourcePath(String file)
    {
        final File f = new File("");
        final String dossier = f.getAbsolutePath() + File.separator + file;
        return dossier;
    }
    //Récupération du fichier CSV
   public static File getData (String file)
   {
       final String fileName = getRessourcePath(file);
       File f = new File (fileName);
       return f;
   }
}
