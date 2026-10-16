package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Uso de colección sugerido por la práctica
    public static ArrayList<Tarea> listaTareas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n--- GESTOR DE TAREAS ---");
            System.out.println("1. Registrar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Completar tarea");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese la descripción de la tarea: ");
                        String desc = scanner.nextLine();
                        listaTareas.add(new Tarea(desc));
                        System.out.println("Tarea registrada correctamente.");
                        break;
                    case 2:
                        System.out.println("\nLista de Tareas:");
                        if (listaTareas.isEmpty()) {
                            System.out.println("No hay tareas registradas.");
                        } else {
                            for (int i = 0; i < listaTareas.size(); i++) {
                                System.out.println(i + ". " + listaTareas.get(i));
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese el número de la tarea a completar: ");
                        int indice = Integer.parseInt(scanner.nextLine());
                        listaTareas.get(indice).marcarComoCompletada();
                        System.out.println("Tarea marcada como completada.");
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número válido.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: La tarea seleccionada no existe.");
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }
        scanner.close();
    }
}