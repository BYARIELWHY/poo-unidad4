package unidad2.model;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    //Relación con Investigador
    private Investigador investigador;
    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public void setInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);

        if (investigador != null) {
            System.out.println("Investigador: " + investigador.getNombre());
        }
    }
}