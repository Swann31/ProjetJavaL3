package gestionnairedemission;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CsvEmployeDAO implements EmployeDAO {

    private File f;
    private CsvFile csvF;
    // Constructeur
    private CsvEmployeDAO() {
        super();
    }
    public CsvEmployeDAO(File file) {
        this();
        this.f=file;
        this.csvF = new CsvFile(file); 
    }
    @Override
    public List<Employe> addEmploye() {
        List<Employe> listE = new ArrayList<>();
        return listE;
    }
    
}
