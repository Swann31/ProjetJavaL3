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
     */
    Integer GetIdE();
    
    /**
     * Getteur pour l'ensemble des compétences possédées par l'employé.
     * @see Competence
     */
    Competence getCompetence();
    
    /**
     * Getteur pour la date d'entrée dans l'entreprise pour l'employé.
     */
    Date getDateEntree();
}
