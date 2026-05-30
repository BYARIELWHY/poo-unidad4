package unidad2.model;

public class VideoYoutube extends ContenidoAudiovisual {
    private String canal;
    public VideoYoutube(String titulo, int duracionEnMinutos, String genero, String canal) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
    }
    public String getCanal() {
        return canal;
    }
    public void setCanal(String canal) {
        this.canal = canal;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Video de Youtube:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Canal: " + canal);
    }
}