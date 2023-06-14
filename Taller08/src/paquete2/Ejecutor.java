/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        boolean bandera = true;
        int opcion;
        while (bandera) {
            System.out.println("-----------DOCENTES NOMBRAMIENTO/FACTURA"
                    + "-----------");
            System.out.println("-Ingrese 1 para crear objeto de tipo "
                    + "DocenteNombramiento");
            System.out.println("-Ingrese 2 para crear objeto de tipo "
                    + "DocenteFactura");
            System.out.println("-Ingrese 3 para salir del programa ");

            System.out.print("--> ");
            opcion = sc.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    String nombres = nombresApellidos();
                    String cedula = cedula();

                    System.out.println("Por favor ingrese el valor del sueldo"
                            + " inicial");
                    double sueldo = sc.nextDouble();

                    System.out.println("Por favor ingrese el valor de cada"
                            + " hora extra");
                    double horasE = sc.nextDouble();

                    System.out.println("Por favor ingrese el numero de horas"
                            + "  extra que hace el docente");
                    int numeroH = sc.nextInt();

                    DocenteNombramiento doc = new DocenteNombramiento();
                    doc.establecerNombre(nombres);
                    doc.establecerCedula(cedula);
                    doc.establecerValorSueldo(sueldo);
                    doc.establecerHorasExtra(numeroH);
                    doc.establecerValorHoraExtra(horasE);
                    doc.establecerSueldoFinal();
                    System.out.println(doc);

                    break;
                case 2:

                    nombres = nombresApellidos();
                    cedula = cedula();

                    System.out.println("Por favor ingrese el valor de la factura"
                            + " inicial");
                    double factura = sc.nextDouble();

                    System.out.println("Por favor ingrese el valor del iva");
                    double iva = sc.nextDouble();

                    DocenteFactura doc2 = new DocenteFactura();
                    doc2.establecerNombre(nombres);
                    doc2.establecerCedula(cedula);
                    doc2.establecerValorFactura(factura);
                    doc2.establecerValorIva(iva);
                    doc2.establecerValorCancelar();

                    System.out.println(doc2);

                    break;
                case 3:
                    bandera = false;
                    System.out.println("Gracias!");

                    break;
                default:
                    System.out.println("Error, opción no válida.");
                    break;
            }

        }

    }

    public static String nombresApellidos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el nombres del docente");

        String nombres = sc.nextLine();

        return nombres;
    }

    public static String cedula() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el ID del docente");

        String id = sc.nextLine();

        return id;
    }

}
