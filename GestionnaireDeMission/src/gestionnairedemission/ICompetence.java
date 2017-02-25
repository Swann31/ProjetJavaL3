package gestionnairedemission;

/**
 * <b> Interface ICompetence </b>
 * <p> Interface définissant les méthodes pour la classe Competence tout en permettant d'anticiper l'évolutivité de l'application. </p>
 * @author Swann LAZAR
 * @version 1.0
 */
public interface ICompetence {
    
    /**
     * Getteur pour l'identifiant de la compétence.
     * @return L'identifiant de la compétence.
     */
    String getIDC();
    
    /**
     * Getteur pour la catégorie de la compétence.
     * @return La catégorie de la compétence.
     */
    String getCat();

    /**
     * Getteur pour le libellé de la compétence.
     * @return Le libellé de la compétence.
     */
    String getLib();
    
}
