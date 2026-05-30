package unidad2.model;
import java.util.ArrayList;
import java.util.List;

import unidad2.controller.ContenidoController;
import unidad2.service.ArchivoService;
public class Main {
    public static void main(String[] args) {
    	 
        // MVC
        ContenidoController controller = new ContenidoController();
        controller.mostrarEjemplo();

        // PELÍCULA + ACTORES
        Actor actor1 = new Actor("Carlos", 35);
        Actor actor2 = new Actor("Ana", 28);
        Pelicula peli = new Pelicula("Accion X", 120, "Accion", "Marvel");
        peli.agregarActor(actor1);
        peli.agregarActor(actor2);
        peli.mostrarDetalles();
        System.out.println("------------------------");

        // SERIE + TEMPORADAS
        SerieDeTV serie = new SerieDeTV("Serie Top", 45, "Drama");
        Temporada t1 = new Temporada(1, 10);
        Temporada t2 = new Temporada(2, 8);
        serie.agregarTemporada(t1);
        serie.agregarTemporada(t2);
        serie.mostrarDetalles();
        System.out.println("------------------------");

        // DOCUMENTAL + INVESTIGADOR
        Investigador inv = new Investigador("Dr. Lopez", "Historia");
        Documental doc = new Documental("Docu X", 90, "Educativo", "Historia");
        doc.setInvestigador(inv);
        doc.mostrarDetalles();
        System.out.println("------------------------");

        // HERENCIA
        VideoYoutube video = new VideoYoutube("Tutorial Java", 15, "Educativo", "MiCanal");
        video.mostrarDetalles();
        System.out.println("------------------------");

        Cortometraje corto = new Cortometraje("Corto Indie", 20, "Drama", 5);
        corto.mostrarDetalles();

        System.out.println("================ ARCHIVOS =================");

        // Archivos CSV
        ArchivoService archivo = new ArchivoService();
        List<String> lista = new ArrayList<>();
        lista.add("Avengers");
        lista.add("Batman");

        // Guardar en archivo
        archivo.guardarPeliculas(lista);

        // Leer del archivo
        List<String> leidas = archivo.leerPeliculas();
        System.out.println("Peliculas leidas desde archivo:");
        for (String p : leidas) {
            System.out.println(p);
        }
    }
}