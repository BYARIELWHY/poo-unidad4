package unidad2.service;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
public class ArchivoService {
  // Guardar datos en CSV
  public void guardarPeliculas(List<String> peliculas) {
     try (PrintWriter writer = new PrintWriter(new File("peliculas.csv"))) {
        for (String p : peliculas) {
             writer.println(p);
            }
            System.out.println("Datos guardados correctamente");
        } catch (Exception e) {
            System.out.println("Error al guardar archivo");
        }
    }
   // Leer datos desde CSV
   public List<String> leerPeliculas() {
       List<String> peliculas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("peliculas.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                peliculas.add(linea);
            }
        } catch (Exception e) {
            System.out.println("Error al leer archivo");
        }
        return peliculas;
    }
}