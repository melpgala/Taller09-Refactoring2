public class ServicioMedico {
    private String nombre;
    private String descripcion;
    private double costo;
    private int duracion;

    public ServicioMedico(String nombre, String descripcion, double costo, int duracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
<<<<<<< HEAD
        // Ojo que las dos asignaciones de abajo deben de tener logica de validacion en el setter, esos valores no pueden ser negativos
        setCosto(costo);
        setDuracion( duracion);
=======
        setCosto(costo); // Validación del costo a través del método setter
        setDuracion(duracion); // Validación de la duración a través del método setter
>>>>>>> c80c620f84c3670889c782ef9efb1e72f75dc33a
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        if(costo<0){
            System.out.println("El costo no puede ser menor a 0");
            return;
        }
        this.costo = costo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
<<<<<<< HEAD
        if(duracion<0){
            System.out.println("El costo no puede ser menor a 0");
            return;
        }
        
=======
        if (duracion <= 0) {
        	System.out.println("La duración debe ser mayor a 0");
        }
>>>>>>> c80c620f84c3670889c782ef9efb1e72f75dc33a
        this.duracion = duracion;
    }

}
