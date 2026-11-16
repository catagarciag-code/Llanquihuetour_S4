/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import data.GestorDatos; 
import java.util.ArrayList; 
import model.Tours;

/**
 *
 * @author Catalina García Santana
 */
public class LlanquihueTour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       GestorDatos gestor = new GestorDatos();
    String ruta = "src/resources/tour.txt";
    
    //Lista desde el archivo con ubicación en resources
    ArrayList<Tours> lista = gestor.cargarTours(ruta);
    
    System.out.println("=== TODOS LOS TOURS REGISTRADOS ===");
    for (Tours t : lista) {
        System.out.println(t);
    }
    
    //Filtro segun tipo de tour
    System.out.println("\n=== TOURS FILTRADOS POR TIPO (Gastronomico) ===");
    for (Tours t : lista) {
        if (t.getTipo().equalsIgnoreCase("Gastronomico")) {
            System.out.println(t);
        }
    }
 }
    
}
