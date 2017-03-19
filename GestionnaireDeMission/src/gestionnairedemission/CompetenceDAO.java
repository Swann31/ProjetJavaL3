package gestionnairedemission;

import java.util.ArrayList;

/**
 * <b> Interface CompetenceDAO </b>
 * <p> Interface liée à la classe CsvCompetenceDAO, le Data Access Object de la classe Compétence, utilisé ici en vue de l'évolutivité du projet.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public interface CompetenceDAO {
    
    /**
     * Conversion des données reçues au sein du fichier en Compétence au sens de la classe Java : méthode actuellement abstraite.
     * @return La liste des compétences ajoutés en omettant le titre au sein du fichier CSV.
     * @see Competence
     */
    ArrayList<Competence> addCompetence();
}
