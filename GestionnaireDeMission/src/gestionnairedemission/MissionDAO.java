package gestionnairedemission;

import java.util.ArrayList;

/**
 * <b> Interface MissionDAO </b>
 * <p> Interface définissant les méthodes pour la classe CsvMissionDAO tout en permettant d'anticiper l'évolutivité de l'application. </p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public interface MissionDAO {
    
    /**
     * Créé une liste contenant l'ensemble des missions à ajouter de la sorte.
     * Il s'agit d'un parcours de la liste fournie via l'objet CsvFile et une conversion en données de celui-ci.
     * @return  La liste des missions ajoutées en omettant le titre au sein du fichier CSV.
     * @see Mission
     */
    ArrayList<Mission> addMission();
}
