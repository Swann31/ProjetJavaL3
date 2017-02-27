package gestionnairedemission;

import java.util.List;

/**
 * <b> Interface EmployeDAO </b>
 * <p>Interface liée à la classe CsvEmployeDAO, le Data Acces Object de la classe Employe, utilisé ici en vue de l'évolutivité du projet.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
*/
public interface EmployeDAO {
    
    /**
     * Conversion des données reçues au sein du fichier en Employés au sens de la classe Java : méthode actuellement abstraite.
     * @return La liste des employés ajoutés en omettant le titre au sein du fichier CSV.
     * @see Employe
     */
    List<Employe> addEmploye();
}
