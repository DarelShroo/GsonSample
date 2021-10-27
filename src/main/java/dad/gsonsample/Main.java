package dad.gsonsample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre,apellido;
        int edad=-1;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Introduzca su nombre: ");
            nombre = in.nextLine();
        } while (nombre.isEmpty());
        do {
            System.out.println("Introduzca su apellido: ");
            apellido = in.nextLine();
        } while (apellido.isEmpty());
        do {
            try {
                System.out.println("Introduzca su edad: ");
                String aux = in.nextLine();
                edad = Integer.parseInt(aux);
            } catch (Exception e) {
                System.out.println("No es un numero válido");
            }
        } while (edad < 0);
        in.close();

        Persona persona = new Persona(nombre, apellido, edad);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(persona);
        System.out.println(json);
    }
}
