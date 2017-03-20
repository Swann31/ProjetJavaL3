package interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFormattedTextField.AbstractFormatter;

/**
 * <b> Classe DateLabelFormatter </b>
 * <p> Classe nécessaire à la transformation de String en Objets calendar suivant un formalisme pré-défini.</p>
 * @author Swann LAZAR, Maxence DESLANDES
 * @version 1.0
 */
public class DateLabelFormatter extends AbstractFormatter {

    /**
     * Le format de la date qui devra être défini.
     */
    private final String datePattern = "yyyy-MM-dd";
    
    /**
     * Définition du formalisme d'une date.
     */
    private final SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

    /**
     * Convertis une chaine de caractères en objet calendar.
     * @param text
     *      La date au format texte.
     * @return La date en format prédéfini par la classe.
     * @throws ParseException 
     * @see DateLabelFormatter#dateFormatter
     */
    @Override
    public Object stringToValue(String text) throws ParseException {
        return dateFormatter.parseObject(text);
    }

    /**
     * Convertis un objet calendar en une chaine de caractères.
     * @param value
     *      L'objet adapté au format calendar.
     * @return Une chaine de caractère selon le format défini dans la classe.
     * @throws ParseException 
     * @see DateLabelFormatter#dateFormatter
     */
    @Override
    public String valueToString(Object value) throws ParseException {
        if (value != null) {
            Calendar cal = (Calendar) value;
            return dateFormatter.format(cal.getTime());
        }

        return "";
    } 
}
