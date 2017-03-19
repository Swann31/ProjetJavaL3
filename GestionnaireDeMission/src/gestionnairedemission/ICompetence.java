package gestionnairedemission;

/**
 * <b> Interface ICompetence </b>
 * <p> Interface définissant les méthodes pour la classe Competence tout en permettant d'anticiper l'évolutivité de l'application. </p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public interface ICompetence {
    
    /**
     * Getter pour l'identifiant de la compétence.
     * @return L'identifiant de la compétence.
     */
    String getIDC();
    
    /**
     * Getter pour la catégorie de la compétence.
     * @return La catégorie de la compétence.
     */
    String getCat();

    /**
     * Getter pour le libellé de la compétence.
     * @return Le libellé de la compétence.
     */
    String getLib();
    
}
