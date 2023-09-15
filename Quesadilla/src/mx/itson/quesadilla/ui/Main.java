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
        

        if (telefonos != null) {
            telefonos = telefonos.replace("664", "Tijuana");
            telefonos = telefonos.replace("662", "Hermosillo");
            telefonos = telefonos.replace("622", "Guaymas");
            String[] lineas = telefonos.split(",");

            // cuenta las ciudades
            int tijuanaCount = 0;
            int hermosilloCount = 0;
            int guaymasCount = 0;
            int desconocidoCount = 0;

            // Busca nombres de ciudades en el contenido
            for (String linea : lineas) {
                if (linea.contains("Tijuana")) {
                    tijuanaCount++;
                } else if (linea.contains("Hermosillo")) {
                    hermosilloCount++;
                } else if (linea.contains("Guaymas")) {
                    guaymasCount++;
                } else {
                    desconocidoCount++;
                }
            }

            System.out.println("Hay " + tijuanaCount + " números de Tijuana");
            System.out.println("Hay " + hermosilloCount + " números de Hermosillo");
            System.out.println("Hay " + guaymasCount + " números de Guaymas");
            System.out.println("Hay " + desconocidoCount + " números con código de área desconocido");
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

