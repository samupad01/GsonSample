package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Creamos la instancia de Persona
	        Persona p = new Persona();

	        //Lectura de nombre por teclado y verificar que el campo no se encuentra vacío.
	        String nombre = "";
	        while (nombre.isEmpty()) {
	            System.out.print("Ingrese el nombre: ");
	            nombre = scanner.nextLine();
	            if (nombre.isEmpty()) {
	                System.out.println("El nombre no puede estar vacío.");
	            }
	        }
	        p.setNombre(nombre);

	        //Lectura de apellidos por teclado y verificar que el campo no esta vacío.
	        String apellidos = "";
	        while (apellidos.isEmpty()) {
	            System.out.print("Ingrese los apellidos: ");
	            apellidos = scanner.nextLine();
	            if (apellidos.isEmpty()) {
	                System.out.println("Los apellidos no pueden estar vacíos.");
	            }
	        }
	        p.setApellidos(apellidos);

	        //Lectura de la edad por consola y verificación de la misma.
	        int edad = 0;
	        boolean entradaValida = false;
	        while (!entradaValida) {
	            System.out.print("Ingrese la edad: ");
	            String edadInput = scanner.nextLine();
	            try {
	                edad = Integer.parseInt(edadInput);
	                entradaValida = true;
	            } catch (NumberFormatException e) {
	                System.out.println("La edad debe ser un número entero.");
	            }
	        }
	        p.setEdad(edad);

	        scanner.close();

	        // Convertir el objeto Persona a formato JSON
	        Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        String json = gson.toJson(p);

	        // Mostrar el resultado JSON en la consola
	        System.out.println(json);
	    }
}
