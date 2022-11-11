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
        radio radio = new radio();
        boolean salir = false;
        boolean salir1 = false;
        int op = 0;
        String menu = "Bienvenido a la radio, funciones: \n1. Apagar radio \n2. Subir volumen \n3. Bajar volumen \n4.Modo radio \n5. Modo reproduccion \n6. Modo telefono \n7. Modo productividad";

        /**
         * Menu con todas las opciones que el usuario puede escoger
         */

        while(!salir){
            try {
                System.out.println("Desea encender la radio?");
                int op1 =0;
                System.out.println("1. Si \n2. No\n");
                op1 = teclado.nextInt();
                teclado.nextLine();
                switch(op1){
                    case 1: {
                        while(!salir1){
                            System.out.println(menu);
                            System.out.println("Ingrese una opcion");
                            op = teclado.nextInt();
                            teclado.nextLine();
                            switch(op){
                                case 1: {
                                    
                                    break;
                                }
                                
                                case 2: {
                                    break;
                                }
    
                                case 3: {
                                    break;
                                }
                                
                                case 4: {
                                    break;
                                }
    
                                case 5: {
                                    break;
                                }
    
                                case 6: {
                                    break;
                                }
    
                                case 7: {
                                    break;
                                }
    
                                default: {
                                    System.out.println("Ingrese una opcion entre 1-7");
                                    break;
                                }

                            }
                        }
                    }
                }
                System.out.println(" Bienvenido a la radio, a continuacion se te presentan las siguientes opciones:\n1. Funciones principales");
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

        if (radio.CambiarSpeaker()){
            System.out.println("Cambiando a speaker...");
        }
        else{
            System.out.println("Cambiando a auriculares...");
        }

    }
}