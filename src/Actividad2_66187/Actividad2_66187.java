/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad2_66187;

import java.util.Scanner;

/**
 *
 * @author Alondra Palma
 */
public class Actividad2_66187 {
    public static void datos() {
        System.out.println("UNIVERSIDAD AUTONOMA DE CAMPECHE");
        System.out.println("INGENIERIA EN SISTEMAS COMPUTACIONALES");
        System.out.println("ALONDRA SARAI PALMA PACHECO");
    }

    public static void ejer1() {
        System.out.println("-----------[Ejercicio 1]--------------------------");
        System.out.println("Ingresa un numero del 1 al 5");

        Scanner miConsola = new Scanner(System.in);
        int numero = miConsola.nextInt();
//seleciona un numero del 1 al 5 para saber como se escribe en ingles
        switch (numero) {
            case 1:
                System.out.println("En ingles es: One");
                break;
            case 2:
                System.out.println("En ingles es: Two");
                break;
            case 3:
                System.out.println("En ingles es: Three");
                break;
            case 4:
                System.out.println("En ingles es: Four");
                break;
            case 5:
                System.out.println("En ingles es: Five");
                break;
            default:
                System.out.println("No existe");

        }
    }

    public static void ejer2() {
        System.out.println("-----------[Ejercicio 2]--------------------------");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una opción correr, saltar, dormir, comer, estudiar");
        String accion = teclado.next();

        switch (accion) {
            case "correr":
                System.out.println("Haz escrito " + accion);
                break;
            case "saltar":
                System.out.println("Haz escrito " + accion);
                break;
            case "dormir":
                System.out.println("Haz escrito " + accion);
                break;
            case "comer":
                System.out.println("Haz escrito " + accion);
                break;
            case "estudiar":
                System.out.println("Haz escrito " + accion);
                break;
            default:
                System.out.println("ERROR ESCRIBA OTRA PALABRA");
        }
    }

    public static void ejer3() {
        System.out.println("-----------[Ejercicio 3]-----------------------");
        System.out.println("-----------[Horario JUEVES]-----------------------");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa una hora ");
        int hora = teclado.nextInt();

        switch (hora) {
            case 1:case 2:case 3:case 4:case 5:
                System.out.println("durmiendo");
                break;
            case 6:
                System.out.println("Despertar");
                break;
            case 7:
                System.out.println("Clase de administración general ");
                break;
            case 8:
                System.out.println("Desayuno");
                break;
            case 9:case 10:case 11:
                System.out.println("Clase algebra ");
                break;
            case 12:case 13:
                System.out.println("Clase organizacion computacional ");
                break;
            case 14:
                System.out.println("Clase fisica ");
                break;
            case 15:
                System.out.println("Almuerzo");
                break;
            case 16:case 17:
                System.out.println("Tarea");
                break;
            case 18:
                System.out.println("Bañarse");
                break;
            case 19:case 20:
                System.out.println("Clase de LP");
                break;
            case 21:
                System.out.println("Cena");
                break;
            case 22:case 23:case 24:
                System.out.println("Dormir");
                break;
            default:
                System.out.println("ERROR ESCRIBA OTRA PALABRA");
        }
    }

    public static void ejer4() {
        System.out.println("-----------[Ejercicio 4]-----------------------");
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero ");
        numero = teclado.nextInt();
        int diaSem = 0;
        
        if (numero >= 1 && numero <= 7) {
            switch (numero) {
                case 1:
                    System.out.println("Domingo " );
                    break;
                case 2:
                    System.out.println("Lunes ");
                    break;
                case 3:
                    System.out.println("Martes ");
                    break;
                case 4:
                    System.out.println("Miercoles ");
                    break;
                case 5:
                    System.out.println("Jueves ");
                    break;
                case 6:
                    System.out.println("Viernes ");
                    break;
                case 7:
                    System.out.println("Sabado ");
                    break;
            }
        } else {
            System.out.println("INCORRECTO");
        }
    
    }
    public static void main(String[] args) {
        datos();
        ejer1();
        ejer2();   
        ejer3();
        ejer4();
    }
}
