package unidad2.controller;
import unidad2.model.Actor;
import unidad2.model.Pelicula;
public class ContenidoController {
    public void mostrarEjemplo() {
        Actor actor1 = new Actor("Carlos", 35);
        Actor actor2 = new Actor("Ana", 28);
        Pelicula peli = new Pelicula("Accion X", 120, "Accion", "Marvel");
        peli.agregarActor(actor1);
        peli.agregarActor(actor2);
        peli.mostrarDetalles();
    }
}