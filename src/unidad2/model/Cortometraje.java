package unidad2.model;

public class Cortometraje extends ContenidoAudiovisual {
    private int premios;
    public Cortometraje(String titulo, int duracionEnMinutos, String genero, int premios) {
        super(titulo, duracionEnMinutos, genero);
        this.premios = premios;
    }
    public int getPremios() {
        return premios;
    }
    public void setPremios(int premios) {
        this.premios = premios;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Cortometraje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Premios: " + premios);
    }
}