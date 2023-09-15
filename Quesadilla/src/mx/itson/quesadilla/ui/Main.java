/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.quesadilla.ui;
import java.util.Scanner;

/**
 *
 * @author avalo
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Escriba el enunciado a separar");
        
        Scanner scanner = new Scanner (System.in);
        String telefonos = scanner.nextLine();
        
//if contar
        if (telefonos != null) {
            telefonos = telefonos.replace("664", "Tijuana");
            telefonos = telefonos.replace("662", "Hermosillo");
            telefonos = telefonos.replace("622", "Guaymas");
            String[] lineas = telefonos.split(",");

            // cuenta las ciudades por telefono
            int tijuanaContador = 0;
            int hermosilloContador = 0;
            int guaymasContador = 0;
            int desconocidoContador = 0;

            // Se aplica el contador
            for (String linea : lineas) {
                if (linea.contains("Tijuana")) {
                    tijuanaContador++;
                } else if (linea.contains("Hermosillo")) {
                    hermosilloContador++;
                } else if (linea.contains("Guaymas")) {
                    guaymasContador++;
                } else {
                    desconocidoContador++;
                }
            }

            System.out.println("Hay " + tijuanaContador + " números de Tijuana");
            System.out.println("Hay " + hermosilloContador + " números de Hermosillo");
            System.out.println("Hay " + guaymasContador + " números de Guaymas");
            System.out.println("Hay " + desconocidoContador + " números con código de área desconocido");
        }
    }

    //lunes11
//        boolean estaUsada = oracion.startsWith("a") || oracion.startsWith("A");
//
//        // con variable
//        if (estaUsada){
//            System.out.println("Si inicia con a");
//        }else{
//            System.out.println("No inicia con a");
//        }
//
////en dos lineas
//        if (oracion.startsWith("a")) {
////
//        } else {
//            System.out.println("No inicia co a");
//
//            //El if en una sola linea
//            System.out.println(oracion.startsWith("a") ? "Si inicia con a" : "no inicia con a");
    }

