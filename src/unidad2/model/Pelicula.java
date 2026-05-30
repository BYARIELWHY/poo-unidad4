package unidad2.model;
import java.util.ArrayList;
import java.util.List;
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    // Relación con Actor 
    private List<Actor> actores = new ArrayList<>();
    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
    }
    public String getEstudio() {
        return estudio;
    }
    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    //Agregar actores
    public void agregarActor(Actor actor) {
        actores.add(actor);
    }
    // Mostrar actores 
    public void mostrarActores() {
        for (Actor a : actores) {
            System.out.println("Actor: " + a.getNombre());
        }
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        // Mostrar actores 
        mostrarActores();
    }
}