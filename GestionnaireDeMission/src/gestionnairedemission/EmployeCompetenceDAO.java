package gestionnairedemission;

/**
 * <b> Interface EmployeCompetenceDAO </b>
 * <p>Interface liée à la classe CsvEmployeCompetenceDAO, le Data Access Object de la classe Employe ayant pour but d'ajouter à un employé les compétences qui lui sont inhérentes, utilisé ici en vue de l'évolutivité du projet.</p>
 * @author Swann LAZAR
 * @version  1.0
 */
public interface EmployeCompetenceDAO {
    
    /**
     * Conversion des données reçues au sein du fichier en un tableau comprenant l'ensemble des données à traiter.
     * @return La liste des IdEmployés liée à la liste des IDCompetences.
     */
    String[][] addCompetence();
}
