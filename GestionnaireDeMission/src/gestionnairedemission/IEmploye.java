package gestionnairedemission;

import java.util.Date;

/**
 * <b> Interface IEmploye</b>
 * <p> Interface définissant les méthodes pour la classe Emplpoyé tout en permettant d'anticiper l'évolutivité de l'application</p>
 * @author Swann LAZAR
 * @version 1.0
 */
public interface IEmploye {
    
    /**
     * Getteur pour l'identifiant de l'employé.
     * @return L'identifiant de l'employé.
     */
    int getIdE();
    
    /**
     * Getteur pour l'ensemble des compétences possédées par l'employé.
     * @return La liste des compétences possédées par l'employé.
     * @see Competence
     */
    Competence [] getCompetence();
    
    /**
     * Getteur pour la date d'entrée dans l'entreprise pour l'employé.
     * @return Date d'entrée de l'employé dans l'entreprise.
     */
    Date getDate();
}
