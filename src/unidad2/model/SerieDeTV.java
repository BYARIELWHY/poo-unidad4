package unidad2.model;
import java.util.ArrayList;
import java.util.List;
public class SerieDeTV extends ContenidoAudiovisual {
    //Relación con Temporada 
    private List<Temporada> temporadas = new ArrayList<>();
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
    }
    //Agregar temporada
    public void agregarTemporada(Temporada t) {
        temporadas.add(t);
    }
    //Mostrar temporadas
    public void mostrarTemporadas() {
        for (Temporada t : temporadas) {
            System.out.println("Temporada: " + t.getNumero());
        }
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
    //Mostrar temporadas
        mostrarTemporadas();
    }
}