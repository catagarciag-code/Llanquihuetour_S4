/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.Tours;

/**
 *
 * @author Catalina García Santana
 */
public class GestorDatos {
    
    public ArrayList<Tours> cargarTours(String rutaArchivo) {
        ArrayList<Tours> listaTours = new ArrayList<>();
        
        //// Abre el archivo y asegura su cierre automático al finalizar
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                // Ignora líneas vacías y separa los atributos usando punto y coma
                if (!linea.trim().isEmpty()) {
                    String[] datos = linea.split(";");

                    String nombre = datos[0];
                    String tipo = datos[1];
                    int precio = Integer.parseInt(datos[ 2 ].trim());
                    
                    // Crea el objeto Tour con los datos extraídos y lo agrega a la lista
                    Tours tour = new Tours(nombre, tipo, precio);
                    listaTours.add(tour);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en formato de numero: " + e.getMessage());
        }

        return listaTours;
    }
}