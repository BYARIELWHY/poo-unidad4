package unidad2.test;
import unidad2.model.Pelicula;
public class TestManual {
    public static void main(String[] args) {
        Pelicula p = new Pelicula("Avengers", 120, "Accion", "Marvel");
        if (p.getTitulo().equals("Avengers") &&
            p.getDuracionEnMinutos() == 120 &&
            p.getGenero().equals("Accion")) {
            System.out.println("TEST OK");
        } else {
            System.out.println("TEST FALLÓ");
        }
    }
}