    /**
    * @Autor: Marcos Diaz y Diego Soto
      @Date: 11-11-2022
    * Clase principal donde el usuario interactua con el programa
    */

import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        boolean continuar = false;
        int op = 0;

        /**
         * Menu con todas las opciones que el usuario puede escoger
         */

        while(continuar == false){
            try {
                System.out.println(" Iniciando radio.......  ");
                System.out.println(" Bienvenido a la radio, a continuacion se te presentan las siguientes opciones:\n");
                System.out.println("1. Funciones principales");
                System.out.println("2. Modo Radio");
                System.out.println("3. Modo Reproduccion");
                System.out.println("4. Modo Telefono");
                System.out.println("5. Modo productividad");
                System.out.println("Porfavor elije una opcion:");
                op = Integer.parseInt(teclado.nextLine());
                
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(" La entrada es incorrecta/la opcion no existe, porfavor verifica lo que ingresaste");
            }
        }

    }
}