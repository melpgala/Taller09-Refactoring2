import java.util.ArrayList;
import java.util.List;

public class HistorialMedico {
    private List<Consulta> consultas;
    private List<RecetaMedica> recetasMedicas=new ArrayList<>();

    public HistorialMedico() {
        this.consultas = new ArrayList<>();
        this.recetasMedicas = new ArrayList<>();
    }

    public List<String> getConsultas() {
        return Collections.unmodifiableCollection(recetasMedicas);
    }

    public void añadirConsulta(Consulta consulta) {
        consultas.add(consulta);
    }
    public void eliminarRecetas(Consulta consulta) {
        consultas.remove(consulta);
    }

    public List<String> getRecetasMedicas() {
        return Collections.unmodifiableCollection(recetasMedicas);
    }

    public void añadirRecetas(RecetaMedica receta) {
        recetasMedicas.add(receta);
    }
    public void eliminarRecetas(RecetaMedica receta) {
        recetasMedicas.remove(receta);
    }
}
