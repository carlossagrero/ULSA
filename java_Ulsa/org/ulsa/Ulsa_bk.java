/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.ulsa;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author carlosisaacsagrerocampos
 */
public class Ulsa {

    public static void main(String[] args) {
        Ulsa ulsa = new Ulsa();
        clearScreen();
        ulsa.mostrarMenu();
    }

    public void mostrarMenu() {
        int op = 0;
        while (op != 7) {
            
            System.out.println("1) Consultar cuenta");
            System.out.println("2) Actualizar cuenta");
            System.out.println("3) Eliminar cuenta");
            System.out.println("4) Crear cuenta");
            System.out.println("5) Tranferencias");
            System.out.println("6) Pago de servicios");
            System.out.println("7) Salir");

            Scanner input = new Scanner(System.in);
            System.out.print("Selecciona una opción:");
            op = input.nextInt();
            switch (op) {
                case 1 -> {
                    consultar();
                }
                case 2 -> {
                    actualizar();

                }
                case 3 -> {
                    eliminar();

                }
                case 4 -> {
                    crear();
                }
                case 5 -> {

                    System.out.print("Cuenta: ");
                    int cuenta = input.nextInt();
                    System.out.print("Monto: ");
                    int monto = input.nextInt();
                    transferir(cuenta, monto);

                }
                case 6 -> {
                    pagarServicios();

                }
                case 7 -> {
                    break;
                }
                default ->
                    System.out.println("Opción no válida");
            }
        }

    }

    public static void consultar() {
        clearScreen();
        System.out.println("Se hizo una consulta");
    }

    public static void actualizar() {
        clearScreen();
        System.out.println("Se actualizó");
    }

    public static void crear() {
        clearScreen();
        System.out.println("Se creó");
    }

    public static void eliminar() {
        clearScreen();
        System.out.println("Se eliminó");
    }

    public static void transferir(int cuenta, double monto) {
        clearScreen();
        System.out.print("Se tranfirió $");
        System.out.print(monto);
        System.out.print(" a la cuenta: ");
        System.out.println(cuenta);
    }

    public static void pagarServicios() {
        clearScreen();
        System.out.println("Se pagó servicio");
    }

    private static void clearScreen() {
        

        try {
            new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();

        } catch (IOException | InterruptedException e) {
            System.out.println("Ocurrió un problema");
        }
    }
}
